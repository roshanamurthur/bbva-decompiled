package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeOnErrorComplete;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleOnErrorComplete<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Single<T> f77822p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super Throwable> f77823q0;

    public SingleOnErrorComplete(Single<T> single, Predicate<? super Throwable> predicate) {
        this.f77822p0 = single;
        this.f77823q0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f77822p0.subscribe(new MaybeOnErrorComplete.OnErrorCompleteMultiObserver(maybeObserver, this.f77823q0));
    }
}
