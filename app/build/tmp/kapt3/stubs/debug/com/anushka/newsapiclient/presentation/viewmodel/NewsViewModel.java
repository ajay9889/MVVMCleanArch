package com.anushka.newsapiclient.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/anushka/newsapiclient/presentation/viewmodel/NewsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "getNewsHeadLineUseCase", "Lcom/anushka/newsapiclient/domain/usecase/GetNewsHeadLineUseCase;", "(Landroid/app/Application;Lcom/anushka/newsapiclient/domain/usecase/GetNewsHeadLineUseCase;)V", "newsHeadLines", "Landroidx/lifecycle/MutableLiveData;", "Lcom/anushka/newsapiclient/data/util/Resource;", "Lcom/anushka/newsapiclient/data/model/APIResponse;", "getNewsHeadLines", "()Landroidx/lifecycle/MutableLiveData;", "Lkotlinx/coroutines/Job;", "country", "", "page", "", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.anushka.newsapiclient.data.util.Resource<com.anushka.newsapiclient.data.model.APIResponse>> newsHeadLines = null;
    private final android.app.Application app = null;
    private final com.anushka.newsapiclient.domain.usecase.GetNewsHeadLineUseCase getNewsHeadLineUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.anushka.newsapiclient.data.util.Resource<com.anushka.newsapiclient.data.model.APIResponse>> getNewsHeadLines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getNewsHeadLines(@org.jetbrains.annotations.NotNull()
    java.lang.String country, int page) {
        return null;
    }
    
    private final boolean isNetworkAvailable(android.content.Context context) {
        return false;
    }
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.anushka.newsapiclient.domain.usecase.GetNewsHeadLineUseCase getNewsHeadLineUseCase) {
        super(null);
    }
}