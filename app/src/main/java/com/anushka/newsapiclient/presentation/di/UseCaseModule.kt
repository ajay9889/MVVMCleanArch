package com.anushka.newsapiclient.presentation.di

import com.anushka.newsapiclient.domain.repository.NewsRepository
import com.anushka.newsapiclient.domain.usecase.GetNewsHeadLineUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)

class UseCaseModule {
    @Provides
    fun provideGetNewsHeadLinesUseCase( newsRepository: NewsRepository ): GetNewsHeadLineUseCase{
        return GetNewsHeadLineUseCase(newsRepository)
    }
}