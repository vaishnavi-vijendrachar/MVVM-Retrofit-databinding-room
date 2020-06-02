package com.vaishnavi.aadc1.data

data class Weather (
    val sun_rise : String,
    val sun_set : String,
    val timezone: String,
    val consolidated_weather : List<WeatherDetails>
)