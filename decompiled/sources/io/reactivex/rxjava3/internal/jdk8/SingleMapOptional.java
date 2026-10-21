package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleMapOptional<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Single<T> f74175p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, Optional<? extends R>> f74176q0;

    public static final class a<T, R> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f74177p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, Optional<? extends R>> f74178q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f74179r0;

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, Optional<? extends R>> function) {
            this.f74177p0 = maybeObserver;
            this.f74178q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.f74179r0;
            this.f74179r0 = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74179r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74177p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f74179r0, disposable)) {
                this.f74179r0 = disposable;
                this.f74177p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            MaybeObserver<? super R> maybeObserver = this.f74177p0;
            try {
                Optional<? extends R> optionalApply = this.f74178q0.apply(t10);
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

    public SingleMapOptional(Single<T> single, Function<? super T, Optional<? extends R>> function) {
        this.f74175p0 = single;
        this.f74176q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.f74175p0.subscribe(new a(maybeObserver, this.f74176q0));
    }
}
