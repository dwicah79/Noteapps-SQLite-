package com.example.noteapp.entity

import android.icu.text.CaseMap.Title
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
data class Note(
    var id : Int = 0,
    var title: String? = null,
    var description : String? = null,
    var date: String? = null
):Parcelable
