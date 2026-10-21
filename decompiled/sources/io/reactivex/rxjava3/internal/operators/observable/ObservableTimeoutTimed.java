package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTimeoutTimed<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f77297p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f77298q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f77299r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ObservableSource<? extends T> f77300s0;

    public static final class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77301p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77302q0;

        public a(Observer<? super T> observer, AtomicReference<Disposable> atomicReference) {
            this.f77301p0 = observer;
            this.f77302q0 = atomicReference;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77301p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77301p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77301p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f77302q0, disposable);
        }
    }

    public static final class b<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, d {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77303p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77304q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f77305r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f77306s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SequentialDisposable f77307t0 = new SequentialDisposable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicLong f77308u0 = new AtomicLong();
        public final AtomicReference<Disposable> v0 = new AtomicReference<>();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public ObservableSource<? extends T> f77309w0;

        public b(Observer<? super T> observer, long j10, TimeUnit timeUnit, Scheduler.Worker worker, ObservableSource<? extends T> observableSource) {
            this.f77303p0 = observer;
            this.f77304q0 = j10;
            this.f77305r0 = timeUnit;
            this.f77306s0 = worker;
            this.f77309w0 = observableSource;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed.d
        public final void b(long j10) {
            if (this.f77308u0.compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.v0);
                ObservableSource<? extends T> observableSource = this.f77309w0;
                this.f77309w0 = null;
                observableSource.subscribe(new a(this.f77303p0, this));
                this.f77306s0.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.v0);
            DisposableHelper.dispose(this);
            this.f77306s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77308u0.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f77307t0.dispose();
                this.f77303p0.onComplete();
                this.f77306s0.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77308u0.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f77307t0.dispose();
            this.f77303p0.onError(th2);
            this.f77306s0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            AtomicLong atomicLong = this.f77308u0;
            long j10 = atomicLong.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (atomicLong.compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.f77307t0;
                    sequentialDisposable.get().dispose();
                    this.f77303p0.onNext(t10);
                    sequentialDisposable.replace(this.f77306s0.schedule(new e(j11, this), this.f77304q0, this.f77305r0));
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.v0, disposable);
        }
    }

    public static final class c<T> extends AtomicLong implements Observer<T>, Disposable, d {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77310p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77311q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f77312r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f77313s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SequentialDisposable f77314t0 = new SequentialDisposable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77315u0 = new AtomicReference<>();

        public c(Observer<? super T> observer, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f77310p0 = observer;
            this.f77311q0 = j10;
            this.f77312r0 = timeUnit;
            this.f77313s0 = worker;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed.d
        public final void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.f77315u0);
                this.f77310p0.onError(new TimeoutException(ExceptionHelper.timeoutMessage(this.f77311q0, this.f77312r0)));
                this.f77313s0.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f77315u0);
            this.f77313s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f77315u0.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f77314t0.dispose();
                this.f77310p0.onComplete();
                this.f77313s0.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f77314t0.dispose();
            this.f77310p0.onError(th2);
            this.f77313s0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.f77314t0;
                    sequentialDisposable.get().dispose();
                    this.f77310p0.onNext(t10);
                    sequentialDisposable.replace(this.f77313s0.schedule(new e(j11, this), this.f77311q0, this.f77312r0));
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f77315u0, disposable);
        }
    }

    public interface d {
        void b(long j10);
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final d f77316p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77317q0;

        public e(long j10, d dVar) {
            this.f77317q0 = j10;
            this.f77316p0 = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f77316p0.b(this.f77317q0);
        }
    }

    public ObservableTimeoutTimed(Observable<T> observable, long j10, TimeUnit timeUnit, Scheduler scheduler, ObservableSource<? extends T> observableSource) {
        super(observable);
        this.f77297p0 = j10;
        this.f77298q0 = timeUnit;
        this.f77299r0 = scheduler;
        this.f77300s0 = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ObservableSource<? extends T> observableSource = this.f77300s0;
        Scheduler scheduler = this.f77299r0;
        if (observableSource == null) {
            c cVar = new c(observer, this.f77297p0, this.f77298q0, scheduler.createWorker());
            observer.onSubscribe(cVar);
            cVar.f77314t0.replace(cVar.f77313s0.schedule(new e(0L, cVar), cVar.f77311q0, cVar.f77312r0));
            this.source.subscribe(cVar);
            return;
        }
        b bVar = new b(observer, this.f77297p0, this.f77298q0, scheduler.createWorker(), this.f77300s0);
        observer.onSubscribe(bVar);
        bVar.f77307t0.replace(bVar.f77306s0.schedule(new e(0L, bVar), bVar.f77304q0, bVar.f77305r0));
        this.source.subscribe(bVar);
    }
}
