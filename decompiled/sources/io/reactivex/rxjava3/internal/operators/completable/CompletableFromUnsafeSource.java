package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableFromUnsafeSource extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74316p0;

    public CompletableFromUnsafeSource(CompletableSource completableSource) {
        this.f74316p0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74316p0.subscribe(completableObserver);
    }
}
