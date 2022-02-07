package com.itsnotme.starwars.data.person.cloud

interface PersonCloudDataSource {
    suspend fun getPersonList(name: String): PersonListCloudResponse
    suspend fun getPersonDetails(url: String): PersonCloudModel
}