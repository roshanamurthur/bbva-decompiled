package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposables;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleJust<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T f73530p0;

    public SingleJust(T t10) {
        this.f73530p0 = t10;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        singleObserver.onSubscribe(Disposables.disposed());
        singleObserver.onSuccess(this.f73530p0);
    }
}
