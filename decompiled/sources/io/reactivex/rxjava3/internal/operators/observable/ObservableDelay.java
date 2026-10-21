package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDelay<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f76565p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f76566q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f76567r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f76568s0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76569p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f76570q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f76571r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f76572s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f76573t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f76574u0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableDelay$a$a, reason: collision with other inner class name */
        public final class RunnableC0406a implements Runnable {
            public RunnableC0406a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.f76569p0.onComplete();
                } finally {
                    aVar.f76572s0.dispose();
                }
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Throwable f76576p0;

            public b(Throwable th2) {
                this.f76576p0 = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.f76569p0.onError(this.f76576p0);
                } finally {
                    aVar.f76572s0.dispose();
                }
            }
        }

        public final class c implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final T f76578p0;

            public c(T t10) {
                this.f76578p0 = t10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f76569p0.onNext(this.f76578p0);
            }
        }

        public a(Observer<? super T> observer, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z10) {
            this.f76569p0 = observer;
            this.f76570q0 = j10;
            this.f76571r0 = timeUnit;
            this.f76572s0 = worker;
            this.f76573t0 = z10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76574u0.dispose();
            this.f76572s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76572s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76572s0.schedule(new RunnableC0406a(), this.f76570q0, this.f76571r0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76572s0.schedule(new b(th2), this.f76573t0 ? this.f76570q0 : 0L, this.f76571r0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76572s0.schedule(new c(t10), this.f76570q0, this.f76571r0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76574u0, disposable)) {
                this.f76574u0 = disposable;
                this.f76569p0.onSubscribe(this);
            }
        }
    }

    public ObservableDelay(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(observableSource);
        this.f76565p0 = j10;
        this.f76566q0 = timeUnit;
        this.f76567r0 = scheduler;
        this.f76568s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(this.f76568s0 ? observer : new SerializedObserver(observer), this.f76565p0, this.f76566q0, this.f76567r0.createWorker(), this.f76568s0));
    }
}
