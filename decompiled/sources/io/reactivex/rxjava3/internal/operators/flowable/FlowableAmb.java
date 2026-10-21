package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableAmb<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T>[] f74456q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Iterable<? extends Publisher<? extends T>> f74457r0;

    public static final class a<T> implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74458p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T>[] f74459q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f74460r0 = new AtomicInteger();

        public a(Subscriber<? super T> subscriber, int i10) {
            this.f74458p0 = subscriber;
            this.f74459q0 = new b[i10];
        }

        public final boolean a(int i10) {
            AtomicInteger atomicInteger = this.f74460r0;
            int i11 = 0;
            if (atomicInteger.get() != 0 || !atomicInteger.compareAndSet(0, i10)) {
                return false;
            }
            b<T>[] bVarArr = this.f74459q0;
            int length = bVarArr.length;
            while (i11 < length) {
                int i12 = i11 + 1;
                if (i12 != i10) {
                    b<T> bVar = bVarArr[i11];
                    bVar.getClass();
                    SubscriptionHelper.cancel(bVar);
                }
                i11 = i12;
            }
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            AtomicInteger atomicInteger = this.f74460r0;
            if (atomicInteger.get() != -1) {
                atomicInteger.lazySet(-1);
                for (b<T> bVar : this.f74459q0) {
                    bVar.getClass();
                    SubscriptionHelper.cancel(bVar);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                int i10 = this.f74460r0.get();
                b<T>[] bVarArr = this.f74459q0;
                if (i10 > 0) {
                    bVarArr[i10 - 1].request(j10);
                    return;
                }
                if (i10 == 0) {
                    for (b<T> bVar : bVarArr) {
                        bVar.request(j10);
                    }
                }
            }
        }
    }

    public static final class b<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f74461p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f74462q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Subscriber<? super T> f74463r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74464s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f74465t0 = new AtomicLong();

        public b(a<T> aVar, int i10, Subscriber<? super T> subscriber) {
            this.f74461p0 = aVar;
            this.f74462q0 = i10;
            this.f74463r0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            boolean z10 = this.f74464s0;
            Subscriber<? super T> subscriber = this.f74463r0;
            if (z10) {
                subscriber.onComplete();
            } else if (!this.f74461p0.a(this.f74462q0)) {
                get().cancel();
            } else {
                this.f74464s0 = true;
                subscriber.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            boolean z10 = this.f74464s0;
            Subscriber<? super T> subscriber = this.f74463r0;
            if (z10) {
                subscriber.onError(th2);
            } else if (this.f74461p0.a(this.f74462q0)) {
                this.f74464s0 = true;
                subscriber.onError(th2);
            } else {
                get().cancel();
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            boolean z10 = this.f74464s0;
            Subscriber<? super T> subscriber = this.f74463r0;
            if (z10) {
                subscriber.onNext(t10);
            } else if (!this.f74461p0.a(this.f74462q0)) {
                get().cancel();
            } else {
                this.f74464s0 = true;
                subscriber.onNext(t10);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this, this.f74465t0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.f74465t0, j10);
        }
    }

    public FlowableAmb(Publisher<? extends T>[] publisherArr, Iterable<? extends Publisher<? extends T>> iterable) {
        this.f74456q0 = publisherArr;
        this.f74457r0 = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        int length;
        Subscriber<? super T> subscriber2;
        Publisher<? extends T>[] publisherArr = this.f74456q0;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            try {
                length = 0;
                for (Publisher<? extends T> publisher : this.f74457r0) {
                    if (publisher == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), subscriber);
                        return;
                    }
                    if (length == publisherArr.length) {
                        Publisher<? extends T>[] publisherArr2 = new Publisher[(length >> 2) + length];
                        System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                        publisherArr = publisherArr2;
                    }
                    int i10 = length + 1;
                    publisherArr[length] = publisher;
                    length = i10;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, subscriber);
                return;
            }
        } else {
            length = publisherArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(subscriber);
            return;
        }
        if (length == 1) {
            publisherArr[0].subscribe(subscriber);
            return;
        }
        a aVar = new a(subscriber, length);
        b<T>[] bVarArr = aVar.f74459q0;
        int length2 = bVarArr.length;
        int i11 = 0;
        while (true) {
            subscriber2 = aVar.f74458p0;
            if (i11 >= length2) {
                break;
            }
            int i12 = i11 + 1;
            bVarArr[i11] = new b<>(aVar, i12, subscriber2);
            i11 = i12;
        }
        AtomicInteger atomicInteger = aVar.f74460r0;
        atomicInteger.lazySet(0);
        subscriber2.onSubscribe(aVar);
        for (int i13 = 0; i13 < length2 && atomicInteger.get() == 0; i13++) {
            publisherArr[i13].subscribe(bVarArr[i13]);
        }
    }
}
