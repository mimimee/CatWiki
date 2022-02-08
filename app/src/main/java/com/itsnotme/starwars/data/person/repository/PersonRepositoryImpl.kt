package com.itsnotme.starwars.data.person.repository

import androidx.lifecycle.LiveData
import com.itsnotme.starwars.data.person.cache.FavoritePersonEntity
import com.itsnotme.starwars.data.person.cache.PersonCacheDataSource
import com.itsnotme.starwars.data.person.cloud.PersonCloudDataSource
import com.itsnotme.starwars.data.person.cloud.PersonCloudModel
import com.itsnotme.starwars.data.person.cloud.PersonListCloudResponse
import com.itsnotme.starwars.domain.repository.PersonRepository
import javax.inject.Inject

class PersonRepositoryImpl @Inject constructor(
    private val cloudDataSource: PersonCloudDataSource,
    private val cacheDataSource: PersonCacheDataSource
) : PersonRepository {
    override suspend fun getPersonListFromNet(name: String): PersonListCloudResponse =
        cloudDataSource.getPersonList(name)

    override suspend fun getPersonDetailsFromNet(url: String): PersonCloudModel =
        cloudDataSource.getPersonDetails(url)

    override suspend fun clearFavorites() {
        cacheDataSource.clearFavorites()
    }

    override suspend fun saveFavorite(person: FavoritePersonEntity) {
        cacheDataSource.saveFavorite(person)
    }

    override suspend fun getFavorites(): LiveData<List<FavoritePersonEntity>> =
        cacheDataSource.getFavorites()

    override suspend fun getFavoritePersonByUrl(url: String): LiveData<FavoritePersonEntity> =
        cacheDataSource.getFavoritePersonByUrl(url)
}