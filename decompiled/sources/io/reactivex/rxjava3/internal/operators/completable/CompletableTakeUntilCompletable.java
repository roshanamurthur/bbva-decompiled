package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableTakeUntilCompletable extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Completable f74381p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f74382q0;

    public static final class a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74383p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final C0362a f74384q0 = new C0362a(this);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicBoolean f74385r0 = new AtomicBoolean();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.completable.CompletableTakeUntilCompletable$a$a, reason: collision with other inner class name */
        public static final class C0362a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a f74386p0;

            public C0362a(a aVar) {
                this.f74386p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a aVar = this.f74386p0;
                if (aVar.f74385r0.compareAndSet(false, true)) {
                    DisposableHelper.dispose(aVar);
                    aVar.f74383p0.onComplete();
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = this.f74386p0;
                if (!aVar.f74385r0.compareAndSet(false, true)) {
                    RxJavaPlugins.onError(th2);
                } else {
                    DisposableHelper.dispose(aVar);
                    aVar.f74383p0.onError(th2);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver) {
            this.f74383p0 = completableObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f74385r0.compareAndSet(false, true)) {
                DisposableHelper.dispose(this);
                DisposableHelper.dispose(this.f74384q0);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74385r0.get();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f74385r0.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.f74384q0);
                this.f74383p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            if (!this.f74385r0.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this.f74384q0);
                this.f74383p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public CompletableTakeUntilCompletable(Completable completable, CompletableSource completableSource) {
        this.f74381p0 = completable;
        this.f74382q0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver);
        completableObserver.onSubscribe(aVar);
        this.f74382q0.subscribe(aVar.f74384q0);
        this.f74381p0.subscribe(aVar);
    }
}
