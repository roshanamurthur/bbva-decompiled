package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleJust<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T f77808p0;

    public SingleJust(T t10) {
        this.f77808p0 = t10;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        singleObserver.onSubscribe(d.a());
        singleObserver.onSuccess(this.f77808p0);
    }
}
