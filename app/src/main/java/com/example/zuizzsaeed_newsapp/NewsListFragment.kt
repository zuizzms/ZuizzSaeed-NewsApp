package com.example.zuizzsaeed_newsapp
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zuizzsaeed_newsapp.Article
import com.example.zuizzsaeed_newsapp.NewsDetailFragment
import com.example.zuizzsaeed_newsapp.NewsListAdapter
import com.example.zuizzsaeed_newsapp.R
import com.example.zuizzsaeed_newsapp.databinding.FragmentNewsListBinding
import com.example.zuizzsaeed_newsapp.NewsListViewModel

class NewsListFragment : Fragment() {

    private val viewModel: NewsListViewModel by viewModels()
    private lateinit var binding: FragmentNewsListBinding
    private lateinit var newsListAdapter: NewsListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsListBinding.inflate(inflater, container, false)
        binding?.newsRecyclerView?.layoutManager = LinearLayoutManager(context)
        // newsListAdapter = NewsListAdapter(emptyList(), this::onArticleClicked)
        binding?.newsRecyclerView?.adapter = newsListAdapter

        return binding!!.root
    }

}


