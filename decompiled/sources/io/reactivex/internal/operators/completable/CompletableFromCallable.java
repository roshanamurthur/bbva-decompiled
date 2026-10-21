package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableFromCallable extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<?> f70049p0;

    public CompletableFromCallable(Callable<?> callable) {
        this.f70049p0 = callable;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        Disposable disposableEmpty = Disposables.empty();
        completableObserver.onSubscribe(disposableEmpty);
        try {
            this.f70049p0.call();
            if (disposableEmpty.isDisposed()) {
                return;
            }
            completableObserver.onComplete();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (disposableEmpty.isDisposed()) {
                RxJavaPlugins.onError(th2);
            } else {
                completableObserver.onError(th2);
            }
        }
    }
}
