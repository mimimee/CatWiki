package com.itsnotme.starwars.domain.person.mappers

import com.itsnotme.starwars.domain.person.PersonDomainModel

interface PersonCloudToDomainMapper {
    fun map(name: String, birthYear: String, url: String, films: List<String>): PersonDomainModel

    class BaseImpl : PersonCloudToDomainMapper {
        override fun map(name: String, birthYear: String, url: String, films: List<String>) =
            PersonDomainModel(name, birthYear, url, films)
    }
}