package com.rodrigo.applicationworkapi.model

import com.google.gson.annotations.SerializedName

data class Produto (
    @SerializedName("id")
    val id: String,
    @SerializedName("prname")
    val prName: String,
    @SerializedName("primage")
    val prImage: String,
    @SerializedName("prprice")
    val prPrice: String


)

