package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapNotification<T, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends MaybeSource<? extends R>> f75892p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends MaybeSource<? extends R>> f75893q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Supplier<? extends MaybeSource<? extends R>> f75894r0;

    public static final class a<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f75895p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f75896q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends MaybeSource<? extends R>> f75897r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Supplier<? extends MaybeSource<? extends R>> f75898s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f75899t0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapNotification$a$a, reason: collision with other inner class name */
        public final class C0382a implements MaybeObserver<R> {
            public C0382a() {
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a.this.f75895p0.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a.this.f75895p0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(a.this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(R r3) {
                a.this.f75895p0.onSuccess(r3);
            }
        }

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends R>> function, Function<? super Throwable, ? extends MaybeSource<? extends R>> function2, Supplier<? extends MaybeSource<? extends R>> supplier) {
            this.f75895p0 = maybeObserver;
            this.f75896q0 = function;
            this.f75897r0 = function2;
            this.f75898s0 = supplier;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            this.f75899t0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            try {
                MaybeSource<? extends R> maybeSource = this.f75898s0.get();
                Objects.requireNonNull(maybeSource, "The onCompleteSupplier returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource2 = maybeSource;
                if (isDisposed()) {
                    return;
                }
                maybeSource2.subscribe(new C0382a());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f75895p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            try {
                MaybeSource<? extends R> maybeSourceApply = this.f75897r0.apply(th2);
                Objects.requireNonNull(maybeSourceApply, "The onErrorMapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = maybeSourceApply;
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new C0382a());
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f75895p0.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75899t0, disposable)) {
                this.f75899t0 = disposable;
                this.f75895p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            try {
                MaybeSource<? extends R> maybeSourceApply = this.f75896q0.apply(t10);
                Objects.requireNonNull(maybeSourceApply, "The onSuccessMapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = maybeSourceApply;
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new C0382a());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f75895p0.onError(th2);
            }
        }
    }

    public MaybeFlatMapNotification(MaybeSource<T> maybeSource, Function<? super T, ? extends MaybeSource<? extends R>> function, Function<? super Throwable, ? extends MaybeSource<? extends R>> function2, Supplier<? extends MaybeSource<? extends R>> supplier) {
        super(maybeSource);
        this.f75892p0 = function;
        this.f75893q0 = function2;
        this.f75894r0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f75892p0, this.f75893q0, this.f75894r0));
    }
}
