package com.example.redballtoy.films_gb.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.redballtoy.films_gb.model.Repository
import com.example.redballtoy.films_gb.model.RepositoryImpl
import java.lang.Thread.sleep

class MainViewModel(
        private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
        private val repositoryImpl: Repository = RepositoryImpl(),
        private val delay:Long=5000
) : ViewModel() {

    //получить объект AppState которых находится в LiveData при его измении
    fun getLiveData(): LiveData<AppState> = liveDataToObserve

    fun getMovieDetailsFromLocalSource() = getDataFromLocalSource()
    fun getMovieDetailsFromRemoteSource() = getDataFromLocalSource()


    private fun getDataFromLocalSource() {
        //перед тем как положить данные в LiveData уладем в  LiveData признак Loading
        // который указывает что приложение загружается
        //этот метод кладет данные на текущем потоке и подписчик получт данные на этом же потоке
        liveDataToObserve.value = AppState.Loading
        //иммитация запроса в сеть, запускаем в другом потоке, нельзя блокировать главный поток
        Thread {
            sleep(delay)
            //postValue - возвращает данные в главный поток, что позволяет подписываться на
            //эти данные вьюшками
            //если данные успешно загрузились забираем их
            val data =repositoryImpl.getMovieDetailsFromLocalStorage()
            liveDataToObserve.postValue(AppState.Success(data))

            //В случае ошибки
            AppState.Error(Throwable("Error!"))
        }.start()
    }
}