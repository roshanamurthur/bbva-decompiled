package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeOnErrorNext<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends MaybeSource<? extends T>> f71726p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f71727q0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71728p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends MaybeSource<? extends T>> f71729q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f71730r0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.MaybeOnErrorNext$a$a, reason: collision with other inner class name */
        public static final class C0320a<T> implements MaybeObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final MaybeObserver<? super T> f71731p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final AtomicReference<Disposable> f71732q0;

            public C0320a(MaybeObserver<? super T> maybeObserver, AtomicReference<Disposable> atomicReference) {
                this.f71731p0 = maybeObserver;
                this.f71732q0 = atomicReference;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                this.f71731p0.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th2) {
                this.f71731p0.onError(th2);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this.f71732q0, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(T t10) {
                this.f71731p0.onSuccess(t10);
            }
        }

        public a(MaybeObserver<? super T> maybeObserver, Function<? super Throwable, ? extends MaybeSource<? extends T>> function, boolean z10) {
            this.f71728p0 = maybeObserver;
            this.f71729q0 = function;
            this.f71730r0 = z10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71728p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            boolean z10 = this.f71730r0;
            MaybeObserver<? super T> maybeObserver = this.f71728p0;
            if (!z10 && !(th2 instanceof Exception)) {
                maybeObserver.onError(th2);
                return;
            }
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.f71729q0.apply(th2), "The resumeFunction returned a null MaybeSource");
                DisposableHelper.replace(this, null);
                maybeSource.subscribe(new C0320a(maybeObserver, this));
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                maybeObserver.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f71728p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71728p0.onSuccess(t10);
        }
    }

    public MaybeOnErrorNext(MaybeSource<T> maybeSource, Function<? super Throwable, ? extends MaybeSource<? extends T>> function, boolean z10) {
        super(maybeSource);
        this.f71726p0 = function;
        this.f71727q0 = z10;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f71726p0, this.f71727q0));
    }
}
