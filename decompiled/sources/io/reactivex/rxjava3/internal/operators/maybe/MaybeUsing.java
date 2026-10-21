package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeUsing<T, D> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends D> f76050p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super D, ? extends MaybeSource<? extends T>> f76051q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super D> f76052r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f76053s0;

    public static final class a<T, D> extends AtomicReference<Object> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f76054p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super D> f76055q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f76056r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f76057s0;

        public a(MaybeObserver<? super T> maybeObserver, D d2, Consumer<? super D> consumer, boolean z10) {
            super(d2);
            this.f76054p0 = maybeObserver;
            this.f76055q0 = consumer;
            this.f76056r0 = z10;
        }

        public final void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f76055q0.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f76056r0) {
                a();
                this.f76057s0.dispose();
                this.f76057s0 = DisposableHelper.DISPOSED;
            } else {
                this.f76057s0.dispose();
                this.f76057s0 = DisposableHelper.DISPOSED;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76057s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f76057s0 = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f76054p0;
            boolean z10 = this.f76056r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f76055q0.accept(andSet);
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

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f76057s0 = DisposableHelper.DISPOSED;
            boolean z10 = this.f76056r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f76055q0.accept(andSet);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f76054p0.onError(th2);
            if (z10) {
                return;
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76057s0, disposable)) {
                this.f76057s0 = disposable;
                this.f76054p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f76057s0 = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f76054p0;
            boolean z10 = this.f76056r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f76055q0.accept(andSet);
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

    public MaybeUsing(Supplier<? extends D> supplier, Function<? super D, ? extends MaybeSource<? extends T>> function, Consumer<? super D> consumer, boolean z10) {
        this.f76050p0 = supplier;
        this.f76051q0 = function;
        this.f76052r0 = consumer;
        this.f76053s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        boolean z10 = this.f76053s0;
        Consumer<? super D> consumer = this.f76052r0;
        try {
            D d2 = this.f76050p0.get();
            try {
                MaybeSource<? extends T> maybeSourceApply = this.f76051q0.apply(d2);
                Objects.requireNonNull(maybeSourceApply, "The sourceSupplier returned a null MaybeSource");
                maybeSourceApply.subscribe(new a(maybeObserver, d2, consumer, z10));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                if (z10) {
                    try {
                        consumer.accept(d2);
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
                    consumer.accept(d2);
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
