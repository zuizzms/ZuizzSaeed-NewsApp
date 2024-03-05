package com.example.zuizzsaeed_newsapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NewsAPIClient {
    private const val BASE_URL = "https://newsapi.org/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: NewsApiService = retrofit.create(NewsApiService::class.java)
}
