package com.vaishnavi.aadc1.repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.google.gson.JsonObject
import com.vaishnavi.aadc1.data.Weather
import com.vaishnavi.aadc1.repository.remote.WeatherService
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherRepository(private val context: Context) {

     fun getWeatherDetailsFor(city: String): MutableLiveData<Weather> {
        var data = MutableLiveData<Weather>()
        lateinit var weatherdata : Weather

        val call = WeatherService.getRetrofitInstance().getWeatherDetails()

        call.enqueue(object : Callback<Weather> {
            override fun onFailure(call: Call<Weather>, t: Throwable) {
                Log.v("Vish", "ERROR")
                t.printStackTrace()
                data.value = null
            }
            override fun onResponse(call: Call<Weather>, response: Response<Weather>) {
                if(response.isSuccessful) {
                    response.body()?.let {
                        weatherdata = Weather(
                            it.sun_rise,
                            it.sun_set,
                            it.timezone,
                            it.consolidated_weather
                        )
                    }

                    data.value =  weatherdata
                }
            }

        })

        return data
    }

}