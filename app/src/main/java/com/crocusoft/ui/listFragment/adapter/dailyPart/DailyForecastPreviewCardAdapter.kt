package com.crocusoft.ui.listFragment.adapter.dailyPart

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.crocusoft.R
import com.crocusoft.databinding.ItemForecastPreviewBinding
import com.crocusoft.pojo.daily.DailyWeatherInfoPOJO
import com.crocusoft.ui.listFragment.ListFragment
import com.crocusoft.utils.inflate

class DailyForecastPreviewCardAdapter(private val fragment: ListFragment) :
    ListAdapter<DailyWeatherInfoPOJO, DailyForecastCardViewHolder>(
        DailyForecastDiffCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyForecastCardViewHolder {
        return DailyForecastCardViewHolder(
            ItemForecastPreviewBinding.bind(
                parent.inflate(R.layout.item_forecast_preview)
            )
        )
    }

    override fun onBindViewHolder(holder: DailyForecastCardViewHolder, position: Int) {
        holder.bind(getItem(position), position)
        holder.itemView.setOnClickListener {
            fragment.navigateDetailedForecastFragment(
                getItem(position).toString()
            )
        }
    }

}