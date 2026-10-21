package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableWithLatestFromMany<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final Publisher<?>[] f71467q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final Iterable<? extends Publisher<?>> f71468r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Function<? super Object[], R> f71469s0;

    public final class a implements Function<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // io.reactivex.functions.Function
        public final R apply(T t10) throws Exception {
            return (R) ObjectHelper.requireNonNull(FlowableWithLatestFromMany.this.f71469s0.apply(new Object[]{t10}), "The combiner returned a null value");
        }
    }

    public static final class b<T, R> extends AtomicInteger implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71471p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Object[], R> f71472q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c[] f71473r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReferenceArray<Object> f71474s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Subscription> f71475t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicLong f71476u0;
        public final AtomicThrowable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f71477w0;

        public b(Subscriber<? super R> subscriber, Function<? super Object[], R> function, int i10) {
            this.f71471p0 = subscriber;
            this.f71472q0 = function;
            c[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c(this, i11);
            }
            this.f71473r0 = cVarArr;
            this.f71474s0 = new AtomicReferenceArray<>(i10);
            this.f71475t0 = new AtomicReference<>();
            this.f71476u0 = new AtomicLong();
            this.v0 = new AtomicThrowable();
        }

        public final void a(int i10) {
            int i11 = 0;
            while (true) {
                c[] cVarArr = this.f71473r0;
                if (i11 >= cVarArr.length) {
                    return;
                }
                if (i11 != i10) {
                    c cVar = cVarArr[i11];
                    cVar.getClass();
                    SubscriptionHelper.cancel(cVar);
                }
                i11++;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.cancel(this.f71475t0);
            for (c cVar : this.f71473r0) {
                cVar.getClass();
                SubscriptionHelper.cancel(cVar);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71477w0) {
                return;
            }
            this.f71477w0 = true;
            a(-1);
            HalfSerializer.onComplete(this.f71471p0, this, this.v0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71477w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f71477w0 = true;
            a(-1);
            HalfSerializer.onError(this.f71471p0, th2, this, this.v0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f71477w0) {
                return;
            }
            this.f71475t0.get().request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f71475t0, this.f71476u0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f71475t0, this.f71476u0, j10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.f71477w0) {
                return false;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f71474s0;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            objArr[0] = t10;
            int i10 = 0;
            while (i10 < length) {
                Object obj = atomicReferenceArray.get(i10);
                if (obj == null) {
                    return false;
                }
                i10++;
                objArr[i10] = obj;
            }
            try {
                HalfSerializer.onNext(this.f71471p0, ObjectHelper.requireNonNull(this.f71472q0.apply(objArr), "The combiner returned a null value"), this, this.v0);
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
                return false;
            }
        }
    }

    public static final class c extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<?, ?> f71478p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f71479q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f71480r0;

        public c(b<?, ?> bVar, int i10) {
            this.f71478p0 = bVar;
            this.f71479q0 = i10;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            b<?, ?> bVar = this.f71478p0;
            int i10 = this.f71479q0;
            if (this.f71480r0) {
                bVar.getClass();
                return;
            }
            bVar.f71477w0 = true;
            SubscriptionHelper.cancel(bVar.f71475t0);
            bVar.a(i10);
            HalfSerializer.onComplete(bVar.f71471p0, bVar, bVar.v0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            b<?, ?> bVar = this.f71478p0;
            int i10 = this.f71479q0;
            bVar.f71477w0 = true;
            SubscriptionHelper.cancel(bVar.f71475t0);
            bVar.a(i10);
            HalfSerializer.onError(bVar.f71471p0, th2, bVar, bVar.v0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (!this.f71480r0) {
                this.f71480r0 = true;
            }
            this.f71478p0.f71474s0.set(this.f71479q0, obj);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public FlowableWithLatestFromMany(@NonNull Flowable<T> flowable, @NonNull Publisher<?>[] publisherArr, Function<? super Object[], R> function) {
        super(flowable);
        this.f71467q0 = publisherArr;
        this.f71468r0 = null;
        this.f71469s0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        int length;
        Publisher<?>[] publisherArr = this.f71467q0;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            try {
                length = 0;
                for (Publisher<?> publisher : this.f71468r0) {
                    if (length == publisherArr.length) {
                        publisherArr = (Publisher[]) Arrays.copyOf(publisherArr, (length >> 1) + length);
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
            new FlowableMap(this.source, new a()).subscribeActual(subscriber);
            return;
        }
        b bVar = new b(subscriber, this.f71469s0, length);
        subscriber.onSubscribe(bVar);
        AtomicReference<Subscription> atomicReference = bVar.f71475t0;
        for (int i11 = 0; i11 < length && atomicReference.get() != SubscriptionHelper.CANCELLED; i11++) {
            publisherArr[i11].subscribe(bVar.f71473r0[i11]);
        }
        this.source.subscribe((FlowableSubscriber) bVar);
    }

    public FlowableWithLatestFromMany(@NonNull Flowable<T> flowable, @NonNull Iterable<? extends Publisher<?>> iterable, @NonNull Function<? super Object[], R> function) {
        super(flowable);
        this.f71467q0 = null;
        this.f71468r0 = iterable;
        this.f71469s0 = function;
    }
}
