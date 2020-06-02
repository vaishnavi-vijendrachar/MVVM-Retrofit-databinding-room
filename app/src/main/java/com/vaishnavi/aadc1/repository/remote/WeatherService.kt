package com.vaishnavi.aadc1.repository.remote

import android.provider.SyncStateContract
import com.vaishnavi.aadc1.URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeatherService {
    companion object {
        fun getRetrofitInstance() : WeatherApi{

            val retrofit = Retrofit.Builder().baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create()).build()
            return retrofit.create(WeatherApi::class.java)
        }
    }
}