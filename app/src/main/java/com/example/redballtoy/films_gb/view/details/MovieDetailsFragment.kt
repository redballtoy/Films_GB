package com.example.redballtoy.films_gb.view.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.redballtoy.films_gb.databinding.MovieDetailsBinding
import com.example.redballtoy.films_gb.model.MovieDetailsData
import com.example.redballtoy.films_gb.viewmodel.AppState
import com.example.redballtoy.films_gb.viewmodel.MainViewModel
import com.google.android.material.snackbar.Snackbar

class MovieDetailsFragment: Fragment() {
    private var _binding: MovieDetailsBinding? = null
    private val binding get()=_binding!!
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MovieDetailsBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //означает что жизненный цикл viewModel будет привязан к жизненному циклу
        // этого фрагмента (this) и viewModel = MainViewModel
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        //подписываемся на viewModel c использованием observe учитывая то в каком состоянии
        //находится наш объект viewLifecycleOwner
        viewModel.getLiveData().observe(
            //это состояние жизненного цикла не фрагмента а его вьюшки
            //состояние вьюшек может меняться а фрагмент остается тем же самым
            viewLifecycleOwner,
            //state объект который будет принимать новое состояние приложения
            Observer {state: AppState -> renderData(state) }
        )
        //Получение данных
        viewModel.getMovieDetailsFromLocalSource()
    }


    private fun renderData(appState: AppState){
        when (appState) {
            is AppState.Success->{
                val movieDetailsData: MovieDetailsData = appState.movieDetailsData
                binding.pbLoading.visibility = View.GONE
                setData(movieDetailsData)
            }
            is AppState.Loading->{
                binding.pbLoading.visibility = View.VISIBLE
            }
            is AppState.Error->{
                binding.pbLoading.visibility = View.GONE
                Snackbar
                    .make(binding.clMainView,"Error",Snackbar.LENGTH_INDEFINITE)
                    .setAction("Reload"){viewModel.getMovieDetailsFromLocalSource()}
                    .show()
            }
        }
    }

    private fun setData(movieDetailsData: MovieDetailsData){
        //binding.ivBackdropMoviePath
        binding.tvOriginalTitle.text=movieDetailsData.title
        binding.tvAgeCategory.text=movieDetailsData.ageCategory
        binding.tvGenres.text=movieDetailsData.genres.values.toString()
        binding.rbVoteAverage.rating=(movieDetailsData.vote_average/2.0F).toFloat()
        binding.tvVoteCount.text=movieDetailsData.vote_count.toString()
        binding.tvOverview.text=movieDetailsData.overview
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

    companion object{
        fun newInstance()= MovieDetailsFragment()
    }

}