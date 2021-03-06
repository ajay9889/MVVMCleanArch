// Generated by Dagger (https://dagger.dev).
package com.anushka.newsapiclient.presentation.di;

import com.anushka.newsapiclient.presentation.adapter.NewsAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AdapterModule_ProvideAdapterFactory implements Factory<NewsAdapter> {
  private final AdapterModule module;

  public AdapterModule_ProvideAdapterFactory(AdapterModule module) {
    this.module = module;
  }

  @Override
  public NewsAdapter get() {
    return provideAdapter(module);
  }

  public static AdapterModule_ProvideAdapterFactory create(AdapterModule module) {
    return new AdapterModule_ProvideAdapterFactory(module);
  }

  public static NewsAdapter provideAdapter(AdapterModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideAdapter());
  }
}
