package com.anushka.newsapiclient.domain.usecase

import com.anushka.newsapiclient.data.model.Article
import com.anushka.newsapiclient.domain.repository.NewsRepository

class DeleteNewsUseCase (private val repository: NewsRepository) {
    suspend fun execute(article: Article){
        repository.deleteNews(article)
    }
}