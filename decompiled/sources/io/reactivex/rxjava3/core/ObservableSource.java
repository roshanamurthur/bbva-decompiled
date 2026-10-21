package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
@FunctionalInterface
public interface ObservableSource<T> {
    void subscribe(@NonNull Observer<? super T> observer);
}
