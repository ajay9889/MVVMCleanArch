package com.anushka.newsapiclient.domain.repository

import com.anushka.newsapiclient.data.model.APIResponse
import com.anushka.newsapiclient.data.model.Article
import com.anushka.newsapiclient.data.util.Resource
import kotlinx.coroutines.flow.Flow


interface NewsRepository {
    suspend fun getNewsHeadLines(country: String, page: Int): Resource<APIResponse>
    suspend fun getSearchNews(searchNewsQuery:String) : Resource<APIResponse>
    suspend fun savedNews(article: Article)
    suspend fun deleteNews(article: Article)

    // it will work but it is not recommened to live data here .. we should rxjava..
    // Flow API to flow the data which allow here
    // we should not android compnant classes he repository
    fun getSavedNews(): Flow<List<Article>>
}