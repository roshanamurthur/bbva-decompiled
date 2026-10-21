package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableTimer extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f74400p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f74401q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f74402r0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74403p0;

        public a(CompletableObserver completableObserver) {
            this.f74403p0 = completableObserver;
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
            this.f74403p0.onComplete();
        }
    }

    public CompletableTimer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f74400p0 = j10;
        this.f74401q0 = timeUnit;
        this.f74402r0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver);
        completableObserver.onSubscribe(aVar);
        DisposableHelper.replace(aVar, this.f74402r0.scheduleDirect(aVar, this.f74400p0, this.f74401q0));
    }
}
