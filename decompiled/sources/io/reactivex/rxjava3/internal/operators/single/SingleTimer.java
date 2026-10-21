package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleTimer extends Single<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f77864p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f77865q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f77866r0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Long> f77867p0;

        public a(SingleObserver<? super Long> singleObserver) {
            this.f77867p0 = singleObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f77867p0.onSuccess(0L);
        }
    }

    public SingleTimer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f77864p0 = j10;
        this.f77865q0 = timeUnit;
        this.f77866r0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        a aVar = new a(singleObserver);
        singleObserver.onSubscribe(aVar);
        DisposableHelper.replace(aVar, this.f77866r0.scheduleDirect(aVar, this.f77864p0, this.f77865q0));
    }
}
