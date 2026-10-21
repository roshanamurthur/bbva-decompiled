package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableTakeUntilCompletable extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Completable f70117p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f70118q0;

    public static final class a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70119p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final C0298a f70120q0 = new C0298a(this);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicBoolean f70121r0 = new AtomicBoolean();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$a$a, reason: collision with other inner class name */
        public static final class C0298a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a f70122p0;

            public C0298a(a aVar) {
                this.f70122p0 = aVar;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a aVar = this.f70122p0;
                if (aVar.f70121r0.compareAndSet(false, true)) {
                    DisposableHelper.dispose(aVar);
                    aVar.f70119p0.onComplete();
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = this.f70122p0;
                if (!aVar.f70121r0.compareAndSet(false, true)) {
                    RxJavaPlugins.onError(th2);
                } else {
                    DisposableHelper.dispose(aVar);
                    aVar.f70119p0.onError(th2);
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver) {
            this.f70119p0 = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f70121r0.compareAndSet(false, true)) {
                DisposableHelper.dispose(this);
                DisposableHelper.dispose(this.f70120q0);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70121r0.get();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.f70121r0.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.f70120q0);
                this.f70119p0.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            if (!this.f70121r0.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                DisposableHelper.dispose(this.f70120q0);
                this.f70119p0.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public CompletableTakeUntilCompletable(Completable completable, CompletableSource completableSource) {
        this.f70117p0 = completable;
        this.f70118q0 = completableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver);
        completableObserver.onSubscribe(aVar);
        this.f70118q0.subscribe(aVar.f70120q0);
        this.f70117p0.subscribe(aVar);
    }
}
