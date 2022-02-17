package com.itsnotme.catwiki.data.fact.cloud

import com.itsnotme.catwiki.data.net.CatWikiApiService
import javax.inject.Inject

class FactCloudDataSourceImpl @Inject constructor(
    private val apiService: CatWikiApiService
) : FactCloudDataSource {
    override suspend fun getFactList(amount: Int): List<FactCloudModel> =
        apiService.getFactList(amount)

    override suspend fun getFactDetails(url: String): FactCloudModel =
        apiService.getFactById(url)
}