package com.itsnotme.starwars.data.person.cache

import androidx.lifecycle.LiveData

interface PersonCacheDataSource {
    suspend fun clearFavorites()
    suspend fun saveFavorite(person: FavoritePersonEntity)
    fun getFavorites(): LiveData<List<FavoritePersonEntity>>
    fun getFavoritePersonByUrl(url: String): LiveData<FavoritePersonEntity>
}