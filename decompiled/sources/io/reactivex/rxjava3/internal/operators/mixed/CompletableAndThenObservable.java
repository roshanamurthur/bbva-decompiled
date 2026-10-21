package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableAndThenObservable<R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f76070p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<? extends R> f76071q0;

    public static final class a<R> extends AtomicReference<Disposable> implements Observer<R>, CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76072p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ObservableSource<? extends R> f76073q0;

        public a(ObservableSource observableSource, Observer observer) {
            this.f76073q0 = observableSource;
            this.f76072p0 = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            ObservableSource<? extends R> observableSource = this.f76073q0;
            if (observableSource == null) {
                this.f76072p0.onComplete();
            } else {
                this.f76073q0 = null;
                observableSource.subscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76072p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(R r3) {
            this.f76072p0.onNext(r3);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    public CompletableAndThenObservable(CompletableSource completableSource, ObservableSource<? extends R> observableSource) {
        this.f76070p0 = completableSource;
        this.f76071q0 = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        a aVar = new a(this.f76071q0, observer);
        observer.onSubscribe(aVar);
        this.f76070p0.subscribe(aVar);
    }
}
