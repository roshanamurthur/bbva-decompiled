package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeMap<T, R> extends io.reactivex.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends R> f71699p0;

    public static final class a<T, R> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f71700p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f71701q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f71702r0;

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends R> function) {
            this.f71700p0 = maybeObserver;
            this.f71701q0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.f71702r0;
            this.f71702r0 = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71702r0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71700p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71700p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71702r0, disposable)) {
                this.f71702r0 = disposable;
                this.f71700p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            MaybeObserver<? super R> maybeObserver = this.f71700p0;
            try {
                maybeObserver.onSuccess((Object) ObjectHelper.requireNonNull(this.f71701q0.apply(t10), "The mapper returned a null item"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }
    }

    public MaybeMap(MaybeSource<T> maybeSource, Function<? super T, ? extends R> function) {
        super(maybeSource);
        this.f71699p0 = function;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f71699p0));
    }
}
