package com.anushka.newsapiclient.domain.usecase

import com.anushka.newsapiclient.data.model.Article
import com.anushka.newsapiclient.domain.repository.NewsRepository

class GetSavedNewUseCase (private val repository: NewsRepository) {
     fun execute(){
        repository.getSavedNews()
    }
}