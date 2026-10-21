package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoOnError<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73450p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Throwable> f73451q0;

    public final class a implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73452p0;

        public a(SingleObserver<? super T> singleObserver) {
            this.f73452p0 = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            try {
                SingleDoOnError.this.f73451q0.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f73452p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f73452p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73452p0.onSuccess(t10);
        }
    }

    public SingleDoOnError(SingleSource<T> singleSource, Consumer<? super Throwable> consumer) {
        this.f73450p0 = singleSource;
        this.f73451q0 = consumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73450p0.subscribe(new a(singleObserver));
    }
}
