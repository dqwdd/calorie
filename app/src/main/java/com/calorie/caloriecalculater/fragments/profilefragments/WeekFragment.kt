package com.calorie.caloriecalculater.fragments.profilefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.calorie.caloriecalculater.R
import com.calorie.caloriecalculater.fragments.BaseFragment

class WeekFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_week, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()
    }



    override fun setupEvents() {
    }

    override fun setValues() {
    }

}