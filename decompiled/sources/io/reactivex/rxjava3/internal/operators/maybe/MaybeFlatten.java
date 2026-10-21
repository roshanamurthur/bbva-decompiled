package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatten<T, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f75907p0;

    public static final class a<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f75908p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f75909q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f75910r0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten$a$a, reason: collision with other inner class name */
        public final class C0383a implements MaybeObserver<R> {
            public C0383a() {
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a.this.f75908p0.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a.this.f75908p0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(a.this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                a.this.f75908p0.onSuccess(r3);
            }
        }

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends R>> function) {
            this.f75908p0 = maybeObserver;
            this.f75909q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            this.f75910r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75908p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75908p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75910r0, disposable)) {
                this.f75910r0 = disposable;
                this.f75908p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            try {
                MaybeSource<? extends R> maybeSourceApply = this.f75909q0.apply(t10);
                Objects.requireNonNull(maybeSourceApply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = maybeSourceApply;
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new C0383a());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f75908p0.onError(th2);
            }
        }
    }

    public MaybeFlatten(MaybeSource<T> maybeSource, Function<? super T, ? extends MaybeSource<? extends R>> function) {
        super(maybeSource);
        this.f75907p0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f75907p0));
    }
}
