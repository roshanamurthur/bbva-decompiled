package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableTimer extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f70136p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f70137q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f70138r0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70139p0;

        public a(CompletableObserver completableObserver) {
            this.f70139p0 = completableObserver;
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
            this.f70139p0.onComplete();
        }
    }

    public CompletableTimer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f70136p0 = j10;
        this.f70137q0 = timeUnit;
        this.f70138r0 = scheduler;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver);
        completableObserver.onSubscribe(aVar);
        DisposableHelper.replace(aVar, this.f70138r0.scheduleDirect(aVar, this.f70136p0, this.f70137q0));
    }
}
