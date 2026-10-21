package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDematerialize<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Single<T> f77677p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, Notification<R>> f77678q0;

    public static final class a<T, R> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f77679p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, Notification<R>> f77680q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77681r0;

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, Notification<R>> function) {
            this.f77679p0 = maybeObserver;
            this.f77680q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77681r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77681r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77679p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77681r0, disposable)) {
                this.f77681r0 = disposable;
                this.f77679p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            MaybeObserver<? super R> maybeObserver = this.f77679p0;
            try {
                Notification<R> notificationApply = this.f77680q0.apply(t10);
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

    public SingleDematerialize(Single<T> single, Function<? super T, Notification<R>> function) {
        this.f77677p0 = single;
        this.f77678q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.f77677p0.subscribe(new a(maybeObserver, this.f77678q0));
    }
}
