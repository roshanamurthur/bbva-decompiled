package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface SingleOperator<Downstream, Upstream> {
    @NonNull
    SingleObserver<? super Upstream> apply(@NonNull SingleObserver<? super Downstream> singleObserver) throws Throwable;
}
