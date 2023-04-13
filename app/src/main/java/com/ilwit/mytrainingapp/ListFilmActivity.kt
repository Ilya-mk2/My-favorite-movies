package com.ilwit.mytrainingapp

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            adapter.
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        testCat = ActivityListFilmBinding.inflate(layoutInflater)
        setContentView(testCat.root)

        val listOfFilms = intent.getStringArrayExtra(FILMS_KEY) as Array<String>

        init()

        testCat.backButton.setOnClickListener{
            finish()
        }

        testCat.personal.text = intent.getStringExtra(TITLE_KEY)

       // var adapt : ArrayAdapter<String> = ArrayAdapter<String>(this, R.layout.simple_list_item_1, listOfFilms)
        //testCat.listOfFilms.adapter = adapt
    }
        companion object {
            const val TITLE_KEY = "TITLE_KEY"
            const val FILMS_KEY = "FILMS_KEY"
        }


}