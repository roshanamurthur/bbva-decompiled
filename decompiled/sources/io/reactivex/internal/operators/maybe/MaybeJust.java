package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.fuseable.ScalarCallable;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeJust<T> extends Maybe<T> implements ScalarCallable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T f71697p0;

    public MaybeJust(T t10) {
        this.f71697p0 = t10;
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public T call() {
        return this.f71697p0;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(Disposables.disposed());
        maybeObserver.onSuccess(this.f71697p0);
    }
}
