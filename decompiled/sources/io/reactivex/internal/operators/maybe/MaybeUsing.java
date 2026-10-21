package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
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

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeUsing<T, D> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends D> f71803p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super D, ? extends MaybeSource<? extends T>> f71804q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super D> f71805r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f71806s0;

    public static final class a<T, D> extends AtomicReference<Object> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71807p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super D> f71808q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f71809r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f71810s0;

        public a(MaybeObserver<? super T> maybeObserver, D d2, Consumer<? super D> consumer, boolean z10) {
            super(d2);
            this.f71807p0 = maybeObserver;
            this.f71808q0 = consumer;
            this.f71809r0 = z10;
        }

        public final void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f71808q0.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71810s0.dispose();
            this.f71810s0 = DisposableHelper.DISPOSED;
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71810s0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71810s0 = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f71807p0;
            boolean z10 = this.f71809r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f71808q0.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    maybeObserver.onError(th2);
                    return;
                }
            }
            maybeObserver.onComplete();
            if (z10) {
                return;
            }
            a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71810s0 = DisposableHelper.DISPOSED;
            boolean z10 = this.f71809r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f71808q0.accept(andSet);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f71807p0.onError(th2);
            if (z10) {
                return;
            }
            a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71810s0, disposable)) {
                this.f71810s0 = disposable;
                this.f71807p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71810s0 = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f71807p0;
            boolean z10 = this.f71809r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f71808q0.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    maybeObserver.onError(th2);
                    return;
                }
            }
            maybeObserver.onSuccess(t10);
            if (z10) {
                return;
            }
            a();
        }
    }

    public MaybeUsing(Callable<? extends D> callable, Function<? super D, ? extends MaybeSource<? extends T>> function, Consumer<? super D> consumer, boolean z10) {
        this.f71803p0 = callable;
        this.f71804q0 = function;
        this.f71805r0 = consumer;
        this.f71806s0 = z10;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        boolean z10 = this.f71806s0;
        Consumer<? super D> consumer = this.f71805r0;
        try {
            D dCall = this.f71803p0.call();
            try {
                ((MaybeSource) ObjectHelper.requireNonNull(this.f71804q0.apply(dCall), "The sourceSupplier returned a null MaybeSource")).subscribe(new a(maybeObserver, dCall, consumer, z10));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                if (z10) {
                    try {
                        consumer.accept(dCall);
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        EmptyDisposable.error(new CompositeException(th2, th3), maybeObserver);
                        return;
                    }
                }
                EmptyDisposable.error(th2, maybeObserver);
                if (z10) {
                    return;
                }
                try {
                    consumer.accept(dCall);
                } catch (Throwable th4) {
                    Exceptions.throwIfFatal(th4);
                    RxJavaPlugins.onError(th4);
                }
            }
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            EmptyDisposable.error(th5, maybeObserver);
        }
    }
}
