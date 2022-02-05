package com.itsnotme.starwars.data.net

import okhttp3.ResponseBody
import retrofit2.http.GET

interface StarWarsApiService {
    @GET("planets/1/")
    suspend fun getFirstPlanet(): ResponseBody
}