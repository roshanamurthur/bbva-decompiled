package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleOnErrorReturn<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f73544p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends T> f73545q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final T f73546r0;

    public final class a implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73547p0;

        public a(SingleObserver<? super T> singleObserver) {
            this.f73547p0 = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            T tApply;
            SingleOnErrorReturn singleOnErrorReturn = SingleOnErrorReturn.this;
            Function<? super Throwable, ? extends T> function = singleOnErrorReturn.f73545q0;
            SingleObserver<? super T> singleObserver = this.f73547p0;
            if (function != null) {
                try {
                    tApply = function.apply(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    singleObserver.onError(new CompositeException(th2, th3));
                    return;
                }
            } else {
                tApply = singleOnErrorReturn.f73546r0;
            }
            if (tApply != null) {
                singleObserver.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            singleObserver.onError(nullPointerException);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f73547p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73547p0.onSuccess(t10);
        }
    }

    public SingleOnErrorReturn(SingleSource<? extends T> singleSource, Function<? super Throwable, ? extends T> function, T t10) {
        this.f73544p0 = singleSource;
        this.f73545q0 = function;
        this.f73546r0 = t10;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73544p0.subscribe(new a(singleObserver));
    }
}
