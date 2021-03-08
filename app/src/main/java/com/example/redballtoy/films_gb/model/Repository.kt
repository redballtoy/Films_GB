package com.example.redballtoy.films_gb.model

interface Repository {
    fun getMovieDetailsFromLocalStorage():MovieDetailsData
    fun getMovieDetailsFromServer():MovieDetailsData

}
