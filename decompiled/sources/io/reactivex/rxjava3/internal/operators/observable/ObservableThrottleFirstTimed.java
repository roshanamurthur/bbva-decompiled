package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableThrottleFirstTimed<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f77253p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f77254q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f77255r0;

    public static final class a<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77256p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77257q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f77258r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f77259s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f77260t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f77261u0;

        public a(SerializedObserver serializedObserver, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f77256p0 = serializedObserver;
            this.f77257q0 = j10;
            this.f77258r0 = timeUnit;
            this.f77259s0 = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77260t0.dispose();
            this.f77259s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77259s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77256p0.onComplete();
            this.f77259s0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77256p0.onError(th2);
            this.f77259s0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f77261u0) {
                return;
            }
            this.f77261u0 = true;
            this.f77256p0.onNext(t10);
            Disposable disposable = get();
            if (disposable != null) {
                disposable.dispose();
            }
            DisposableHelper.replace(this, this.f77259s0.schedule(this, this.f77257q0, this.f77258r0));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77260t0, disposable)) {
                this.f77260t0 = disposable;
                this.f77256p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f77261u0 = false;
        }
    }

    public ObservableThrottleFirstTimed(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f77253p0 = j10;
        this.f77254q0 = timeUnit;
        this.f77255r0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(new SerializedObserver(observer), this.f77253p0, this.f77254q0, this.f77255r0.createWorker()));
    }
}
