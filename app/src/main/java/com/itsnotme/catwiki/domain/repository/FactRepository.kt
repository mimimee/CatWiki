package com.itsnotme.catwiki.domain.repository

import androidx.lifecycle.LiveData
import com.itsnotme.catwiki.data.fact.cache.FavoriteFactEntity
import com.itsnotme.catwiki.data.fact.cloud.FactCloudModel

interface FactRepository {
    suspend fun getFactListFromNet(amount: Int): List<FactCloudModel>
    suspend fun getFactDetailsFromNet(url: String): FactCloudModel

    suspend fun clearFavorites()
    suspend fun saveFavorite(fact: FavoriteFactEntity)
    suspend fun getFavorites(): List<FavoriteFactEntity>
    fun observeFavorites(): LiveData<List<FavoriteFactEntity>>
    fun getFavoriteFactByUrl(url: String): LiveData<FavoriteFactEntity>
}