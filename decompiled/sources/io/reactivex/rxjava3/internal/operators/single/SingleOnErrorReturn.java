package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleOnErrorReturn<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f77824p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends T> f77825q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final T f77826r0;

    public final class a implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77827p0;

        public a(SingleObserver<? super T> singleObserver) {
            this.f77827p0 = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            T tApply;
            SingleOnErrorReturn singleOnErrorReturn = SingleOnErrorReturn.this;
            Function<? super Throwable, ? extends T> function = singleOnErrorReturn.f77825q0;
            SingleObserver<? super T> singleObserver = this.f77827p0;
            if (function != null) {
                try {
                    tApply = function.apply(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    singleObserver.onError(new CompositeException(th2, th3));
                    return;
                }
            } else {
                tApply = singleOnErrorReturn.f77826r0;
            }
            if (tApply != null) {
                singleObserver.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            singleObserver.onError(nullPointerException);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f77827p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f77827p0.onSuccess(t10);
        }
    }

    public SingleOnErrorReturn(SingleSource<? extends T> singleSource, Function<? super Throwable, ? extends T> function, T t10) {
        this.f77824p0 = singleSource;
        this.f77825q0 = function;
        this.f77826r0 = t10;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77824p0.subscribe(new a(singleObserver));
    }
}
