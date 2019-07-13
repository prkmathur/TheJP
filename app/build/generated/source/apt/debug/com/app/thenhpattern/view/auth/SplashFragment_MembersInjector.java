// Generated by Dagger (https://google.github.io/dagger).
package com.app.thenhpattern.view.auth;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.app.thenhpattern.util.BaseFragment_MembersInjector;
import com.app.thenhpattern.util.SessionManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

public final class SplashFragment_MembersInjector implements MembersInjector<SplashFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public SplashFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  public static MembersInjector<SplashFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new SplashFragment_MembersInjector(
        childFragmentInjectorProvider, viewModelFactoryProvider, sessionManagerProvider);
  }

  @Override
  public void injectMembers(SplashFragment instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    BaseFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSessionManager(instance, sessionManagerProvider.get());
  }

  public static void injectSessionManager(SplashFragment instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }
}
