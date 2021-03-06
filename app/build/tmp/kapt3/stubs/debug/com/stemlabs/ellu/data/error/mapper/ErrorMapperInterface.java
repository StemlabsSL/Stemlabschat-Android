package com.stemlabs.ellu.data.error.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H&R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/stemlabs/ellu/data/error/mapper/ErrorMapperInterface;", "", "errorsMap", "", "", "", "getErrorsMap", "()Ljava/util/Map;", "getErrorString", "errorId", "app_debug"})
public abstract interface ErrorMapperInterface {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getErrorString(int errorId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.Integer, java.lang.String> getErrorsMap();
}