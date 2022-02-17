package com.itsnotme.catwiki.data.fact.cloud

import com.google.gson.annotations.SerializedName

data class FactCloudModel(
    @SerializedName("_id") val id: String = "",
    @SerializedName("text") var text: String = "",
    @SerializedName("updatedAt") val updatedAt: String = "",
    @SerializedName("status") val status: Status
)

data class Status(@SerializedName("sentCount") val sentCount: Int = 0)