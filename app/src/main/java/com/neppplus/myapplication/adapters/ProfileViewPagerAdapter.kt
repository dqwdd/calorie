package com.neppplus.myapplication.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.myapplication.fragments.profilefragments.DayFragment
import com.neppplus.myapplication.fragments.profilefragments.MonthFragment
import com.neppplus.myapplication.fragments.profilefragments.WeekFragment
import com.neppplus.myapplication.fragments.profilefragments.YearFragment

class ProfileViewPagerAdapter ( fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "일별"
            1 -> "주별"
            2 -> "월별"
            else -> "년별"
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