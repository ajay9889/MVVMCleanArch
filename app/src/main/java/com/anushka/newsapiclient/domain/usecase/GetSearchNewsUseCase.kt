package com.anushka.newsapiclient.domain.usecase

import com.anushka.newsapiclient.data.model.APIResponse
import com.anushka.newsapiclient.data.model.Article
import com.anushka.newsapiclient.data.util.Resource
import com.anushka.newsapiclient.domain.repository.NewsRepository


class GetSearchNewsUseCase (private val repository: NewsRepository) {
    suspend fun execute(searchQuery: String) : Resource<APIResponse>{
        return repository.getSearchNews(searchQuery);
    }
}