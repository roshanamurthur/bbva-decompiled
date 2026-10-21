package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public interface SchedulerRunnableIntrospection {
    @NonNull
    Runnable getWrappedRunnable();
}
