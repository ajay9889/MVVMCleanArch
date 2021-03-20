package com.anushka.newsapiclient.presentation.di

import com.anushka.newsapiclient.data.repository.NewsRepositoryImpl
import com.anushka.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import com.anushka.newsapiclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// new reposiroty Instance

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun providesRepository(
        newsRemoteDataSource: NewsRemoteDataSource
    ): NewsRepository{
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}