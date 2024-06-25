package com.free.home.workout.notools.fitness.tracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.free.home.workout.notools.fitness.tracker.databinding.FragmentOnBoarding2Binding

class OnBoarding2Fragment : Fragment() {
    private lateinit var binding: FragmentOnBoarding2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnBoarding2Binding.inflate(inflater, container, false)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_onBoarding2Fragment_to_signInFragment)
        }

        return binding.root
    }

}