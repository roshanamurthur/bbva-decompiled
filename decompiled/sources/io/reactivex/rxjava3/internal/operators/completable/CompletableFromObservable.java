package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableFromObservable<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f74307p0;

    public CompletableFromObservable(ObservableSource<T> observableSource) {
        this.f74307p0 = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74307p0.subscribe(new a(completableObserver));
    }

    public static final class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74308p0;

        public a(CompletableObserver completableObserver) {
            this.f74308p0 = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f74308p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f74308p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f74308p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
        }
    }
}
