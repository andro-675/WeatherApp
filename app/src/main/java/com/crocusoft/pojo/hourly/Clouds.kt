package com.crocusoft.pojo.hourly

import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("all") val all: Int
){
    override fun toString(): String {
        return "All - $all"
    }
}