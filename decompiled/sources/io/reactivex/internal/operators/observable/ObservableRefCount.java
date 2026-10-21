package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRefCount<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ConnectableObservable<T> f72694p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f72695q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f72696r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f72697s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Scheduler f72698t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public a f72699u0;

    public static final class a extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ObservableRefCount<?> f72700p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SequentialDisposable f72701q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f72702r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72703s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72704t0;

        public a(ObservableRefCount<?> observableRefCount) {
            this.f72700p0 = observableRefCount;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) throws Exception {
            Disposable disposable2 = disposable;
            DisposableHelper.replace(this, disposable2);
            synchronized (this.f72700p0) {
                try {
                    if (this.f72704t0) {
                        ((ResettableConnectable) this.f72700p0.f72694p0).resetIf(disposable2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f72700p0.e(this);
        }
    }

    public static final class b<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72705p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ObservableRefCount<T> f72706q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a f72707r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f72708s0;

        public b(Observer<? super T> observer, ObservableRefCount<T> observableRefCount, a aVar) {
            this.f72705p0 = observer;
            this.f72706q0 = observableRefCount;
            this.f72707r0 = aVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72708s0.dispose();
            if (compareAndSet(false, true)) {
                ObservableRefCount<T> observableRefCount = this.f72706q0;
                a aVar = this.f72707r0;
                synchronized (observableRefCount) {
                    try {
                        a aVar2 = observableRefCount.f72699u0;
                        if (aVar2 != null && aVar2 == aVar) {
                            long j10 = aVar.f72702r0 - 1;
                            aVar.f72702r0 = j10;
                            if (j10 == 0 && aVar.f72703s0) {
                                if (observableRefCount.f72696r0 == 0) {
                                    observableRefCount.e(aVar);
                                } else {
                                    SequentialDisposable sequentialDisposable = new SequentialDisposable();
                                    aVar.f72701q0 = sequentialDisposable;
                                    sequentialDisposable.replace(observableRefCount.f72698t0.scheduleDirect(aVar, observableRefCount.f72696r0, observableRefCount.f72697s0));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72708s0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f72706q0.d(this.f72707r0);
                this.f72705p0.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72706q0.d(this.f72707r0);
                this.f72705p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72705p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72708s0, disposable)) {
                this.f72708s0 = disposable;
                this.f72705p0.onSubscribe(this);
            }
        }
    }

    public ObservableRefCount(ConnectableObservable<T> connectableObservable) {
        this(connectableObservable, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public final void d(a aVar) {
        synchronized (this) {
            try {
                if (this.f72694p0 instanceof ObservablePublishClassic) {
                    a aVar2 = this.f72699u0;
                    if (aVar2 != null && aVar2 == aVar) {
                        this.f72699u0 = null;
                        SequentialDisposable sequentialDisposable = aVar.f72701q0;
                        if (sequentialDisposable != null) {
                            sequentialDisposable.dispose();
                            aVar.f72701q0 = null;
                        }
                    }
                    long j10 = aVar.f72702r0 - 1;
                    aVar.f72702r0 = j10;
                    if (j10 == 0) {
                        ConnectableObservable<T> connectableObservable = this.f72694p0;
                        if (connectableObservable instanceof Disposable) {
                            ((Disposable) connectableObservable).dispose();
                        } else if (connectableObservable instanceof ResettableConnectable) {
                            ((ResettableConnectable) connectableObservable).resetIf(aVar.get());
                        }
                    }
                } else {
                    a aVar3 = this.f72699u0;
                    if (aVar3 != null && aVar3 == aVar) {
                        SequentialDisposable sequentialDisposable2 = aVar.f72701q0;
                        if (sequentialDisposable2 != null) {
                            sequentialDisposable2.dispose();
                            aVar.f72701q0 = null;
                        }
                        long j11 = aVar.f72702r0 - 1;
                        aVar.f72702r0 = j11;
                        if (j11 == 0) {
                            this.f72699u0 = null;
                            ConnectableObservable<T> connectableObservable2 = this.f72694p0;
                            if (connectableObservable2 instanceof Disposable) {
                                ((Disposable) connectableObservable2).dispose();
                            } else if (connectableObservable2 instanceof ResettableConnectable) {
                                ((ResettableConnectable) connectableObservable2).resetIf(aVar.get());
                            }
                        }
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
                if (aVar.f72702r0 == 0 && aVar == this.f72699u0) {
                    this.f72699u0 = null;
                    Disposable disposable = aVar.get();
                    DisposableHelper.dispose(aVar);
                    ConnectableObservable<T> connectableObservable = this.f72694p0;
                    if (connectableObservable instanceof Disposable) {
                        ((Disposable) connectableObservable).dispose();
                    } else if (connectableObservable instanceof ResettableConnectable) {
                        if (disposable == null) {
                            aVar.f72704t0 = true;
                        } else {
                            ((ResettableConnectable) connectableObservable).resetIf(disposable);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar;
        boolean z10;
        SequentialDisposable sequentialDisposable;
        synchronized (this) {
            try {
                aVar = this.f72699u0;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f72699u0 = aVar;
                }
                long j10 = aVar.f72702r0;
                if (j10 == 0 && (sequentialDisposable = aVar.f72701q0) != null) {
                    sequentialDisposable.dispose();
                }
                long j11 = j10 + 1;
                aVar.f72702r0 = j11;
                if (aVar.f72703s0 || j11 != this.f72695q0) {
                    z10 = false;
                } else {
                    z10 = true;
                    aVar.f72703s0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f72694p0.subscribe(new b(observer, this, aVar));
        if (z10) {
            this.f72694p0.connect(aVar);
        }
    }

    public ObservableRefCount(ConnectableObservable<T> connectableObservable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f72694p0 = connectableObservable;
        this.f72695q0 = i10;
        this.f72696r0 = j10;
        this.f72697s0 = timeUnit;
        this.f72698t0 = scheduler;
    }
}
