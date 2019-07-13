// Generated by Dagger (https://google.github.io/dagger).
package com.app.thenhpattern.viewmodel.auth;

import com.app.thenhpattern.model.remote.DataSource;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<DataSource> dataSourceProvider;

  public SplashViewModel_Factory(Provider<DataSource> dataSourceProvider) {
    this.dataSourceProvider = dataSourceProvider;
  }

  @Override
  public SplashViewModel get() {
    return provideInstance(dataSourceProvider);
  }

  public static SplashViewModel provideInstance(Provider<DataSource> dataSourceProvider) {
    return new SplashViewModel(dataSourceProvider.get());
  }

  public static SplashViewModel_Factory create(Provider<DataSource> dataSourceProvider) {
    return new SplashViewModel_Factory(dataSourceProvider);
  }

  public static SplashViewModel newSplashViewModel(DataSource dataSource) {
    return new SplashViewModel(dataSource);
  }
}