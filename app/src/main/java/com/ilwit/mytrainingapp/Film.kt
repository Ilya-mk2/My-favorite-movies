package com.ilwit.mytrainingapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Film(val name :String, val producer: String, val year :Int) : Parcelable{

}