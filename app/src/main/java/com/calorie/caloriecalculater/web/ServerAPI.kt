package com.example.databinding20210910.web

import android.content.Context
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServerAPI {

    companion object {
        //        서버 주소
        val hostURL = "http://apis.data.go.kr"

        private var retrofit : Retrofit? = null

        fun getRetrofit(context: Context) : Retrofit {

            if (retrofit == null) {

                val interceptor = Interceptor {
                    with(it) {

                        val newRequest = request().newBuilder()
                            .build()

                        proceed(newRequest)
                    }
                }

                val gson = GsonBuilder().setLenient().create()

                retrofit = Retrofit.Builder()
                    .baseUrl(hostURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
    }

}