package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableObserveOn extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70089p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f70090q0;

    public static final class a extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70091p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f70092q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Throwable f70093r0;

        public a(CompletableObserver completableObserver, Scheduler scheduler) {
            this.f70091p0 = completableObserver;
            this.f70092q0 = scheduler;
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
            DisposableHelper.replace(this, this.f70092q0.scheduleDirect(this));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70093r0 = th2;
            DisposableHelper.replace(this, this.f70092q0.scheduleDirect(this));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f70091p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f70093r0;
            CompletableObserver completableObserver = this.f70091p0;
            if (th2 == null) {
                completableObserver.onComplete();
            } else {
                this.f70093r0 = null;
                completableObserver.onError(th2);
            }
        }
    }

    public CompletableObserveOn(CompletableSource completableSource, Scheduler scheduler) {
        this.f70089p0 = completableSource;
        this.f70090q0 = scheduler;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70089p0.subscribe(new a(completableObserver, this.f70090q0));
    }
}
