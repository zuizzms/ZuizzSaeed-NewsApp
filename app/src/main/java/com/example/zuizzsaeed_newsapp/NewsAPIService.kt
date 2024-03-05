package com.example.zuizzsaeed_newsapp
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Query

//  Retrofit interface representing API endpoints

private const val key = "583e26f15851451683e51b6b3b49f4be"

interface NewsApiService {
    @GET("top-headlines")
    fun getTopHeadlines(
        @Query("country") country: String,
        @Query("category") category: String?,
        @Query("apiKey") apiKey: String = key

    ): Call<News>
}
