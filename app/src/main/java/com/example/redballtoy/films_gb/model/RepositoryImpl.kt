package com.example.redballtoy.films_gb.model


//Репозиторий реализует то как данные будут получены
class RepositoryImpl:Repository {
    override fun getFilmsFromLocalStorage(): List<Film> {
        return Films().getFilms()
    }

    override fun getMovieDetailsFromServer(): List<Film> {
        return Films().getFilms()
    }
}
