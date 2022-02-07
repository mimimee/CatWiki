package com.itsnotme.starwars.data.person.cloud

import com.itsnotme.starwars.data.net.StarWarsApiService
import javax.inject.Inject

class PersonCloudDataSourceImpl @Inject constructor(
    private val apiService: StarWarsApiService
) : PersonCloudDataSource {
    override suspend fun getPersonList(): List<PersonCloudModel> =
        apiService.getPersonList()

    override suspend fun getPersonDetails(url: String): PersonCloudModel =
        apiService.getPersonByUrl(url)
}