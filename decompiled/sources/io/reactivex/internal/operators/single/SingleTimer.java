package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleTimer extends Single<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f73575p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f73576q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f73577r0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Long> f73578p0;

        public a(SingleObserver<? super Long> singleObserver) {
            this.f73578p0 = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f73578p0.onSuccess(0L);
        }
    }

    public SingleTimer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f73575p0 = j10;
        this.f73576q0 = timeUnit;
        this.f73577r0 = scheduler;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        a aVar = new a(singleObserver);
        singleObserver.onSubscribe(aVar);
        DisposableHelper.replace(aVar, this.f73577r0.scheduleDirect(aVar, this.f73575p0, this.f73576q0));
    }
}
