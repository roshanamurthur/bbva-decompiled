package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public interface Emitter<T> {
    void onComplete();

    void onError(@NonNull Throwable th2);

    void onNext(@NonNull T t10);
}
