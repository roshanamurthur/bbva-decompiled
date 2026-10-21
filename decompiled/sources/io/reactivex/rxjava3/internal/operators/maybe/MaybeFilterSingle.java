package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFilterSingle<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f75860p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f75861q0;

    public static final class a<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75862p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f75863q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f75864r0;

        public a(MaybeObserver<? super T> maybeObserver, Predicate<? super T> predicate) {
            this.f75862p0 = maybeObserver;
            this.f75863q0 = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.f75864r0;
            this.f75864r0 = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75864r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75862p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75864r0, disposable)) {
                this.f75864r0 = disposable;
                this.f75862p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            MaybeObserver<? super T> maybeObserver = this.f75862p0;
            try {
                if (this.f75863q0.test(t10)) {
                    maybeObserver.onSuccess(t10);
                } else {
                    maybeObserver.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }
    }

    public MaybeFilterSingle(SingleSource<T> singleSource, Predicate<? super T> predicate) {
        this.f75860p0 = singleSource;
        this.f75861q0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f75860p0.subscribe(new a(maybeObserver, this.f75861q0));
    }
}
