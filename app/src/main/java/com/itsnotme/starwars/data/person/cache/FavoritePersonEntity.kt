package com.itsnotme.starwars.data.person.cache

import androidx.room.Entity
import androidx.room.PrimaryKey

private const val FAVORITE_TABLE = "favorite_table"

@Entity(tableName = FAVORITE_TABLE)
data class FavoritePersonEntity(
    @PrimaryKey
    val url: String,
    val name: String,
    val birthYear: String,
    val films: List<String>
)