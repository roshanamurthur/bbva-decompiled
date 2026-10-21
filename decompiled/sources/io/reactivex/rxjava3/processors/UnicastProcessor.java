package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    public boolean F0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SpscLinkedArrayQueue<T> f78335q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Runnable> f78336r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f78337s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile boolean f78338t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Throwable f78339u0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public volatile boolean f78340w0;
    public final AtomicReference<Subscriber<? super T>> v0 = new AtomicReference<>();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final AtomicBoolean f78341x0 = new AtomicBoolean();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final a f78342y0 = new a();
    public final AtomicLong E0 = new AtomicLong();

    public final class a extends BasicIntQueueSubscription<T> {
        public a() {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (UnicastProcessor.this.f78340w0) {
                return;
            }
            UnicastProcessor.this.f78340w0 = true;
            Runnable andSet = UnicastProcessor.this.f78336r0.getAndSet(null);
            if (andSet != null) {
                andSet.run();
            }
            UnicastProcessor.this.v0.lazySet(null);
            if (UnicastProcessor.this.f78342y0.getAndIncrement() == 0) {
                UnicastProcessor.this.v0.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.F0) {
                    return;
                }
                unicastProcessor.f78335q0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            UnicastProcessor.this.f78335q0.clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return UnicastProcessor.this.f78335q0.isEmpty();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            return UnicastProcessor.this.f78335q0.poll();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                BackpressureHelper.add(unicastProcessor.E0, j10);
                unicastProcessor.f();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.F0 = true;
            return 2;
        }
    }

    public UnicastProcessor(int i10, Runnable runnable, boolean z10) {
        this.f78335q0 = new SpscLinkedArrayQueue<>(i10);
        this.f78336r0 = new AtomicReference<>(runnable);
        this.f78337s0 = z10;
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, true);
    }

    public final boolean e(boolean z10, boolean z11, boolean z12, Subscriber<? super T> subscriber, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.f78340w0) {
            spscLinkedArrayQueue.clear();
            this.v0.lazySet(null);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (z10 && this.f78339u0 != null) {
            spscLinkedArrayQueue.clear();
            this.v0.lazySet(null);
            subscriber.onError(this.f78339u0);
            return true;
        }
        if (!z12) {
            return false;
        }
        Throwable th2 = this.f78339u0;
        this.v0.lazySet(null);
        if (th2 != null) {
            subscriber.onError(th2);
        } else {
            subscriber.onComplete();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        long j10;
        if (this.f78342y0.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        Subscriber<? super T> subscriber = this.v0.get();
        int iAddAndGet2 = 1;
        while (subscriber == null) {
            iAddAndGet2 = this.f78342y0.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
            subscriber = this.v0.get();
            iAddAndGet = 1;
        }
        if (this.F0) {
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f78335q0;
            int i10 = (this.f78337s0 ? 1 : 0) ^ iAddAndGet;
            while (!this.f78340w0) {
                boolean z10 = this.f78338t0;
                if (i10 != 0 && z10 && this.f78339u0 != null) {
                    spscLinkedArrayQueue.clear();
                    this.v0.lazySet(null);
                    subscriber.onError(this.f78339u0);
                    return;
                }
                subscriber.onNext(null);
                if (z10) {
                    this.v0.lazySet(null);
                    Throwable th2 = this.f78339u0;
                    if (th2 != null) {
                        subscriber.onError(th2);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f78342y0.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.v0.lazySet(null);
            return;
        }
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = this.f78335q0;
        boolean z11 = !this.f78337s0;
        int iAddAndGet3 = iAddAndGet;
        while (true) {
            long j11 = this.E0.get();
            long j12 = 0;
            while (true) {
                if (j11 == j12) {
                    j10 = j12;
                    break;
                }
                boolean z12 = this.f78338t0;
                T tPoll = spscLinkedArrayQueue2.poll();
                int i11 = tPoll == null ? iAddAndGet : 0;
                j10 = j12;
                if (e(z11, z12, i11, subscriber, spscLinkedArrayQueue2)) {
                    return;
                }
                if (i11 != 0) {
                    break;
                }
                subscriber.onNext(tPoll);
                j12 = j10 + 1;
                iAddAndGet = 1;
            }
            if (j11 == j12 && e(z11, this.f78338t0, spscLinkedArrayQueue2.isEmpty(), subscriber, spscLinkedArrayQueue2)) {
                return;
            }
            if (j10 != 0 && j11 != Long.MAX_VALUE) {
                this.E0.addAndGet(-j10);
            }
            iAddAndGet3 = this.f78342y0.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                iAddAndGet = 1;
            }
        }
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    @Nullable
    public Throwable getThrowable() {
        if (this.f78338t0) {
            return this.f78339u0;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasComplete() {
        return this.f78338t0 && this.f78339u0 == null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasSubscribers() {
        return this.v0.get() != null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasThrowable() {
        return this.f78338t0 && this.f78339u0 != null;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f78338t0 || this.f78340w0) {
            return;
        }
        this.f78338t0 = true;
        Runnable andSet = this.f78336r0.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        f();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        ExceptionHelper.nullCheck(th2, "onError called with a null Throwable.");
        if (this.f78338t0 || this.f78340w0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78339u0 = th2;
        this.f78338t0 = true;
        Runnable andSet = this.f78336r0.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        f();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        ExceptionHelper.nullCheck(t10, "onNext called with a null value.");
        if (this.f78338t0 || this.f78340w0) {
            return;
        }
        this.f78335q0.offer(t10);
        f();
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f78338t0 || this.f78340w0) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (this.f78341x0.get() || !this.f78341x0.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), subscriber);
            return;
        }
        subscriber.onSubscribe(this.f78342y0);
        this.v0.set(subscriber);
        if (this.f78340w0) {
            this.v0.lazySet(null);
        } else {
            f();
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i10) {
        ObjectHelper.verifyPositive(i10, "capacityHint");
        return new UnicastProcessor<>(i10, null, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(boolean z10) {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, z10);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i10, @NonNull Runnable runnable) {
        return create(i10, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i10, @NonNull Runnable runnable, boolean z10) {
        Objects.requireNonNull(runnable, "onTerminate");
        ObjectHelper.verifyPositive(i10, "capacityHint");
        return new UnicastProcessor<>(i10, runnable, z10);
    }
}
