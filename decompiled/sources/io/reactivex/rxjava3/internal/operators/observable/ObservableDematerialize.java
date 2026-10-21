package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDematerialize<T, R> extends io.reactivex.rxjava3.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends Notification<R>> f76587p0;

    public static final class a<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f76588p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Notification<R>> f76589q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f76590r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f76591s0;

        public a(Observer<? super R> observer, Function<? super T, ? extends Notification<R>> function) {
            this.f76588p0 = observer;
            this.f76589q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76591s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76591s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76590r0) {
                return;
            }
            this.f76590r0 = true;
            this.f76588p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76590r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76590r0 = true;
                this.f76588p0.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76590r0) {
                if (t10 instanceof Notification) {
                    Notification notification = (Notification) t10;
                    if (notification.isOnError()) {
                        RxJavaPlugins.onError(notification.getError());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                Notification<R> notificationApply = this.f76589q0.apply(t10);
                Objects.requireNonNull(notificationApply, "The selector returned a null Notification");
                Notification<R> notification2 = notificationApply;
                if (notification2.isOnError()) {
                    this.f76591s0.dispose();
                    onError(notification2.getError());
                } else if (!notification2.isOnComplete()) {
                    this.f76588p0.onNext(notification2.getValue());
                } else {
                    this.f76591s0.dispose();
                    onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76591s0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76591s0, disposable)) {
                this.f76591s0 = disposable;
                this.f76588p0.onSubscribe(this);
            }
        }
    }

    public ObservableDematerialize(ObservableSource<T> observableSource, Function<? super T, ? extends Notification<R>> function) {
        super(observableSource);
        this.f76587p0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new a(observer, this.f76587p0));
    }
}
