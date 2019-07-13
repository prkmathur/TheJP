package com.app.thenhpattern.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.thenhpattern.viewmodel.auth.RegisterViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentRegisterBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final EditText edtEmail;

  @NonNull
  public final EditText edtFname;

  @NonNull
  public final EditText edtLname;

  @NonNull
  public final EditText edtPassword;

  @NonNull
  public final EditText edtPhone;

  @NonNull
  public final ConstraintLayout loadingLayout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView6;

  @Bindable
  protected RegisterViewModel mData;

  protected FragmentRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView backBtn, Button btnSubmit, EditText edtEmail, EditText edtFname, EditText edtLname,
      EditText edtPassword, EditText edtPhone, ConstraintLayout loadingLayout,
      ProgressBar progressBar, TextView textView4, TextView textView6) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backBtn = backBtn;
    this.btnSubmit = btnSubmit;
    this.edtEmail = edtEmail;
    this.edtFname = edtFname;
    this.edtLname = edtLname;
    this.edtPassword = edtPassword;
    this.edtPhone = edtPhone;
    this.loadingLayout = loadingLayout;
    this.progressBar = progressBar;
    this.textView4 = textView4;
    this.textView6 = textView6;
  }

  public abstract void setData(@Nullable RegisterViewModel data);

  @Nullable
  public RegisterViewModel getData() {
    return mData;
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterBinding>inflateInternal(inflater, com.app.thenhpattern.R.layout.fragment_register, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterBinding>inflateInternal(inflater, com.app.thenhpattern.R.layout.fragment_register, null, false, component);
  }

  public static FragmentRegisterBinding bind(@NonNull View view) {
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
  public static FragmentRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRegisterBinding)bind(component, view, com.app.thenhpattern.R.layout.fragment_register);
  }
}
