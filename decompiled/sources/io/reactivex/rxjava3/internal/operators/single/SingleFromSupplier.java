package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFromSupplier<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends T> f77801p0;

    public SingleFromSupplier(Supplier<? extends T> supplier) {
        this.f77801p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        Disposable disposableB = d.b();
        singleObserver.onSubscribe(disposableB);
        if (disposableB.isDisposed()) {
            return;
        }
        try {
            T t10 = this.f77801p0.get();
            Objects.requireNonNull(t10, "The supplier returned a null value");
            if (disposableB.isDisposed()) {
                return;
            }
            singleObserver.onSuccess(t10);
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
