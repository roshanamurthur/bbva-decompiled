package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTimeout<T, U, V> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<U> f73005p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<V>> f73006q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ObservableSource<? extends T> f73007r0;

    public static final class a extends AtomicReference<Disposable> implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final d f73008p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73009q0;

        public a(long j10, d dVar) {
            this.f73009q0 = j10;
            this.f73008p0 = dVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper) {
                lazySet(disposableHelper);
                this.f73008p0.b(this.f73009q0);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj == disposableHelper) {
                RxJavaPlugins.onError(th2);
            } else {
                lazySet(disposableHelper);
                this.f73008p0.a(this.f73009q0, th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Disposable disposable = (Disposable) get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                disposable.dispose();
                lazySet(disposableHelper);
                this.f73008p0.b(this.f73009q0);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public static final class b<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, d {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f73010p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<?>> f73011q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SequentialDisposable f73012r0 = new SequentialDisposable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f73013s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Disposable> f73014t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public ObservableSource<? extends T> f73015u0;

        public b(ObservableSource observableSource, Observer observer, Function function) {
            this.f73010p0 = observer;
            this.f73011q0 = function;
            this.f73015u0 = observableSource;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.d
        public final void a(long j10, Throwable th2) {
            if (!this.f73013s0.compareAndSet(j10, Long.MAX_VALUE)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this);
                this.f73010p0.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.d
        public final void b(long j10) {
            if (this.f73013s0.compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.f73014t0);
                ObservableSource<? extends T> observableSource = this.f73015u0;
                this.f73015u0 = null;
                observableSource.subscribe(new ObservableTimeoutTimed.a(this.f73010p0, this));
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f73014t0);
            DisposableHelper.dispose(this);
            this.f73012r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f73013s0.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.f73012r0;
                sequentialDisposable.dispose();
                this.f73010p0.onComplete();
                sequentialDisposable.dispose();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f73013s0.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
                return;
            }
            SequentialDisposable sequentialDisposable = this.f73012r0;
            sequentialDisposable.dispose();
            this.f73010p0.onError(th2);
            sequentialDisposable.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            AtomicLong atomicLong = this.f73013s0;
            long j10 = atomicLong.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (atomicLong.compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.f73012r0;
                    Disposable disposable = sequentialDisposable.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Observer<? super T> observer = this.f73010p0;
                    observer.onNext(t10);
                    try {
                        ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f73011q0.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        a aVar = new a(j11, this);
                        if (sequentialDisposable.replace(aVar)) {
                            observableSource.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f73014t0.get().dispose();
                        atomicLong.getAndSet(Long.MAX_VALUE);
                        observer.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f73014t0, disposable);
        }
    }

    public static final class c<T> extends AtomicLong implements Observer<T>, Disposable, d {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f73016p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<?>> f73017q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SequentialDisposable f73018r0 = new SequentialDisposable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Disposable> f73019s0 = new AtomicReference<>();

        public c(Observer<? super T> observer, Function<? super T, ? extends ObservableSource<?>> function) {
            this.f73016p0 = observer;
            this.f73017q0 = function;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.d
        public final void a(long j10, Throwable th2) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this.f73019s0);
                this.f73016p0.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.d
        public final void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.f73019s0);
                this.f73016p0.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f73019s0);
            this.f73018r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f73019s0.get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f73018r0.dispose();
                this.f73016p0.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73018r0.dispose();
                this.f73016p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.f73018r0;
                    Disposable disposable = sequentialDisposable.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Observer<? super T> observer = this.f73016p0;
                    observer.onNext(t10);
                    try {
                        ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f73017q0.apply(t10), "The itemTimeoutIndicator returned a null ObservableSource.");
                        a aVar = new a(j11, this);
                        if (sequentialDisposable.replace(aVar)) {
                            observableSource.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f73019s0.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        observer.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f73019s0, disposable);
        }
    }

    public interface d extends ObservableTimeoutTimed.d {
        void a(long j10, Throwable th2);
    }

    public ObservableTimeout(Observable<T> observable, ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        super(observable);
        this.f73005p0 = observableSource;
        this.f73006q0 = function;
        this.f73007r0 = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ObservableSource<U> observableSource = this.f73005p0;
        Function<? super T, ? extends ObservableSource<V>> function = this.f73006q0;
        ObservableSource<? extends T> observableSource2 = this.f73007r0;
        if (observableSource2 == null) {
            c cVar = new c(observer, function);
            observer.onSubscribe(cVar);
            if (observableSource != null) {
                a aVar = new a(0L, cVar);
                if (cVar.f73018r0.replace(aVar)) {
                    observableSource.subscribe(aVar);
                }
            }
            this.source.subscribe(cVar);
            return;
        }
        b bVar = new b(observableSource2, observer, function);
        observer.onSubscribe(bVar);
        if (observableSource != null) {
            a aVar2 = new a(0L, bVar);
            if (bVar.f73012r0.replace(aVar2)) {
                observableSource.subscribe(aVar2);
            }
        }
        this.source.subscribe(bVar);
    }
}
