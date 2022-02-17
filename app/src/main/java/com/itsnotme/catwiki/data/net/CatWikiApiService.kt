package com.itsnotme.catwiki.data.net

import com.itsnotme.catwiki.data.fact.cloud.FactCloudModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CatWikiApiService {
    @GET("facts/random")
    suspend fun getFactList(@Query("amount") amount: Int): List<FactCloudModel>

    @GET("facts/{id}")
    suspend fun getFactById(@Path("id") id: String): FactCloudModel
}