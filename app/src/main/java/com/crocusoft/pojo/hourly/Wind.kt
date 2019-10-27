package com.crocusoft.pojo.hourly

import com.google.gson.annotations.SerializedName

data class Wind(
    @SerializedName("speed") val speed: Double,
    @SerializedName("deg") val degree: Double
) {
    override fun toString(): String {
        return "Speed - $speed\n\n" +
               "Degree - $degree"
    }
}