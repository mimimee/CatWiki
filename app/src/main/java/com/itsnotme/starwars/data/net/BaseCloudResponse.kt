package com.itsnotme.starwars.data.net

import com.google.gson.annotations.SerializedName

abstract class BaseCloudResponse<T> {
    @SerializedName("count") val count: Int = 0
    @SerializedName("next") var next: String = ""
    @SerializedName("previous") val previous: String = ""
    @SerializedName("results") val results: T? = null
}