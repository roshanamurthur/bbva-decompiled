package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableSubscribeOn extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70112p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f70113q0;

    public static final class a extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70114p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f70115q0 = new SequentialDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompletableSource f70116r0;

        public a(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.f70114p0 = completableObserver;
            this.f70116r0 = completableSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            this.f70115q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f70114p0.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70114p0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f70116r0.subscribe(this);
        }
    }

    public CompletableSubscribeOn(CompletableSource completableSource, Scheduler scheduler) {
        this.f70112p0 = completableSource;
        this.f70113q0 = scheduler;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver, this.f70112p0);
        completableObserver.onSubscribe(aVar);
        aVar.f70115q0.replace(this.f70113q0.scheduleDirect(aVar));
    }
}
