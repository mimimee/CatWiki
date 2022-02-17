package com.itsnotme.catwiki.data.fact.cache

import androidx.lifecycle.LiveData

interface FactCacheDataSource {
    suspend fun clearFavorites()
    suspend fun saveFavorite(fact: FavoriteFactEntity)
    suspend fun getFavorites(): List<FavoriteFactEntity>
    fun observeFavorites(): LiveData<List<FavoriteFactEntity>>
    fun getFavoriteFactByUrl(url: String): LiveData<FavoriteFactEntity>
}