package com.itsnotme.starwars.domain.person.mappers

import com.itsnotme.starwars.domain.person.PersonDomainModel

interface PersonDbToDomainMapper {
    fun map(name: String, birthYear: String, url: String, films: List<String>): PersonDomainModel

    class BaseImpl : PersonDbToDomainMapper {
        override fun map(name: String, birthYear: String, url: String, films: List<String>) =
            PersonDomainModel(name, birthYear, url, films)
    }
}