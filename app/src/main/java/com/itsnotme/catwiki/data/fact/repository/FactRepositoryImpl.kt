package com.itsnotme.catwiki.data.fact.repository

import androidx.lifecycle.LiveData
import com.itsnotme.catwiki.data.fact.cache.FavoriteFactEntity
import com.itsnotme.catwiki.data.fact.cache.FactCacheDataSource
import com.itsnotme.catwiki.data.fact.cloud.FactCloudDataSource
import com.itsnotme.catwiki.data.fact.cloud.FactCloudModel
import com.itsnotme.catwiki.domain.repository.FactRepository
import javax.inject.Inject

class FactRepositoryImpl @Inject constructor(
    private val cloudDataSource: FactCloudDataSource,
    private val cacheDataSource: FactCacheDataSource
) : FactRepository {
    override suspend fun getFactListFromNet(name: String): List<FactCloudModel> =
        cloudDataSource.getFactList(name)

    override suspend fun getFactDetailsFromNet(url: String): FactCloudModel =
        cloudDataSource.getFactDetails(url)

    override suspend fun clearFavorites() {
        cacheDataSource.clearFavorites()
    }

    override suspend fun saveFavorite(fact: FavoriteFactEntity) {
        cacheDataSource.saveFavorite(fact)
    }

    override fun observeFavorites(): LiveData<List<FavoriteFactEntity>> =
        cacheDataSource.observeFavorites()

    override suspend fun getFavorites(): List<FavoriteFactEntity> =
        cacheDataSource.getFavorites()

    override fun getFavoriteFactByUrl(url: String): LiveData<FavoriteFactEntity> =
        cacheDataSource.getFavoriteFactByUrl(url)
}