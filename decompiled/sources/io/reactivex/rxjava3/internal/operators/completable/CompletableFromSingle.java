package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableFromSingle<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f74313p0;

    public static final class a<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74314p0;

        public a(CompletableObserver completableObserver) {
            this.f74314p0 = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74314p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f74314p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f74314p0.onComplete();
        }
    }

    public CompletableFromSingle(SingleSource<T> singleSource) {
        this.f74313p0 = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74313p0.subscribe(new a(completableObserver));
    }
}
