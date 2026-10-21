package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleTimeout<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77852p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f77853q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f77854r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f77855s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final SingleSource<? extends T> f77856t0;

    public static final class a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Runnable, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77857p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77858q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final C0425a<T> f77859r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public SingleSource<? extends T> f77860s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final long f77861t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final TimeUnit f77862u0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.single.SingleTimeout$a$a, reason: collision with other inner class name */
        public static final class C0425a<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final SingleObserver<? super T> f77863p0;

            public C0425a(SingleObserver<? super T> singleObserver) {
                this.f77863p0 = singleObserver;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                this.f77863p0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(T t10) {
                this.f77863p0.onSuccess(t10);
            }
        }

        public a(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource, long j10, TimeUnit timeUnit) {
            this.f77857p0 = singleObserver;
            this.f77860s0 = singleSource;
            this.f77861t0 = j10;
            this.f77862u0 = timeUnit;
            if (singleSource != null) {
                this.f77859r0 = new C0425a<>(singleObserver);
            } else {
                this.f77859r0 = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f77858q0);
            C0425a<T> c0425a = this.f77859r0;
            if (c0425a != null) {
                DisposableHelper.dispose(c0425a);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this.f77858q0);
                this.f77857p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            DisposableHelper.dispose(this.f77858q0);
            this.f77857p0.onSuccess(t10);
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
            SingleSource<? extends T> singleSource = this.f77860s0;
            if (singleSource == null) {
                this.f77857p0.onError(new TimeoutException(ExceptionHelper.timeoutMessage(this.f77861t0, this.f77862u0)));
            } else {
                this.f77860s0 = null;
                singleSource.subscribe(this.f77859r0);
            }
        }
    }

    public SingleTimeout(SingleSource<T> singleSource, long j10, TimeUnit timeUnit, Scheduler scheduler, SingleSource<? extends T> singleSource2) {
        this.f77852p0 = singleSource;
        this.f77853q0 = j10;
        this.f77854r0 = timeUnit;
        this.f77855s0 = scheduler;
        this.f77856t0 = singleSource2;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        a aVar = new a(singleObserver, this.f77856t0, this.f77853q0, this.f77854r0);
        singleObserver.onSubscribe(aVar);
        DisposableHelper.replace(aVar.f77858q0, this.f77855s0.scheduleDirect(aVar, this.f77853q0, this.f77854r0));
        this.f77852p0.subscribe(aVar);
    }
}
