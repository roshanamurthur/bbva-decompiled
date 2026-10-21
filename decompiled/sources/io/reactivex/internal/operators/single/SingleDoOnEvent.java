package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDoOnEvent<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73454p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiConsumer<? super T, ? super Throwable> f73455q0;

    public final class a implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73456p0;

        public a(SingleObserver<? super T> singleObserver) {
            this.f73456p0 = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            try {
                SingleDoOnEvent.this.f73455q0.accept(null, th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f73456p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f73456p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            SingleObserver<? super T> singleObserver = this.f73456p0;
            try {
                SingleDoOnEvent.this.f73455q0.accept(t10, null);
                singleObserver.onSuccess(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                singleObserver.onError(th2);
            }
        }
    }

    public SingleDoOnEvent(SingleSource<T> singleSource, BiConsumer<? super T, ? super Throwable> biConsumer) {
        this.f73454p0 = singleSource;
        this.f73455q0 = biConsumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73454p0.subscribe(new a(singleObserver));
    }
}
