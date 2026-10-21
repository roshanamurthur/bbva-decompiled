package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapNotification<T, R> extends io.reactivex.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f71647p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends MaybeSource<? extends R>> f71648q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Callable<? extends MaybeSource<? extends R>> f71649r0;

    public static final class a<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f71650p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f71651q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends MaybeSource<? extends R>> f71652r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Callable<? extends MaybeSource<? extends R>> f71653s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f71654t0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.MaybeFlatMapNotification$a$a, reason: collision with other inner class name */
        public final class C0318a implements MaybeObserver<R> {
            public C0318a() {
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                a.this.f71650p0.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th2) {
                a.this.f71650p0.onError(th2);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(a.this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r3) {
                a.this.f71650p0.onSuccess(r3);
            }
        }

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends R>> function, Function<? super Throwable, ? extends MaybeSource<? extends R>> function2, Callable<? extends MaybeSource<? extends R>> callable) {
            this.f71650p0 = maybeObserver;
            this.f71651q0 = function;
            this.f71652r0 = function2;
            this.f71653s0 = callable;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            this.f71654t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            try {
                ((MaybeSource) ObjectHelper.requireNonNull(this.f71653s0.call(), "The onCompleteSupplier returned a null MaybeSource")).subscribe(new C0318a());
            } catch (Exception e5) {
                Exceptions.throwIfFatal(e5);
                this.f71650p0.onError(e5);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            try {
                ((MaybeSource) ObjectHelper.requireNonNull(this.f71652r0.apply(th2), "The onErrorMapper returned a null MaybeSource")).subscribe(new C0318a());
            } catch (Exception e5) {
                Exceptions.throwIfFatal(e5);
                this.f71650p0.onError(new CompositeException(th2, e5));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71654t0, disposable)) {
                this.f71654t0 = disposable;
                this.f71650p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            try {
                ((MaybeSource) ObjectHelper.requireNonNull(this.f71651q0.apply(t10), "The onSuccessMapper returned a null MaybeSource")).subscribe(new C0318a());
            } catch (Exception e5) {
                Exceptions.throwIfFatal(e5);
                this.f71650p0.onError(e5);
            }
        }
    }

    public MaybeFlatMapNotification(MaybeSource<T> maybeSource, Function<? super T, ? extends MaybeSource<? extends R>> function, Function<? super Throwable, ? extends MaybeSource<? extends R>> function2, Callable<? extends MaybeSource<? extends R>> callable) {
        super(maybeSource);
        this.f71647p0 = function;
        this.f71648q0 = function2;
        this.f71649r0 = callable;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f71647p0, this.f71648q0, this.f71649r0));
    }
}
