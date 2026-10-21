package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSubscribeOn<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f72905p0;

    public static final class a<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72906p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72907q0 = new AtomicReference<>();

        public a(Observer<? super T> observer) {
            this.f72906p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f72907q0);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72906p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72906p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72906p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f72907q0, disposable);
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f72908p0;

        public b(a<T> aVar) {
            this.f72908p0 = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ObservableSubscribeOn.this.source.subscribe(this.f72908p0);
        }
    }

    public ObservableSubscribeOn(ObservableSource<T> observableSource, Scheduler scheduler) {
        super(observableSource);
        this.f72905p0 = scheduler;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        DisposableHelper.setOnce(aVar, this.f72905p0.scheduleDirect(new b(aVar)));
    }
}
