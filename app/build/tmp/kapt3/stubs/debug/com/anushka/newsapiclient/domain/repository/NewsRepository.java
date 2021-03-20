package com.anushka.newsapiclient.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u0010H&J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/anushka/newsapiclient/domain/repository/NewsRepository;", "", "deleteNews", "", "article", "Lcom/anushka/newsapiclient/data/model/Article;", "(Lcom/anushka/newsapiclient/data/model/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsHeadLines", "Lcom/anushka/newsapiclient/data/util/Resource;", "Lcom/anushka/newsapiclient/data/model/APIResponse;", "country", "", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedNews", "Lkotlinx/coroutines/flow/Flow;", "", "getSearchNews", "searchNewsQuery", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savedNews", "app_debug"})
public abstract interface NewsRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNewsHeadLines(@org.jetbrains.annotations.NotNull()
    java.lang.String country, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.anushka.newsapiclient.data.util.Resource<com.anushka.newsapiclient.data.model.APIResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSearchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String searchNewsQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.anushka.newsapiclient.data.util.Resource<com.anushka.newsapiclient.data.model.APIResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object savedNews(@org.jetbrains.annotations.NotNull()
    com.anushka.newsapiclient.data.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteNews(@org.jetbrains.annotations.NotNull()
    com.anushka.newsapiclient.data.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.anushka.newsapiclient.data.model.Article>> getSavedNews();
}