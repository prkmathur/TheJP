package com.app.thenhpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.thenhpattern.di.modules.viewmodules.mainviewmodules.JobViewModelModule;
import com.app.thenhpattern.view.main.JobFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainBuilderModule_ContributeJobFragment.JobFragmentSubcomponent.class)
public abstract class MainBuilderModule_ContributeJobFragment {
  private MainBuilderModule_ContributeJobFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(JobFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      JobFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = JobViewModelModule.class)
  public interface JobFragmentSubcomponent extends AndroidInjector<JobFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<JobFragment> {}
  }
}
