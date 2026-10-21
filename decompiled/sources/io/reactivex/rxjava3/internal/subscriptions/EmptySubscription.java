package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import org.reactivestreams.Subscriber;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class EmptySubscription implements QueueSubscription<Object> {
    private static final /* synthetic */ EmptySubscription[] $VALUES;
    public static final EmptySubscription INSTANCE;

    static {
        EmptySubscription emptySubscription = new EmptySubscription("INSTANCE", 0);
        INSTANCE = emptySubscription;
        $VALUES = new EmptySubscription[]{emptySubscription};
    }

    public EmptySubscription() {
        throw null;
    }

    public static void complete(Subscriber<?> subscriber) {
        subscriber.onSubscribe(INSTANCE);
        subscriber.onComplete();
    }

    public static void error(Throwable th2, Subscriber<?> subscriber) {
        subscriber.onSubscribe(INSTANCE);
        subscriber.onError(th2);
    }

    public static EmptySubscription valueOf(String str) {
        return (EmptySubscription) Enum.valueOf(EmptySubscription.class, str);
    }

    public static EmptySubscription[] values() {
        return (EmptySubscription[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    @Nullable
    public Object poll() {
        return null;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        SubscriptionHelper.validate(j10);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public void clear() {
    }
}
