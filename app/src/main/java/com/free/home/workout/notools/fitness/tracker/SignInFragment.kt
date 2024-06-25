package com.free.home.workout.notools.fitness.tracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.free.home.workout.notools.fitness.tracker.base.BaseFragment
import com.free.home.workout.notools.fitness.tracker.databinding.FragmentSignInBinding

class SignInFragment : BaseFragment<FragmentSignInBinding>(FragmentSignInBinding::inflate) {
    override fun setListener() {
        binding.tvSignup.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }
    }

    override fun allObserver() {
    }

}