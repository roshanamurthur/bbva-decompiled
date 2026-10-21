package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDelay<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f73392p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f73393q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f73394r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f73395s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f73396t0;

    public final class a implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SequentialDisposable f73397p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleObserver<? super T> f73398q0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.single.SingleDelay$a$a, reason: collision with other inner class name */
        public final class RunnableC0356a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Throwable f73400p0;

            public RunnableC0356a(Throwable th2) {
                this.f73400p0 = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f73398q0.onError(this.f73400p0);
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final T f73402p0;

            public b(T t10) {
                this.f73402p0 = t10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f73398q0.onSuccess(this.f73402p0);
            }
        }

        public a(SequentialDisposable sequentialDisposable, SingleObserver<? super T> singleObserver) {
            this.f73397p0 = sequentialDisposable;
            this.f73398q0 = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            SingleDelay singleDelay = SingleDelay.this;
            this.f73397p0.replace(singleDelay.f73395s0.scheduleDirect(new RunnableC0356a(th2), singleDelay.f73396t0 ? singleDelay.f73393q0 : 0L, singleDelay.f73394r0));
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f73397p0.replace(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            SingleDelay singleDelay = SingleDelay.this;
            this.f73397p0.replace(singleDelay.f73395s0.scheduleDirect(new b(t10), singleDelay.f73393q0, singleDelay.f73394r0));
        }
    }

    public SingleDelay(SingleSource<? extends T> singleSource, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        this.f73392p0 = singleSource;
        this.f73393q0 = j10;
        this.f73394r0 = timeUnit;
        this.f73395s0 = scheduler;
        this.f73396t0 = z10;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.f73392p0.subscribe(new a(sequentialDisposable, singleObserver));
    }
}
