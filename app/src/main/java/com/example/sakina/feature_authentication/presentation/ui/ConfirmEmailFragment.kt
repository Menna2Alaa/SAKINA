package com.example.sakina.feature_authentication.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sakina.MainActivity
import com.example.sakina.databinding.FragmentConfirmEmailBinding
import com.example.sakina.feature_authentication.presentation.view_model.AuthViewModel


class ConfirmEmailFragment : Fragment() {

    lateinit var binding: FragmentConfirmEmailBinding
    lateinit var viewModel: AuthViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentConfirmEmailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).authViewModel


    }

    override fun onResume() {
        super.onResume()

    }


}