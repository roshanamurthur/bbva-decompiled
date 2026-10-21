package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromAction<T> extends Maybe<T> implements Callable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Action f71673p0;

    public MaybeFromAction(Action action) {
        this.f71673p0 = action;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        this.f71673p0.run();
        return null;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        Disposable disposableEmpty = Disposables.empty();
        maybeObserver.onSubscribe(disposableEmpty);
        if (disposableEmpty.isDisposed()) {
            return;
        }
        try {
            this.f71673p0.run();
            if (disposableEmpty.isDisposed()) {
                return;
            }
            maybeObserver.onComplete();
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
