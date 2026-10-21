package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMaterialize<T> extends io.reactivex.internal.operators.observable.a<T, Notification<T>> {

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Notification<T>> f72586p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f72587q0;

        public a(Observer<? super Notification<T>> observer) {
            this.f72586p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72587q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72587q0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Notification notificationCreateOnComplete = Notification.createOnComplete();
            Observer<? super Notification<T>> observer = this.f72586p0;
            observer.onNext(notificationCreateOnComplete);
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            Notification notificationCreateOnError = Notification.createOnError(th2);
            Observer<? super Notification<T>> observer = this.f72586p0;
            observer.onNext(notificationCreateOnError);
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72586p0.onNext(Notification.createOnNext(t10));
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72587q0, disposable)) {
                this.f72587q0 = disposable;
                this.f72586p0.onSubscribe(this);
            }
        }
    }

    public ObservableMaterialize(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Notification<T>> observer) {
        this.source.subscribe(new a(observer));
    }
}
