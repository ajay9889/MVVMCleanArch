package com.anushka.newsapiclient.data.repository.datasourceimpl

import com.anushka.newsapiclient.data.api.NewApiService
import com.anushka.newsapiclient.data.model.APIResponse
import com.anushka.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl (
        private val apiService: NewApiService
        ): NewsRemoteDataSource {
     override suspend fun getTopHeadline(country: String, page: Int): Response<APIResponse> {
       return apiService.getTopHealdline(country,page)
    }
}