package com.free.home.workout.notools.fitness.tracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.free.home.workout.notools.fitness.tracker.databinding.FragmentOnBoarding1Binding

class OnBoarding1Fragment : Fragment() {
    private lateinit var binding: FragmentOnBoarding1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnBoarding1Binding.inflate(inflater, container, false)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_onBoarding1Fragment_to_onBoarding2Fragment)
        }

        return binding.root
    }

}