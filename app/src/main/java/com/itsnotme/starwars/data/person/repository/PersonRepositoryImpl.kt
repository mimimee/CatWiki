package com.itsnotme.starwars.data.person.repository

import com.itsnotme.starwars.data.person.cloud.PersonCloudDataSource
import com.itsnotme.starwars.data.person.cloud.PersonCloudModel
import com.itsnotme.starwars.data.person.cloud.PersonListCloudResponse
import com.itsnotme.starwars.domain.repository.PersonRepository
import javax.inject.Inject

class PersonRepositoryImpl @Inject constructor(
    private val cloudDataSource: PersonCloudDataSource
) : PersonRepository {
    override suspend fun getPersonListFromNet(name: String): PersonListCloudResponse =
        cloudDataSource.getPersonList(name)

    override suspend fun getPersonDetailsFromNet(url: String): PersonCloudModel =
        cloudDataSource.getPersonDetails(url)
}