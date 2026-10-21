package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableAndThenObservable<R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f71823p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<? extends R> f71824q0;

    public static final class a<R> extends AtomicReference<Disposable> implements Observer<R>, CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f71825p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ObservableSource<? extends R> f71826q0;

        public a(ObservableSource observableSource, Observer observer) {
            this.f71826q0 = observableSource;
            this.f71825p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            ObservableSource<? extends R> observableSource = this.f71826q0;
            if (observableSource == null) {
                this.f71825p0.onComplete();
            } else {
                this.f71826q0 = null;
                observableSource.subscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f71825p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(R r3) {
            this.f71825p0.onNext(r3);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    public CompletableAndThenObservable(CompletableSource completableSource, ObservableSource<? extends R> observableSource) {
        this.f71823p0 = completableSource;
        this.f71824q0 = observableSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        a aVar = new a(this.f71824q0, observer);
        observer.onSubscribe(aVar);
        this.f71823p0.subscribe(aVar);
    }
}
