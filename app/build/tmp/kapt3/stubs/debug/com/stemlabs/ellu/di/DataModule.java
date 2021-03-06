package com.stemlabs.ellu.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/stemlabs/ellu/di/DataModule;", "", "()V", "provideDataRepository", "Lcom/stemlabs/ellu/data/DataRepositorySource;", "dataRepository", "Lcom/stemlabs/ellu/data/DataRepository;", "app_debug"})
@dagger.Module()
public abstract class DataModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.stemlabs.ellu.data.DataRepositorySource provideDataRepository(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.DataRepository dataRepository);
    
    public DataModule() {
        super();
    }
}