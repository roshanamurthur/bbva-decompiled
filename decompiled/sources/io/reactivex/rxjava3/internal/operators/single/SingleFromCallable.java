package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFromCallable<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends T> f77794p0;

    public SingleFromCallable(Callable<? extends T> callable) {
        this.f77794p0 = callable;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        Disposable disposableB = d.b();
        singleObserver.onSubscribe(disposableB);
        if (disposableB.isDisposed()) {
            return;
        }
        try {
            T tCall = this.f77794p0.call();
            Objects.requireNonNull(tCall, "The callable returned a null value");
            if (disposableB.isDisposed()) {
                return;
            }
            singleObserver.onSuccess(tCall);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (disposableB.isDisposed()) {
                RxJavaPlugins.onError(th2);
            } else {
                singleObserver.onError(th2);
            }
        }
    }
}
