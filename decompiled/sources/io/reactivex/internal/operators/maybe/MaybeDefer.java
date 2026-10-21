package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDefer<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends MaybeSource<? extends T>> f71554p0;

    public MaybeDefer(Callable<? extends MaybeSource<? extends T>> callable) {
        this.f71554p0 = callable;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        try {
            ((MaybeSource) ObjectHelper.requireNonNull(this.f71554p0.call(), "The maybeSupplier returned a null MaybeSource")).subscribe(maybeObserver);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, maybeObserver);
        }
    }
}
