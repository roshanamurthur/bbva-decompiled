package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeOnErrorNext<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends MaybeSource<? extends T>> f75966p0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75967p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends MaybeSource<? extends T>> f75968q0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.MaybeOnErrorNext$a$a, reason: collision with other inner class name */
        public static final class C0384a<T> implements MaybeObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final MaybeObserver<? super T> f75969p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final AtomicReference<Disposable> f75970q0;

            public C0384a(MaybeObserver<? super T> maybeObserver, AtomicReference<Disposable> atomicReference) {
                this.f75969p0 = maybeObserver;
                this.f75970q0 = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                this.f75969p0.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                this.f75969p0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this.f75970q0, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(T t10) {
                this.f75969p0.onSuccess(t10);
            }
        }

        public a(MaybeObserver<? super T> maybeObserver, Function<? super Throwable, ? extends MaybeSource<? extends T>> function) {
            this.f75967p0 = maybeObserver;
            this.f75968q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75967p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            MaybeObserver<? super T> maybeObserver = this.f75967p0;
            try {
                MaybeSource<? extends T> maybeSourceApply = this.f75968q0.apply(th2);
                Objects.requireNonNull(maybeSourceApply, "The resumeFunction returned a null MaybeSource");
                MaybeSource<? extends T> maybeSource = maybeSourceApply;
                DisposableHelper.replace(this, null);
                maybeSource.subscribe(new C0384a(maybeObserver, this));
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                maybeObserver.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f75967p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75967p0.onSuccess(t10);
        }
    }

    public MaybeOnErrorNext(MaybeSource<T> maybeSource, Function<? super Throwable, ? extends MaybeSource<? extends T>> function) {
        super(maybeSource);
        this.f75966p0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f75966p0));
    }
}
