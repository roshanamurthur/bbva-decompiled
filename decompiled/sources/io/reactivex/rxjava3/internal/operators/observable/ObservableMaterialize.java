package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMaterialize<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Notification<T>> {

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Notification<T>> f76872p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f76873q0;

        public a(Observer<? super Notification<T>> observer) {
            this.f76872p0 = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76873q0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76873q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Notification notificationCreateOnComplete = Notification.createOnComplete();
            Observer<? super Notification<T>> observer = this.f76872p0;
            observer.onNext(notificationCreateOnComplete);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            Notification notificationCreateOnError = Notification.createOnError(th2);
            Observer<? super Notification<T>> observer = this.f76872p0;
            observer.onNext(notificationCreateOnError);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76872p0.onNext(Notification.createOnNext(t10));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76873q0, disposable)) {
                this.f76873q0 = disposable;
                this.f76872p0.onSubscribe(this);
            }
        }
    }

    public ObservableMaterialize(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Notification<T>> observer) {
        this.source.subscribe(new a(observer));
    }
}
