package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableToSingle<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70144p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<? extends T> f70145q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final T f70146r0;

    public final class a implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f70147p0;

        public a(SingleObserver<? super T> singleObserver) {
            this.f70147p0 = singleObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            T tCall;
            CompletableToSingle completableToSingle = CompletableToSingle.this;
            Callable<? extends T> callable = completableToSingle.f70145q0;
            SingleObserver<? super T> singleObserver = this.f70147p0;
            if (callable != null) {
                try {
                    tCall = callable.call();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    singleObserver.onError(th2);
                    return;
                }
            } else {
                tCall = completableToSingle.f70146r0;
            }
            if (tCall == null) {
                singleObserver.onError(new NullPointerException("The value supplied is null"));
            } else {
                singleObserver.onSuccess(tCall);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70147p0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f70147p0.onSubscribe(disposable);
        }
    }

    public CompletableToSingle(CompletableSource completableSource, Callable<? extends T> callable, T t10) {
        this.f70144p0 = completableSource;
        this.f70146r0 = t10;
        this.f70145q0 = callable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f70144p0.subscribe(new a(singleObserver));
    }
}
