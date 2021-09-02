package com.neppplus.myapplication.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.neppplus.myapplication.R
import com.neppplus.myapplication.adapters.ProfileViewPagerAdapter
import com.neppplus.myapplication.fragments.profilefragments.DayFragment
import com.neppplus.myapplication.fragments.profilefragments.MonthFragment
import com.neppplus.myapplication.fragments.profilefragments.WeekFragment
import com.neppplus.myapplication.fragments.profilefragments.YearFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {

    lateinit var myFragment: View
    lateinit var viewPagers: ViewPager
    lateinit var tabLayouts: TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.fragment_profile, container, false)
        return myFragment
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setUpViewPager()
        tabLayouts.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
            }
        })
    }


    @SuppressLint("UseRequireInsteadOfGet")
    private fun setUpViewPager() {
        viewPagers = profileViewPager
        tabLayouts = profileTabLayout

        var adapter = ProfileViewPagerAdapter(fragmentManager!!)
        adapter.addFragment(DayFragment(), "Day")
        adapter.addFragment(WeekFragment(), "Week")
        adapter.addFragment(MonthFragment(), "Month")
        adapter.addFragment(YearFragment(), "Year")

        viewPagers!!.adapter = adapter
        tabLayouts!!.setupWithViewPager(viewPagers)
    }


}