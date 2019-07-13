// Generated by Dagger (https://google.github.io/dagger).
package com.app.thenhpattern.di.modules;

import com.app.thenhpattern.MyApplication;
import com.app.thenhpattern.model.remote.DataSource;
import com.app.thenhpattern.util.SessionManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideMockRepositoryFactory implements Factory<DataSource> {
  private final AppModule module;

  private final Provider<MyApplication> applicationProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public AppModule_ProvideMockRepositoryFactory(
      AppModule module,
      Provider<MyApplication> applicationProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public DataSource get() {
    return provideInstance(module, applicationProvider, sessionManagerProvider);
  }

  public static DataSource provideInstance(
      AppModule module,
      Provider<MyApplication> applicationProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return proxyProvideMockRepository(
        module, applicationProvider.get(), sessionManagerProvider.get());
  }

  public static AppModule_ProvideMockRepositoryFactory create(
      AppModule module,
      Provider<MyApplication> applicationProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new AppModule_ProvideMockRepositoryFactory(
        module, applicationProvider, sessionManagerProvider);
  }

  public static DataSource proxyProvideMockRepository(
      AppModule instance, MyApplication application, SessionManager sessionManager) {
    return Preconditions.checkNotNull(
        instance.provideMockRepository(application, sessionManager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
