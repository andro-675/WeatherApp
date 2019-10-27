package com.crocusoft.network

import com.crocusoft.utils.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object API {

    private val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    val apiService: ApiMethods by lazy {
        retrofitBuilder
            .build()
            .create(ApiMethods::class.java)
    }

}