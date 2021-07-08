package com.frankmorara.navcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.frankmorara.navcomponent.databinding.FragmentHomeBinding

class HomeFragment: Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

//        Setting a click listener on continue button to find the navController that moves the home fragment to the login fragment
        val continueButton = binding.buttonContinue
        continueButton.setOnClickListener {
            val action = R.id.action_homeFragment_to_loginFragment
            findNavController().navigate(action)
        }
        return binding.root
    }
}