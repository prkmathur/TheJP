// Generated by Dagger (https://google.github.io/dagger).
package com.app.thenhpattern.view;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.app.thenhpattern.util.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.inject.Provider;

public final class PagerActivity_MembersInjector implements MembersInjector<PagerActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public PagerActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PagerActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PagerActivity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PagerActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    BaseActivity_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }
}
