package com.itsnotme.starwars.data.person.cloud

import com.google.gson.annotations.SerializedName

class PersonListCloudResponse(
    @SerializedName("count") val count: Int = 0,
    @SerializedName("next") var next: String = "",
    @SerializedName("previous") val previous: String = "",
    @SerializedName("results") val results: List<PersonCloudModel> = emptyList()
)

class PersonCloudModel(
    @SerializedName("name") val name: String = "",
    @SerializedName("birth_year") val birthYear: String = "",
    @SerializedName("url") val url: String = "",
    @SerializedName("films") val films: List<String> = emptyList()
)