package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeMapOptional<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Maybe<T> f74081p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, Optional<? extends R>> f74082q0;

    public static final class a<T, R> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f74083p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, Optional<? extends R>> f74084q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f74085r0;

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, Optional<? extends R>> function) {
            this.f74083p0 = maybeObserver;
            this.f74084q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.f74085r0;
            this.f74085r0 = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74085r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f74083p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74083p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f74085r0, disposable)) {
                this.f74085r0 = disposable;
                this.f74083p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            MaybeObserver<? super R> maybeObserver = this.f74083p0;
            try {
                Optional<? extends R> optionalApply = this.f74084q0.apply(t10);
                Objects.requireNonNull(optionalApply, "The mapper returned a null item");
                Optional optionalB = cm.a.b(optionalApply);
                if (optionalB.isPresent()) {
                    maybeObserver.onSuccess((Object) optionalB.get());
                } else {
                    maybeObserver.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }
    }

    public MaybeMapOptional(Maybe<T> maybe, Function<? super T, Optional<? extends R>> function) {
        this.f74081p0 = maybe;
        this.f74082q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.f74081p0.subscribe(new a(maybeObserver, this.f74082q0));
    }
}
