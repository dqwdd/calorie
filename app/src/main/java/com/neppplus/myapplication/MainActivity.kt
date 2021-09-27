package com.neppplus.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.ActionBar
import androidx.core.view.ViewCompat.setNestedScrollingEnabled
import androidx.viewpager.widget.ViewPager
import com.neppplus.myapplication.adapters.FoodCalorieDataRecyclerAdapter
import com.neppplus.myapplication.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_calendar.*
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter

//

class MainActivity : BaseActivity() {

    val key = "ZttZgKaWHUnvsLX%2FB8UWGVI9d3Uj6PqProTiP2Dnq78CyAgcSK6%2B%2F1r%2FdtmJoWXOTNDBb2G1PxVYeB32Iq6teA%3D%3D"

//    https://everybody-yeah.tistory.com/6



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
        configureBottomNavigation()

}

    override fun setupEvents() {
    }

    override fun setValues() {
    }

    class SwipeLockableViewPager(context: Context, attrs: AttributeSet): ViewPager(context, attrs) {
        private var swipeEnabled = false

        override fun onTouchEvent(event: MotionEvent): Boolean {
            return when (swipeEnabled) {
                true -> super.onTouchEvent(event)
                false -> false
            }
        }

        override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
            return when (swipeEnabled) {
                true -> super.onInterceptTouchEvent(event)
                false -> false
            }
        }

        fun setSwipePagingEnabled(swipeEnabled: Boolean) {
            this.swipeEnabled = swipeEnabled
        }
    }

    private fun configureBottomNavigation(){
        mainViewPager.adapter = MainViewPagerAdapter(supportFragmentManager)
        mainBottomMenu.setupWithViewPager(mainViewPager)

        val bottomNaviLayout: View = this.layoutInflater.inflate(R.layout.bottom_navigation_tab, null, false)

        mainBottomMenu.getTabAt(0)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_home_tab) as RelativeLayout
        mainBottomMenu.getTabAt(1)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_search_tab) as RelativeLayout
        mainBottomMenu.getTabAt(2)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_add_tab) as RelativeLayout
        mainBottomMenu.getTabAt(3)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_like_tab) as RelativeLayout
    }

}















