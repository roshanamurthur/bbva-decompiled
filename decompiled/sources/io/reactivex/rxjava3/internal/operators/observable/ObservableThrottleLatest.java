package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableThrottleLatest<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f77262p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f77263q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f77264r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f77265s0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public volatile boolean E0;
        public boolean F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77266p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77267q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f77268r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f77269s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f77270t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<T> f77271u0 = new AtomicReference<>();
        public Disposable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f77272w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Throwable f77273x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f77274y0;

        public a(Observer<? super T> observer, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z10) {
            this.f77266p0 = observer;
            this.f77267q0 = j10;
            this.f77268r0 = timeUnit;
            this.f77269s0 = worker;
            this.f77270t0 = z10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f77271u0;
            Observer<? super T> observer = this.f77266p0;
            int iAddAndGet = 1;
            while (!this.f77274y0) {
                boolean z10 = this.f77272w0;
                if (z10 && this.f77273x0 != null) {
                    atomicReference.lazySet(null);
                    observer.onError(this.f77273x0);
                    this.f77269s0.dispose();
                    return;
                }
                boolean z11 = atomicReference.get() == null;
                if (z10) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z11 && this.f77270t0) {
                        observer.onNext(andSet);
                    }
                    observer.onComplete();
                    this.f77269s0.dispose();
                    return;
                }
                if (z11) {
                    if (this.E0) {
                        this.F0 = false;
                        this.E0 = false;
                    }
                } else if (!this.F0 || this.E0) {
                    observer.onNext(atomicReference.getAndSet(null));
                    this.E0 = false;
                    this.F0 = true;
                    this.f77269s0.schedule(this, this.f77267q0, this.f77268r0);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77274y0 = true;
            this.v0.dispose();
            this.f77269s0.dispose();
            if (getAndIncrement() == 0) {
                this.f77271u0.lazySet(null);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77274y0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77272w0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77273x0 = th2;
            this.f77272w0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77271u0.set(t10);
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                this.f77266p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.E0 = true;
            a();
        }
    }

    public ObservableThrottleLatest(Observable<T> observable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(observable);
        this.f77262p0 = j10;
        this.f77263q0 = timeUnit;
        this.f77264r0 = scheduler;
        this.f77265s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f77262p0, this.f77263q0, this.f77264r0.createWorker(), this.f77265s0));
    }
}
