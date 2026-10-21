package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableFromObservable<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f70050p0;

    public CompletableFromObservable(ObservableSource<T> observableSource) {
        this.f70050p0 = observableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70050p0.subscribe(new a(completableObserver));
    }

    public static final class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70051p0;

        public a(CompletableObserver completableObserver) {
            this.f70051p0 = completableObserver;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f70051p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f70051p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f70051p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
        }
    }
}
