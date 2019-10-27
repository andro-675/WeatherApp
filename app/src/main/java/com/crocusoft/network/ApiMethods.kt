package com.crocusoft.network

import com.crocusoft.pojo.daily.DailyMainResponsePOJO
import com.crocusoft.pojo.hourly.HourlyMainResponsePOJO
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiMethods {

    @GET("daily")
    suspend fun getDailyForecast(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("cnt") count: Int,
        @Query("APPID") appKey: String
    ): DailyMainResponsePOJO

    @GET("hourly")
    suspend fun getHourlyForecast(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("APPID") appKey: String
    ): HourlyMainResponsePOJO

}