package com.calorie.caloriecalculater

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()


        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({

            val myIntent = Intent(mContext, MainActivity::class.java)
            startActivity(myIntent)
            finish()

        }, 2500)

    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }

}