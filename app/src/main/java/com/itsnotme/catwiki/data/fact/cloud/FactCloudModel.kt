package com.itsnotme.catwiki.data.fact.cloud

import com.google.gson.annotations.SerializedName

class FactCloudModel(
    @SerializedName("_id") val id: Int = 0,
    @SerializedName("text") var text: String = "",
    @SerializedName("updatedAt") val updatedAt: String = "",
    @SerializedName("sentCount") val sentCount: Int = 0,
)