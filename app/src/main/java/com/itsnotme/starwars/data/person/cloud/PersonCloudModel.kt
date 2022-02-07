package com.itsnotme.starwars.data.person.cloud

import com.google.gson.annotations.SerializedName

data class PersonCloudModel(
    @SerializedName("name") private val name: String,
    @SerializedName("birth_year") private val birthYear: String,
    @SerializedName("url") private val url: String,
    @SerializedName("films") private val films: List<String>
)