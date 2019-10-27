package com.crocusoft.pojo.hourly

import com.google.gson.annotations.SerializedName

data class Main(
    @SerializedName("temp") val temp: Double,
    @SerializedName("temp_min") val tempMin: Double,
    @SerializedName("temp_max") val tempMax: Double,
    @SerializedName("pressure") val pressure: Double,
    @SerializedName("sea_level") val seaLevel: Double,
    @SerializedName("grnd_level") val grndLevel: Double,
    @SerializedName("humidity") val humidity: Int,
    @SerializedName("temp_kf") val tempKf: Double
){
    override fun toString(): String {
        return "Temp - $temp\n\n" +
               "Temp Min - $tempMin\n\n" +
               "Temp Max - $tempMax\n\n" +
               "Pressure - $pressure\n\n" +
               "Sea Level - $seaLevel\n\n" +
               "Grnd Level - $grndLevel\n\n" +
               "Humidity - $humidity\n\n" +
               "TempKF - $tempKf"
    }
}