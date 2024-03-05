package com.example.zuizzsaeed_newsapp
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.zuizzsaeed_newsapp.NewsApiService
import com.example.zuizzsaeed_newsapp.Article
import com.example.zuizzsaeed_newsapp.News
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.Date
import java.util.UUID

class NewsListViewModel : ViewModel() {

    private val articles = mutableListOf<Article>()
    private val source = Source(id = "source_id", name = "Test Source")
    private val author = "author!"
    private val title = "title!"
    private val description = "description!"
    private val url = "url!"
    private val urlToImage = "urlToImage!"
    private val publishedAt = "publishedAt!"
    private val content = "content!"
    init {
        for (i in 0 until 100) {
            val article = Article(
                source = source,
                author = author,
                title = title,
                description = description,
                url = url,
                urlToImage = urlToImage,
                publishedAt = publishedAt,
                content = content
            )

            articles += article
        }
    }
    }