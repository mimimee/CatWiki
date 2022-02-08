package com.itsnotme.starwars.domain.repository

import androidx.lifecycle.LiveData
import com.itsnotme.starwars.data.person.cache.FavoritePersonEntity
import com.itsnotme.starwars.data.person.cloud.PersonCloudModel
import com.itsnotme.starwars.data.person.cloud.PersonListCloudResponse

interface PersonRepository {
    suspend fun getPersonListFromNet(name: String): PersonListCloudResponse
    suspend fun getPersonDetailsFromNet(url: String): PersonCloudModel

    suspend fun clearFavorites()
    suspend fun saveFavorite(person: FavoritePersonEntity)
    suspend fun getFavorites(): LiveData<List<FavoritePersonEntity>>
    suspend fun getFavoritePersonByUrl(url: String): LiveData<FavoritePersonEntity>
}