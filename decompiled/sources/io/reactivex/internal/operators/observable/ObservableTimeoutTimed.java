package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTimeoutTimed<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f73020p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f73021q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f73022r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ObservableSource<? extends T> f73023s0;

    public static final class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f73024p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f73025q0;

        public a(Observer<? super T> observer, AtomicReference<Disposable> atomicReference) {
            this.f73024p0 = observer;
            this.f73025q0 = atomicReference;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f73024p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f73024p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f73024p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f73025q0, disposable);
        }
    }

    public static final class b<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, d {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f73026p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73027q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f73028r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f73029s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SequentialDisposable f73030t0 = new SequentialDisposable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicLong f73031u0 = new AtomicLong();
        public final AtomicReference<Disposable> v0 = new AtomicReference<>();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public ObservableSource<? extends T> f73032w0;

        public b(Observer<? super T> observer, long j10, TimeUnit timeUnit, Scheduler.Worker worker, ObservableSource<? extends T> observableSource) {
            this.f73026p0 = observer;
            this.f73027q0 = j10;
            this.f73028r0 = timeUnit;
            this.f73029s0 = worker;
            this.f73032w0 = observableSource;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.d
        public final void b(long j10) {
            if (this.f73031u0.compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.v0);
                ObservableSource<? extends T> observableSource = this.f73032w0;
                this.f73032w0 = null;
                observableSource.subscribe(new a(this.f73026p0, this));
                this.f73029s0.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.v0);
            DisposableHelper.dispose(this);
            this.f73029s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f73031u0.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f73030t0.dispose();
                this.f73026p0.onComplete();
                this.f73029s0.dispose();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f73031u0.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f73030t0.dispose();
            this.f73026p0.onError(th2);
            this.f73029s0.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            AtomicLong atomicLong = this.f73031u0;
            long j10 = atomicLong.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (atomicLong.compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.f73030t0;
                    sequentialDisposable.get().dispose();
                    this.f73026p0.onNext(t10);
                    sequentialDisposable.replace(this.f73029s0.schedule(new e(j11, this), this.f73027q0, this.f73028r0));
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.v0, disposable);
        }
    }

    public static final class c<T> extends AtomicLong implements Observer<T>, Disposable, d {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f73033p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73034q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f73035r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f73036s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final SequentialDisposable f73037t0 = new SequentialDisposable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Disposable> f73038u0 = new AtomicReference<>();

        public c(Observer<? super T> observer, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f73033p0 = observer;
            this.f73034q0 = j10;
            this.f73035r0 = timeUnit;
            this.f73036s0 = worker;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.d
        public final void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.f73038u0);
                this.f73033p0.onError(new TimeoutException(ExceptionHelper.timeoutMessage(this.f73034q0, this.f73035r0)));
                this.f73036s0.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f73038u0);
            this.f73036s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f73038u0.get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f73037t0.dispose();
                this.f73033p0.onComplete();
                this.f73036s0.dispose();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f73037t0.dispose();
            this.f73033p0.onError(th2);
            this.f73036s0.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    SequentialDisposable sequentialDisposable = this.f73037t0;
                    sequentialDisposable.get().dispose();
                    this.f73033p0.onNext(t10);
                    sequentialDisposable.replace(this.f73036s0.schedule(new e(j11, this), this.f73034q0, this.f73035r0));
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f73038u0, disposable);
        }
    }

    public interface d {
        void b(long j10);
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final d f73039p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73040q0;

        public e(long j10, d dVar) {
            this.f73040q0 = j10;
            this.f73039p0 = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f73039p0.b(this.f73040q0);
        }
    }

    public ObservableTimeoutTimed(Observable<T> observable, long j10, TimeUnit timeUnit, Scheduler scheduler, ObservableSource<? extends T> observableSource) {
        super(observable);
        this.f73020p0 = j10;
        this.f73021q0 = timeUnit;
        this.f73022r0 = scheduler;
        this.f73023s0 = observableSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ObservableSource<? extends T> observableSource = this.f73023s0;
        Scheduler scheduler = this.f73022r0;
        if (observableSource == null) {
            c cVar = new c(observer, this.f73020p0, this.f73021q0, scheduler.createWorker());
            observer.onSubscribe(cVar);
            cVar.f73037t0.replace(cVar.f73036s0.schedule(new e(0L, cVar), cVar.f73034q0, cVar.f73035r0));
            this.source.subscribe(cVar);
            return;
        }
        b bVar = new b(observer, this.f73020p0, this.f73021q0, scheduler.createWorker(), this.f73023s0);
        observer.onSubscribe(bVar);
        bVar.f73030t0.replace(bVar.f73029s0.schedule(new e(0L, bVar), bVar.f73027q0, bVar.f73028r0));
        this.source.subscribe(bVar);
    }
}
