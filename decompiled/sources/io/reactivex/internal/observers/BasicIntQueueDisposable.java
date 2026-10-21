package io.reactivex.internal.observers;

import io.reactivex.internal.fuseable.QueueDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements QueueDisposable<T> {
    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
