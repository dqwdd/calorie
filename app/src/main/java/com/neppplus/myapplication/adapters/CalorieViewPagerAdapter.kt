package com.neppplus.myapplication.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.myapplication.fragments.caloriefragments.EveningFragment
import com.neppplus.myapplication.fragments.caloriefragments.LunchFragment
import com.neppplus.myapplication.fragments.caloriefragments.MoriningFragment
import com.neppplus.myapplication.fragments.caloriefragments.SnackFragment
import com.neppplus.myapplication.fragments.profilefragments.DayFragment
import com.neppplus.myapplication.fragments.profilefragments.MonthFragment
import com.neppplus.myapplication.fragments.profilefragments.WeekFragment
import com.neppplus.myapplication.fragments.profilefragments.YearFragment

class CalorieViewPagerAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm) {

//    private val fragmentTitleList = mutableListOf("일별", "주별", "월별", "연별")
//
//    override fun getPageTitle(position: Int): CharSequence? {
//        return return fragmentTitleList[position]
//    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "아침"
            1 -> "점심"
            2 -> "저녁"
            else -> "간식 등"
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MoriningFragment()
            1 -> LunchFragment()
            2 -> EveningFragment()
            else -> SnackFragment()
        }
    }
}