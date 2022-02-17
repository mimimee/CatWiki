package com.itsnotme.catwiki.data.fact.cache

import androidx.room.Entity
import androidx.room.PrimaryKey

private const val FAVORITE_TABLE = "favorite_table"

@Entity(tableName = FAVORITE_TABLE)
data class FavoriteFactEntity(
    @PrimaryKey
    val id: String,
    val text: String,
    val updatedAt: String,
    val sentCount: Int
)