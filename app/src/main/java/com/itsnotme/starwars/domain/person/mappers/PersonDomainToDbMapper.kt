package com.itsnotme.starwars.domain.person.mappers

import com.itsnotme.starwars.data.person.cache.FavoritePersonEntity

interface PersonDomainToDbMapper {
    fun map(name: String, birthYear: String, url: String, films: List<String>): FavoritePersonEntity

    class BaseImp : PersonDomainToDbMapper {
        override fun map(name: String, birthYear: String, url: String, films: List<String>) =
            FavoritePersonEntity(name, birthYear, url, films)
    }
}