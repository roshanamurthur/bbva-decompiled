package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleMap<T, R> extends Single<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f77811p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends R> f77812q0;

    public static final class a<T, R> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f77813p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f77814q0;

        public a(SingleObserver<? super R> singleObserver, Function<? super T, ? extends R> function) {
            this.f77813p0 = singleObserver;
            this.f77814q0 = function;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77813p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f77813p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            try {
                R rApply = this.f77814q0.apply(t10);
                Objects.requireNonNull(rApply, "The mapper function returned a null value.");
                this.f77813p0.onSuccess(rApply);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }
    }

    public SingleMap(SingleSource<? extends T> singleSource, Function<? super T, ? extends R> function) {
        this.f77811p0 = singleSource;
        this.f77812q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f77811p0.subscribe(new a(singleObserver, this.f77812q0));
    }
}
