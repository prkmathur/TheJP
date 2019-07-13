// Generated by Dagger (https://google.github.io/dagger).
package com.app.thenhpattern.viewmodel.navigator;

import com.app.thenhpattern.model.remote.DataSource;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LeftViewModel_Factory implements Factory<LeftViewModel> {
  private final Provider<DataSource> dataSourceProvider;

  public LeftViewModel_Factory(Provider<DataSource> dataSourceProvider) {
    this.dataSourceProvider = dataSourceProvider;
  }

  @Override
  public LeftViewModel get() {
    return provideInstance(dataSourceProvider);
  }

  public static LeftViewModel provideInstance(Provider<DataSource> dataSourceProvider) {
    return new LeftViewModel(dataSourceProvider.get());
  }

  public static LeftViewModel_Factory create(Provider<DataSource> dataSourceProvider) {
    return new LeftViewModel_Factory(dataSourceProvider);
  }

  public static LeftViewModel newLeftViewModel(DataSource dataSource) {
    return new LeftViewModel(dataSource);
  }
}
