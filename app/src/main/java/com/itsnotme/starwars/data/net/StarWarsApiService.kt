package com.itsnotme.starwars.data.net

import com.itsnotme.starwars.data.person.cloud.PersonCloudModel
import retrofit2.http.GET
import retrofit2.http.Url

interface StarWarsApiService {
    @GET("people")
    suspend fun getPersonList(): List<PersonCloudModel>

    @GET
    suspend fun getPersonByUrl(@Url url: String): PersonCloudModel
}