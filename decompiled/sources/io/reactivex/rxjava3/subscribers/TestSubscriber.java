package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Subscriber<? super T> f78465p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public volatile boolean f78466q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Subscription> f78467r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicLong f78468s0;

    public TestSubscriber() {
        this(a.INSTANCE, Long.MAX_VALUE);
    }

    @NonNull
    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (this.f78466q0) {
            return;
        }
        this.f78466q0 = true;
        SubscriptionHelper.cancel(this.f78467r0);
    }

    @Override // io.reactivex.rxjava3.observers.BaseTestConsumer, io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        cancel();
    }

    public final boolean hasSubscription() {
        return this.f78467r0.get() != null;
    }

    public final boolean isCancelled() {
        return this.f78466q0;
    }

    @Override // io.reactivex.rxjava3.observers.BaseTestConsumer, io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f78466q0;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.f78467r0.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.completions++;
            this.f78465p0.onComplete();
        } finally {
            this.done.countDown();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@NonNull Throwable th2) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.f78467r0.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            if (th2 == null) {
                this.errors.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.errors.add(th2);
            }
            this.f78465p0.onError(th2);
        } finally {
            this.done.countDown();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@NonNull T t10) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.f78467r0.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        this.values.add(t10);
        if (t10 == null) {
            this.errors.add(new NullPointerException("onNext received a null value"));
        }
        this.f78465p0.onNext(t10);
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(@NonNull Subscription subscription) {
        this.lastThread = Thread.currentThread();
        if (subscription == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        AtomicReference<Subscription> atomicReference = this.f78467r0;
        while (!atomicReference.compareAndSet(null, subscription)) {
            if (atomicReference.get() != null) {
                subscription.cancel();
                if (atomicReference.get() != SubscriptionHelper.CANCELLED) {
                    this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + subscription));
                    return;
                }
                return;
            }
        }
        this.f78465p0.onSubscribe(subscription);
        long andSet = this.f78468s0.getAndSet(0L);
        if (andSet != 0) {
            subscription.request(andSet);
        }
        onStart();
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j10) {
        SubscriptionHelper.deferredRequest(this.f78467r0, this.f78468s0, j10);
    }

    public final TestSubscriber<T> requestMore(long j10) {
        request(j10);
        return this;
    }

    public TestSubscriber(long j10) {
        this(a.INSTANCE, j10);
    }

    @NonNull
    public static <T> TestSubscriber<T> create(long j10) {
        return new TestSubscriber<>(j10);
    }

    @Override // io.reactivex.rxjava3.observers.BaseTestConsumer
    public final TestSubscriber<T> assertSubscribed() {
        if (this.f78467r0.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    public TestSubscriber(@NonNull Subscriber<? super T> subscriber) {
        this(subscriber, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create(@NonNull Subscriber<? super T> subscriber) {
        return new TestSubscriber<>(subscriber);
    }

    public TestSubscriber(@NonNull Subscriber<? super T> subscriber, long j10) {
        if (j10 >= 0) {
            this.f78465p0 = subscriber;
            this.f78467r0 = new AtomicReference<>();
            this.f78468s0 = new AtomicLong(j10);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements FlowableSubscriber<Object> {
        private static final /* synthetic */ a[] $VALUES;
        public static final a INSTANCE;

        static {
            a aVar = new a("INSTANCE", 0);
            INSTANCE = aVar;
            $VALUES = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
        }
    }

    public void onStart() {
    }
}
