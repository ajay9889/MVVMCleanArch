package com.anushka.newsapiclient.presentation.di

import android.app.Application
import com.anushka.newsapiclient.domain.usecase.GetNewsHeadLineUseCase
import com.anushka.newsapiclient.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun provideViewModelFactory(
        application: Application,
        getNewsHeadLineUseCase: GetNewsHeadLineUseCase
    ): NewsViewModelFactory
    {
        return NewsViewModelFactory(application ,
            getNewsHeadLineUseCase )
    }
}