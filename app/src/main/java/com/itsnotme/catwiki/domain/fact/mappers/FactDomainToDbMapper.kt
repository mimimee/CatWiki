package com.itsnotme.catwiki.domain.fact.mappers

import com.itsnotme.catwiki.data.fact.cache.FavoriteFactEntity

interface FactDomainToDbMapper {
    fun map(id: String, text: String, updatedAt: String, sentCount: Int): FavoriteFactEntity

    class BaseImp : FactDomainToDbMapper {
        override fun map(id: String, text: String, updatedAt: String, sentCount: Int) =
            FavoriteFactEntity(id, text, updatedAt, sentCount)
    }
}