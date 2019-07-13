// Generated by Dagger (https://google.github.io/dagger).
package com.app.thenhpattern.viewmodel.auth;

import com.app.thenhpattern.model.remote.DataSource;
import com.app.thenhpattern.util.SessionManager;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<DataSource> dataSourceProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public RegisterViewModel_Factory(
      Provider<DataSource> dataSourceProvider, Provider<SessionManager> sessionManagerProvider) {
    this.dataSourceProvider = dataSourceProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public RegisterViewModel get() {
    return provideInstance(dataSourceProvider, sessionManagerProvider);
  }

  public static RegisterViewModel provideInstance(
      Provider<DataSource> dataSourceProvider, Provider<SessionManager> sessionManagerProvider) {
    return new RegisterViewModel(dataSourceProvider.get(), sessionManagerProvider.get());
  }

  public static RegisterViewModel_Factory create(
      Provider<DataSource> dataSourceProvider, Provider<SessionManager> sessionManagerProvider) {
    return new RegisterViewModel_Factory(dataSourceProvider, sessionManagerProvider);
  }

  public static RegisterViewModel newRegisterViewModel(
      DataSource dataSource, SessionManager sessionManager) {
    return new RegisterViewModel(dataSource, sessionManager);
  }
}
