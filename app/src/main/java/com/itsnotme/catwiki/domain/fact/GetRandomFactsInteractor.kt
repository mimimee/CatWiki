package com.itsnotme.catwiki.domain.fact

import com.itsnotme.catwiki.domain.interactors.BaseInteractor
import com.itsnotme.catwiki.domain.repository.FactRepository
import javax.inject.Inject

class GetRandomFactsInteractor @Inject constructor(
    private val repository: FactRepository
) : BaseInteractor<FactDomainModel>() {
    private var pageSize: Int = 10

    fun setPageSize(size: Int) {
        if (size > 0) pageSize = size
    }

    override suspend fun fetch(): FactDomainModel {
        val factsFromNet = repository.getFactListFromNet(pageSize)
    }

}