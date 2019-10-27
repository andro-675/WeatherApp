package com.crocusoft.ui.listFragment.adapter.hourlyPart

import androidx.recyclerview.widget.DiffUtil
import com.crocusoft.pojo.hourly.HourlyForecastPOJO

class HourlyForecastDiffCallback : DiffUtil.ItemCallback<HourlyForecastPOJO>() {
    override fun areItemsTheSame(
        oldItem: HourlyForecastPOJO,
        newItem: HourlyForecastPOJO
    ): Boolean {
        return oldItem.dt == newItem.dt
    }

    override fun areContentsTheSame(
        oldItem: HourlyForecastPOJO,
        newItem: HourlyForecastPOJO
    ): Boolean {
        return oldItem == newItem
    }
}