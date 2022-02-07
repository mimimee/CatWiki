package com.itsnotme.starwars.domain.person

data class PersonDomainModel(
    private val name: String,
    private val birthYear: String,
    private val url: String,
    private val films: List<String>
)