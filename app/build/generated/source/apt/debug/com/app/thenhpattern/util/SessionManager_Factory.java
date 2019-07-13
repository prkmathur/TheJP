// Generated by Dagger (https://google.github.io/dagger).
package com.app.thenhpattern.util;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SessionManager_Factory implements Factory<SessionManager> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SessionManager_Factory(Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SessionManager get() {
    return provideInstance(sharedPreferencesProvider);
  }

  public static SessionManager provideInstance(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SessionManager(sharedPreferencesProvider.get());
  }

  public static SessionManager_Factory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SessionManager_Factory(sharedPreferencesProvider);
  }

  public static SessionManager newSessionManager(SharedPreferences sharedPreferences) {
    return new SessionManager(sharedPreferences);
  }
}
