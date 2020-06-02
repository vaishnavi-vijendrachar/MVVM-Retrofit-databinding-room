package com.vaishnavi.aadc1.data

data class WeatherDetails (
    val id  : Long,
    val weather_state_name : String,
    val applicable_date : String,
    val min_temp : Double,
    val max_temp : Double,
    val the_temp : Double,
    val humidity: Long,
    val weather_state_abbr : String
)
