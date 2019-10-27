package com.crocusoft.repository

import com.crocusoft.network.API
import com.crocusoft.pojo.daily.DailyMainResponsePOJO
import com.crocusoft.pojo.hourly.HourlyMainResponsePOJO
import com.crocusoft.utils.API_KEY
import com.crocusoft.utils.COUNTRY_LAT
import com.crocusoft.utils.COUNTRY_LON
import com.crocusoft.utils.DAY_COUNT

object ForecastFragmentRepository {

    suspend fun getDailyForecast(): DailyMainResponsePOJO =
        API.apiService.getDailyForecast(COUNTRY_LAT, COUNTRY_LON, DAY_COUNT, API_KEY)

    suspend fun getHourlyForecast(): HourlyMainResponsePOJO =
        API.apiService.getHourlyForecast(COUNTRY_LAT, COUNTRY_LON, API_KEY)

}