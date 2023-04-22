package com.ilwit.mytrainingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ilwit.mytrainingapp.databinding.FilmItemBinding


class FilmsAdapter: RecyclerView.Adapter<FilmsHolder>() {

    var filmList = ArrayList<Film>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmsHolder {
       val binding = FilmItemBinding.inflate(LayoutInflater.from(parent.context))

        return FilmsHolder(binding)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

    override fun onBindViewHolder(holder: FilmsHolder, position: Int) {
       holder.bind(filmList[position])

    }

}