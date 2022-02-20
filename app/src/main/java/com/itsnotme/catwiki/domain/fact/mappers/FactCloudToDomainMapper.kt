package com.itsnotme.catwiki.domain.fact.mappers

import com.itsnotme.catwiki.domain.fact.FactDomainModel
import javax.inject.Inject

interface FactCloudToDomainMapper {
    fun map(id: String, text: String, updated: String, sentCount: Int? = 0): FactDomainModel


    class BaseImpl @Inject constructor() : FactCloudToDomainMapper {
        override fun map(id: String, text: String, updated: String, sentCount: Int?) =
            FactDomainModel(id, text, updated, sentCount ?: 0)
    }
}