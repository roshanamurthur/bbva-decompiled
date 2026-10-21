package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class SafeSingleObserver<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleObserver<? super T> f74227p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f74228q0;

    public SafeSingleObserver(SingleObserver<? super T> singleObserver) {
        this.f74227p0 = singleObserver;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(@NonNull Throwable th2) {
        if (this.f74228q0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        try {
            this.f74227p0.onError(th2);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(@NonNull Disposable disposable) {
        try {
            this.f74227p0.onSubscribe(disposable);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            this.f74228q0 = true;
            disposable.dispose();
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(@NonNull T t10) {
        if (this.f74228q0) {
            return;
        }
        try {
            this.f74227p0.onSuccess(t10);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }
}
