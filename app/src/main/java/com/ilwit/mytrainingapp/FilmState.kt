package com.ilwit.mytrainingapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilmState (val title: String, val listOffilms : List<Film>) : Parcelable