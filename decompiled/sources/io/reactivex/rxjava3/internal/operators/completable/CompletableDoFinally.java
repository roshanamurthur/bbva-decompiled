package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableDoFinally extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74294p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f74295q0;

    public static final class a extends AtomicInteger implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74296p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f74297q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f74298r0;

        public a(CompletableObserver completableObserver, Action action) {
            this.f74296p0 = completableObserver;
            this.f74297q0 = action;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f74297q0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74298r0.dispose();
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74298r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f74296p0.onComplete();
            a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74296p0.onError(th2);
            a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f74298r0, disposable)) {
                this.f74298r0 = disposable;
                this.f74296p0.onSubscribe(this);
            }
        }
    }

    public CompletableDoFinally(CompletableSource completableSource, Action action) {
        this.f74294p0 = completableSource;
        this.f74295q0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74294p0.subscribe(new a(completableObserver, this.f74295q0));
    }
}
