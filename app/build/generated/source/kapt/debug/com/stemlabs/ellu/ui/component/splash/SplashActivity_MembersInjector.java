// Generated by Dagger (https://dagger.dev).
package com.stemlabs.ellu.ui.component.splash;

import com.stemlabs.ellu.ui.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  private final Provider<SplashViewModel> splashViewModelProvider;

  public SplashActivity_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider,
      Provider<SplashViewModel> splashViewModelProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.splashViewModelProvider = splashViewModelProvider;
  }

  public static MembersInjector<SplashActivity> create(
      Provider<ViewModelFactory> viewModelFactoryProvider,
      Provider<SplashViewModel> splashViewModelProvider) {
    return new SplashActivity_MembersInjector(viewModelFactoryProvider, splashViewModelProvider);}

  @Override
  public void injectMembers(SplashActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSplashViewModel(instance, splashViewModelProvider.get());
  }

  @InjectedFieldSignature("com.stemlabs.ellu.ui.component.splash.SplashActivity.viewModelFactory")
  public static void injectViewModelFactory(SplashActivity instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.stemlabs.ellu.ui.component.splash.SplashActivity.splashViewModel")
  public static void injectSplashViewModel(SplashActivity instance,
      SplashViewModel splashViewModel) {
    instance.splashViewModel = splashViewModel;
  }
}
