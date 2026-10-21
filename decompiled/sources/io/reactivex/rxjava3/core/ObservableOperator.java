package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface ObservableOperator<Downstream, Upstream> {
    @NonNull
    Observer<? super Upstream> apply(@NonNull Observer<? super Downstream> observer) throws Throwable;
}
