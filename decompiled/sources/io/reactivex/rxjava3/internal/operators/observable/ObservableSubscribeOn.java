package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSubscribeOn<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f77182p0;

    public static final class a<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77183p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77184q0 = new AtomicReference<>();

        public a(Observer<? super T> observer) {
            this.f77183p0 = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f77184q0);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77183p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77183p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77183p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f77184q0, disposable);
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f77185p0;

        public b(a<T> aVar) {
            this.f77185p0 = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ObservableSubscribeOn.this.source.subscribe(this.f77185p0);
        }
    }

    public ObservableSubscribeOn(ObservableSource<T> observableSource, Scheduler scheduler) {
        super(observableSource);
        this.f77182p0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        DisposableHelper.setOnce(aVar, this.f77182p0.scheduleDirect(new b(aVar)));
    }
}
