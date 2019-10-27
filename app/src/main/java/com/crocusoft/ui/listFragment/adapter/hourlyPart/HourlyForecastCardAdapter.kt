package com.crocusoft.ui.listFragment.adapter.hourlyPart

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.crocusoft.R
import com.crocusoft.databinding.ItemForecastPreviewBinding
import com.crocusoft.pojo.hourly.HourlyForecastPOJO
import com.crocusoft.ui.listFragment.ListFragment
import com.crocusoft.utils.inflate

class HourlyForecastCardAdapter(private val fragment: ListFragment) :
    ListAdapter<HourlyForecastPOJO, HourlyForecastCardViewHolder>(
        HourlyForecastDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HourlyForecastCardViewHolder {
        return HourlyForecastCardViewHolder(
            ItemForecastPreviewBinding.bind(
                parent.inflate(R.layout.item_forecast_preview)
            )
        )
    }

    override fun onBindViewHolder(holder: HourlyForecastCardViewHolder, position: Int) {
        holder.bind(getItem(position), position)
        holder.itemView.setOnClickListener { fragment.navigateDetailedForecastFragment(getItem(position).toString()) }
    }

}