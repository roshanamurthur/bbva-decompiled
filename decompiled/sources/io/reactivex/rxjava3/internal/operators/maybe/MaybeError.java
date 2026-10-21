package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeError<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f75854p0;

    public MaybeError(Throwable th2) {
        this.f75854p0 = th2;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(d.a());
        maybeObserver.onError(this.f75854p0);
    }
}
