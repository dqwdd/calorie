package com.calorie.caloriecalculater.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.apipractice.json.ItemData
import com.example.apipractice.json.Library
import com.calorie.caloriecalculater.R
import com.calorie.caloriecalculater.adapters.CalorieViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_calorie.*
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CalorieFragment : BaseFragment() {

    companion object {
        private var frag : CalorieFragment? = null
        fun getFrag() : CalorieFragment {
            if (frag == null) {
                frag = CalorieFragment()
            }
            return frag!!
        }
    }

    val key = "ZttZgKaWHUnvsLX%2FB8UWGVI9d3Uj6PqProTiP2Dnq78CyAgcSK6%2B%2F1r%2FdtmJoWXOTNDBb2G1PxVYeB32Iq6teA%3D%3D"

    val mItemList = ArrayList<ItemData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calorie, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureTopNavigation()
        aa()
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }

    private fun configureTopNavigation(){
        CalorieViewPager.adapter = CalorieViewPagerAdapter(childFragmentManager)
        CalorieTabLayout.setupWithViewPager(CalorieViewPager)
    }

    fun aa() {

        apiService.getRequestCalorieData(key).enqueue(object : Callback<Library> {
            override fun onResponse(call: Call<Library>, response: Response<Library>) {
                if (response.isSuccessful) {

                    Log.d("?????? ??????",response.body()!!.toString())

                    val basicResponse = response.body()!!
                    mItemList.addAll(basicResponse.body.items)


                    /*
                    var items = arrayOf("SM3", "SM5", "SM7", "SONATA", "AVANTE", "SOUL", "K5", "K7")

                    var autoCompleteTextView = view?.findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
                    var adapterr = ArrayAdapter<String>(mContext, android.R.layout.simple_dropdown_item_1line, items)
                    if (autoCompleteTextView != null) {
                        autoCompleteTextView.setAdapter(adapterr)
                    }
                    */




                }
                else {
                    val jsonObj = JSONObject(response.errorBody()!!.string())
                    Log.d("?????? ??????", jsonObj.toString())
                }

            }

            override fun onFailure(call: Call<Library>, t: Throwable) {
                Log.d("?????? ??????", call.toString())
            }
        })



    }

}
