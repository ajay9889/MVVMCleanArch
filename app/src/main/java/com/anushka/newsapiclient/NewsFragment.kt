package com.anushka.newsapiclient

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.anushka.newsapiclient.data.util.Resource
import com.anushka.newsapiclient.databinding.FragmentNewsBinding
import com.anushka.newsapiclient.presentation.adapter.NewsAdapter
import com.anushka.newsapiclient.presentation.viewmodel.NewsViewModel

class NewsFragment : Fragment() {
    private var vieModel: NewsViewModel? = null;

    private lateinit var binding: FragmentNewsBinding
    private lateinit var newsAdapter: NewsAdapter;
    private var country= "us"
    private var page= 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNewsBinding.bind(view)
        // avoid unexpected error

        vieModel = (activity as MainActivity).viewModel
        newsAdapter= (activity as MainActivity).newsAdapter


        initRecyclerView()
        viewnewList()
    }

    private fun viewnewList() {

            vieModel?.getNewsHeadLines(country = country, page = page)
            vieModel?.newsHeadLines?.observe(viewLifecycleOwner, Observer { resources ->
                when (resources) {
                    is Resource.Loading -> {
                        showProgressBar()

                    }
                    is Resource.Success -> {
                        hideProgressBar()
                        resources?.data.let {
                            newsAdapter.differ.submitList(it?.articles)
                        }
                    }
                    is Resource.Error -> {
                        hideProgressBar()
                        Toast.makeText(activity, resources.message, Toast.LENGTH_SHORT).show()
                    }
                }
            })
    }


    private fun  initRecyclerView(){
        binding.rvNews.apply {
            adapter= newsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
    private fun showProgressBar(){
        binding.progressBar.visibility = View.VISIBLE
    }
    private fun hideProgressBar(){
        binding.progressBar.visibility = View.GONE
    }
}