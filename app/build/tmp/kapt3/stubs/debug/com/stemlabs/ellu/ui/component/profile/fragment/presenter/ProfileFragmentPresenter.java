package com.stemlabs.ellu.ui.component.profile.fragment.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/stemlabs/ellu/ui/component/profile/fragment/presenter/ProfileFragmentPresenter;", "Lcom/stemlabs/ellu/ui/component/profile/fragment/presenter/ProfileFragmentPresenterHandler;", "context", "Landroid/content/Context;", "view", "Lcom/stemlabs/ellu/ui/component/profile/fragment/view/ProfileFragmentView;", "(Landroid/content/Context;Lcom/stemlabs/ellu/ui/component/profile/fragment/view/ProfileFragmentView;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getView", "()Lcom/stemlabs/ellu/ui/component/profile/fragment/view/ProfileFragmentView;", "setView", "(Lcom/stemlabs/ellu/ui/component/profile/fragment/view/ProfileFragmentView;)V", "getProfile", "", "request", "Lcom/stemlabs/ellu/data/model/request/ApiRequest;", "updateProfile", "img", "Ljava/io/File;", "updateProfileImage", "app_debug"})
public final class ProfileFragmentPresenter implements com.stemlabs.ellu.ui.component.profile.fragment.presenter.ProfileFragmentPresenterHandler {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private com.stemlabs.ellu.ui.component.profile.fragment.view.ProfileFragmentView view;
    
    @java.lang.Override()
    public void getProfile(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request) {
    }
    
    @java.lang.Override()
    public void updateProfile(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request, @org.jetbrains.annotations.Nullable()
    java.io.File img) {
    }
    
    @java.lang.Override()
    public void updateProfileImage(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request, @org.jetbrains.annotations.Nullable()
    java.io.File img) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.profile.fragment.view.ProfileFragmentView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.profile.fragment.view.ProfileFragmentView p0) {
    }
    
    public ProfileFragmentPresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.profile.fragment.view.ProfileFragmentView view) {
        super();
    }
}