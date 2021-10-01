package com.calorie.caloriecalculater.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.calorie.caloriecalculater.R
import com.calorie.caloriecalculater.adapters.ProfileViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureTopNavigation()
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }


    private fun configureTopNavigation(){
        ProfileViewPager.adapter = ProfileViewPagerAdapter(childFragmentManager)
        ProfileTabLayout.setupWithViewPager(ProfileViewPager)
    }


}