package com.itsnotme.starwars.data.person.repository

import com.itsnotme.starwars.data.person.cloud.PersonCloudModel

interface PersonRepository {
    suspend fun getPersonListFromNet(): List<PersonCloudModel>
    suspend fun getPersonDetailsFromNet(): PersonCloudModel
    //todo
    //suspend fun savePersonToDb()
}