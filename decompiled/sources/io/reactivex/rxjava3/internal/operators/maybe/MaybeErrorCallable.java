package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeErrorCallable<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends Throwable> f75855p0;

    public MaybeErrorCallable(Supplier<? extends Throwable> supplier) {
        this.f75855p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(d.a());
        try {
            th = (Throwable) ExceptionHelper.nullCheck(this.f75855p0.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th2) {
            th = th2;
            Exceptions.throwIfFatal(th);
        }
        maybeObserver.onError(th);
    }
}
