package com.itsnotme.starwars.data.person.cache

import androidx.lifecycle.LiveData

interface PersonCacheDataSource {
    suspend fun clearFavorites()
    suspend fun saveFavorite(person: FavoritePersonEntity)
    suspend fun getFavorites(): LiveData<List<FavoritePersonEntity>>
    suspend fun getFavoritePersonByUrl(url: String): LiveData<FavoritePersonEntity>
}