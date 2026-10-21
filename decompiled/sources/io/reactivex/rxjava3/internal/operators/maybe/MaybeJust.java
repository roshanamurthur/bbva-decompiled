package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.internal.fuseable.ScalarSupplier;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeJust<T> extends Maybe<T> implements ScalarSupplier<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T f75937p0;

    public MaybeJust(T t10) {
        this.f75937p0 = t10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.ScalarSupplier, io.reactivex.rxjava3.functions.Supplier
    public T get() {
        return this.f75937p0;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(d.a());
        maybeObserver.onSuccess(this.f75937p0);
    }
}
