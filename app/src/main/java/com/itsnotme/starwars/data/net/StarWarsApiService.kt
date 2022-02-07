package com.itsnotme.starwars.data.net

import com.itsnotme.starwars.data.person.cloud.PersonCloudModel
import com.itsnotme.starwars.data.person.cloud.PersonListCloudResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface StarWarsApiService {
    @GET("people")
    suspend fun getPersonList(@Query("search") name: String): PersonListCloudResponse

    @GET
    suspend fun getPersonByUrl(@Url url: String): PersonCloudModel
}