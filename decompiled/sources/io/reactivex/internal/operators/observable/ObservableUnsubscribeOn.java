package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableUnsubscribeOn<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f73054p0;

    public static final class a<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f73055p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f73056q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f73057r0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$a$a, reason: collision with other inner class name */
        public final class RunnableC0353a implements Runnable {
            public RunnableC0353a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f73057r0.dispose();
            }
        }

        public a(Observer<? super T> observer, Scheduler scheduler) {
            this.f73055p0 = observer;
            this.f73056q0 = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f73056q0.scheduleDirect(new RunnableC0353a());
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.f73055p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (get()) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73055p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (get()) {
                return;
            }
            this.f73055p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73057r0, disposable)) {
                this.f73057r0 = disposable;
                this.f73055p0.onSubscribe(this);
            }
        }
    }

    public ObservableUnsubscribeOn(ObservableSource<T> observableSource, Scheduler scheduler) {
        super(observableSource);
        this.f73054p0 = scheduler;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f73054p0));
    }
}
