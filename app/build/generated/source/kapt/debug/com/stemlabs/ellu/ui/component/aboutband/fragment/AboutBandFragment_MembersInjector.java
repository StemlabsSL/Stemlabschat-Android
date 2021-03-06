// Generated by Dagger (https://dagger.dev).
package com.stemlabs.ellu.ui.component.aboutband.fragment;

import com.stemlabs.ellu.ui.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AboutBandFragment_MembersInjector implements MembersInjector<AboutBandFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public AboutBandFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<AboutBandFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new AboutBandFragment_MembersInjector(viewModelFactoryProvider);}

  @Override
  public void injectMembers(AboutBandFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.stemlabs.ellu.ui.component.aboutband.fragment.AboutBandFragment.viewModelFactory")
  public static void injectViewModelFactory(AboutBandFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
