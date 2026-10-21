package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableOnErrorReturn<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74357p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends T> f74358q0;

    public static final class a<T> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f74359p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends T> f74360q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f74361r0;

        public a(MaybeObserver<? super T> maybeObserver, Function<? super Throwable, ? extends T> function) {
            this.f74359p0 = maybeObserver;
            this.f74360q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74361r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74361r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f74359p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            MaybeObserver<? super T> maybeObserver = this.f74359p0;
            try {
                T tApply = this.f74360q0.apply(th2);
                Objects.requireNonNull(tApply, "The itemSupplier returned a null value");
                maybeObserver.onSuccess(tApply);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                maybeObserver.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f74361r0, disposable)) {
                this.f74361r0 = disposable;
                this.f74359p0.onSubscribe(this);
            }
        }
    }

    public CompletableOnErrorReturn(CompletableSource completableSource, Function<? super Throwable, ? extends T> function) {
        this.f74357p0 = completableSource;
        this.f74358q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f74357p0.subscribe(new a(maybeObserver, this.f74358q0));
    }
}
