package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes12.dex */
public interface Observer<T> {
    void onComplete();

    void onError(@NonNull Throwable th2);

    void onNext(@NonNull T t10);

    void onSubscribe(@NonNull Disposable disposable);
}
