package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableUnsubscribeOn<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f77331p0;

    public static final class a<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77332p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f77333q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77334r0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableUnsubscribeOn$a$a, reason: collision with other inner class name */
        public final class RunnableC0418a implements Runnable {
            public RunnableC0418a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f77334r0.dispose();
            }
        }

        public a(Observer<? super T> observer, Scheduler scheduler) {
            this.f77332p0 = observer;
            this.f77333q0 = scheduler;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f77333q0.scheduleDirect(new RunnableC0418a());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.f77332p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (get()) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77332p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (get()) {
                return;
            }
            this.f77332p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77334r0, disposable)) {
                this.f77334r0 = disposable;
                this.f77332p0.onSubscribe(this);
            }
        }
    }

    public ObservableUnsubscribeOn(ObservableSource<T> observableSource, Scheduler scheduler) {
        super(observableSource);
        this.f77331p0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f77331p0));
    }
}
