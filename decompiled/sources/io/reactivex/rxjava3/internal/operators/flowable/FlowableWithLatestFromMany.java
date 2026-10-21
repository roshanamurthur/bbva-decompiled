package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableWithLatestFromMany<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final Publisher<?>[] f75699q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final Iterable<? extends Publisher<?>> f75700r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Function<? super Object[], R> f75701s0;

    public final class a implements Function<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // io.reactivex.rxjava3.functions.Function
        public final R apply(T t10) throws Throwable {
            R rApply = FlowableWithLatestFromMany.this.f75701s0.apply(new Object[]{t10});
            Objects.requireNonNull(rApply, "The combiner returned a null value");
            return rApply;
        }
    }

    public static final class b<T, R> extends AtomicInteger implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f75703p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Object[], R> f75704q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c[] f75705r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReferenceArray<Object> f75706s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Subscription> f75707t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicLong f75708u0;
        public final AtomicThrowable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f75709w0;

        public b(Subscriber<? super R> subscriber, Function<? super Object[], R> function, int i10) {
            this.f75703p0 = subscriber;
            this.f75704q0 = function;
            c[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c(this, i11);
            }
            this.f75705r0 = cVarArr;
            this.f75706s0 = new AtomicReferenceArray<>(i10);
            this.f75707t0 = new AtomicReference<>();
            this.f75708u0 = new AtomicLong();
            this.v0 = new AtomicThrowable();
        }

        public final void a(int i10) {
            int i11 = 0;
            while (true) {
                c[] cVarArr = this.f75705r0;
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
            SubscriptionHelper.cancel(this.f75707t0);
            for (c cVar : this.f75705r0) {
                cVar.getClass();
                SubscriptionHelper.cancel(cVar);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75709w0) {
                return;
            }
            this.f75709w0 = true;
            a(-1);
            HalfSerializer.onComplete(this.f75703p0, this, this.v0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75709w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f75709w0 = true;
            a(-1);
            HalfSerializer.onError(this.f75703p0, th2, this, this.v0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10) || this.f75709w0) {
                return;
            }
            this.f75707t0.get().request(1L);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f75707t0, this.f75708u0, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f75707t0, this.f75708u0, j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.f75709w0) {
                return false;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f75706s0;
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
                R rApply = this.f75704q0.apply(objArr);
                Objects.requireNonNull(rApply, "The combiner returned a null value");
                HalfSerializer.onNext(this.f75703p0, rApply, this, this.v0);
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
        public final b<?, ?> f75710p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f75711q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f75712r0;

        public c(b<?, ?> bVar, int i10) {
            this.f75710p0 = bVar;
            this.f75711q0 = i10;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            b<?, ?> bVar = this.f75710p0;
            int i10 = this.f75711q0;
            if (this.f75712r0) {
                bVar.getClass();
                return;
            }
            bVar.f75709w0 = true;
            SubscriptionHelper.cancel(bVar.f75707t0);
            bVar.a(i10);
            HalfSerializer.onComplete(bVar.f75703p0, bVar, bVar.v0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            b<?, ?> bVar = this.f75710p0;
            int i10 = this.f75711q0;
            bVar.f75709w0 = true;
            SubscriptionHelper.cancel(bVar.f75707t0);
            bVar.a(i10);
            HalfSerializer.onError(bVar.f75703p0, th2, bVar, bVar.v0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (!this.f75712r0) {
                this.f75712r0 = true;
            }
            this.f75710p0.f75706s0.set(this.f75711q0, obj);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public FlowableWithLatestFromMany(@NonNull Flowable<T> flowable, @NonNull Publisher<?>[] publisherArr, Function<? super Object[], R> function) {
        super(flowable);
        this.f75699q0 = publisherArr;
        this.f75700r0 = null;
        this.f75701s0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        int length;
        Publisher<?>[] publisherArr = this.f75699q0;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            try {
                length = 0;
                for (Publisher<?> publisher : this.f75700r0) {
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
        b bVar = new b(subscriber, this.f75701s0, length);
        subscriber.onSubscribe(bVar);
        AtomicReference<Subscription> atomicReference = bVar.f75707t0;
        for (int i11 = 0; i11 < length && atomicReference.get() != SubscriptionHelper.CANCELLED; i11++) {
            publisherArr[i11].subscribe(bVar.f75705r0[i11]);
        }
        this.source.subscribe((FlowableSubscriber) bVar);
    }

    public FlowableWithLatestFromMany(@NonNull Flowable<T> flowable, @NonNull Iterable<? extends Publisher<?>> iterable, @NonNull Function<? super Object[], R> function) {
        super(flowable);
        this.f75699q0 = null;
        this.f75700r0 = iterable;
        this.f75701s0 = function;
    }
}
