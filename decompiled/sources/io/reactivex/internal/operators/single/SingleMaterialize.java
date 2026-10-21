package io.reactivex.internal.operators.single;

import io.reactivex.Notification;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.operators.mixed.MaterializeSingleObserver;

/* JADX INFO: loaded from: classes12.dex */
@Experimental
public final class SingleMaterialize<T> extends Single<Notification<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Single<T> f73537p0;

    public SingleMaterialize(Single<T> single) {
        this.f73537p0 = single;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Notification<T>> singleObserver) {
        this.f73537p0.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}
