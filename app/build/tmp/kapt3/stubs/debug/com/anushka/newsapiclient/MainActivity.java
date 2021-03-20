package com.anushka.newsapiclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001b"}, d2 = {"Lcom/anushka/newsapiclient/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/anushka/newsapiclient/databinding/ActivityMainBinding;", "factory", "Lcom/anushka/newsapiclient/presentation/viewmodel/NewsViewModelFactory;", "getFactory", "()Lcom/anushka/newsapiclient/presentation/viewmodel/NewsViewModelFactory;", "setFactory", "(Lcom/anushka/newsapiclient/presentation/viewmodel/NewsViewModelFactory;)V", "newsAdapter", "Lcom/anushka/newsapiclient/presentation/adapter/NewsAdapter;", "getNewsAdapter", "()Lcom/anushka/newsapiclient/presentation/adapter/NewsAdapter;", "setNewsAdapter", "(Lcom/anushka/newsapiclient/presentation/adapter/NewsAdapter;)V", "viewModel", "Lcom/anushka/newsapiclient/presentation/viewmodel/NewsViewModel;", "getViewModel", "()Lcom/anushka/newsapiclient/presentation/viewmodel/NewsViewModel;", "setViewModel", "(Lcom/anushka/newsapiclient/presentation/viewmodel/NewsViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.anushka.newsapiclient.presentation.viewmodel.NewsViewModelFactory factory;
    @javax.inject.Inject()
    public com.anushka.newsapiclient.presentation.adapter.NewsAdapter newsAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.anushka.newsapiclient.presentation.viewmodel.NewsViewModel viewModel;
    private com.anushka.newsapiclient.databinding.ActivityMainBinding binding;
    
    @org.jetbrains.annotations.NotNull()
    public final com.anushka.newsapiclient.presentation.viewmodel.NewsViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.anushka.newsapiclient.presentation.viewmodel.NewsViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.anushka.newsapiclient.presentation.adapter.NewsAdapter getNewsAdapter() {
        return null;
    }
    
    public final void setNewsAdapter(@org.jetbrains.annotations.NotNull()
    com.anushka.newsapiclient.presentation.adapter.NewsAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.anushka.newsapiclient.presentation.viewmodel.NewsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.anushka.newsapiclient.presentation.viewmodel.NewsViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public MainActivity() {
        super();
    }
}