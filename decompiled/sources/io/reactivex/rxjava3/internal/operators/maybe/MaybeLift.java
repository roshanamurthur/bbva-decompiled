package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeOperator;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeLift<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeOperator<? extends R, ? super T> f75938p0;

    public MaybeLift(MaybeSource<T> maybeSource, MaybeOperator<? extends R, ? super T> maybeOperator) {
        super(maybeSource);
        this.f75938p0 = maybeOperator;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        try {
            MaybeObserver<? super Object> maybeObserverApply = this.f75938p0.apply(maybeObserver);
            Objects.requireNonNull(maybeObserverApply, "The operator returned a null MaybeObserver");
            this.source.subscribe(maybeObserverApply);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, maybeObserver);
        }
    }
}
