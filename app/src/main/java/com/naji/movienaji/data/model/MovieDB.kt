package com.naji.movienaji.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.naji.movienaji.utils.CONSTANTS

@Entity(tableName = CONSTANTS.TABLE_NAME)
data class MovieDB (
    @PrimaryKey
    val id: Int,
    val poster_path: String,
    val overview: String,
    val title: String,
    val backdrop_path: String
)