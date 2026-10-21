package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableOperator;
import io.reactivex.CompletableSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableLift extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70062p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableOperator f70063q0;

    public CompletableLift(CompletableSource completableSource, CompletableOperator completableOperator) {
        this.f70062p0 = completableSource;
        this.f70063q0 = completableOperator;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        try {
            this.f70062p0.subscribe(this.f70063q0.apply(completableObserver));
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }
}
