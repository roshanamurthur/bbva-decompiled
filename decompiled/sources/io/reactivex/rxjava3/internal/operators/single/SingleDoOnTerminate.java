package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoOnTerminate<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77728p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f77729q0;

    public final class a implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77730p0;

        public a(SingleObserver<? super T> singleObserver) {
            this.f77730p0 = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            try {
                SingleDoOnTerminate.this.f77729q0.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f77730p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f77730p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            SingleObserver<? super T> singleObserver = this.f77730p0;
            try {
                SingleDoOnTerminate.this.f77729q0.run();
                singleObserver.onSuccess(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                singleObserver.onError(th2);
            }
        }
    }

    public SingleDoOnTerminate(SingleSource<T> singleSource, Action action) {
        this.f77728p0 = singleSource;
        this.f77729q0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77728p0.subscribe(new a(singleObserver));
    }
}
