package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSkipLastTimed<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72876p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f72877q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f72878r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f72879s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f72880t0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72881p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72882q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f72883r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f72884s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f72885t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f72886u0;
        public Disposable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f72887w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f72888x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Throwable f72889y0;

        public a(Observer<? super T> observer, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
            this.f72881p0 = observer;
            this.f72882q0 = j10;
            this.f72883r0 = timeUnit;
            this.f72884s0 = scheduler;
            this.f72885t0 = new SpscLinkedArrayQueue<>(i10);
            this.f72886u0 = z10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = this.f72881p0;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f72885t0;
            boolean z10 = this.f72886u0;
            TimeUnit timeUnit = this.f72883r0;
            Scheduler scheduler = this.f72884s0;
            long j10 = this.f72882q0;
            int iAddAndGet = 1;
            while (!this.f72887w0) {
                boolean z11 = this.f72888x0;
                Long l6 = (Long) spscLinkedArrayQueue.peek();
                boolean z12 = l6 == null;
                long jNow = scheduler.now(timeUnit);
                if (!z12 && l6.longValue() > jNow - j10) {
                    z12 = true;
                }
                if (z11) {
                    if (!z10) {
                        Throwable th2 = this.f72889y0;
                        if (th2 != null) {
                            this.f72885t0.clear();
                            observer.onError(th2);
                            return;
                        } else if (z12) {
                            observer.onComplete();
                            return;
                        }
                    } else if (z12) {
                        Throwable th3 = this.f72889y0;
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
            this.f72885t0.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f72887w0) {
                return;
            }
            this.f72887w0 = true;
            this.v0.dispose();
            if (getAndIncrement() == 0) {
                this.f72885t0.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72887w0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72888x0 = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72889y0 = th2;
            this.f72888x0 = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72885t0.offer(Long.valueOf(this.f72884s0.now(this.f72883r0)), t10);
            a();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                this.f72881p0.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLastTimed(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        super(observableSource);
        this.f72876p0 = j10;
        this.f72877q0 = timeUnit;
        this.f72878r0 = scheduler;
        this.f72879s0 = i10;
        this.f72880t0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72876p0, this.f72877q0, this.f72878r0, this.f72879s0, this.f72880t0));
    }
}
