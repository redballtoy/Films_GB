package com.example.redballtoy.films_gb.viewmodel

import com.example.redballtoy.films_gb.model.MovieDetailsData

sealed class AppState {
    data class Success(val movieDetailsData: MovieDetailsData) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
