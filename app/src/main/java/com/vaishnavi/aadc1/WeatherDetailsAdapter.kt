package com.vaishnavi.aadc1

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.vaishnavi.aadc1.data.WeatherDetails
import com.vaishnavi.aadc1.databinding.WeatherDetailsItemBinding

class WeatherDetailsAdapter(val context: Context, var list: List<WeatherDetails>) :
    RecyclerView.Adapter<WeatherDetailsAdapter.WeatherViewHolder>() {
    class WeatherViewHolder(binding: WeatherDetailsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var listBinding = binding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        var binding: WeatherDetailsItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.weather_details_item,
            parent,
            false
        )
        return WeatherViewHolder(binding)
    }

    override fun getItemCount(): Int {
        Log.d("vish", "size" + list.size)
        return list.size
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        holder.listBinding.date.text = list[position].applicable_date
        holder.listBinding.humidity.text =
            context.getString(R.string.humidity_label) + context.getString(R.string.empty) + list[position].humidity.toString()
        holder.listBinding.temp.text = list[position].the_temp.toString() + " C"
        holder.listBinding.weatherState.text = list[position].weather_state_name
        holder.listBinding.maxTemp.text =
            context.getString(R.string.max_label) + context.getString(R.string.empty) + list[position].max_temp.toString()
        holder.listBinding.minTemp.text =
            context.getString(R.string.min_label) + context.getString(R.string.empty) + list[position].min_temp.toString()
        val imgUrl =
            "https://www.metaweather.com/static/img/weather/png/" + list[position].weather_state_abbr + ".png"

        Glide.with(holder.listBinding.image.context).load(imgUrl).into(holder.listBinding.image)

        holder.listBinding.cardLayout.setOnClickListener {

        }
    }

}
