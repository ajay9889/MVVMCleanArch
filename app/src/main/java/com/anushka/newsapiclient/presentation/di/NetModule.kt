package com.anushka.newsapiclient.presentation.di

import com.anushka.newsapiclient.BuildConfig
import com.anushka.newsapiclient.data.api.NewApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit{
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client: OkHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BuildConfig.BASE_URL).client(client).build()
    }
    @Singleton
    @Provides
    fun provideNewsApiService(retrofit: Retrofit): NewApiService{
        return retrofit.create(NewApiService::class.java)
    }
}