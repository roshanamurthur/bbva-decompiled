package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.QueueDrain;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends a implements FlowableSubscriber<T>, QueueDrain<U, V> {
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected final Subscriber<? super V> downstream;
    protected Throwable error;
    protected final SimplePlainQueue<U> queue;

    public QueueDrainSubscriber(Subscriber<? super V> subscriber, SimplePlainQueue<U> simplePlainQueue) {
        this.downstream = subscriber;
        this.queue = simplePlainQueue;
    }

    public boolean accept(Subscriber<? super V> subscriber, U u2) {
        return false;
    }

    @Override // io.reactivex.rxjava3.internal.util.QueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.rxjava3.internal.util.QueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override // io.reactivex.rxjava3.internal.util.QueueDrain
    public final boolean enter() {
        return this.f78064p0.getAndIncrement() == 0;
    }

    @Override // io.reactivex.rxjava3.internal.util.QueueDrain
    public final Throwable error() {
        return this.error;
    }

    public final boolean fastEnter() {
        AtomicInteger atomicInteger = this.f78064p0;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1);
    }

    public final void fastPathEmitMax(U u2, boolean z10, Disposable disposable) {
        Subscriber<? super V> subscriber = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j10 = this.f78063q0.get();
            if (j10 == 0) {
                disposable.dispose();
                subscriber.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else {
                if (accept(subscriber, u2) && j10 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            }
        } else {
            simplePlainQueue.offer(u2);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, subscriber, z10, disposable, this);
    }

    public final void fastPathOrderedEmitMax(U u2, boolean z10, Disposable disposable) {
        Subscriber<? super V> subscriber = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j10 = this.f78063q0.get();
            if (j10 == 0) {
                this.cancelled = true;
                disposable.dispose();
                subscriber.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (simplePlainQueue.isEmpty()) {
                if (accept(subscriber, u2) && j10 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                simplePlainQueue.offer(u2);
            }
        } else {
            simplePlainQueue.offer(u2);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, subscriber, z10, disposable, this);
    }

    @Override // io.reactivex.rxjava3.internal.util.QueueDrain
    public final int leave(int i10) {
        return this.f78064p0.addAndGet(i10);
    }

    @Override // io.reactivex.rxjava3.internal.util.QueueDrain
    public final long produced(long j10) {
        return this.f78063q0.addAndGet(-j10);
    }

    public void request(long j10) {
        requested(j10);
    }

    @Override // io.reactivex.rxjava3.internal.util.QueueDrain
    public final long requested() {
        return this.f78063q0.get();
    }

    public final void requested(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            BackpressureHelper.add(this.f78063q0, j10);
        }
    }
}
