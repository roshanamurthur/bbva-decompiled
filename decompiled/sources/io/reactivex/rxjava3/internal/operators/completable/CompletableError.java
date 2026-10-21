package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableError extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f74303p0;

    public CompletableError(Throwable th2) {
        this.f74303p0 = th2;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        EmptyDisposable.error(this.f74303p0, completableObserver);
    }
}
