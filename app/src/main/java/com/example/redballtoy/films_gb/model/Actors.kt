package com.example.redballtoy.films_gb.model

import com.example.redballtoy.films_gb.R


class Actors {
    private val actors = listOf(
            Actor(1, R.drawable.chris_evans, R.string.chris_evans),
            Actor(2, R.drawable.chris_hemsworth, R.string.chris_hemsworth),
            Actor(3, R.drawable.mark_ruffalo, R.string.mark_ruffalo),
            Actor(4, R.drawable.robert_downey, R.string.robert_downey),
            Actor(5, R.drawable.chris_evans, R.string.chris_evans),
            Actor(6, R.drawable.chris_hemsworth, R.string.chris_hemsworth),
            Actor(7, R.drawable.mark_ruffalo, R.string.mark_ruffalo),
            Actor(8, R.drawable.robert_downey, R.string.robert_downey)
    )

    fun getActorById(id: Int) = actors[id]

    fun getCount() = actors.size
}