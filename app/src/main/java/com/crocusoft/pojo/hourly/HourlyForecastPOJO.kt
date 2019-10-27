package com.crocusoft.pojo.hourly

import com.crocusoft.pojo.WeatherPropertiesPOJO
import com.google.gson.annotations.SerializedName

data class HourlyForecastPOJO(
    @SerializedName("dt") val dt: Long,
    @SerializedName("main") val main: Main,
    @SerializedName("weather") val weather: List<WeatherPropertiesPOJO>,
    @SerializedName("clouds") val clouds: Clouds,
    @SerializedName("wind") val wind: Wind,
    @SerializedName("sys") val sys: Sys,
    @SerializedName("dt_txt") val date: String
) {
    override fun toString(): String {
        return "Main - $main\n\n" +
                "Weather - ${weather[0]}\n\n" +
                "Clouds - $clouds\n\n" +
                "Wind - $wind\n\n" +
                "Sys - $sys\n\n" +
                date
    }
}