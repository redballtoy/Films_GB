package com.example.redballtoy.films_gb.model


//Репозиторий реализует то как данные будут получены
class RepositoryImpl:Repository {
    override fun getMovieDetailsFromLocalStorage(): MovieDetailsData {
        return MovieDetailsData()
    }

    override fun getMovieDetailsFromServer(): MovieDetailsData {
        return MovieDetailsData()
    }
}
