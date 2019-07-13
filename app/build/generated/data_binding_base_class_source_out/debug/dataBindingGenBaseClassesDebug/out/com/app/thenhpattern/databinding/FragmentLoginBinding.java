package com.app.thenhpattern.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.thenhpattern.viewmodel.auth.LoginViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final Button btnLogin;

  @NonNull
  public final TextView btnRegister;

  @NonNull
  public final EditText edtEmail;

  @NonNull
  public final EditText edtPassword;

  @NonNull
  public final ConstraintLayout loadingLayout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView txtForget;

  @Bindable
  protected LoginViewModel mData;

  protected FragmentLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnLogin, TextView btnRegister, EditText edtEmail, EditText edtPassword,
      ConstraintLayout loadingLayout, ProgressBar progressBar, TextView textView3,
      TextView textView6, TextView txtForget) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLogin = btnLogin;
    this.btnRegister = btnRegister;
    this.edtEmail = edtEmail;
    this.edtPassword = edtPassword;
    this.loadingLayout = loadingLayout;
    this.progressBar = progressBar;
    this.textView3 = textView3;
    this.textView6 = textView6;
    this.txtForget = txtForget;
  }

  public abstract void setData(@Nullable LoginViewModel data);

  @Nullable
  public LoginViewModel getData() {
    return mData;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, com.app.thenhpattern.R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, com.app.thenhpattern.R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
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
  public static FragmentLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginBinding)bind(component, view, com.app.thenhpattern.R.layout.fragment_login);
  }
}
