package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, Subscription {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public T f78042p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f78043q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Subscription> f78044r0;

    public FutureSubscriber() {
        super(1);
        this.f78044r0 = new AtomicReference<>();
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f78043q0;
        if (th2 == null) {
            return this.f78042p0;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f78044r0.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f78042p0 == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        AtomicReference<Subscription> atomicReference = this.f78044r0;
        Subscription subscription = atomicReference.get();
        if (subscription == this || subscription == SubscriptionHelper.CANCELLED) {
            return;
        }
        while (!atomicReference.compareAndSet(subscription, this)) {
            if (atomicReference.get() != subscription) {
                return;
            }
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        AtomicReference<Subscription> atomicReference;
        Subscription subscription;
        if (this.f78043q0 == null && (subscription = (atomicReference = this.f78044r0).get()) != this && subscription != SubscriptionHelper.CANCELLED) {
            while (!atomicReference.compareAndSet(subscription, this)) {
                if (atomicReference.get() != subscription) {
                }
            }
            this.f78043q0 = th2;
            countDown();
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f78042p0 == null) {
            this.f78042p0 = t10;
        } else {
            this.f78044r0.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this.f78044r0, subscription, Long.MAX_VALUE);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        SubscriptionHelper subscriptionHelper;
        while (true) {
            AtomicReference<Subscription> atomicReference = this.f78044r0;
            Subscription subscription = atomicReference.get();
            if (subscription == this || subscription == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
            do {
                if (atomicReference.compareAndSet(subscription, subscriptionHelper)) {
                    if (subscription != null) {
                        subscription.cancel();
                    }
                    countDown();
                    return true;
                }
            } while (atomicReference.get() == subscription);
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j10, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th2 = this.f78043q0;
            if (th2 == null) {
                return this.f78042p0;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
    }
}
