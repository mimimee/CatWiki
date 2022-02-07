package com.itsnotme.starwars.domain.repository

import com.itsnotme.starwars.data.person.cloud.PersonCloudModel
import com.itsnotme.starwars.data.person.cloud.PersonListCloudResponse

interface PersonRepository {
    suspend fun getPersonListFromNet(name: String): PersonListCloudResponse
    suspend fun getPersonDetailsFromNet(url: String): PersonCloudModel
    //todo
    //suspend fun getPersonListFromDb()
    //suspend fun savePersonToDb()
    //suspend fun removePersonFromDb()
}