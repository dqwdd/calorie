package com.neppplus.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.neppplus.myapplication.R
import com.neppplus.myapplication.adapters.CalorieViewPagerAdapter
import com.neppplus.myapplication.adapters.ProfileViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_calorie.*
import kotlinx.android.synthetic.main.fragment_profile.*

class CalorieFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calorie, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureTopNavigation()
        setupEvents()
        setValues()
    }

    private fun configureTopNavigation(){
        CalorieViewPager.adapter = CalorieViewPagerAdapter(childFragmentManager)
        CalorieTabLayout.setupWithViewPager(CalorieViewPager)
    }


    fun setupEvents() {
    }

    fun setValues() {}



}
