package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromSupplier<T> extends Maybe<T> implements Supplier<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends T> f75924p0;

    public MaybeFromSupplier(Supplier<? extends T> supplier) {
        this.f75924p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public T get() throws Throwable {
        return this.f75924p0.get();
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        Disposable disposableB = d.b();
        maybeObserver.onSubscribe(disposableB);
        if (disposableB.isDisposed()) {
            return;
        }
        try {
            T t10 = this.f75924p0.get();
            if (disposableB.isDisposed()) {
                return;
            }
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(t10);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (disposableB.isDisposed()) {
                RxJavaPlugins.onError(th2);
            } else {
                maybeObserver.onError(th2);
            }
        }
    }
}
