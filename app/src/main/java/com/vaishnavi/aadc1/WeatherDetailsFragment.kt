package com.vaishnavi.aadc1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.vaishnavi.aadc1.databinding.FragmentWeatherDetailsBinding

/**
 * A simple [Fragment] subclass.
 */
class WeatherDetailsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding : FragmentWeatherDetailsBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_weather_details, container, false)
        return binding.root
    }

}
