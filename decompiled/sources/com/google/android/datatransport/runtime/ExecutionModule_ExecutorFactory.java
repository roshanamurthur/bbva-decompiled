package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes9.dex */
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExecutionModule_ExecutorFactory f43693a = new ExecutionModule_ExecutorFactory();
    }

    public static ExecutionModule_ExecutorFactory create() {
        return a.f43693a;
    }

    public static Executor executor() {
        return (Executor) Preconditions.checkNotNull(new ud.c(Executors.newSingleThreadExecutor()), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Executor get() {
        return executor();
    }
}
