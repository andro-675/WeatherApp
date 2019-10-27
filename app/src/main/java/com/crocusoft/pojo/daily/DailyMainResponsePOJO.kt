package com.crocusoft.pojo.daily

import com.google.gson.annotations.SerializedName

data class DailyMainResponsePOJO (
    @SerializedName("cod") val code: String,
    @SerializedName("message") val message: Int,
    @SerializedName("cnt") val dayCount: Int,
    @SerializedName("list") val days: List<DailyWeatherInfoPOJO>
)