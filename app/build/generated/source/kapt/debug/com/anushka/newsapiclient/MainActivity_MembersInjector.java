// Generated by Dagger (https://dagger.dev).
package com.anushka.newsapiclient;

import com.anushka.newsapiclient.presentation.adapter.NewsAdapter;
import com.anushka.newsapiclient.presentation.viewmodel.NewsViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<NewsViewModelFactory> factoryProvider;

  private final Provider<NewsAdapter> newsAdapterProvider;

  public MainActivity_MembersInjector(Provider<NewsViewModelFactory> factoryProvider,
      Provider<NewsAdapter> newsAdapterProvider) {
    this.factoryProvider = factoryProvider;
    this.newsAdapterProvider = newsAdapterProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<NewsViewModelFactory> factoryProvider,
      Provider<NewsAdapter> newsAdapterProvider) {
    return new MainActivity_MembersInjector(factoryProvider, newsAdapterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectFactory(instance, factoryProvider.get());
    injectNewsAdapter(instance, newsAdapterProvider.get());
  }

  @InjectedFieldSignature("com.anushka.newsapiclient.MainActivity.factory")
  public static void injectFactory(MainActivity instance, NewsViewModelFactory factory) {
    instance.factory = factory;
  }

  @InjectedFieldSignature("com.anushka.newsapiclient.MainActivity.newsAdapter")
  public static void injectNewsAdapter(MainActivity instance, NewsAdapter newsAdapter) {
    instance.newsAdapter = newsAdapter;
  }
}
