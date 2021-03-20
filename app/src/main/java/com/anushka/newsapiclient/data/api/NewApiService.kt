package com.anushka.newsapiclient.data.api

import com.anushka.newsapiclient.BuildConfig
import com.anushka.newsapiclient.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewApiService {
    @GET("v2/top-headlines")
    suspend fun getTopHealdline(
            @Query ("country")
            country: String,
            @Query ("page")
            page: Int,
            @Query("apikey")
            apikey: String= BuildConfig.API_KEY
    ): Response<APIResponse>
}