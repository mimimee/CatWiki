package com.itsnotme.catwiki.domain.fact.mappers

import com.itsnotme.catwiki.domain.fact.FactDomainModel

interface FactCloudToDomainMapper {
    fun map(id: String, text: String, updated: String, sentCount: Int): FactDomainModel

    class BaseImpl : FactCloudToDomainMapper {
        override fun map(id: String, text: String, updated: String, sentCount: Int) =
            FactDomainModel(id, text, updated, sentCount)
    }
}