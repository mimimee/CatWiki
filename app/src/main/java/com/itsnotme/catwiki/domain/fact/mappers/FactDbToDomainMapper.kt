package com.itsnotme.catwiki.domain.fact.mappers

import com.itsnotme.catwiki.domain.fact.FactDomainModel

interface FactDbToDomainMapper {
    fun map(id: String, text: String, updated: String, sentCount: Int): FactDomainModel

    class BaseImpl : FactDbToDomainMapper {
        override fun map(id: String, text: String, updated: String, sentCount: Int) =
            FactDomainModel(id, text, updated, sentCount)
    }
}