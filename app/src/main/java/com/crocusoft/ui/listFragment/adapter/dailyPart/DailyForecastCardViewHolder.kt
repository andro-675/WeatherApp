package com.crocusoft.ui.listFragment.adapter.dailyPart

import android.view.Gravity
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.crocusoft.R
import com.crocusoft.databinding.ItemForecastPreviewBinding
import com.crocusoft.pojo.daily.DailyWeatherInfoPOJO

class DailyForecastCardViewHolder(
    private val binding: ItemForecastPreviewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(data: DailyWeatherInfoPOJO, position: Int) {
        binding.apply {

            mainForecast = data.weather[0].main

            val iconID = getIcon(data.weather[0].main)

            if (position % 2 == 0) {
                imageViewRightCard.setImageResource(iconID)
                imageViewLeftCard.visibility = View.GONE
                textViewMainForecast.gravity = Gravity.START
            } else {
                imageViewLeftCard.setImageResource(iconID)
                imageViewRightCard.visibility = View.GONE
                textViewMainForecast.gravity = Gravity.END
            }

            executePendingBindings()

        }
    }

    private fun getIcon(main: String): Int {
        return when (main) {
            "Clear" -> R.drawable.ic_sun
            "Rain" -> R.drawable.ic_rain
            "Clouds" -> R.drawable.ic_cloud
            else -> 0
        }
    }

}