package io.reactivex.internal.operators.single;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Notification;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: loaded from: classes12.dex */
@Experimental
public final class SingleDematerialize<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Single<T> f73423p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, Notification<R>> f73424q0;

    public static final class a<T, R> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f73425p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, Notification<R>> f73426q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f73427r0;

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, Notification<R>> function) {
            this.f73425p0 = maybeObserver;
            this.f73426q0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73427r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73427r0.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73425p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73427r0, disposable)) {
                this.f73427r0 = disposable;
                this.f73425p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            MaybeObserver<? super R> maybeObserver = this.f73425p0;
            try {
                Notification notification = (Notification) ObjectHelper.requireNonNull(this.f73426q0.apply(t10), "The selector returned a null Notification");
                if (notification.isOnNext()) {
                    maybeObserver.onSuccess((Object) notification.getValue());
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
        this.f73423p0 = single;
        this.f73424q0 = function;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.f73423p0.subscribe(new a(maybeObserver, this.f73424q0));
    }
}
