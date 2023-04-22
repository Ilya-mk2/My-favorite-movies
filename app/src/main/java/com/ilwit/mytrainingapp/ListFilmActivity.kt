package com.ilwit.mytrainingapp

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ilwit.mytrainingapp.databinding.ActivityListFilmBinding


class ListFilmActivity : AppCompatActivity() {

    lateinit var testCat: ActivityListFilmBinding
    private val adapter = FilmsAdapter()

    private fun init() {
        testCat.apply {
            recyclerV.layoutManager = LinearLayoutManager(this@ListFilmActivity)
            recyclerV.adapter = adapter

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        testCat = ActivityListFilmBinding.inflate(layoutInflater)
        setContentView(testCat.root)

        val listOfFilms = intent.getStringArrayExtra(FILMS_KEY) as Array<String>
        val films = stringToFilm(listOfFilms)
        Log.d("Films", films.joinToString())
        adapter.filmList.addAll(films)
        adapter.notifyDataSetChanged()

        init()

        testCat.backButton.setOnClickListener {
            finish()
        }

        testCat.personal.text = intent.getStringExtra(TITLE_KEY)
        
    }

    companion object {
        const val TITLE_KEY = "TITLE_KEY"
        const val FILMS_KEY = "FILMS_KEY"
    }

    fun stringToFilm(films: Array<String>): List<Film> {
        Log.d("HZ", "DO")
        return films.map { Film(it) }.toList()
        Log.d("HZ", "POSLE")

    }
}