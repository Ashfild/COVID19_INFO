package com.example.info_covid19.model

data class IndonesiaResponse(
    val name: String,
    val positif: String,
    val sembuh: String,
    val meninggal: String,
    val dirawat: String
)