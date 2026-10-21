package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
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
public final class SingleUsing<T, U> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<U> f73588p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super U, ? extends SingleSource<? extends T>> f73589q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super U> f73590r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f73591s0;

    public static final class a<T, U> extends AtomicReference<Object> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73592p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super U> f73593q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f73594r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f73595s0;

        public a(SingleObserver<? super T> singleObserver, U u2, boolean z10, Consumer<? super U> consumer) {
            super(u2);
            this.f73592p0 = singleObserver;
            this.f73594r0 = z10;
            this.f73593q0 = consumer;
        }

        public final void a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f73593q0.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73595s0.dispose();
            this.f73595s0 = DisposableHelper.DISPOSED;
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73595s0.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73595s0 = DisposableHelper.DISPOSED;
            boolean z10 = this.f73594r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f73593q0.accept(andSet);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f73592p0.onError(th2);
            if (z10) {
                return;
            }
            a();
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73595s0, disposable)) {
                this.f73595s0 = disposable;
                this.f73592p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73595s0 = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.f73592p0;
            boolean z10 = this.f73594r0;
            if (z10) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f73593q0.accept(andSet);
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

    public SingleUsing(Callable<U> callable, Function<? super U, ? extends SingleSource<? extends T>> function, Consumer<? super U> consumer, boolean z10) {
        this.f73588p0 = callable;
        this.f73589q0 = function;
        this.f73590r0 = consumer;
        this.f73591s0 = z10;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        Consumer<? super U> consumer = this.f73590r0;
        boolean z10 = this.f73591s0;
        try {
            U uCall = this.f73588p0.call();
            try {
                ((SingleSource) ObjectHelper.requireNonNull(this.f73589q0.apply(uCall), "The singleFunction returned a null SingleSource")).subscribe(new a(singleObserver, uCall, z10, consumer));
            } catch (Throwable th2) {
                th = th2;
                Exceptions.throwIfFatal(th);
                if (z10) {
                    try {
                        consumer.accept(uCall);
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
                    consumer.accept(uCall);
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
