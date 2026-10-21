package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSampleTimed<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72786p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f72787q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f72788r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f72789s0;

    public static final class a<T> extends c<T> {
        public final AtomicInteger v0;

        public a(SerializedObserver serializedObserver, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            super(serializedObserver, j10, timeUnit, scheduler);
            this.v0 = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.c
        public final void a() {
            T andSet = getAndSet(null);
            Observer<? super T> observer = this.f72790p0;
            if (andSet != null) {
                observer.onNext(andSet);
            }
            if (this.v0.decrementAndGet() == 0) {
                observer.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicInteger atomicInteger = this.v0;
            if (atomicInteger.incrementAndGet() == 2) {
                T andSet = getAndSet(null);
                Observer<? super T> observer = this.f72790p0;
                if (andSet != null) {
                    observer.onNext(andSet);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    observer.onComplete();
                }
            }
        }
    }

    public static final class b<T> extends c<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.c
        public final void a() {
            this.f72790p0.onComplete();
        }

        @Override // java.lang.Runnable
        public final void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f72790p0.onNext(andSet);
            }
        }
    }

    public static abstract class c<T> extends AtomicReference<T> implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72790p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72791q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f72792r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f72793s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72794t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f72795u0;

        public c(SerializedObserver serializedObserver, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f72790p0 = serializedObserver;
            this.f72791q0 = j10;
            this.f72792r0 = timeUnit;
            this.f72793s0 = scheduler;
        }

        public abstract void a();

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f72794t0);
            this.f72795u0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72795u0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.dispose(this.f72794t0);
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f72794t0);
            this.f72790p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            lazySet(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72795u0, disposable)) {
                this.f72795u0 = disposable;
                this.f72790p0.onSubscribe(this);
                Scheduler scheduler = this.f72793s0;
                long j10 = this.f72791q0;
                DisposableHelper.replace(this.f72794t0, scheduler.schedulePeriodicallyDirect(this, j10, j10, this.f72792r0));
            }
        }
    }

    public ObservableSampleTimed(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(observableSource);
        this.f72786p0 = j10;
        this.f72787q0 = timeUnit;
        this.f72788r0 = scheduler;
        this.f72789s0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        if (this.f72789s0) {
            this.source.subscribe(new a(serializedObserver, this.f72786p0, this.f72787q0, this.f72788r0));
        } else {
            this.source.subscribe(new b(serializedObserver, this.f72786p0, this.f72787q0, this.f72788r0));
        }
    }
}
