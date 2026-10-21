package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnBackpressureLatest<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75157p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f75158q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f75159r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f75160s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f75161t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicLong f75162u0 = new AtomicLong();
        public final AtomicReference<T> v0 = new AtomicReference<>();

        public a(Subscriber<? super T> subscriber) {
            this.f75157p0 = subscriber;
        }

        public final boolean a(boolean z10, boolean z11, Subscriber<?> subscriber, AtomicReference<T> atomicReference) {
            if (this.f75161t0) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f75160s0;
            if (th2 != null) {
                atomicReference.lazySet(null);
                subscriber.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f75157p0;
            AtomicLong atomicLong = this.f75162u0;
            AtomicReference<T> atomicReference = this.v0;
            int iAddAndGet = 1;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 == atomicLong.get()) {
                        break;
                    }
                    boolean z10 = this.f75159r0;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (a(z10, z11, subscriber, atomicReference)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(andSet);
                    j10++;
                }
                if (j10 == atomicLong.get()) {
                    if (a(this.f75159r0, atomicReference.get() == null, subscriber, atomicReference)) {
                        return;
                    }
                }
                if (j10 != 0) {
                    BackpressureHelper.produced(atomicLong, j10);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f75161t0) {
                return;
            }
            this.f75161t0 = true;
            this.f75158q0.cancel();
            if (getAndIncrement() == 0) {
                this.v0.lazySet(null);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75159r0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75160s0 = th2;
            this.f75159r0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.v0.lazySet(t10);
            b();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75158q0, subscription)) {
                this.f75158q0 = subscription;
                this.f75157p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75162u0, j10);
                b();
            }
        }
    }

    public FlowableOnBackpressureLatest(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber));
    }
}
