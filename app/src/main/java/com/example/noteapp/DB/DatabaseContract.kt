package com.example.noteapp.DB

import android.provider.BaseColumns

internal class DatabaseContract{

    internal class NoteColumns : BaseColumns{
        companion object{
            const val TABLE_NAME = "note"
            const val _ID = "id"
            const val TITLE = "title"
            const val DESCRIPTION = "description"
            const val DATE = "date"
        }
    }
}