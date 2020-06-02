package com.vaishnavi.aadc1.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.vaishnavi.aadc1.data.Weather
import com.vaishnavi.aadc1.repository.WeatherRepository

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val context = application.applicationContext
    lateinit var weather : MutableLiveData<Weather>
    fun getWeatherDetailsFor(city: String): MutableLiveData<Weather> {
        return WeatherRepository(context).getWeatherDetailsFor(city)
    }
}
