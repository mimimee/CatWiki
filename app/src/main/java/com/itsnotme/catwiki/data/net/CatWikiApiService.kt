package com.itsnotme.catwiki.data.net

import com.itsnotme.catwiki.data.fact.cloud.FactCloudModel
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface CatWikiApiService {
    @GET("people")
    suspend fun getFactList(@Query("search") name: String): List<FactCloudModel>

    @GET
    suspend fun getFactById(@Url url: String): FactCloudModel
}