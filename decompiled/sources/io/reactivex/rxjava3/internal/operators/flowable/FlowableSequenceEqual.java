package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSequenceEqual<T> extends Flowable<Boolean> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T> f75371q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Publisher<? extends T> f75372r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BiPredicate<? super T, ? super T> f75373s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f75374t0;

    public static final class a<T> extends DeferredScalarSubscription<Boolean> implements b {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiPredicate<? super T, ? super T> f75375p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c<T> f75376q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c<T> f75377r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f75378s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f75379t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public T f75380u0;
        public T v0;

        public a(Subscriber<? super Boolean> subscriber, int i10, BiPredicate<? super T, ? super T> biPredicate) {
            super(subscriber);
            this.f75375p0 = biPredicate;
            this.f75379t0 = new AtomicInteger();
            this.f75376q0 = new c<>(this, i10);
            this.f75377r0 = new c<>(this, i10);
            this.f75378s0 = new AtomicThrowable();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual.b
        public final void a(Throwable th2) {
            if (this.f75378s0.tryAddThrowableOrReport(th2)) {
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            c<T> cVar = this.f75376q0;
            cVar.getClass();
            SubscriptionHelper.cancel(cVar);
            c<T> cVar2 = this.f75377r0;
            cVar2.getClass();
            SubscriptionHelper.cancel(cVar2);
            this.f75378s0.tryTerminateAndReport();
            if (this.f75379t0.getAndIncrement() == 0) {
                cVar.a();
                cVar2.a();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSequenceEqual.b
        public final void drain() {
            if (this.f75379t0.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue<T> simpleQueue = this.f75376q0.f75385t0;
                SimpleQueue<T> simpleQueue2 = this.f75377r0.f75385t0;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (true) {
                        if (isCancelled()) {
                            this.f75376q0.a();
                            this.f75377r0.a();
                            return;
                        }
                        if (this.f75378s0.get() != null) {
                            e();
                            this.f75378s0.tryTerminateConsumer(this.downstream);
                            return;
                        }
                        boolean z10 = this.f75376q0.f75386u0;
                        T tPoll = this.f75380u0;
                        if (tPoll == null) {
                            try {
                                tPoll = simpleQueue.poll();
                                this.f75380u0 = tPoll;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                e();
                                this.f75378s0.tryAddThrowableOrReport(th2);
                                this.f75378s0.tryTerminateConsumer(this.downstream);
                                return;
                            }
                        }
                        boolean z11 = tPoll == null;
                        boolean z12 = this.f75377r0.f75386u0;
                        T tPoll2 = this.v0;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = simpleQueue2.poll();
                                this.v0 = tPoll2;
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                e();
                                this.f75378s0.tryAddThrowableOrReport(th3);
                                this.f75378s0.tryTerminateConsumer(this.downstream);
                                return;
                            }
                        }
                        boolean z13 = tPoll2 == null;
                        if (z10 && z12 && z11 && z13) {
                            complete(Boolean.TRUE);
                            return;
                        }
                        if (z10 && z12 && z11 != z13) {
                            e();
                            complete(Boolean.FALSE);
                            return;
                        }
                        if (z11 || z13) {
                            break;
                        }
                        try {
                            if (!this.f75375p0.test(tPoll, tPoll2)) {
                                e();
                                complete(Boolean.FALSE);
                                return;
                            } else {
                                this.f75380u0 = null;
                                this.v0 = null;
                                this.f75376q0.b();
                                this.f75377r0.b();
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            e();
                            this.f75378s0.tryAddThrowableOrReport(th4);
                            this.f75378s0.tryTerminateConsumer(this.downstream);
                            return;
                        }
                    }
                } else if (isCancelled()) {
                    this.f75376q0.a();
                    this.f75377r0.a();
                    return;
                } else if (this.f75378s0.get() != null) {
                    e();
                    this.f75378s0.tryTerminateConsumer(this.downstream);
                    return;
                }
                iAddAndGet = this.f75379t0.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final void e() {
            c<T> cVar = this.f75376q0;
            cVar.getClass();
            SubscriptionHelper.cancel(cVar);
            cVar.a();
            c<T> cVar2 = this.f75377r0;
            cVar2.getClass();
            SubscriptionHelper.cancel(cVar2);
            cVar2.a();
        }
    }

    public interface b {
        void a(Throwable th2);

        void drain();
    }

    public static final class c<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b f75381p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f75382q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f75383r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f75384s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile SimpleQueue<T> f75385t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f75386u0;
        public int v0;

        public c(b bVar, int i10) {
            this.f75381p0 = bVar;
            this.f75383r0 = i10 - (i10 >> 2);
            this.f75382q0 = i10;
        }

        public final void a() {
            SimpleQueue<T> simpleQueue = this.f75385t0;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        public final void b() {
            if (this.v0 != 1) {
                long j10 = this.f75384s0 + 1;
                if (j10 < this.f75383r0) {
                    this.f75384s0 = j10;
                } else {
                    this.f75384s0 = 0L;
                    get().request(j10);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75386u0 = true;
            this.f75381p0.drain();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75381p0.a(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0 != 0 || this.f75385t0.offer(t10)) {
                this.f75381p0.drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.v0 = iRequestFusion;
                        this.f75385t0 = queueSubscription;
                        this.f75386u0 = true;
                        this.f75381p0.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.v0 = iRequestFusion;
                        this.f75385t0 = queueSubscription;
                        subscription.request(this.f75382q0);
                        return;
                    }
                }
                this.f75385t0 = new SpscArrayQueue(this.f75382q0);
                subscription.request(this.f75382q0);
            }
        }
    }

    public FlowableSequenceEqual(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, BiPredicate<? super T, ? super T> biPredicate, int i10) {
        this.f75371q0 = publisher;
        this.f75372r0 = publisher2;
        this.f75373s0 = biPredicate;
        this.f75374t0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super Boolean> subscriber) {
        a aVar = new a(subscriber, this.f75374t0, this.f75373s0);
        subscriber.onSubscribe(aVar);
        this.f75371q0.subscribe(aVar.f75376q0);
        this.f75372r0.subscribe(aVar.f75377r0);
    }
}
