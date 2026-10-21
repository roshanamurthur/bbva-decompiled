package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRefCount<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ConnectableObservable<T> f76971p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f76972q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f76973r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f76974s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Scheduler f76975t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public a f76976u0;

    public static final class a extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ObservableRefCount<?> f76977p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SequentialDisposable f76978q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f76979r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f76980s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f76981t0;

        public a(ObservableRefCount<?> observableRefCount) {
            this.f76977p0 = observableRefCount;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Disposable disposable) throws Throwable {
            DisposableHelper.replace(this, disposable);
            synchronized (this.f76977p0) {
                try {
                    if (this.f76981t0) {
                        this.f76977p0.f76971p0.reset();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f76977p0.e(this);
        }
    }

    public static final class b<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76982p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ObservableRefCount<T> f76983q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a f76984r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f76985s0;

        public b(Observer<? super T> observer, ObservableRefCount<T> observableRefCount, a aVar) {
            this.f76982p0 = observer;
            this.f76983q0 = observableRefCount;
            this.f76984r0 = aVar;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76985s0.dispose();
            if (compareAndSet(false, true)) {
                ObservableRefCount<T> observableRefCount = this.f76983q0;
                a aVar = this.f76984r0;
                synchronized (observableRefCount) {
                    try {
                        a aVar2 = observableRefCount.f76976u0;
                        if (aVar2 != null && aVar2 == aVar) {
                            long j10 = aVar.f76979r0 - 1;
                            aVar.f76979r0 = j10;
                            if (j10 == 0 && aVar.f76980s0) {
                                if (observableRefCount.f76973r0 == 0) {
                                    observableRefCount.e(aVar);
                                } else {
                                    SequentialDisposable sequentialDisposable = new SequentialDisposable();
                                    aVar.f76978q0 = sequentialDisposable;
                                    sequentialDisposable.replace(observableRefCount.f76975t0.scheduleDirect(aVar, observableRefCount.f76973r0, observableRefCount.f76974s0));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76985s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f76983q0.d(this.f76984r0);
                this.f76982p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76983q0.d(this.f76984r0);
                this.f76982p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76982p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76985s0, disposable)) {
                this.f76985s0 = disposable;
                this.f76982p0.onSubscribe(this);
            }
        }
    }

    public ObservableRefCount(ConnectableObservable<T> connectableObservable) {
        this(connectableObservable, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public final void d(a aVar) {
        synchronized (this) {
            try {
                if (this.f76976u0 == aVar) {
                    SequentialDisposable sequentialDisposable = aVar.f76978q0;
                    if (sequentialDisposable != null) {
                        sequentialDisposable.dispose();
                        aVar.f76978q0 = null;
                    }
                    long j10 = aVar.f76979r0 - 1;
                    aVar.f76979r0 = j10;
                    if (j10 == 0) {
                        this.f76976u0 = null;
                        this.f76971p0.reset();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f76979r0 == 0 && aVar == this.f76976u0) {
                    this.f76976u0 = null;
                    Disposable disposable = aVar.get();
                    DisposableHelper.dispose(aVar);
                    if (disposable == null) {
                        aVar.f76981t0 = true;
                    } else {
                        this.f76971p0.reset();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar;
        boolean z10;
        SequentialDisposable sequentialDisposable;
        synchronized (this) {
            try {
                aVar = this.f76976u0;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f76976u0 = aVar;
                }
                long j10 = aVar.f76979r0;
                if (j10 == 0 && (sequentialDisposable = aVar.f76978q0) != null) {
                    sequentialDisposable.dispose();
                }
                long j11 = j10 + 1;
                aVar.f76979r0 = j11;
                if (aVar.f76980s0 || j11 != this.f76972q0) {
                    z10 = false;
                } else {
                    z10 = true;
                    aVar.f76980s0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f76971p0.subscribe(new b(observer, this, aVar));
        if (z10) {
            this.f76971p0.connect(aVar);
        }
    }

    public ObservableRefCount(ConnectableObservable<T> connectableObservable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f76971p0 = connectableObservable;
        this.f76972q0 = i10;
        this.f76973r0 = j10;
        this.f76974s0 = timeUnit;
        this.f76975t0 = scheduler;
    }
}
