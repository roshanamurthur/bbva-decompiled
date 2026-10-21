package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends io.reactivex.internal.operators.flowable.a<T, Flowable<T>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<B> f71397q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super B, ? extends Publisher<V>> f71398r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f71399s0;

    public static final class a<T, V> extends DisposableSubscriber<V> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c<T, ?, V> f71400q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final UnicastProcessor<T> f71401r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f71402s0;

        public a(c<T, ?, V> cVar, UnicastProcessor<T> unicastProcessor) {
            this.f71400q0 = cVar;
            this.f71401r0 = unicastProcessor;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71402s0) {
                return;
            }
            this.f71402s0 = true;
            this.f71400q0.a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71402s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f71402s0 = true;
                this.f71400q0.c(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(V v3) {
            cancel();
            onComplete();
        }
    }

    public static final class b<T, B> extends DisposableSubscriber<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c<T, B, ?> f71403q0;

        public b(c<T, B, ?> cVar) {
            this.f71403q0 = cVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71403q0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71403q0.c(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b10) {
            this.f71403q0.d(b10);
        }
    }

    public static final class c<T, B, V> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription {
        public final AtomicBoolean E0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Publisher<B> f71404r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Function<? super B, ? extends Publisher<V>> f71405s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f71406t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final CompositeDisposable f71407u0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicReference<Disposable> f71408w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final ArrayList f71409x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicLong f71410y0;

        public c(SerializedSubscriber serializedSubscriber, Publisher publisher, Function function, int i10) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f71408w0 = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f71410y0 = atomicLong;
            this.E0 = new AtomicBoolean();
            this.f71404r0 = publisher;
            this.f71405s0 = function;
            this.f71406t0 = i10;
            this.f71407u0 = new CompositeDisposable();
            this.f71409x0 = new ArrayList();
            atomicLong.lazySet(1L);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void a(a<T, V> aVar) {
            this.f71407u0.delete(aVar);
            this.queue.offer((U) new d(aVar.f71401r0, null));
            if (enter()) {
                b();
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final boolean accept(Subscriber<? super Flowable<T>> subscriber, Object obj) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            SimpleQueue simpleQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            ArrayList arrayList = this.f71409x0;
            int iLeave = 1;
            while (true) {
                boolean z10 = this.done;
                Object objPoll = simpleQueue.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    this.f71407u0.dispose();
                    DisposableHelper.dispose(this.f71408w0);
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((UnicastProcessor) it.next()).onError(th2);
                        }
                    } else {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((UnicastProcessor) it2.next()).onComplete();
                        }
                    }
                    arrayList.clear();
                    return;
                }
                if (z11) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll instanceof d) {
                    d dVar = (d) objPoll;
                    UnicastProcessor<T> unicastProcessor = dVar.f71411a;
                    if (unicastProcessor != null) {
                        if (arrayList.remove(unicastProcessor)) {
                            dVar.f71411a.onComplete();
                            if (this.f71410y0.decrementAndGet() == 0) {
                                this.f71407u0.dispose();
                                DisposableHelper.dispose(this.f71408w0);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.E0.get()) {
                        UnicastProcessor unicastProcessorCreate = UnicastProcessor.create(this.f71406t0);
                        long jRequested = requested();
                        if (jRequested != 0) {
                            arrayList.add(unicastProcessorCreate);
                            subscriber.onNext(unicastProcessorCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            try {
                                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f71405s0.apply(dVar.f71412b), "The publisher supplied is null");
                                a aVar = new a(this, unicastProcessorCreate);
                                if (this.f71407u0.add(aVar)) {
                                    this.f71410y0.getAndIncrement();
                                    publisher.subscribe(aVar);
                                }
                            } catch (Throwable th3) {
                                cancel();
                                subscriber.onError(th3);
                            }
                        } else {
                            cancel();
                            subscriber.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((UnicastProcessor) it3.next()).onNext(NotificationLite.getValue(objPoll));
                    }
                }
            }
        }

        public final void c(Throwable th2) {
            this.v0.cancel();
            this.f71407u0.dispose();
            DisposableHelper.dispose(this.f71408w0);
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.E0.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.f71408w0);
                if (this.f71410y0.decrementAndGet() == 0) {
                    this.v0.cancel();
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void d(B b10) {
            this.queue.offer((U) new d(null, b10));
            if (enter()) {
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                b();
            }
            if (this.f71410y0.decrementAndGet() == 0) {
                this.f71407u0.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            if (enter()) {
                b();
            }
            if (this.f71410y0.decrementAndGet() == 0) {
                this.f71407u0.dispose();
            }
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (fastEnter()) {
                Iterator it = this.f71409x0.iterator();
                while (it.hasNext()) {
                    ((UnicastProcessor) it.next()).onNext(t10);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t10));
                if (!enter()) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.downstream.onSubscribe(this);
                if (this.E0.get()) {
                    return;
                }
                b bVar = new b(this);
                AtomicReference<Disposable> atomicReference = this.f71408w0;
                while (!atomicReference.compareAndSet(null, bVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                subscription.request(Long.MAX_VALUE);
                this.f71404r0.subscribe(bVar);
            }
        }
    }

    public static final class d<T, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnicastProcessor<T> f71411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f71412b;

        public d(UnicastProcessor<T> unicastProcessor, B b10) {
            this.f71411a = unicastProcessor;
            this.f71412b = b10;
        }
    }

    public FlowableWindowBoundarySelector(Flowable<T> flowable, Publisher<B> publisher, Function<? super B, ? extends Publisher<V>> function, int i10) {
        super(flowable);
        this.f71397q0 = publisher;
        this.f71398r0 = function;
        this.f71399s0 = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber) new c(new SerializedSubscriber(subscriber), this.f71397q0, this.f71398r0, this.f71399s0));
    }
}
