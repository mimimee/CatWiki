package com.itsnotme.catwiki.data.fact.cache

import androidx.lifecycle.LiveData
import com.itsnotme.catwiki.data.db.FavoriteFactDao
import javax.inject.Inject

class FactCacheDataSourceImpl @Inject constructor(
    private val favoriteFactDao: FavoriteFactDao
) : FactCacheDataSource {
    override suspend fun clearFavorites() {
        favoriteFactDao.clearTable()
    }

    override suspend fun saveFavorite(fact: FavoriteFactEntity) {
        favoriteFactDao.insertFavorite(fact)
    }

    override fun observeFavorites(): LiveData<List<FavoriteFactEntity>> =
        favoriteFactDao.observeAllFavorites()

    override suspend fun getFavorites(): List<FavoriteFactEntity> {
        return favoriteFactDao.getAllFavorites()
    }

    override fun getFavoriteFactByUrl(url: String): LiveData<FavoriteFactEntity> =
        favoriteFactDao.observeFavoriteFactByUrl(url)
}