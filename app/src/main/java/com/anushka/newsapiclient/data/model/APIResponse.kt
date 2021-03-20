package com.anushka.newsapiclient.data.model

import java.io.Serializable

data class APIResponse(
    val articles: List<Article>?,
    val status: String?,
    val totalResults: Int?
): Serializable