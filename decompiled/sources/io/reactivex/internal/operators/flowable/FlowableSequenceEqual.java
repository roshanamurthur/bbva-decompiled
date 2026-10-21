package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSequenceEqual<T> extends Flowable<Boolean> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T> f71113q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Publisher<? extends T> f71114r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BiPredicate<? super T, ? super T> f71115s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f71116t0;

    public static final class a<T> extends DeferredScalarSubscription<Boolean> implements b {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiPredicate<? super T, ? super T> f71117p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c<T> f71118q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c<T> f71119r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f71120s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f71121t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public T f71122u0;
        public T v0;

        public a(Subscriber<? super Boolean> subscriber, int i10, BiPredicate<? super T, ? super T> biPredicate) {
            super(subscriber);
            this.f71117p0 = biPredicate;
            this.f71121t0 = new AtomicInteger();
            this.f71118q0 = new c<>(this, i10);
            this.f71119r0 = new c<>(this, i10);
            this.f71120s0 = new AtomicThrowable();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.b
        public final void a(Throwable th2) {
            if (this.f71120s0.addThrowable(th2)) {
                drain();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            c<T> cVar = this.f71118q0;
            cVar.getClass();
            SubscriptionHelper.cancel(cVar);
            c<T> cVar2 = this.f71119r0;
            cVar2.getClass();
            SubscriptionHelper.cancel(cVar2);
            if (this.f71121t0.getAndIncrement() == 0) {
                cVar.a();
                cVar2.a();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.b
        public final void drain() {
            if (this.f71121t0.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue<T> simpleQueue = this.f71118q0.f71127t0;
                SimpleQueue<T> simpleQueue2 = this.f71119r0.f71127t0;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (true) {
                        if (isCancelled()) {
                            this.f71118q0.a();
                            this.f71119r0.a();
                            return;
                        }
                        if (this.f71120s0.get() != null) {
                            e();
                            this.downstream.onError(this.f71120s0.terminate());
                            return;
                        }
                        boolean z10 = this.f71118q0.f71128u0;
                        T tPoll = this.f71122u0;
                        if (tPoll == null) {
                            try {
                                tPoll = simpleQueue.poll();
                                this.f71122u0 = tPoll;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                e();
                                this.f71120s0.addThrowable(th2);
                                this.downstream.onError(this.f71120s0.terminate());
                                return;
                            }
                        }
                        boolean z11 = tPoll == null;
                        boolean z12 = this.f71119r0.f71128u0;
                        T tPoll2 = this.v0;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = simpleQueue2.poll();
                                this.v0 = tPoll2;
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                e();
                                this.f71120s0.addThrowable(th3);
                                this.downstream.onError(this.f71120s0.terminate());
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
                            if (!this.f71117p0.test(tPoll, tPoll2)) {
                                e();
                                complete(Boolean.FALSE);
                                return;
                            } else {
                                this.f71122u0 = null;
                                this.v0 = null;
                                this.f71118q0.b();
                                this.f71119r0.b();
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            e();
                            this.f71120s0.addThrowable(th4);
                            this.downstream.onError(this.f71120s0.terminate());
                            return;
                        }
                    }
                } else if (isCancelled()) {
                    this.f71118q0.a();
                    this.f71119r0.a();
                    return;
                } else if (this.f71120s0.get() != null) {
                    e();
                    this.downstream.onError(this.f71120s0.terminate());
                    return;
                }
                iAddAndGet = this.f71121t0.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final void e() {
            c<T> cVar = this.f71118q0;
            cVar.getClass();
            SubscriptionHelper.cancel(cVar);
            cVar.a();
            c<T> cVar2 = this.f71119r0;
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
        public final b f71123p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f71124q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f71125r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f71126s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile SimpleQueue<T> f71127t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f71128u0;
        public int v0;

        public c(b bVar, int i10) {
            this.f71123p0 = bVar;
            this.f71125r0 = i10 - (i10 >> 2);
            this.f71124q0 = i10;
        }

        public final void a() {
            SimpleQueue<T> simpleQueue = this.f71127t0;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        public final void b() {
            if (this.v0 != 1) {
                long j10 = this.f71126s0 + 1;
                if (j10 < this.f71125r0) {
                    this.f71126s0 = j10;
                } else {
                    this.f71126s0 = 0L;
                    get().request(j10);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71128u0 = true;
            this.f71123p0.drain();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71123p0.a(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.v0 != 0 || this.f71127t0.offer(t10)) {
                this.f71123p0.drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.v0 = iRequestFusion;
                        this.f71127t0 = queueSubscription;
                        this.f71128u0 = true;
                        this.f71123p0.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.v0 = iRequestFusion;
                        this.f71127t0 = queueSubscription;
                        subscription.request(this.f71124q0);
                        return;
                    }
                }
                this.f71127t0 = new SpscArrayQueue(this.f71124q0);
                subscription.request(this.f71124q0);
            }
        }
    }

    public FlowableSequenceEqual(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, BiPredicate<? super T, ? super T> biPredicate, int i10) {
        this.f71113q0 = publisher;
        this.f71114r0 = publisher2;
        this.f71115s0 = biPredicate;
        this.f71116t0 = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Boolean> subscriber) {
        a aVar = new a(subscriber, this.f71116t0, this.f71115s0);
        subscriber.onSubscribe(aVar);
        this.f71113q0.subscribe(aVar.f71118q0);
        this.f71114r0.subscribe(aVar.f71119r0);
    }
}
