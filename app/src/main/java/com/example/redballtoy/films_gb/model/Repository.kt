package com.example.redballtoy.films_gb.model

interface Repository {
    fun getFilmsFromLocalStorage(): List<Film>
    fun getMovieDetailsFromServer(): List<Film>
}
