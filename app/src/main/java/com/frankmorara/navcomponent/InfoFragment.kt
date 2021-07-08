package com.frankmorara.navcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.frankmorara.navcomponent.databinding.FragmentInfoBinding

class InfoFragment: Fragment(R.layout.fragment_info) {
    private lateinit var binding: FragmentInfoBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentInfoBinding.inflate(layoutInflater)

        val okButton = binding.buttonOk
        okButton.setOnClickListener {
            val action = R.id.action_infoFragment_to_homeFragment
            findNavController().navigate(action)
        }
        return binding.root

    }
}