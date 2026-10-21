package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFromUnsafeSource<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77802p0;

    public SingleFromUnsafeSource(SingleSource<T> singleSource) {
        this.f77802p0 = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77802p0.subscribe(singleObserver);
    }
}
