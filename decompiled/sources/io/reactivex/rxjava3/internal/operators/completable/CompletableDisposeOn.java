package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableDisposeOn extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74288p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f74289q0;

    public static final class a implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74290p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f74291q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f74292r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f74293s0;

        public a(CompletableObserver completableObserver, Scheduler scheduler) {
            this.f74290p0 = completableObserver;
            this.f74291q0 = scheduler;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74293s0 = true;
            this.f74291q0.scheduleDirect(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74293s0;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f74293s0) {
                return;
            }
            this.f74290p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            if (this.f74293s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74290p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f74292r0, disposable)) {
                this.f74292r0 = disposable;
                this.f74290p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74292r0.dispose();
            this.f74292r0 = DisposableHelper.DISPOSED;
        }
    }

    public CompletableDisposeOn(CompletableSource completableSource, Scheduler scheduler) {
        this.f74288p0 = completableSource;
        this.f74289q0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74288p0.subscribe(new a(completableObserver, this.f74289q0));
    }
}
