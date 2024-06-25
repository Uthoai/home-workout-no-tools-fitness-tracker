package com.free.home.workout.notools.fitness.tracker.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.free.home.workout.notools.fitness.tracker.R
import com.free.home.workout.notools.fitness.tracker.data.ListData

class ListAdapter(context: Context, dataArrayList: ArrayList<ListData?>?) :
    ArrayAdapter<ListData?>(context, R.layout.choose_item_layout, dataArrayList!!) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var view = view
        val listData = getItem(position)
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.choose_item_layout, parent, false)
        }
        val listImage = view!!.findViewById<ImageView>(R.id.ic_itemIcon)
        val listName = view.findViewById<TextView>(R.id.tv_itemTitle)
        listImage.setImageResource(listData!!.image)
        listName.text = listData.name



        return view
    }
}