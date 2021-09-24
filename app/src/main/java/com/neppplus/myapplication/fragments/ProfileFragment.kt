package com.neppplus.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.neppplus.myapplication.R
import com.neppplus.myapplication.adapters.ProfileViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureTopNavigation()
    }


    private fun configureTopNavigation(){
        ProfileViewPager.adapter = ProfileViewPagerAdapter(childFragmentManager)
        ProfileTabLayout.setupWithViewPager(ProfileViewPager)
    }


}