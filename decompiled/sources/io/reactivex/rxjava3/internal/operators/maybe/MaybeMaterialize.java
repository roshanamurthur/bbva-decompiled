package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.internal.operators.mixed.MaterializeSingleObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeMaterialize<T> extends Single<Notification<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Maybe<T> f75943p0;

    public MaybeMaterialize(Maybe<T> maybe) {
        this.f75943p0 = maybe;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Notification<T>> singleObserver) {
        this.f75943p0.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}
