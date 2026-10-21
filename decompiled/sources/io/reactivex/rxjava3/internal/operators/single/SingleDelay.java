package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDelay<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f77646p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f77647q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f77648r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f77649s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f77650t0;

    public final class a implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SequentialDisposable f77651p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleObserver<? super T> f77652q0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.single.SingleDelay$a$a, reason: collision with other inner class name */
        public final class RunnableC0421a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Throwable f77654p0;

            public RunnableC0421a(Throwable th2) {
                this.f77654p0 = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f77652q0.onError(this.f77654p0);
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final T f77656p0;

            public b(T t10) {
                this.f77656p0 = t10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f77652q0.onSuccess(this.f77656p0);
            }
        }

        public a(SequentialDisposable sequentialDisposable, SingleObserver<? super T> singleObserver) {
            this.f77651p0 = sequentialDisposable;
            this.f77652q0 = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            SingleDelay singleDelay = SingleDelay.this;
            this.f77651p0.replace(singleDelay.f77649s0.scheduleDirect(new RunnableC0421a(th2), singleDelay.f77650t0 ? singleDelay.f77647q0 : 0L, singleDelay.f77648r0));
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f77651p0.replace(disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            SingleDelay singleDelay = SingleDelay.this;
            this.f77651p0.replace(singleDelay.f77649s0.scheduleDirect(new b(t10), singleDelay.f77647q0, singleDelay.f77648r0));
        }
    }

    public SingleDelay(SingleSource<? extends T> singleSource, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        this.f77646p0 = singleSource;
        this.f77647q0 = j10;
        this.f77648r0 = timeUnit;
        this.f77649s0 = scheduler;
        this.f77650t0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.f77646p0.subscribe(new a(sequentialDisposable, singleObserver));
    }
}
