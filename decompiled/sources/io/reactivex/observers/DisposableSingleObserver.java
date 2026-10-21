package io.reactivex.observers;

import io.reactivex.SingleObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DisposableSingleObserver<T> implements SingleObserver<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicReference<Disposable> f73809p0 = new AtomicReference<>();

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.f73809p0);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f73809p0.get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(@NonNull Disposable disposable) {
        if (EndConsumerHelper.setOnce(this.f73809p0, disposable, getClass())) {
            onStart();
        }
    }

    public void onStart() {
    }
}
