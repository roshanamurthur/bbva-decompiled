package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromCallable<T> extends Maybe<T> implements Callable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends T> f71674p0;

    public MaybeFromCallable(Callable<? extends T> callable) {
        this.f71674p0 = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.f71674p0.call();
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        Disposable disposableEmpty = Disposables.empty();
        maybeObserver.onSubscribe(disposableEmpty);
        if (disposableEmpty.isDisposed()) {
            return;
        }
        try {
            T tCall = this.f71674p0.call();
            if (disposableEmpty.isDisposed()) {
                return;
            }
            if (tCall == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(tCall);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (disposableEmpty.isDisposed()) {
                RxJavaPlugins.onError(th2);
            } else {
                maybeObserver.onError(th2);
            }
        }
    }
}
