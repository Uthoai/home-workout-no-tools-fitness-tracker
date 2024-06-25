package com.free.home.workout.notools.fitness.tracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.free.home.workout.notools.fitness.tracker.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWelcomeBinding.inflate(inflater,container,false)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_onBoarding1Fragment)
        }

        return binding.root
    //return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

}