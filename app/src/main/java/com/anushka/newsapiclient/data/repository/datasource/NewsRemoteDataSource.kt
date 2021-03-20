package com.anushka.newsapiclient.data.repository.datasource

import com.anushka.newsapiclient.data.model.APIResponse
import retrofit2.Response

// asbtract interface to communcate with API
interface NewsRemoteDataSource {

suspend fun getTopHeadline(country: String, page: Int):
        Response<APIResponse>
}