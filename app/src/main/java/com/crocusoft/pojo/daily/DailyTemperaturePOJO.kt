package com.crocusoft.pojo.daily

import com.google.gson.annotations.SerializedName

data class DailyTemperaturePOJO(
    @SerializedName("day") val day: Double,
    @SerializedName("min") val min: Double,
    @SerializedName("max") val max: Double,
    @SerializedName("night") val night: Double,
    @SerializedName("eve") val evening: Double,
    @SerializedName("morn") val morning: Double
)