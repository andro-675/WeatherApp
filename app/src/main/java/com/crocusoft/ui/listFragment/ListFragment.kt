package com.crocusoft.ui.listFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.crocusoft.R
import com.crocusoft.pojo.daily.DailyMainResponsePOJO
import com.crocusoft.pojo.hourly.HourlyMainResponsePOJO
import com.crocusoft.ui.listFragment.adapter.dailyPart.DailyForecastPreviewCardAdapter
import com.crocusoft.ui.listFragment.adapter.hourlyPart.HourlyForecastCardAdapter
import com.crocusoft.viewModels.ListFragmentViewModel
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    lateinit var navController: NavController

    private val viewModel by lazy {
        ViewModelProvider(this).get(ListFragmentViewModel::class.java)
    }

    private val recyclerAdapterDaily by lazy {
        DailyForecastPreviewCardAdapter(
            this
        )
    }
    private val recyclerAdapterHourly by lazy {
        HourlyForecastCardAdapter(
            this
        )
    }

    private var choice: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        choice = arguments!!.getInt("choice")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onStart() {
        super.onStart()
        when(choice) {
            1 -> viewModel.getDailyForecast()
            2 -> viewModel.getHourlyForecast()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        configureRecyclerView()
        navController = Navigation.findNavController(view)
    }

    private fun configureRecyclerView() {
        recycler_view_forecast.adapter = when(choice) {
            1 -> recyclerAdapterDaily
            else -> recyclerAdapterHourly
        }
        viewModel.weatherForecast.observe(this, Observer {

            progress_bar.visibility = View.GONE

            when(choice) {
                1 -> recyclerAdapterDaily.submitList((it as DailyMainResponsePOJO).days)
                2 -> recyclerAdapterHourly.submitList((it as HourlyMainResponsePOJO).hourlyForecast)
            }
        })
    }

    fun navigateDetailedForecastFragment(data: String) {
        val bundle = bundleOf("data" to data)
        navController.navigate(R.id.action_listFragment_to_detailedFragment, bundle)
    }

}
