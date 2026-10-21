package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
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
public final class SingleUsing<T, U> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<U> f77877p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super U, ? extends SingleSource<? extends T>> f77878q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super U> f77879r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f77880s0;

    public static final class a<T, U> extends AtomicReference<Object> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77881p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super U> f77882q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f77883r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f77884s0;

        public a(SingleObserver<? super T> singleObserver, U u2, boolean z10, Consumer<? super U> consumer) {
            super(u2);
            this.f77881p0 = singleObserver;
            this.f77883r0 = z10;
            this.f77882q0 = consumer;
        }

        public final void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f77882q0.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77883r0) {
                a();
                this.f77884s0.dispose();
                this.f77884s0 = DisposableHelper.DISPOSED;
            } else {
                this.f77884s0.dispose();
                this.f77884s0 = DisposableHelper.DISPOSED;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77884s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77884s0 = DisposableHelper.DISPOSED;
            boolean z10 = this.f77883r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f77882q0.accept(andSet);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f77881p0.onError(th2);
            if (z10) {
                return;
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77884s0, disposable)) {
                this.f77884s0 = disposable;
                this.f77881p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f77884s0 = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.f77881p0;
            boolean z10 = this.f77883r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f77882q0.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    singleObserver.onError(th2);
                    return;
                }
            }
            singleObserver.onSuccess(t10);
            if (z10) {
                return;
            }
            a();
        }
    }

    public SingleUsing(Supplier<U> supplier, Function<? super U, ? extends SingleSource<? extends T>> function, Consumer<? super U> consumer, boolean z10) {
        this.f77877p0 = supplier;
        this.f77878q0 = function;
        this.f77879r0 = consumer;
        this.f77880s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        Consumer<? super U> consumer = this.f77879r0;
        boolean z10 = this.f77880s0;
        try {
            U u2 = this.f77877p0.get();
            try {
                SingleSource<? extends T> singleSourceApply = this.f77878q0.apply(u2);
                Objects.requireNonNull(singleSourceApply, "The singleFunction returned a null SingleSource");
                singleSourceApply.subscribe(new a(singleObserver, u2, z10, consumer));
            } catch (Throwable th2) {
                th = th2;
                Exceptions.throwIfFatal(th);
                if (z10) {
                    try {
                        consumer.accept(u2);
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        th = new CompositeException(th, th3);
                    }
                }
                EmptyDisposable.error(th, singleObserver);
                if (z10) {
                    return;
                }
                try {
                    consumer.accept(u2);
                } catch (Throwable th4) {
                    Exceptions.throwIfFatal(th4);
                    RxJavaPlugins.onError(th4);
                }
            }
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            EmptyDisposable.error(th5, singleObserver);
        }
    }
}
