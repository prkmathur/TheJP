package com.app.thenhpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.thenhpattern.di.modules.viewmodules.mainviewmodules.NotificationViewModelModule;
import com.app.thenhpattern.view.main.NotificationsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      PagerBuilderModule_ContributeNotificationsFragment.NotificationsFragmentSubcomponent.class
)
public abstract class PagerBuilderModule_ContributeNotificationsFragment {
  private PagerBuilderModule_ContributeNotificationsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(NotificationsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      NotificationsFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = NotificationViewModelModule.class)
  public interface NotificationsFragmentSubcomponent
      extends AndroidInjector<NotificationsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NotificationsFragment> {}
  }
}
