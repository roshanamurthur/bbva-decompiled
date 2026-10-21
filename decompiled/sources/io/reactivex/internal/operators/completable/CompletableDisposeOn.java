package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableDisposeOn extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70031p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f70032q0;

    public static final class a implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70033p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f70034q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f70035r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f70036s0;

        public a(CompletableObserver completableObserver, Scheduler scheduler) {
            this.f70033p0 = completableObserver;
            this.f70034q0 = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70036s0 = true;
            this.f70034q0.scheduleDirect(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70036s0;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.f70036s0) {
                return;
            }
            this.f70033p0.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            if (this.f70036s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70033p0.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f70035r0, disposable)) {
                this.f70035r0 = disposable;
                this.f70033p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f70035r0.dispose();
            this.f70035r0 = DisposableHelper.DISPOSED;
        }
    }

    public CompletableDisposeOn(CompletableSource completableSource, Scheduler scheduler) {
        this.f70031p0 = completableSource;
        this.f70032q0 = scheduler;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70031p0.subscribe(new a(completableObserver, this.f70032q0));
    }
}
