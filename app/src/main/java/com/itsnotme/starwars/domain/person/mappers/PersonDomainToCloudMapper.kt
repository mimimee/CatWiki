package com.itsnotme.starwars.domain.person.mappers

import com.itsnotme.starwars.data.person.cloud.PersonCloudModel

interface PersonDomainToCloudMapper {
    fun map(name: String, birthYear: String, url: String, films: List<String>): PersonCloudModel

    class BaseImp : PersonDomainToCloudMapper {
        override fun map(name: String, birthYear: String, url: String, films: List<String>) =
            PersonCloudModel(name, birthYear, url, films)
    }
}