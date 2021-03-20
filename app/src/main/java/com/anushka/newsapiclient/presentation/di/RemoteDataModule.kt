package com.anushka.newsapiclient.presentation.di

import com.anushka.newsapiclient.data.api.NewApiService
import com.anushka.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import com.anushka.newsapiclient.data.repository.datasourceimpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
// new remote data source
@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemote(
        newApiService: NewApiService
    ): NewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newApiService)
    }
}