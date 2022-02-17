package com.itsnotme.catwiki.data.fact.cloud

interface FactCloudDataSource {
    suspend fun getFactList(amount: Int): List<FactCloudModel>
    suspend fun getFactDetails(url: String): FactCloudModel
}