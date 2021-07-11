package com.anushka.newsapiclient.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anushka.newsapiclient.domain.usecase.GetNewsHeadLineUseCase

class NewsViewModelFactory (
    private val app: Application,
    private val getNewsHeadLineUseCase : GetNewsHeadLineUseCase
    ): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       return NewsViewModel(app ,
           getNewsHeadLineUseCase) as T
    }
}