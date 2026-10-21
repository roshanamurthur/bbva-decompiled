package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableFromSupplier extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<?> f74315p0;

    public CompletableFromSupplier(Supplier<?> supplier) {
        this.f74315p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        Disposable disposableB = d.b();
        completableObserver.onSubscribe(disposableB);
        try {
            this.f74315p0.get();
            if (disposableB.isDisposed()) {
                return;
            }
            completableObserver.onComplete();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (disposableB.isDisposed()) {
                RxJavaPlugins.onError(th2);
            } else {
                completableObserver.onError(th2);
            }
        }
    }
}
