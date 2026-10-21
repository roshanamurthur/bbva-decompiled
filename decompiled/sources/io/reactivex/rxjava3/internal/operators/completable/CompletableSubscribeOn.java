package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableSubscribeOn extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74376p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f74377q0;

    public static final class a extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74378p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f74379q0 = new SequentialDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompletableSource f74380r0;

        public a(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.f74378p0 = completableObserver;
            this.f74380r0 = completableSource;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            this.f74379q0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f74378p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74378p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74380r0.subscribe(this);
        }
    }

    public CompletableSubscribeOn(CompletableSource completableSource, Scheduler scheduler) {
        this.f74376p0 = completableSource;
        this.f74377q0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver, this.f74376p0);
        completableObserver.onSubscribe(aVar);
        aVar.f74379q0.replace(this.f74377q0.scheduleDirect(aVar));
    }
}
