package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDebounceTimed<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f76550p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f76551q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f76552r0;

    public static final class a<T> extends AtomicReference<Disposable> implements Runnable, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f76553p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f76554q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final b<T> f76555r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f76556s0 = new AtomicBoolean();

        public a(T t10, long j10, b<T> bVar) {
            this.f76553p0 = t10;
            this.f76554q0 = j10;
            this.f76555r0 = bVar;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f76556s0.compareAndSet(false, true)) {
                b<T> bVar = this.f76555r0;
                long j10 = this.f76554q0;
                T t10 = this.f76553p0;
                if (j10 == bVar.v0) {
                    bVar.f76557p0.onNext(t10);
                    DisposableHelper.dispose(this);
                }
            }
        }
    }

    public static final class b<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76557p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f76558q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f76559r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f76560s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f76561t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public a f76562u0;
        public volatile long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f76563w0;

        public b(SerializedObserver serializedObserver, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f76557p0 = serializedObserver;
            this.f76558q0 = j10;
            this.f76559r0 = timeUnit;
            this.f76560s0 = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76561t0.dispose();
            this.f76560s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76560s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76563w0) {
                return;
            }
            this.f76563w0 = true;
            a aVar = this.f76562u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            if (aVar != null) {
                aVar.run();
            }
            this.f76557p0.onComplete();
            this.f76560s0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76563w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            a aVar = this.f76562u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            this.f76563w0 = true;
            this.f76557p0.onError(th2);
            this.f76560s0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76563w0) {
                return;
            }
            long j10 = this.v0 + 1;
            this.v0 = j10;
            a aVar = this.f76562u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            a aVar2 = new a(t10, j10, this);
            this.f76562u0 = aVar2;
            DisposableHelper.replace(aVar2, this.f76560s0.schedule(aVar2, this.f76558q0, this.f76559r0));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76561t0, disposable)) {
                this.f76561t0 = disposable;
                this.f76557p0.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f76550p0 = j10;
        this.f76551q0 = timeUnit;
        this.f76552r0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new b(new SerializedObserver(observer), this.f76550p0, this.f76551q0, this.f76552r0.createWorker()));
    }
}
