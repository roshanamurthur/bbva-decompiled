package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromCallable<T> extends Maybe<T> implements Supplier<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends T> f75913p0;

    public MaybeFromCallable(Callable<? extends T> callable) {
        this.f75913p0 = callable;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public T get() throws Exception {
        return this.f75913p0.call();
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        Disposable disposableB = d.b();
        maybeObserver.onSubscribe(disposableB);
        if (disposableB.isDisposed()) {
            return;
        }
        try {
            T tCall = this.f75913p0.call();
            if (disposableB.isDisposed()) {
                return;
            }
            if (tCall == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(tCall);
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
