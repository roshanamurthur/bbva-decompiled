package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleTimeout<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73563p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f73564q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f73565r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f73566s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final SingleSource<? extends T> f73567t0;

    public static final class a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Runnable, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73568p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f73569q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final C0358a<T> f73570r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public SingleSource<? extends T> f73571s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final long f73572t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final TimeUnit f73573u0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.single.SingleTimeout$a$a, reason: collision with other inner class name */
        public static final class C0358a<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final SingleObserver<? super T> f73574p0;

            public C0358a(SingleObserver<? super T> singleObserver) {
                this.f73574p0 = singleObserver;
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th2) {
                this.f73574p0.onError(th2);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(T t10) {
                this.f73574p0.onSuccess(t10);
            }
        }

        public a(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource, long j10, TimeUnit timeUnit) {
            this.f73568p0 = singleObserver;
            this.f73571s0 = singleSource;
            this.f73572t0 = j10;
            this.f73573u0 = timeUnit;
            if (singleSource != null) {
                this.f73570r0 = new C0358a<>(singleObserver);
            } else {
                this.f73570r0 = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f73569q0);
            C0358a<T> c0358a = this.f73570r0;
            if (c0358a != null) {
                DisposableHelper.dispose(c0358a);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this.f73569q0);
                this.f73568p0.onError(th2);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            DisposableHelper.dispose(this.f73569q0);
            this.f73568p0.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            SingleSource<? extends T> singleSource = this.f73571s0;
            if (singleSource == null) {
                this.f73568p0.onError(new TimeoutException(ExceptionHelper.timeoutMessage(this.f73572t0, this.f73573u0)));
            } else {
                this.f73571s0 = null;
                singleSource.subscribe(this.f73570r0);
            }
        }
    }

    public SingleTimeout(SingleSource<T> singleSource, long j10, TimeUnit timeUnit, Scheduler scheduler, SingleSource<? extends T> singleSource2) {
        this.f73563p0 = singleSource;
        this.f73564q0 = j10;
        this.f73565r0 = timeUnit;
        this.f73566s0 = scheduler;
        this.f73567t0 = singleSource2;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        a aVar = new a(singleObserver, this.f73567t0, this.f73564q0, this.f73565r0);
        singleObserver.onSubscribe(aVar);
        DisposableHelper.replace(aVar.f73569q0, this.f73566s0.scheduleDirect(aVar, this.f73564q0, this.f73565r0));
        this.f73563p0.subscribe(aVar);
    }
}
