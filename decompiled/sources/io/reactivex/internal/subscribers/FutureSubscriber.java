package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
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
    public T f73751p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Throwable f73752q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Subscription> f73753r0;

    public FutureSubscriber() {
        super(1);
        this.f73753r0 = new AtomicReference<>();
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
        Throwable th2 = this.f73752q0;
        if (th2 == null) {
            return this.f73751p0;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f73753r0.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f73751p0 == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while (true) {
            AtomicReference<Subscription> atomicReference = this.f73753r0;
            Subscription subscription = atomicReference.get();
            if (subscription == this || subscription == SubscriptionHelper.CANCELLED) {
                return;
            }
            do {
                if (atomicReference.compareAndSet(subscription, this)) {
                    countDown();
                    return;
                }
            } while (atomicReference.get() == subscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        while (true) {
            AtomicReference<Subscription> atomicReference = this.f73753r0;
            Subscription subscription = atomicReference.get();
            if (subscription == this || subscription == SubscriptionHelper.CANCELLED) {
                break;
            }
            this.f73752q0 = th2;
            do {
                if (atomicReference.compareAndSet(subscription, this)) {
                    countDown();
                    return;
                }
            } while (atomicReference.get() == subscription);
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f73751p0 == null) {
            this.f73751p0 = t10;
        } else {
            this.f73753r0.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this.f73753r0, subscription, Long.MAX_VALUE);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        SubscriptionHelper subscriptionHelper;
        while (true) {
            AtomicReference<Subscription> atomicReference = this.f73753r0;
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
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j10, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th2 = this.f73752q0;
            if (th2 == null) {
                return this.f73751p0;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
    }
}
