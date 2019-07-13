// Generated by Dagger (https://google.github.io/dagger).
package com.app.thenhpattern.viewmodel.auth;

import com.app.thenhpattern.model.remote.DataSource;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<DataSource> dataSourceProvider;

  public LoginViewModel_Factory(Provider<DataSource> dataSourceProvider) {
    this.dataSourceProvider = dataSourceProvider;
  }

  @Override
  public LoginViewModel get() {
    return provideInstance(dataSourceProvider);
  }

  public static LoginViewModel provideInstance(Provider<DataSource> dataSourceProvider) {
    return new LoginViewModel(dataSourceProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<DataSource> dataSourceProvider) {
    return new LoginViewModel_Factory(dataSourceProvider);
  }

  public static LoginViewModel newLoginViewModel(DataSource dataSource) {
    return new LoginViewModel(dataSource);
  }
}
