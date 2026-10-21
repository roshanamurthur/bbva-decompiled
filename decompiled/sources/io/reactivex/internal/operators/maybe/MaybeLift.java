package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeOperator;
import io.reactivex.MaybeSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeLift<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeOperator<? extends R, ? super T> f71698p0;

    public MaybeLift(MaybeSource<T> maybeSource, MaybeOperator<? extends R, ? super T> maybeOperator) {
        super(maybeSource);
        this.f71698p0 = maybeOperator;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        try {
            this.source.subscribe((MaybeObserver) ObjectHelper.requireNonNull(this.f71698p0.apply(maybeObserver), "The operator returned a null MaybeObserver"));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, maybeObserver);
        }
    }
}
