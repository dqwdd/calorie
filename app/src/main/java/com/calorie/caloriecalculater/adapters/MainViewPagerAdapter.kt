package com.calorie.caloriecalculater.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.calorie.caloriecalculater.fragments.*

class MainViewPagerAdapter ( fm : FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        return when( position ) {
            0 -> CalorieFragment()
            1 -> HealthFragment()
            2 -> CalendarFragment()
            else -> ProfileFragment()
        }
    }

}