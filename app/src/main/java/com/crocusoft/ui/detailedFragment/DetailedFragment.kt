package com.crocusoft.ui.detailedFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.crocusoft.databinding.FragmentDetailedBinding

class DetailedFragment : Fragment() {

    lateinit var data: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = arguments!!.getString("data")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDetailedBinding.inflate(inflater, container, false)
        binding.allInfo = data
        return binding.root
    }

}
