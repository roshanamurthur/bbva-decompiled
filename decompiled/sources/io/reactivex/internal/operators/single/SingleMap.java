package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleMap<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f73533p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends R> f73534q0;

    public static final class a<T, R> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f73535p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f73536q0;

        public a(SingleObserver<? super R> singleObserver, Function<? super T, ? extends R> function) {
            this.f73535p0 = singleObserver;
            this.f73536q0 = function;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73535p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f73535p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            try {
                this.f73535p0.onSuccess(ObjectHelper.requireNonNull(this.f73536q0.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }
    }

    public SingleMap(SingleSource<? extends T> singleSource, Function<? super T, ? extends R> function) {
        this.f73533p0 = singleSource;
        this.f73534q0 = function;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f73533p0.subscribe(new a(singleObserver, this.f73534q0));
    }
}
