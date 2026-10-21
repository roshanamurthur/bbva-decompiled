package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTimeout<T, U, V> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<U> f77282p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends ObservableSource<V>> f77283q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ObservableSource<? extends T> f77284r0;

    public static final class a extends AtomicReference<Disposable> implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final d f77285p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77286q0;

        public a(long j10, d dVar) {
            this.f77286q0 = j10;
            this.f77285p0 = dVar;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper) {
                lazySet(disposableHelper);
                this.f77285p0.b(this.f77286q0);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj == disposableHelper) {
                RxJavaPlugins.onError(th2);
            } else {
                lazySet(disposableHelper);
                this.f77285p0.a(this.f77286q0, th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            Disposable disposable = (Disposable) get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                disposable.dispose();
                lazySet(disposableHelper);
                this.f77285p0.b(this.f77286q0);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public static final class b<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, d {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77287p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<?>> f77288q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SequentialDisposable f77289r0 = new SequentialDisposable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f77290s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77291t0 = new AtomicReference<>();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public ObservableSource<? extends T> f77292u0;

        public b(ObservableSource observableSource, Observer observer, Function function) {
            this.f77287p0 = observer;
            this.f77288q0 = function;
            this.f77292u0 = observableSource;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeout.d
        public final void a(long j10, Throwable th2) {
            if (!this.f77290s0.compareAndSet(j10, Long.MAX_VALUE)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this);
                this.f77287p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed.d
        public final void b(long j10) {
            if (this.f77290s0.compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.f77291t0);
                ObservableSource<? extends T> observableSource = this.f77292u0;
                this.f77292u0 = null;
                observableSource.subscribe(new ObservableTimeoutTimed.a(this.f77287p0, this));
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f77291t0);
            DisposableHelper.dispose(this);
            this.f77289r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77290s0.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.f77289r0;
                sequentialDisposable.dispose();
                this.f77287p0.onComplete();
                sequentialDisposable.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77290s0.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
                return;
            }
            SequentialDisposable sequentialDisposable = this.f77289r0;
            sequentialDisposable.dispose();
            this.f77287p0.onError(th2);
            sequentialDisposable.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            AtomicLong atomicLong = this.f77290s0;
            long j10 = atomicLong.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (atomicLong.compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.f77289r0;
                    Disposable disposable = sequentialDisposable.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Observer<? super T> observer = this.f77287p0;
                    observer.onNext(t10);
                    try {
                        ObservableSource<?> observableSourceApply = this.f77288q0.apply(t10);
                        Objects.requireNonNull(observableSourceApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        ObservableSource<?> observableSource = observableSourceApply;
                        a aVar = new a(j11, this);
                        if (sequentialDisposable.replace(aVar)) {
                            observableSource.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f77291t0.get().dispose();
                        atomicLong.getAndSet(Long.MAX_VALUE);
                        observer.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f77291t0, disposable);
        }
    }

    public static final class c<T> extends AtomicLong implements Observer<T>, Disposable, d {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77293p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends ObservableSource<?>> f77294q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SequentialDisposable f77295r0 = new SequentialDisposable();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77296s0 = new AtomicReference<>();

        public c(Observer<? super T> observer, Function<? super T, ? extends ObservableSource<?>> function) {
            this.f77293p0 = observer;
            this.f77294q0 = function;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeout.d
        public final void a(long j10, Throwable th2) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this.f77296s0);
                this.f77293p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed.d
        public final void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.f77296s0);
                this.f77293p0.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f77296s0);
            this.f77295r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f77296s0.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f77295r0.dispose();
                this.f77293p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77295r0.dispose();
                this.f77293p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.f77295r0;
                    Disposable disposable = sequentialDisposable.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Observer<? super T> observer = this.f77293p0;
                    observer.onNext(t10);
                    try {
                        ObservableSource<?> observableSourceApply = this.f77294q0.apply(t10);
                        Objects.requireNonNull(observableSourceApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        ObservableSource<?> observableSource = observableSourceApply;
                        a aVar = new a(j11, this);
                        if (sequentialDisposable.replace(aVar)) {
                            observableSource.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f77296s0.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        observer.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f77296s0, disposable);
        }
    }

    public interface d extends ObservableTimeoutTimed.d {
        void a(long j10, Throwable th2);
    }

    public ObservableTimeout(Observable<T> observable, ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        super(observable);
        this.f77282p0 = observableSource;
        this.f77283q0 = function;
        this.f77284r0 = observableSource2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ObservableSource<U> observableSource = this.f77282p0;
        Function<? super T, ? extends ObservableSource<V>> function = this.f77283q0;
        ObservableSource<? extends T> observableSource2 = this.f77284r0;
        if (observableSource2 == null) {
            c cVar = new c(observer, function);
            observer.onSubscribe(cVar);
            if (observableSource != null) {
                a aVar = new a(0L, cVar);
                if (cVar.f77295r0.replace(aVar)) {
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
            if (bVar.f77289r0.replace(aVar2)) {
                observableSource.subscribe(aVar2);
            }
        }
        this.source.subscribe(bVar);
    }
}
