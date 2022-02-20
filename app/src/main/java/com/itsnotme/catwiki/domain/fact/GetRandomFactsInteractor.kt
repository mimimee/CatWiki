package com.itsnotme.catwiki.domain.fact

import com.itsnotme.catwiki.domain.fact.mappers.FactCloudToDomainMapper
import com.itsnotme.catwiki.domain.interactors.BaseInteractor
import com.itsnotme.catwiki.domain.repository.FactRepository
import javax.inject.Inject

class GetRandomFactsInteractor @Inject constructor(
    private val repository: FactRepository,
    private val factCloudToDomainMapper: FactCloudToDomainMapper
) : BaseInteractor<List<FactDomainModel>>() {
    private var pageSize: Int = 10

    fun setPageSize(size: Int): GetRandomFactsInteractor {
        if (size > 0) pageSize = size
        return this
    }

    override suspend fun fetch(): List<FactDomainModel> {
        val factsCloud = repository.getFactListFromNet(pageSize)
        return factsCloud.map { factCloud ->
            factCloudToDomainMapper.map(
                factCloud.id,
                factCloud.text,
                factCloud.updatedAt,
                factCloud.status.sentCount
            )
        }
    }
}