package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Cancellable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class CancellableDisposable extends AtomicReference<Cancellable> implements Disposable {
    public CancellableDisposable(Cancellable cancellable) {
        super(cancellable);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        Cancellable andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e5) {
            Exceptions.throwIfFatal(e5);
            RxJavaPlugins.onError(e5);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get() == null;
    }
}
