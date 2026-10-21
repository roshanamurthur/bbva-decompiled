package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDebounceTimed<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72269p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f72270q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f72271r0;

    public static final class a<T> extends AtomicReference<Disposable> implements Runnable, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f72272p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72273q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final b<T> f72274r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f72275s0 = new AtomicBoolean();

        public a(T t10, long j10, b<T> bVar) {
            this.f72272p0 = t10;
            this.f72273q0 = j10;
            this.f72274r0 = bVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f72275s0.compareAndSet(false, true)) {
                b<T> bVar = this.f72274r0;
                long j10 = this.f72273q0;
                T t10 = this.f72272p0;
                if (j10 == bVar.v0) {
                    bVar.f72276p0.onNext(t10);
                    DisposableHelper.dispose(this);
                }
            }
        }
    }

    public static final class b<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72276p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72277q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f72278r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f72279s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f72280t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public a f72281u0;
        public volatile long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f72282w0;

        public b(SerializedObserver serializedObserver, long j10, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f72276p0 = serializedObserver;
            this.f72277q0 = j10;
            this.f72278r0 = timeUnit;
            this.f72279s0 = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72280t0.dispose();
            this.f72279s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72279s0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72282w0) {
                return;
            }
            this.f72282w0 = true;
            a aVar = this.f72281u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            if (aVar != null) {
                aVar.run();
            }
            this.f72276p0.onComplete();
            this.f72279s0.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72282w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            a aVar = this.f72281u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            this.f72282w0 = true;
            this.f72276p0.onError(th2);
            this.f72279s0.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72282w0) {
                return;
            }
            long j10 = this.v0 + 1;
            this.v0 = j10;
            a aVar = this.f72281u0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
            a aVar2 = new a(t10, j10, this);
            this.f72281u0 = aVar2;
            DisposableHelper.replace(aVar2, this.f72279s0.schedule(aVar2, this.f72277q0, this.f72278r0));
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72280t0, disposable)) {
                this.f72280t0 = disposable;
                this.f72276p0.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f72269p0 = j10;
        this.f72270q0 = timeUnit;
        this.f72271r0 = scheduler;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new b(new SerializedObserver(observer), this.f72269p0, this.f72270q0, this.f72271r0.createWorker()));
    }
}
