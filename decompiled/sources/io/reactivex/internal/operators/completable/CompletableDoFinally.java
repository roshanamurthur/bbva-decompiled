package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableDoFinally extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70037p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f70038q0;

    public static final class a extends AtomicInteger implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70039p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f70040q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f70041r0;

        public a(CompletableObserver completableObserver, Action action) {
            this.f70039p0 = completableObserver;
            this.f70040q0 = action;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f70040q0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70041r0.dispose();
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70041r0.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f70039p0.onComplete();
            a();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70039p0.onError(th2);
            a();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f70041r0, disposable)) {
                this.f70041r0 = disposable;
                this.f70039p0.onSubscribe(this);
            }
        }
    }

    public CompletableDoFinally(CompletableSource completableSource, Action action) {
        this.f70037p0 = completableSource;
        this.f70038q0 = action;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70037p0.subscribe(new a(completableObserver, this.f70038q0));
    }
}
