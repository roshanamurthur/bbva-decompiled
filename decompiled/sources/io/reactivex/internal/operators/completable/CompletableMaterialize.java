package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.Notification;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.operators.mixed.MaterializeSingleObserver;

/* JADX INFO: loaded from: classes11.dex */
@Experimental
public final class CompletableMaterialize<T> extends Single<Notification<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Completable f70064p0;

    public CompletableMaterialize(Completable completable) {
        this.f70064p0 = completable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Notification<T>> singleObserver) {
        this.f70064p0.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}
