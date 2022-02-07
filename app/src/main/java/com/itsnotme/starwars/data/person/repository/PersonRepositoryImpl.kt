package com.itsnotme.starwars.data.person.repository

import com.itsnotme.starwars.data.person.cloud.PersonCloudModel

class PersonRepositoryImpl() : PersonRepository {
    override suspend fun getPersonListFromNet(): List<PersonCloudModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getPersonDetailsFromNet(): PersonCloudModel {
        TODO("Not yet implemented")
    }
}