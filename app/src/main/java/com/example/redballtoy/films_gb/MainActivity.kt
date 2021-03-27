package com.example.redballtoy.films_gb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.redballtoy.films_gb.view.main_list.FilmListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_list)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fl_fragment_container, FilmListFragment())
                .commit()
        }

        //Log.d("myLog", MovieDetailsData().printInfo())

    }
}