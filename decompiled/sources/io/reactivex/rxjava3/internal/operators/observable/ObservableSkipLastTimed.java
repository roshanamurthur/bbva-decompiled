package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSkipLastTimed<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f77153p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f77154q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f77155r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f77156s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f77157t0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77158p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77159q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f77160r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f77161s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f77162t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f77163u0;
        public Disposable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f77164w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f77165x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Throwable f77166y0;

        public a(Observer<? super T> observer, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
            this.f77158p0 = observer;
            this.f77159q0 = j10;
            this.f77160r0 = timeUnit;
            this.f77161s0 = scheduler;
            this.f77162t0 = new SpscLinkedArrayQueue<>(i10);
            this.f77163u0 = z10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = this.f77158p0;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f77162t0;
            boolean z10 = this.f77163u0;
            TimeUnit timeUnit = this.f77160r0;
            Scheduler scheduler = this.f77161s0;
            long j10 = this.f77159q0;
            int iAddAndGet = 1;
            while (!this.f77164w0) {
                boolean z11 = this.f77165x0;
                Long l6 = (Long) spscLinkedArrayQueue.peek();
                boolean z12 = l6 == null;
                long jNow = scheduler.now(timeUnit);
                if (!z12 && l6.longValue() > jNow - j10) {
                    z12 = true;
                }
                if (z11) {
                    if (!z10) {
                        Throwable th2 = this.f77166y0;
                        if (th2 != null) {
                            this.f77162t0.clear();
                            observer.onError(th2);
                            return;
                        } else if (z12) {
                            observer.onComplete();
                            return;
                        }
                    } else if (z12) {
                        Throwable th3 = this.f77166y0;
                        if (th3 != null) {
                            observer.onError(th3);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    spscLinkedArrayQueue.poll();
                    observer.onNext(spscLinkedArrayQueue.poll());
                }
            }
            this.f77162t0.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77164w0) {
                return;
            }
            this.f77164w0 = true;
            this.v0.dispose();
            if (getAndIncrement() == 0) {
                this.f77162t0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77164w0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77165x0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77166y0 = th2;
            this.f77165x0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77162t0.offer(Long.valueOf(this.f77161s0.now(this.f77160r0)), t10);
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                this.f77158p0.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLastTimed(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        super(observableSource);
        this.f77153p0 = j10;
        this.f77154q0 = timeUnit;
        this.f77155r0 = scheduler;
        this.f77156s0 = i10;
        this.f77157t0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f77153p0, this.f77154q0, this.f77155r0, this.f77156s0, this.f77157t0));
    }
}
