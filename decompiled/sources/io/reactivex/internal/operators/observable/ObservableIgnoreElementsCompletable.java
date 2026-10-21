package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableIgnoreElementsCompletable<T> extends Completable implements FuseToObservable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72507p0;

    public ObservableIgnoreElementsCompletable(ObservableSource<T> observableSource) {
        this.f72507p0 = observableSource;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableIgnoreElements(this.f72507p0));
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f72507p0.subscribe(new a(completableObserver));
    }

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f72508p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f72509q0;

        public a(CompletableObserver completableObserver) {
            this.f72508p0 = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72509q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72509q0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72508p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72508p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f72509q0 = disposable;
            this.f72508p0.onSubscribe(this);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
        }
    }
}
