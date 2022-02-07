package com.itsnotme.starwars.data.person.cloud

interface PersonCloudDataSource {
    suspend fun getPersonList(): List<PersonCloudModel>
    suspend fun getPersonDetails(url: String): PersonCloudModel
}