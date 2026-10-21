package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoOnTerminate<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73467p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f73468q0;

    public final class a implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73469p0;

        public a(SingleObserver<? super T> singleObserver) {
            this.f73469p0 = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            try {
                SingleDoOnTerminate.this.f73468q0.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f73469p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f73469p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            SingleObserver<? super T> singleObserver = this.f73469p0;
            try {
                SingleDoOnTerminate.this.f73468q0.run();
                singleObserver.onSuccess(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                singleObserver.onError(th2);
            }
        }
    }

    public SingleDoOnTerminate(SingleSource<T> singleSource, Action action) {
        this.f73467p0 = singleSource;
        this.f73468q0 = action;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73467p0.subscribe(new a(singleObserver));
    }
}
