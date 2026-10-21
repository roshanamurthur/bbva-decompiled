package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Notification;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
@Experimental
public final class MaterializeSingleObserver<T> implements SingleObserver<T>, MaybeObserver<T>, CompletableObserver, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleObserver<? super Notification<T>> f71914p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Disposable f71915q0;

    public MaterializeSingleObserver(SingleObserver<? super Notification<T>> singleObserver) {
        this.f71914p0 = singleObserver;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f71915q0.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f71915q0.isDisposed();
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        this.f71914p0.onSuccess(Notification.createOnComplete());
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        this.f71914p0.onSuccess(Notification.createOnError(th2));
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f71915q0, disposable)) {
            this.f71915q0 = disposable;
            this.f71914p0.onSubscribe(this);
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t10) {
        this.f71914p0.onSuccess(Notification.createOnNext(t10));
    }
}
