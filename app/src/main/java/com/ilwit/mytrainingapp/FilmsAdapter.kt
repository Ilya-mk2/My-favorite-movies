package com.ilwit.mytrainingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ilwit.mytrainingapp.databinding.FilmItemBinding

class FilmsAdapter: RecyclerView.Adapter<FilmsAdapter.FilmsHolder>() {

    var filmList = ArrayList<Film>()

    class FilmsHolder(item: View) :RecyclerView.ViewHolder(item) {

        val binding = FilmItemBinding.bind(item)
        fun bind(film: Film) = with(binding){
        filmName.text = film.name
            filmYear.text = film.year.toString()
     }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.film_item, parent, false)
        return FilmsHolder(view)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

    override fun onBindViewHolder(holder: FilmsHolder, position: Int) {
        holder.bind(filmList[position])
    }

}