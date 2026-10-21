package io.reactivex.subjects;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class UnicastSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SpscLinkedArrayQueue<T> f78686p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<Observer<? super T>> f78687q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Runnable> f78688r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f78689s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile boolean f78690t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public volatile boolean f78691u0;
    public Throwable v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final AtomicBoolean f78692w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final a f78693x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f78694y0;

    public final class a extends BasicIntQueueDisposable<T> {
        public a() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            UnicastSubject.this.f78686p0.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (UnicastSubject.this.f78690t0) {
                return;
            }
            UnicastSubject.this.f78690t0 = true;
            UnicastSubject.this.d();
            UnicastSubject.this.f78687q0.lazySet(null);
            if (UnicastSubject.this.f78693x0.getAndIncrement() == 0) {
                UnicastSubject.this.f78687q0.lazySet(null);
                UnicastSubject unicastSubject = UnicastSubject.this;
                if (unicastSubject.f78694y0) {
                    return;
                }
                unicastSubject.f78686p0.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return UnicastSubject.this.f78690t0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return UnicastSubject.this.f78686p0.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            return UnicastSubject.this.f78686p0.poll();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            UnicastSubject.this.f78694y0 = true;
            return 2;
        }
    }

    public UnicastSubject(int i10, boolean z10) {
        this.f78686p0 = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i10, "capacityHint"));
        this.f78688r0 = new AtomicReference<>();
        this.f78689s0 = z10;
        this.f78687q0 = new AtomicReference<>();
        this.f78692w0 = new AtomicBoolean();
        this.f78693x0 = new a();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create() {
        return new UnicastSubject<>(Observable.bufferSize(), true);
    }

    public final void d() {
        AtomicReference<Runnable> atomicReference = this.f78688r0;
        Runnable runnable = atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    public final void e() {
        Throwable th2;
        if (this.f78693x0.getAndIncrement() != 0) {
            return;
        }
        Observer<? super T> observer = this.f78687q0.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (observer == null) {
            iAddAndGet2 = this.f78693x0.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                observer = this.f78687q0.get();
            }
        }
        if (this.f78694y0) {
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f78686p0;
            boolean z10 = !this.f78689s0;
            while (!this.f78690t0) {
                boolean z11 = this.f78691u0;
                if (z10 && z11 && (th2 = this.v0) != null) {
                    this.f78687q0.lazySet(null);
                    spscLinkedArrayQueue.clear();
                    observer.onError(th2);
                    return;
                }
                observer.onNext(null);
                if (z11) {
                    this.f78687q0.lazySet(null);
                    Throwable th3 = this.v0;
                    if (th3 != null) {
                        observer.onError(th3);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f78693x0.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f78687q0.lazySet(null);
            return;
        }
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = this.f78686p0;
        boolean z12 = !this.f78689s0;
        boolean z13 = true;
        int iAddAndGet3 = 1;
        while (!this.f78690t0) {
            boolean z14 = this.f78691u0;
            T tPoll = this.f78686p0.poll();
            boolean z15 = tPoll == null;
            if (z14) {
                if (z12 && z13) {
                    Throwable th4 = this.v0;
                    if (th4 != null) {
                        this.f78687q0.lazySet(null);
                        spscLinkedArrayQueue2.clear();
                        observer.onError(th4);
                        return;
                    }
                    z13 = false;
                }
                if (z15) {
                    this.f78687q0.lazySet(null);
                    Throwable th5 = this.v0;
                    if (th5 != null) {
                        observer.onError(th5);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
            }
            if (z15) {
                iAddAndGet3 = this.f78693x0.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                observer.onNext(tPoll);
            }
        }
        this.f78687q0.lazySet(null);
        spscLinkedArrayQueue2.clear();
    }

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        if (this.f78691u0) {
            return this.v0;
        }
        return null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return this.f78691u0 && this.v0 == null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.f78687q0.get() != null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return this.f78691u0 && this.v0 != null;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f78691u0 || this.f78690t0) {
            return;
        }
        this.f78691u0 = true;
        d();
        e();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f78691u0 || this.f78690t0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.v0 = th2;
        this.f78691u0 = true;
        d();
        e();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        ObjectHelper.requireNonNull(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f78691u0 || this.f78690t0) {
            return;
        }
        this.f78686p0.offer(t10);
        e();
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f78691u0 || this.f78690t0) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        if (this.f78692w0.get() || !this.f78692w0.compareAndSet(false, true)) {
            EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), observer);
            return;
        }
        observer.onSubscribe(this.f78693x0);
        this.f78687q0.lazySet(observer);
        if (this.f78690t0) {
            this.f78687q0.lazySet(null);
        } else {
            e();
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i10) {
        return new UnicastSubject<>(i10, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i10, Runnable runnable) {
        return new UnicastSubject<>(i10, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i10, Runnable runnable, boolean z10) {
        return new UnicastSubject<>(i10, runnable, z10);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(boolean z10) {
        return new UnicastSubject<>(Observable.bufferSize(), z10);
    }

    public UnicastSubject(int i10, Runnable runnable, boolean z10) {
        this.f78686p0 = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i10, "capacityHint"));
        this.f78688r0 = new AtomicReference<>(ObjectHelper.requireNonNull(runnable, "onTerminate"));
        this.f78689s0 = z10;
        this.f78687q0 = new AtomicReference<>();
        this.f78692w0 = new AtomicBoolean();
        this.f78693x0 = new a();
    }
}
