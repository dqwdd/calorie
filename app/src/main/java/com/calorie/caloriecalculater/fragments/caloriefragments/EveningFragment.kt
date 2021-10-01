package com.calorie.caloriecalculater.fragments.caloriefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.calorie.caloriecalculater.R
import com.calorie.caloriecalculater.fragments.BaseFragment

class EveningFragment : BaseFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.calorie_fragment_evening, container, false)
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