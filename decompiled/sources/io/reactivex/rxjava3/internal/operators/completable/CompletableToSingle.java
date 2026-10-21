package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableToSingle<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74406p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<? extends T> f74407q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final T f74408r0;

    public final class a implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f74409p0;

        public a(SingleObserver<? super T> singleObserver) {
            this.f74409p0 = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            T t10;
            CompletableToSingle completableToSingle = CompletableToSingle.this;
            Supplier<? extends T> supplier = completableToSingle.f74407q0;
            SingleObserver<? super T> singleObserver = this.f74409p0;
            if (supplier != null) {
                try {
                    t10 = supplier.get();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    singleObserver.onError(th2);
                    return;
                }
            } else {
                t10 = completableToSingle.f74408r0;
            }
            if (t10 == null) {
                singleObserver.onError(new NullPointerException("The value supplied is null"));
            } else {
                singleObserver.onSuccess(t10);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74409p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f74409p0.onSubscribe(disposable);
        }
    }

    public CompletableToSingle(CompletableSource completableSource, Supplier<? extends T> supplier, T t10) {
        this.f74406p0 = completableSource;
        this.f74408r0 = t10;
        this.f74407q0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f74406p0.subscribe(new a(singleObserver));
    }
}
