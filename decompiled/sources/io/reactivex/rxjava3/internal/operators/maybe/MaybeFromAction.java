package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromAction<T> extends Maybe<T> implements Supplier<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Action f75912p0;

    public MaybeFromAction(Action action) {
        this.f75912p0 = action;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public T get() throws Throwable {
        this.f75912p0.run();
        return null;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        Disposable disposableB = d.b();
        maybeObserver.onSubscribe(disposableB);
        if (disposableB.isDisposed()) {
            return;
        }
        try {
            this.f75912p0.run();
            if (disposableB.isDisposed()) {
                return;
            }
            maybeObserver.onComplete();
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
