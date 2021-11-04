package com.example.databinding20210910.web

import com.example.apipractice.json.Library
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.*

interface ServerAPIService {

    @GET("/1470000/FoodNtrIrdntInfoService/getFoodNtrItdntList") //칼로리 데이터 얻는 주소
    fun getRequestCalorieData(
        @Query("ServiceKey", encoded = true) key: String,
        @Query("type") type: String="json") : Call<Library>

}