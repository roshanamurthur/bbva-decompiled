package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableDelay extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70017p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f70018q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f70019r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f70020s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f70021t0;

    public static final class a extends AtomicReference<Disposable> implements CompletableObserver, Runnable, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70022p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f70023q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f70024r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f70025s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f70026t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Throwable f70027u0;

        public a(CompletableObserver completableObserver, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            this.f70022p0 = completableObserver;
            this.f70023q0 = j10;
            this.f70024r0 = timeUnit;
            this.f70025s0 = scheduler;
            this.f70026t0 = z10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            DisposableHelper.replace(this, this.f70025s0.scheduleDirect(this, this.f70023q0, this.f70024r0));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70027u0 = th2;
            DisposableHelper.replace(this, this.f70025s0.scheduleDirect(this, this.f70026t0 ? this.f70023q0 : 0L, this.f70024r0));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f70022p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f70027u0;
            this.f70027u0 = null;
            CompletableObserver completableObserver = this.f70022p0;
            if (th2 != null) {
                completableObserver.onError(th2);
            } else {
                completableObserver.onComplete();
            }
        }
    }

    public CompletableDelay(CompletableSource completableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        this.f70017p0 = completableSource;
        this.f70018q0 = j10;
        this.f70019r0 = timeUnit;
        this.f70020s0 = scheduler;
        this.f70021t0 = z10;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70017p0.subscribe(new a(completableObserver, this.f70018q0, this.f70019r0, this.f70020s0, this.f70021t0));
    }
}
