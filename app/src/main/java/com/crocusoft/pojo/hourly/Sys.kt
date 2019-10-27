package com.crocusoft.pojo.hourly

import com.google.gson.annotations.SerializedName

data class Sys(
    @SerializedName("pod") val pod: String
) {
    override fun toString(): String {
        return "Pod - $pod"
    }
}