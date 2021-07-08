package com.frankmorara.navcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frankmorara.navcomponent.databinding.FragmentInfoBinding

class InfoFragment: Fragment(R.layout.fragment_info) {
    private lateinit var binding: FragmentInfoBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentInfoBinding.inflate(layoutInflater)
        return binding.root

    }
}