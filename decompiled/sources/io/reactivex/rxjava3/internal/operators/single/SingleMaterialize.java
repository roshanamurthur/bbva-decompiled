package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.internal.operators.mixed.MaterializeSingleObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleMaterialize<T> extends Single<Notification<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Single<T> f77815p0;

    public SingleMaterialize(Single<T> single) {
        this.f77815p0 = single;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Notification<T>> singleObserver) {
        this.f77815p0.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}
