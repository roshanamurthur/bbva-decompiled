package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableError extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f70046p0;

    public CompletableError(Throwable th2) {
        this.f70046p0 = th2;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        EmptyDisposable.error(this.f70046p0, completableObserver);
    }
}
