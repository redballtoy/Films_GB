package com.example.redballtoy.films_gb.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.redballtoy.films_gb.R
import com.example.redballtoy.films_gb.model.MovieDetailsData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fl_fragment_container, MovieDetailsFragment.newInstance())
                .commit()
        }

        Log.d("myLog", MovieDetailsData().printInfo())

    }
}