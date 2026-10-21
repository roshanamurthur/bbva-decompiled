package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableFromAction extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Action f70048p0;

    public CompletableFromAction(Action action) {
        this.f70048p0 = action;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        Disposable disposableEmpty = Disposables.empty();
        completableObserver.onSubscribe(disposableEmpty);
        try {
            this.f70048p0.run();
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
