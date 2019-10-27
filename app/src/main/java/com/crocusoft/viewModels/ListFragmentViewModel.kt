package com.crocusoft.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.crocusoft.repository.ForecastFragmentRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListFragmentViewModel: ViewModel() {

    var weatherForecast: MutableLiveData<Any> = MutableLiveData()

    fun getDailyForecast() = CoroutineScope(IO).launch {
        val response = ForecastFragmentRepository.getDailyForecast()
        withContext(Main) {
            weatherForecast.value = response
        }
    }

    fun getHourlyForecast() = CoroutineScope(IO).launch {
        val response = ForecastFragmentRepository.getHourlyForecast()
        withContext(Main) {
            weatherForecast.value = response
        }
    }

}