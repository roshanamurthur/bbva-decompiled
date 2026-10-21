package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletablePeek extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74362p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Disposable> f74363q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super Throwable> f74364r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Action f74365s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Action f74366t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Action f74367u0;
    public final Action v0;

    public final class a implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74368p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f74369q0;

        public a(CompletableObserver completableObserver) {
            this.f74368p0 = completableObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            try {
                CompletablePeek.this.v0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f74369q0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74369q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            CompletableObserver completableObserver = this.f74368p0;
            CompletablePeek completablePeek = CompletablePeek.this;
            if (this.f74369q0 == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                completablePeek.f74365s0.run();
                completablePeek.f74366t0.run();
                completableObserver.onComplete();
                try {
                    completablePeek.f74367u0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                completableObserver.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            CompletablePeek completablePeek = CompletablePeek.this;
            if (this.f74369q0 == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th2);
                return;
            }
            try {
                completablePeek.f74364r0.accept(th2);
                completablePeek.f74366t0.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f74368p0.onError(th2);
            try {
                completablePeek.f74367u0.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            CompletableObserver completableObserver = this.f74368p0;
            try {
                CompletablePeek.this.f74363q0.accept(disposable);
                if (DisposableHelper.validate(this.f74369q0, disposable)) {
                    this.f74369q0 = disposable;
                    completableObserver.onSubscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                disposable.dispose();
                this.f74369q0 = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th2, completableObserver);
            }
        }
    }

    public CompletablePeek(CompletableSource completableSource, Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        this.f74362p0 = completableSource;
        this.f74363q0 = consumer;
        this.f74364r0 = consumer2;
        this.f74365s0 = action;
        this.f74366t0 = action2;
        this.f74367u0 = action3;
        this.v0 = action4;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74362p0.subscribe(new a(completableObserver));
    }
}
