package com.ilwit.mytrainingapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ilwit.mytrainingapp.databinding.FilmItemBinding
import org.w3c.dom.Text

class FilmsHolder(private val binding: FilmItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(film: Film) = with(binding){
        filmName.text = film.name
    }

}