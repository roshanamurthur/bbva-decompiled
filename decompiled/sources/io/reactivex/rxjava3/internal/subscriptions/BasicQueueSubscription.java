package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BasicQueueSubscription<T> extends AtomicLong implements QueueSubscription<T> {
    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
