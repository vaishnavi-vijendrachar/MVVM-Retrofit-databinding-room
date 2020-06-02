package com.vaishnavi.aadc1.repository.remote

import com.vaishnavi.aadc1.data.Weather
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.GET

interface WeatherApi {
    @GET("/api/location/44418/")
    fun getWeatherDetails() : Call<Weather>
}