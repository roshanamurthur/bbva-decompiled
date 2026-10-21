package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleContains<T> extends Single<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77638p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Object f77639q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<Object, Object> f77640r0;

    public final class a implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f77641p0;

        public a(SingleObserver<? super Boolean> singleObserver) {
            this.f77641p0 = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77641p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f77641p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            SingleObserver<? super Boolean> singleObserver = this.f77641p0;
            try {
                SingleContains singleContains = SingleContains.this;
                singleObserver.onSuccess(Boolean.valueOf(singleContains.f77640r0.test(t10, singleContains.f77639q0)));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                singleObserver.onError(th2);
            }
        }
    }

    public SingleContains(SingleSource<T> singleSource, Object obj, BiPredicate<Object, Object> biPredicate) {
        this.f77638p0 = singleSource;
        this.f77639q0 = obj;
        this.f77640r0 = biPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f77638p0.subscribe(new a(singleObserver));
    }
}
