package com.app.thenhpattern.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.thenhpattern.viewmodel.auth.LoginViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentForgetPasswordBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final EditText edtEmail;

  @NonNull
  public final Button forgetSubmit;

  @NonNull
  public final TextView textView3;

  @Bindable
  protected LoginViewModel mData;

  protected FragmentForgetPasswordBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView backBtn, EditText edtEmail, Button forgetSubmit,
      TextView textView3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backBtn = backBtn;
    this.edtEmail = edtEmail;
    this.forgetSubmit = forgetSubmit;
    this.textView3 = textView3;
  }

  public abstract void setData(@Nullable LoginViewModel data);

  @Nullable
  public LoginViewModel getData() {
    return mData;
  }

  @NonNull
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_forget_password, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentForgetPasswordBinding>inflateInternal(inflater, com.app.thenhpattern.R.layout.fragment_forget_password, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_forget_password, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentForgetPasswordBinding>inflateInternal(inflater, com.app.thenhpattern.R.layout.fragment_forget_password, null, false, component);
  }

  public static FragmentForgetPasswordBinding bind(@NonNull View view) {
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
  public static FragmentForgetPasswordBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentForgetPasswordBinding)bind(component, view, com.app.thenhpattern.R.layout.fragment_forget_password);
  }
}
