package com.example.redballtoy.films_gb.utils

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.redballtoy.films_gb.model.MovieDetailsData
import com.example.redballtoy.films_gb.viewmodel.AppState

interface MvpView {
    fun renderData(appState: AppState)

}

class Presenter(
    private val view: MvpView
) {
    fun loadData() {
        //загрузка данных
        val data = AppState.Success(MovieDetailsData())

        //отдать данные вьюшке, в этом разница между MVP и MVVM
        //MVP отправляем данные по ссылку на вьюшку, при MVVM вьюшка
        //по подписке при изменнии вьюшек запрашивает данные через ViewModel
        //у ViewModel нет ссылки на активити
        view.renderData(data)

    }

}

class MovieTestFragment : Fragment(), MvpView {

    private lateinit var presenter: Presenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = Presenter(this)
        presenter.loadData()
    }


    override fun renderData(appState: AppState) {
        when (appState) {
            is AppState.Success -> TODO()
            is AppState.Error -> TODO()
            is AppState.Loading -> TODO()
        }
    }
}

