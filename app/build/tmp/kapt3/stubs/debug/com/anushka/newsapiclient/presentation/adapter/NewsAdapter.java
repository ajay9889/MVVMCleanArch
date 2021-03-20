package com.anushka.newsapiclient.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/anushka/newsapiclient/presentation/adapter/NewsAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/anushka/newsapiclient/data/model/Article;", "Lcom/anushka/newsapiclient/presentation/adapter/NewsAdapter$newViewHolder;", "()V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "newViewHolder", "app_debug"})
public final class NewsAdapter extends androidx.paging.PagedListAdapter<com.anushka.newsapiclient.data.model.Article, com.anushka.newsapiclient.presentation.adapter.NewsAdapter.newViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.anushka.newsapiclient.data.model.Article> differ = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.anushka.newsapiclient.data.model.Article> callBacks = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.anushka.newsapiclient.presentation.adapter.NewsAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.anushka.newsapiclient.data.model.Article> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.anushka.newsapiclient.presentation.adapter.NewsAdapter.newViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.anushka.newsapiclient.presentation.adapter.NewsAdapter.newViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public NewsAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/anushka/newsapiclient/presentation/adapter/NewsAdapter$newViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/anushka/newsapiclient/databinding/NewsListItemBinding;", "(Lcom/anushka/newsapiclient/presentation/adapter/NewsAdapter;Lcom/anushka/newsapiclient/databinding/NewsListItemBinding;)V", "getBinding", "()Lcom/anushka/newsapiclient/databinding/NewsListItemBinding;", "bind", "", "article", "Lcom/anushka/newsapiclient/data/model/Article;", "app_debug"})
    public final class newViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.anushka.newsapiclient.databinding.NewsListItemBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.anushka.newsapiclient.data.model.Article article) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.anushka.newsapiclient.databinding.NewsListItemBinding getBinding() {
            return null;
        }
        
        public newViewHolder(@org.jetbrains.annotations.NotNull()
        com.anushka.newsapiclient.databinding.NewsListItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/anushka/newsapiclient/presentation/adapter/NewsAdapter$Companion;", "", "()V", "callBacks", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/anushka/newsapiclient/data/model/Article;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}