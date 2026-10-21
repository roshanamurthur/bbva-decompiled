package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeErrorCallable<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends Throwable> f71610p0;

    public MaybeErrorCallable(Callable<? extends Throwable> callable) {
        this.f71610p0 = callable;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(Disposables.disposed());
        try {
            th = (Throwable) ObjectHelper.requireNonNull(this.f71610p0.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            Exceptions.throwIfFatal(th);
        }
        maybeObserver.onError(th);
    }
}
