package com.crocusoft.pojo.hourly

import com.google.gson.annotations.SerializedName

data class HourlyMainResponsePOJO(
    @SerializedName("cod") val code: String,
    @SerializedName("message") val message: Double,
    @SerializedName("cnt") val cnt: Int,
    @SerializedName("list") val hourlyForecast: List<HourlyForecastPOJO>
)