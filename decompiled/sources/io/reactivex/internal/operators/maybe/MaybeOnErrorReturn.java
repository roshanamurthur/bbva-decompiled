package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeOnErrorReturn<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends T> f71733p0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71734p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends T> f71735q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f71736r0;

        public a(MaybeObserver<? super T> maybeObserver, Function<? super Throwable, ? extends T> function) {
            this.f71734p0 = maybeObserver;
            this.f71735q0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71736r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71736r0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71734p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            MaybeObserver<? super T> maybeObserver = this.f71734p0;
            try {
                maybeObserver.onSuccess((Object) ObjectHelper.requireNonNull(this.f71735q0.apply(th2), "The valueSupplier returned a null value"));
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                maybeObserver.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71736r0, disposable)) {
                this.f71736r0 = disposable;
                this.f71734p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71734p0.onSuccess(t10);
        }
    }

    public MaybeOnErrorReturn(MaybeSource<T> maybeSource, Function<? super Throwable, ? extends T> function) {
        super(maybeSource);
        this.f71733p0 = function;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f71733p0));
    }
}
