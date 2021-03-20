package com.anushka.newsapiclient.domain.usecase

import com.anushka.newsapiclient.data.model.APIResponse
import com.anushka.newsapiclient.data.util.Resource
import com.anushka.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadLineUseCase (private val newsRepository: NewsRepository) {
    suspend fun execute(country : String , page: Int): Resource<APIResponse>{
        return newsRepository.getNewsHeadLines(country ,page)
    }
}