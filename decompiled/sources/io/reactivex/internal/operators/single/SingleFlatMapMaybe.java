package io.reactivex.internal.operators.single;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMapMaybe<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f73505p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f73506q0;

    public static final class a<R> implements MaybeObserver<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<Disposable> f73507p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybeObserver<? super R> f73508q0;

        public a(MaybeObserver maybeObserver, AtomicReference atomicReference) {
            this.f73507p0 = atomicReference;
            this.f73508q0 = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f73508q0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f73508q0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f73507p0, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(R r3) {
            this.f73508q0.onSuccess(r3);
        }
    }

    public static final class b<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f73509p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f73510q0;

        public b(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends R>> function) {
            this.f73509p0 = maybeObserver;
            this.f73510q0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73509p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f73509p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.f73510q0.apply(t10), "The mapper returned a null MaybeSource");
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new a(this.f73509p0, this));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }
    }

    public SingleFlatMapMaybe(SingleSource<? extends T> singleSource, Function<? super T, ? extends MaybeSource<? extends R>> function) {
        this.f73506q0 = function;
        this.f73505p0 = singleSource;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.f73505p0.subscribe(new b(maybeObserver, this.f73506q0));
    }
}
