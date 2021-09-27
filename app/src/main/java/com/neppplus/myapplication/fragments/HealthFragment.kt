package com.neppplus.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.neppplus.myapplication.R
import kotlinx.android.synthetic.main.fragment_health.*

class HealthFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_health, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        button.setOnClickListener {
            val inputText = button.text.toString()
            health_title.text = inputText
        }

        button2.setOnClickListener {
            val inputText = button2.text.toString()
            health_title.text = inputText
        }

        button3.setOnClickListener {
            val inputText = button3.text.toString()
            health_title.text = inputText
        }

        button4.setOnClickListener {
            val inputText = button4.text.toString()
            health_title.text = inputText
        }

    }

    override fun setValues() {
    }

}
