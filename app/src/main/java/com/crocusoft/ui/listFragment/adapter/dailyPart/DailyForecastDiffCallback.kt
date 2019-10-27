package com.crocusoft.ui.listFragment.adapter.dailyPart

import androidx.recyclerview.widget.DiffUtil
import com.crocusoft.pojo.daily.DailyWeatherInfoPOJO

class DailyForecastDiffCallback : DiffUtil.ItemCallback<DailyWeatherInfoPOJO>() {

    override fun areItemsTheSame(oldItem: DailyWeatherInfoPOJO, newItem: DailyWeatherInfoPOJO): Boolean {
        return oldItem.dt == newItem.dt
    }

    override fun areContentsTheSame(oldItem: DailyWeatherInfoPOJO, newItem: DailyWeatherInfoPOJO): Boolean {
        return oldItem == newItem
    }

}