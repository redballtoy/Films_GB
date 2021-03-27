package com.example.redballtoy.films_gb.model

data class Film(
        val adult: Boolean,
        val backdrop_path: String,
        val genres: Map<Int, String>,
        val homepage: String,
        val id: Int,
        val original_title: String,
        val popularity: Double,
        val ageCategory: String,
        val poster_path: String,
        val runtime: Int,
        val title: String,
        val vote_average: Double,
        val vote_count: Int,
        val overview: String
)
