package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableUsing<R> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<R> f70149p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super R, ? extends CompletableSource> f70150q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super R> f70151r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f70152s0;

    public static final class a<R> extends AtomicReference<Object> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70153p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super R> f70154q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f70155r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f70156s0;

        public a(CompletableObserver completableObserver, R r3, Consumer<? super R> consumer, boolean z10) {
            super(r3);
            this.f70153p0 = completableObserver;
            this.f70154q0 = consumer;
            this.f70155r0 = z10;
        }

        public final void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f70154q0.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70156s0.dispose();
            this.f70156s0 = DisposableHelper.DISPOSED;
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70156s0.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f70156s0 = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f70153p0;
            boolean z10 = this.f70155r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f70154q0.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    completableObserver.onError(th2);
                    return;
                }
            }
            completableObserver.onComplete();
            if (z10) {
                return;
            }
            a();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70156s0 = DisposableHelper.DISPOSED;
            boolean z10 = this.f70155r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f70154q0.accept(andSet);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f70153p0.onError(th2);
            if (z10) {
                return;
            }
            a();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f70156s0, disposable)) {
                this.f70156s0 = disposable;
                this.f70153p0.onSubscribe(this);
            }
        }
    }

    public CompletableUsing(Callable<R> callable, Function<? super R, ? extends CompletableSource> function, Consumer<? super R> consumer, boolean z10) {
        this.f70149p0 = callable;
        this.f70150q0 = function;
        this.f70151r0 = consumer;
        this.f70152s0 = z10;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        boolean z10 = this.f70152s0;
        Consumer<? super R> consumer = this.f70151r0;
        try {
            R rCall = this.f70149p0.call();
            try {
                ((CompletableSource) ObjectHelper.requireNonNull(this.f70150q0.apply(rCall), "The completableFunction returned a null CompletableSource")).subscribe(new a(completableObserver, rCall, consumer, z10));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                if (z10) {
                    try {
                        consumer.accept(rCall);
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        EmptyDisposable.error(new CompositeException(th2, th3), completableObserver);
                        return;
                    }
                }
                EmptyDisposable.error(th2, completableObserver);
                if (z10) {
                    return;
                }
                try {
                    consumer.accept(rCall);
                } catch (Throwable th4) {
                    Exceptions.throwIfFatal(th4);
                    RxJavaPlugins.onError(th4);
                }
            }
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            EmptyDisposable.error(th5, completableObserver);
        }
    }
}
