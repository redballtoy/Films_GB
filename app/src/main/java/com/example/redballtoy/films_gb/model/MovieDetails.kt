package com.example.redballtoy.films_gb.model

class MovieDetails(
        val mainMoviePictureId: Int,
        val movieTitleId: Int,
        val ageCategoryId: Int,
        val filmGanreIds: IntArray = intArrayOf()
)