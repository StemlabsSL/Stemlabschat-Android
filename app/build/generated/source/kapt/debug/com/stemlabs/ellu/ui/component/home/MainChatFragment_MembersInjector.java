// Generated by Dagger (https://dagger.dev).
package com.stemlabs.ellu.ui.component.home;

import com.stemlabs.ellu.ui.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainChatFragment_MembersInjector implements MembersInjector<MainChatFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public MainChatFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<MainChatFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new MainChatFragment_MembersInjector(viewModelFactoryProvider);}

  @Override
  public void injectMembers(MainChatFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.stemlabs.ellu.ui.component.home.MainChatFragment.viewModelFactory")
  public static void injectViewModelFactory(MainChatFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
