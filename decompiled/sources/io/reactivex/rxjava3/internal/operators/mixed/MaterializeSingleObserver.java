package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class MaterializeSingleObserver<T> implements SingleObserver<T>, MaybeObserver<T>, CompletableObserver, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleObserver<? super Notification<T>> f76178p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Disposable f76179q0;

    public MaterializeSingleObserver(SingleObserver<? super Notification<T>> singleObserver) {
        this.f76178p0 = singleObserver;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f76179q0.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f76179q0.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        this.f76178p0.onSuccess(Notification.createOnComplete());
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th2) {
        this.f76178p0.onSuccess(Notification.createOnError(th2));
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f76179q0, disposable)) {
            this.f76179q0 = disposable;
            this.f76178p0.onSubscribe(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t10) {
        this.f76178p0.onSuccess(Notification.createOnNext(t10));
    }
}
