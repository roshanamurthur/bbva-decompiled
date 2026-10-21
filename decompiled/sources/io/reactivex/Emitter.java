package io.reactivex;

import io.reactivex.annotations.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public interface Emitter<T> {
    void onComplete();

    void onError(@NonNull Throwable th2);

    void onNext(@NonNull T t10);
}
