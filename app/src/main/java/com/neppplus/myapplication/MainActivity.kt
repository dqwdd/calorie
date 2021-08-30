package com.neppplus.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.ActionBar
import com.neppplus.myapplication.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
//프로그레스바 100이어도 올라가는 비율 적당하게 하고
//200일때도 일정하게 보이게 하고 그런거

// 칼로리 오픈 API 사용할건데
// for문 돌리면 되는건지

// 운동 누르면 해당 운동 이미지 움직이게 하고 싶은데 로티로 해결이 되는지 아니면 다른거 써야하는지

//

class MainActivity : BaseActivity() {

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




