package com.example.info_covid19.model

import com.google.gson.annotations.SerializedName

data class Province(
    @SerializedName("Kode Provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus Posi")
    val positive: Int,
    @SerializedName("Kasus Semb")
    val recover: Int,
    @SerializedName("Kasus Meni")
    val death: Int
)
