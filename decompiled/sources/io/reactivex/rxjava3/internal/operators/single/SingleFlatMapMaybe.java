package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMapMaybe<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f77774p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f77775q0;

    public static final class a<R> implements MaybeObserver<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<Disposable> f77776p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybeObserver<? super R> f77777q0;

        public a(MaybeObserver maybeObserver, AtomicReference atomicReference) {
            this.f77776p0 = atomicReference;
            this.f77777q0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f77777q0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77777q0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f77776p0, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(R r3) {
            this.f77777q0.onSuccess(r3);
        }
    }

    public static final class b<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f77778p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f77779q0;

        public b(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends R>> function) {
            this.f77778p0 = maybeObserver;
            this.f77779q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77778p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f77778p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            try {
                MaybeSource<? extends R> maybeSourceApply = this.f77779q0.apply(t10);
                Objects.requireNonNull(maybeSourceApply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = maybeSourceApply;
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new a(this.f77778p0, this));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }
    }

    public SingleFlatMapMaybe(SingleSource<? extends T> singleSource, Function<? super T, ? extends MaybeSource<? extends R>> function) {
        this.f77775q0 = function;
        this.f77774p0 = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.f77774p0.subscribe(new b(maybeObserver, this.f77775q0));
    }
}
