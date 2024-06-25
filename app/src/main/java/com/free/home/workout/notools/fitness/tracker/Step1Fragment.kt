package com.free.home.workout.notools.fitness.tracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.free.home.workout.notools.fitness.tracker.adapter.ListAdapter
import com.free.home.workout.notools.fitness.tracker.base.BaseFragment
import com.free.home.workout.notools.fitness.tracker.data.ListData
import com.free.home.workout.notools.fitness.tracker.databinding.FragmentStep1Binding

class Step1Fragment : BaseFragment<FragmentStep1Binding>(FragmentStep1Binding::inflate) {
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    val imageList = intArrayOf(
        R.drawable.ic_man,
        R.drawable.ic_woman,
        R.drawable.ic_neutral,
    )
    val nameList = arrayOf("Man", "Woman", "Gender Neutral")
    override fun setListener() {
        dataArrayList.clear()
        for (i in imageList.indices) {
            listData = ListData(
                imageList[i],
                nameList[i]
            )
            dataArrayList.add(listData)
        }

        listAdapter = ListAdapter(requireContext(), dataArrayList)
        binding.listview.adapter = listAdapter

        binding.listview.isClickable = true
        binding.listview.itemsCanFocus = true

        binding.listview.onItemClickListener =
            AdapterView.OnItemClickListener { _, view, _, _ ->
                view.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.lavender))
            }

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_step1Fragment_to_step2Fragment)
        }
    }

    override fun allObserver() {
    }




}