package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDefer<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends MaybeSource<? extends T>> f75788p0;

    public MaybeDefer(Supplier<? extends MaybeSource<? extends T>> supplier) {
        this.f75788p0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        try {
            MaybeSource<? extends T> maybeSource = this.f75788p0.get();
            Objects.requireNonNull(maybeSource, "The maybeSupplier returned a null MaybeSource");
            maybeSource.subscribe(maybeObserver);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, maybeObserver);
        }
    }
}
