package io.reactivex.rxjava3.parallel;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface ParallelFlowableConverter<T, R> {
    @NonNull
    R apply(@NonNull ParallelFlowable<T> parallelFlowable);
}
