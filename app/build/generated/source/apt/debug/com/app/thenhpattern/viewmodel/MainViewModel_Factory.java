// Generated by Dagger (https://google.github.io/dagger).
package com.app.thenhpattern.viewmodel;

import com.app.thenhpattern.model.remote.DataSource;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<DataSource> dataSourceProvider;

  public MainViewModel_Factory(Provider<DataSource> dataSourceProvider) {
    this.dataSourceProvider = dataSourceProvider;
  }

  @Override
  public MainViewModel get() {
    return provideInstance(dataSourceProvider);
  }

  public static MainViewModel provideInstance(Provider<DataSource> dataSourceProvider) {
    return new MainViewModel(dataSourceProvider.get());
  }

  public static MainViewModel_Factory create(Provider<DataSource> dataSourceProvider) {
    return new MainViewModel_Factory(dataSourceProvider);
  }

  public static MainViewModel newMainViewModel(DataSource dataSource) {
    return new MainViewModel(dataSource);
  }
}