package com.crocusoft.pojo.daily

import com.crocusoft.pojo.WeatherPropertiesPOJO
import com.google.gson.annotations.SerializedName

data class DailyWeatherInfoPOJO(
    @SerializedName("dt") val dt: Long,
    @SerializedName("temp") val temperature: DailyTemperaturePOJO,
    @SerializedName("pressure") val pressure: Double,
    @SerializedName("humidity") val humidity: Int,
    @SerializedName("weather") val weather: List<WeatherPropertiesPOJO>,
    @SerializedName("speed") val speed: Double,
    @SerializedName("deg") val degree: Int,
    @SerializedName("clouds") val clouds: Int,
    @SerializedName("snow") val snow: Double
) {
    override fun toString(): String {
        return "Temperature - $temperature\n\n" +
               "Pressure - $pressure\n\n" +
               "Humidity - $humidity\n\n" +
               "Weather = {\n" +
               "\t\tMain - ${weather[0].main}\n" +
               "\t\tDescription - ${weather[0].description}\n}\n\n" +
               "Speed - $speed\n\n" +
               "Degree - $degree\n\n" +
               "Clouds - $clouds\n\n" +
               "Snow - $snow"
    }
}