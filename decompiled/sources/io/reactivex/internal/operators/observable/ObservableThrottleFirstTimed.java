package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableThrottleFirstTimed<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72976p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f72977q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f72978r0;

    public static final class a<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72979p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72980q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f72981r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f72982s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f72983t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f72984u0;
        public boolean v0;

        public a(SerializedObserver serializedObserver, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f72979p0 = serializedObserver;
            this.f72980q0 = j10;
            this.f72981r0 = timeUnit;
            this.f72982s0 = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72983t0.dispose();
            this.f72982s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72982s0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f72979p0.onComplete();
            this.f72982s0.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.v0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.v0 = true;
            this.f72979p0.onError(th2);
            this.f72982s0.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72984u0 || this.v0) {
                return;
            }
            this.f72984u0 = true;
            this.f72979p0.onNext(t10);
            Disposable disposable = get();
            if (disposable != null) {
                disposable.dispose();
            }
            DisposableHelper.replace(this, this.f72982s0.schedule(this, this.f72980q0, this.f72981r0));
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72983t0, disposable)) {
                this.f72983t0 = disposable;
                this.f72979p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f72984u0 = false;
        }
    }

    public ObservableThrottleFirstTimed(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f72976p0 = j10;
        this.f72977q0 = timeUnit;
        this.f72978r0 = scheduler;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(new SerializedObserver(observer), this.f72976p0, this.f72977q0, this.f72978r0.createWorker()));
    }
}
