package com.frankmorara.navcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.frankmorara.navcomponent.databinding.FragmentLoginBinding

class LoginFragment: Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)

        val loginButton = binding.buttonLogin
        loginButton.setOnClickListener {
            val action = R.id.action_loginFragment_to_infoFragment
            findNavController().navigate(action)
        }
        return binding.root
    }
}