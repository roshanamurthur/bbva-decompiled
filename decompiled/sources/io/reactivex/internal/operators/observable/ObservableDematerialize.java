package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDematerialize<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends Notification<R>> f72306p0;

    public static final class a<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72307p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Notification<R>> f72308q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f72309r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f72310s0;

        public a(Observer<? super R> observer, Function<? super T, ? extends Notification<R>> function) {
            this.f72307p0 = observer;
            this.f72308q0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72310s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72310s0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72309r0) {
                return;
            }
            this.f72309r0 = true;
            this.f72307p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72309r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72309r0 = true;
                this.f72307p0.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72309r0) {
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
                Notification notification2 = (Notification) ObjectHelper.requireNonNull(this.f72308q0.apply(t10), "The selector returned a null Notification");
                if (notification2.isOnError()) {
                    this.f72310s0.dispose();
                    onError(notification2.getError());
                } else if (!notification2.isOnComplete()) {
                    this.f72307p0.onNext((Object) notification2.getValue());
                } else {
                    this.f72310s0.dispose();
                    onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72310s0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72310s0, disposable)) {
                this.f72310s0 = disposable;
                this.f72307p0.onSubscribe(this);
            }
        }
    }

    public ObservableDematerialize(ObservableSource<T> observableSource, Function<? super T, ? extends Notification<R>> function) {
        super(observableSource);
        this.f72306p0 = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new a(observer, this.f72306p0));
    }
}
