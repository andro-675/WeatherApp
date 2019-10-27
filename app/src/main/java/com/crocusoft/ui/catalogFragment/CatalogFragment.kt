package com.crocusoft.ui.catalogFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.crocusoft.R
import kotlinx.android.synthetic.main.fragment_catalog.*

class CatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setListeners()
    }

    private fun setListeners() {
        card_view_daily_forecast.setOnClickListener { findNavController().navigate(R.id.action_catalogFragment_to_listFragment, bundleOf("choice" to 1)) }
        card_view_hourly_forecast.setOnClickListener { findNavController().navigate(R.id.action_catalogFragment_to_listFragment, bundleOf("choice" to 2)) }
    }

}
