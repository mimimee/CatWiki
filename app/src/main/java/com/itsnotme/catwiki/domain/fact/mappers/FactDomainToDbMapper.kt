package com.itsnotme.catwiki.domain.fact.mappers

import com.itsnotme.catwiki.data.fact.cache.FavoriteFactEntity
import javax.inject.Inject

interface FactDomainToDbMapper {
    fun map(id: String, text: String, updatedAt: String, sentCount: Int): FavoriteFactEntity

    class BaseImpl @Inject constructor() : FactDomainToDbMapper {
        override fun map(id: String, text: String, updatedAt: String, sentCount: Int) =
            FavoriteFactEntity(id, text, updatedAt, sentCount)
    }
}