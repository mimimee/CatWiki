package com.itsnotme.starwars.data.person.cache

import androidx.lifecycle.LiveData
import com.itsnotme.starwars.data.db.FavoritePersonDao
import javax.inject.Inject

class PersonCacheDataSourceImpl @Inject constructor(
    private val favoritePersonDao: FavoritePersonDao
) : PersonCacheDataSource {
    override suspend fun clearFavorites() {
        favoritePersonDao.clearTable()
    }

    override suspend fun saveFavorite(person: FavoritePersonEntity) {
        favoritePersonDao.insertFavorite(person)
    }

    override suspend fun getFavorites(): LiveData<List<FavoritePersonEntity>> =
        favoritePersonDao.observeAllFavorites()

    override suspend fun getFavoritePersonByUrl(url: String): LiveData<FavoritePersonEntity> =
        favoritePersonDao.observeFavoritePersonByUrl(url)
}