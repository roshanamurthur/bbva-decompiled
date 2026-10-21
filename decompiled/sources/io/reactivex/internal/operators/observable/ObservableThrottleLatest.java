package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableThrottleLatest<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72985p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f72986q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f72987r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f72988s0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public volatile boolean E0;
        public boolean F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72989p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72990q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f72991r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f72992s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f72993t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<T> f72994u0 = new AtomicReference<>();
        public Disposable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f72995w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Throwable f72996x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f72997y0;

        public a(Observer<? super T> observer, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z10) {
            this.f72989p0 = observer;
            this.f72990q0 = j10;
            this.f72991r0 = timeUnit;
            this.f72992s0 = worker;
            this.f72993t0 = z10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f72994u0;
            Observer<? super T> observer = this.f72989p0;
            int iAddAndGet = 1;
            while (!this.f72997y0) {
                boolean z10 = this.f72995w0;
                if (z10 && this.f72996x0 != null) {
                    atomicReference.lazySet(null);
                    observer.onError(this.f72996x0);
                    this.f72992s0.dispose();
                    return;
                }
                boolean z11 = atomicReference.get() == null;
                if (z10) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z11 && this.f72993t0) {
                        observer.onNext(andSet);
                    }
                    observer.onComplete();
                    this.f72992s0.dispose();
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
                    this.f72992s0.schedule(this, this.f72990q0, this.f72991r0);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72997y0 = true;
            this.v0.dispose();
            this.f72992s0.dispose();
            if (getAndIncrement() == 0) {
                this.f72994u0.lazySet(null);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72997y0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72995w0 = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72996x0 = th2;
            this.f72995w0 = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72994u0.set(t10);
            a();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                this.f72989p0.onSubscribe(this);
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
        this.f72985p0 = j10;
        this.f72986q0 = timeUnit;
        this.f72987r0 = scheduler;
        this.f72988s0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72985p0, this.f72986q0, this.f72987r0.createWorker(), this.f72988s0));
    }
}
