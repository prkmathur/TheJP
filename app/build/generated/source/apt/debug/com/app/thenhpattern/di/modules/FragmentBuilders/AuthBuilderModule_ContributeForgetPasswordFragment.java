package com.app.thenhpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.thenhpattern.di.modules.viewmodules.authviewmodules.ForgetPasswordViewModelModule;
import com.app.thenhpattern.view.auth.ForgetPasswordFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      AuthBuilderModule_ContributeForgetPasswordFragment.ForgetPasswordFragmentSubcomponent.class
)
public abstract class AuthBuilderModule_ContributeForgetPasswordFragment {
  private AuthBuilderModule_ContributeForgetPasswordFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ForgetPasswordFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ForgetPasswordFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = ForgetPasswordViewModelModule.class)
  public interface ForgetPasswordFragmentSubcomponent
      extends AndroidInjector<ForgetPasswordFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ForgetPasswordFragment> {}
  }
}
