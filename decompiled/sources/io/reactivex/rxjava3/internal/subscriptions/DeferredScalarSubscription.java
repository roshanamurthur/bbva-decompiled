package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.annotations.Nullable;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    protected final Subscriber<? super T> downstream;
    protected T value;

    public DeferredScalarSubscription(Subscriber<? super T> subscriber) {
        this.downstream = subscriber;
    }

    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t10) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                Subscriber<? super T> subscriber = this.downstream;
                subscriber.onNext(t10);
                if (get() != 4) {
                    subscriber.onComplete();
                    return;
                }
                return;
            }
            this.value = t10;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t10;
        lazySet(16);
        Subscriber<? super T> subscriber2 = this.downstream;
        subscriber2.onNext(t10);
        if (get() != 4) {
            subscriber2.onComplete();
        }
    }

    public final boolean isCancelled() {
        return get() == 4;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(T t10) {
        complete(t10);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    @Nullable
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t10 = this.value;
        this.value = null;
        return t10;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j10) {
        T t10;
        if (SubscriptionHelper.validate(j10)) {
            do {
                int i10 = get();
                if ((i10 & (-2)) != 0) {
                    return;
                }
                if (i10 == 1) {
                    if (!compareAndSet(1, 3) || (t10 = this.value) == null) {
                        return;
                    }
                    this.value = null;
                    Subscriber<? super T> subscriber = this.downstream;
                    subscriber.onNext(t10);
                    if (get() != 4) {
                        subscriber.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }
}
