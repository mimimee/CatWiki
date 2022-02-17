package com.itsnotme.catwiki.data.fact.cloud

interface FactCloudDataSource {
    suspend fun getFactList(name: String): List<FactCloudModel>
    suspend fun getFactDetails(url: String): FactCloudModel
}