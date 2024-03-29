package com.app.thenhpattern.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSplashBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView3;

  protected FragmentSplashBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView3 = imageView3;
  }

  @NonNull
  public static FragmentSplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_splash, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSplashBinding>inflateInternal(inflater, com.app.thenhpattern.R.layout.fragment_splash, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_splash, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSplashBinding>inflateInternal(inflater, com.app.thenhpattern.R.layout.fragment_splash, null, false, component);
  }

  public static FragmentSplashBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSplashBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSplashBinding)bind(component, view, com.app.thenhpattern.R.layout.fragment_splash);
  }
}
