package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFromUnsafeSource<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73524p0;

    public SingleFromUnsafeSource(SingleSource<T> singleSource) {
        this.f73524p0 = singleSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73524p0.subscribe(singleObserver);
    }
}
