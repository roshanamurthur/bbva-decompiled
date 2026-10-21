package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableFromUnsafeSource extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70058p0;

    public CompletableFromUnsafeSource(CompletableSource completableSource) {
        this.f70058p0 = completableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70058p0.subscribe(completableObserver);
    }
}
