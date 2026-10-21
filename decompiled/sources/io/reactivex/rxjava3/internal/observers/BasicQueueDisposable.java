package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BasicQueueDisposable<T> implements QueueDisposable<T> {
    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
