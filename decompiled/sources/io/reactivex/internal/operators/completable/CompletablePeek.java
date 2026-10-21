package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletablePeek extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70098p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Disposable> f70099q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super Throwable> f70100r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Action f70101s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Action f70102t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Action f70103u0;
    public final Action v0;

    public final class a implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70104p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f70105q0;

        public a(CompletableObserver completableObserver) {
            this.f70104p0 = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            try {
                CompletablePeek.this.v0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f70105q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70105q0.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            CompletableObserver completableObserver = this.f70104p0;
            CompletablePeek completablePeek = CompletablePeek.this;
            if (this.f70105q0 == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                completablePeek.f70101s0.run();
                completablePeek.f70102t0.run();
                completableObserver.onComplete();
                try {
                    completablePeek.f70103u0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                completableObserver.onError(th3);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            CompletablePeek completablePeek = CompletablePeek.this;
            if (this.f70105q0 == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th2);
                return;
            }
            try {
                completablePeek.f70100r0.accept(th2);
                completablePeek.f70102t0.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f70104p0.onError(th2);
            try {
                completablePeek.f70103u0.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            CompletableObserver completableObserver = this.f70104p0;
            try {
                CompletablePeek.this.f70099q0.accept(disposable);
                if (DisposableHelper.validate(this.f70105q0, disposable)) {
                    this.f70105q0 = disposable;
                    completableObserver.onSubscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                disposable.dispose();
                this.f70105q0 = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th2, completableObserver);
            }
        }
    }

    public CompletablePeek(CompletableSource completableSource, Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        this.f70098p0 = completableSource;
        this.f70099q0 = consumer;
        this.f70100r0 = consumer2;
        this.f70101s0 = action;
        this.f70102t0 = action2;
        this.f70103u0 = action3;
        this.v0 = action4;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70098p0.subscribe(new a(completableObserver));
    }
}
