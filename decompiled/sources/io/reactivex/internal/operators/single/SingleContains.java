package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleContains<T> extends Single<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73384p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Object f73385q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<Object, Object> f73386r0;

    public final class a implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f73387p0;

        public a(SingleObserver<? super Boolean> singleObserver) {
            this.f73387p0 = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73387p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f73387p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            SingleObserver<? super Boolean> singleObserver = this.f73387p0;
            try {
                SingleContains singleContains = SingleContains.this;
                singleObserver.onSuccess(Boolean.valueOf(singleContains.f73386r0.test(t10, singleContains.f73385q0)));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                singleObserver.onError(th2);
            }
        }
    }

    public SingleContains(SingleSource<T> singleSource, Object obj, BiPredicate<Object, Object> biPredicate) {
        this.f73384p0 = singleSource;
        this.f73385q0 = obj;
        this.f73386r0 = biPredicate;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f73384p0.subscribe(new a(singleObserver));
    }
}
