package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableObserveOn extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74348p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f74349q0;

    public static final class a extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74350p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f74351q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Throwable f74352r0;

        public a(CompletableObserver completableObserver, Scheduler scheduler) {
            this.f74350p0 = completableObserver;
            this.f74351q0 = scheduler;
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
            DisposableHelper.replace(this, this.f74351q0.scheduleDirect(this));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74352r0 = th2;
            DisposableHelper.replace(this, this.f74351q0.scheduleDirect(this));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f74350p0.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f74352r0;
            CompletableObserver completableObserver = this.f74350p0;
            if (th2 == null) {
                completableObserver.onComplete();
            } else {
                this.f74352r0 = null;
                completableObserver.onError(th2);
            }
        }
    }

    public CompletableObserveOn(CompletableSource completableSource, Scheduler scheduler) {
        this.f74348p0 = completableSource;
        this.f74349q0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74348p0.subscribe(new a(completableObserver, this.f74349q0));
    }
}
