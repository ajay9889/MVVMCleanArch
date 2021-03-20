package com.anushka.newsapiclient.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u0013H\u0016J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u001aH\u0002J\u0019\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/anushka/newsapiclient/data/repository/NewsRepositoryImpl;", "Lcom/anushka/newsapiclient/domain/repository/NewsRepository;", "newsRemoteDataSource", "Lcom/anushka/newsapiclient/data/repository/datasource/NewsRemoteDataSource;", "(Lcom/anushka/newsapiclient/data/repository/datasource/NewsRemoteDataSource;)V", "deleteNews", "", "article", "Lcom/anushka/newsapiclient/data/model/Article;", "(Lcom/anushka/newsapiclient/data/model/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsHeadLines", "Lcom/anushka/newsapiclient/data/util/Resource;", "Lcom/anushka/newsapiclient/data/model/APIResponse;", "country", "", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedNews", "Lkotlinx/coroutines/flow/Flow;", "", "getSearchNews", "searchNewsQuery", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "responseToResource", "response", "Lretrofit2/Response;", "savedNews", "app_debug"})
public final class NewsRepositoryImpl implements com.anushka.newsapiclient.domain.repository.NewsRepository {
    private final com.anushka.newsapiclient.data.repository.datasource.NewsRemoteDataSource newsRemoteDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNewsHeadLines(@org.jetbrains.annotations.NotNull()
    java.lang.String country, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.anushka.newsapiclient.data.util.Resource<com.anushka.newsapiclient.data.model.APIResponse>> p2) {
        return null;
    }
    
    private final com.anushka.newsapiclient.data.util.Resource<com.anushka.newsapiclient.data.model.APIResponse> responseToResource(retrofit2.Response<com.anushka.newsapiclient.data.model.APIResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSearchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String searchNewsQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.anushka.newsapiclient.data.util.Resource<com.anushka.newsapiclient.data.model.APIResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object savedNews(@org.jetbrains.annotations.NotNull()
    com.anushka.newsapiclient.data.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteNews(@org.jetbrains.annotations.NotNull()
    com.anushka.newsapiclient.data.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.anushka.newsapiclient.data.model.Article>> getSavedNews() {
        return null;
    }
    
    public NewsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.anushka.newsapiclient.data.repository.datasource.NewsRemoteDataSource newsRemoteDataSource) {
        super();
    }
}