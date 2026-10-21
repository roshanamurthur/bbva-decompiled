package io.reactivex.rxjava3.internal.fuseable;

import io.reactivex.rxjava3.annotations.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractEmptyQueueFuseable<T> implements QueueSubscription<T>, QueueDisposable<T> {
    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return false;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean offer(@NonNull T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final T poll() throws Throwable {
        return null;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
    public final int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean offer(@NonNull T t10, @NonNull T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j10) {
    }
}
