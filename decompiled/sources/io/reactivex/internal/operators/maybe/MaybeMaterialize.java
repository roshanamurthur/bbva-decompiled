package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.Notification;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.operators.mixed.MaterializeSingleObserver;

/* JADX INFO: loaded from: classes12.dex */
@Experimental
public final class MaybeMaterialize<T> extends Single<Notification<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Maybe<T> f71703p0;

    public MaybeMaterialize(Maybe<T> maybe) {
        this.f71703p0 = maybe;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Notification<T>> singleObserver) {
        this.f71703p0.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}
