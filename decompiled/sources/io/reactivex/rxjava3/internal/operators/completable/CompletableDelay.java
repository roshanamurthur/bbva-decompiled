package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableDelay extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74274p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f74275q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f74276r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f74277s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f74278t0;

    public static final class a extends AtomicReference<Disposable> implements CompletableObserver, Runnable, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74279p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f74280q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f74281r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f74282s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f74283t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Throwable f74284u0;

        public a(CompletableObserver completableObserver, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            this.f74279p0 = completableObserver;
            this.f74280q0 = j10;
            this.f74281r0 = timeUnit;
            this.f74282s0 = scheduler;
            this.f74283t0 = z10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            DisposableHelper.replace(this, this.f74282s0.scheduleDirect(this, this.f74280q0, this.f74281r0));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74284u0 = th2;
            DisposableHelper.replace(this, this.f74282s0.scheduleDirect(this, this.f74283t0 ? this.f74280q0 : 0L, this.f74281r0));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f74279p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f74284u0;
            this.f74284u0 = null;
            CompletableObserver completableObserver = this.f74279p0;
            if (th2 != null) {
                completableObserver.onError(th2);
            } else {
                completableObserver.onComplete();
            }
        }
    }

    public CompletableDelay(CompletableSource completableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        this.f74274p0 = completableSource;
        this.f74275q0 = j10;
        this.f74276r0 = timeUnit;
        this.f74277s0 = scheduler;
        this.f74278t0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74274p0.subscribe(new a(completableObserver, this.f74275q0, this.f74276r0, this.f74277s0, this.f74278t0));
    }
}
