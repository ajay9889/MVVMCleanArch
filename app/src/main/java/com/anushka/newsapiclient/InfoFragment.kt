package com.anushka.newsapiclient

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.anushka.newsapiclient.data.model.Article
import com.anushka.newsapiclient.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    lateinit var infoBinding: FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        infoBinding = FragmentInfoBinding.bind(view)
       val article = arguments?.get("select_article") as Article
        infoBinding.webView.apply {
            webViewClient = WebViewClient()
            if(article.url!=null)
            loadUrl(article.url)
        }


    }

}