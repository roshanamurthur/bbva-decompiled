package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDematerialize<T, R> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, Notification<R>> f75817p0;

    public static final class a<T, R> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f75818p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, Notification<R>> f75819q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f75820r0;

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, Notification<R>> function) {
            this.f75818p0 = maybeObserver;
            this.f75819q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75820r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75820r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75818p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75818p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75820r0, disposable)) {
                this.f75820r0 = disposable;
                this.f75818p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            MaybeObserver<? super R> maybeObserver = this.f75818p0;
            try {
                Notification<R> notificationApply = this.f75819q0.apply(t10);
                Objects.requireNonNull(notificationApply, "The selector returned a null Notification");
                Notification<R> notification = notificationApply;
                if (notification.isOnNext()) {
                    maybeObserver.onSuccess(notification.getValue());
                } else if (notification.isOnComplete()) {
                    maybeObserver.onComplete();
                } else {
                    maybeObserver.onError(notification.getError());
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }
    }

    public MaybeDematerialize(Maybe<T> maybe, Function<? super T, Notification<R>> function) {
        super(maybe);
        this.f75817p0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f75817p0));
    }
}
