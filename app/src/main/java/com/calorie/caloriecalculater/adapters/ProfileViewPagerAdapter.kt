package com.calorie.caloriecalculater.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.calorie.caloriecalculater.fragments.profilefragments.DayFragment
import com.calorie.caloriecalculater.fragments.profilefragments.MonthFragment
import com.calorie.caloriecalculater.fragments.profilefragments.WeekFragment
import com.calorie.caloriecalculater.fragments.profilefragments.YearFragment

class ProfileViewPagerAdapter ( fm : FragmentManager) : FragmentPagerAdapter(fm) {

//    private val fragmentTitleList = mutableListOf("일별", "주별", "월별", "연별")
//
//    override fun getPageTitle(position: Int): CharSequence? {
//        return return fragmentTitleList[position]
//    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "일별"
            1 -> "주별"
            2 -> "월별"
            else -> "연별"
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> DayFragment()
            1 -> WeekFragment()
            2 -> MonthFragment()
            else -> YearFragment()
        }
    }
}