// Generated by Dagger (https://google.github.io/dagger).
package com.app.thenhpattern.view.auth;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.app.thenhpattern.util.BaseFragment_MembersInjector;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

public final class RegisterFragment_MembersInjector implements MembersInjector<RegisterFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public RegisterFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<RegisterFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new RegisterFragment_MembersInjector(
        childFragmentInjectorProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(RegisterFragment instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    BaseFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }
}
