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

        val state = intent.getParcelableExtra<FilmState>(STATE_KEY)!!

        adapter.filmList.addAll(state.listOffilms)
        adapter.notifyDataSetChanged()

        init()

        testCat.backButton.setOnClickListener {
            finish()
        }
        testCat.personal.text = state.title
        
    }
    companion object {

        const val STATE_KEY = "STATE_KEY"
    }

}