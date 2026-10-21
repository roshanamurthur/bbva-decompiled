package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<U> f74505q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Publisher<? extends Open> f74506r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Function<? super Open, ? extends Publisher<? extends Close>> f74507s0;

    public static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public volatile boolean E0;
        public long F0;
        public long H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super C> f74508p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Supplier<C> f74509q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Publisher<? extends Open> f74510r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Function<? super Open, ? extends Publisher<? extends Close>> f74511s0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f74515x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<C> f74516y0 = new SpscLinkedArrayQueue<>(Flowable.bufferSize());

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f74512t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicLong f74513u0 = new AtomicLong();
        public final AtomicReference<Subscription> v0 = new AtomicReference<>();
        public LinkedHashMap G0 = new LinkedHashMap();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicThrowable f74514w0 = new AtomicThrowable();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableBufferBoundary$a$a, reason: collision with other inner class name */
        public static final class C0365a<Open> extends AtomicReference<Subscription> implements FlowableSubscriber<Open>, Disposable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, ?, Open, ?> f74517p0;

            public C0365a(a<?, ?, Open, ?> aVar) {
                this.f74517p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                SubscriptionHelper.cancel(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return get() == SubscriptionHelper.CANCELLED;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                lazySet(SubscriptionHelper.CANCELLED);
                a<?, ?, Open, ?> aVar = this.f74517p0;
                aVar.f74512t0.delete(this);
                if (aVar.f74512t0.size() == 0) {
                    SubscriptionHelper.cancel(aVar.v0);
                    aVar.f74515x0 = true;
                    aVar.b();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th2) {
                lazySet(SubscriptionHelper.CANCELLED);
                a<?, ?, Open, ?> aVar = this.f74517p0;
                SubscriptionHelper.cancel(aVar.v0);
                aVar.f74512t0.delete(this);
                aVar.onError(th2);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Open open) {
                a<?, ?, Open, ?> aVar = this.f74517p0;
                aVar.getClass();
                try {
                    C c10 = aVar.f74509q0.get();
                    Objects.requireNonNull(c10, "The bufferSupplier returned a null Collection");
                    C c11 = c10;
                    Publisher<? extends Object> publisherApply = aVar.f74511s0.apply(open);
                    Objects.requireNonNull(publisherApply, "The bufferClose returned a null Publisher");
                    Publisher<? extends Object> publisher = publisherApply;
                    long j10 = aVar.F0;
                    aVar.F0 = 1 + j10;
                    synchronized (aVar) {
                        try {
                            LinkedHashMap linkedHashMap = aVar.G0;
                            if (linkedHashMap != null) {
                                linkedHashMap.put(Long.valueOf(j10), c11);
                                b bVar = new b(aVar, j10);
                                aVar.f74512t0.add(bVar);
                                publisher.subscribe(bVar);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    SubscriptionHelper.cancel(aVar.v0);
                    aVar.onError(th3);
                }
            }

            @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(Subscription subscription) {
                SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
            }
        }

        public a(Subscriber<? super C> subscriber, Publisher<? extends Open> publisher, Function<? super Open, ? extends Publisher<? extends Close>> function, Supplier<C> supplier) {
            this.f74508p0 = subscriber;
            this.f74509q0 = supplier;
            this.f74510r0 = publisher;
            this.f74511s0 = function;
        }

        public final void a(b<T, C> bVar, long j10) {
            boolean z10;
            this.f74512t0.delete(bVar);
            if (this.f74512t0.size() == 0) {
                SubscriptionHelper.cancel(this.v0);
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.G0;
                    if (linkedHashMap == null) {
                        return;
                    }
                    this.f74516y0.offer((C) linkedHashMap.remove(Long.valueOf(j10)));
                    if (z10) {
                        this.f74515x0 = true;
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            long j10 = this.H0;
            Subscriber<? super C> subscriber = this.f74508p0;
            SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.f74516y0;
            int iAddAndGet = 1;
            do {
                long j11 = this.f74513u0.get();
                while (j10 != j11) {
                    if (this.E0) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z10 = this.f74515x0;
                    if (z10 && this.f74514w0.get() != null) {
                        spscLinkedArrayQueue.clear();
                        this.f74514w0.tryTerminateConsumer(subscriber);
                        return;
                    }
                    C cPoll = spscLinkedArrayQueue.poll();
                    boolean z11 = cPoll == null;
                    if (z10 && z11) {
                        subscriber.onComplete();
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        subscriber.onNext(cPoll);
                        j10++;
                    }
                }
                if (j10 == j11) {
                    if (this.E0) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    if (this.f74515x0) {
                        if (this.f74514w0.get() != null) {
                            spscLinkedArrayQueue.clear();
                            this.f74514w0.tryTerminateConsumer(subscriber);
                            return;
                        } else if (spscLinkedArrayQueue.isEmpty()) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                this.H0 = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (SubscriptionHelper.cancel(this.v0)) {
                this.E0 = true;
                this.f74512t0.dispose();
                synchronized (this) {
                    this.G0 = null;
                }
                if (getAndIncrement() != 0) {
                    this.f74516y0.clear();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74512t0.dispose();
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.G0;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        this.f74516y0.offer((C) ((Collection) it.next()));
                    }
                    this.G0 = null;
                    this.f74515x0 = true;
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74514w0.tryAddThrowableOrReport(th2)) {
                this.f74512t0.dispose();
                synchronized (this) {
                    this.G0 = null;
                }
                this.f74515x0 = true;
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.G0;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.v0, subscription)) {
                C0365a c0365a = new C0365a(this);
                this.f74512t0.add(c0365a);
                this.f74510r0.subscribe(c0365a);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            BackpressureHelper.add(this.f74513u0, j10);
            b();
        }
    }

    public static final class b<T, C extends Collection<? super T>> extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T, C, ?, ?> f74518p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f74519q0;

        public b(a<T, C, ?, ?> aVar, long j10) {
            this.f74518p0 = aVar;
            this.f74519q0 = j10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f74518p0.a(this, this.f74519q0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.onError(th2);
                return;
            }
            lazySet(subscriptionHelper);
            a<T, C, ?, ?> aVar = this.f74518p0;
            SubscriptionHelper.cancel(aVar.v0);
            aVar.f74512t0.delete(this);
            aVar.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                subscription.cancel();
                this.f74518p0.a(this, this.f74519q0);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public FlowableBufferBoundary(Flowable<T> flowable, Publisher<? extends Open> publisher, Function<? super Open, ? extends Publisher<? extends Close>> function, Supplier<U> supplier) {
        super(flowable);
        this.f74506r0 = publisher;
        this.f74507s0 = function;
        this.f74505q0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        a aVar = new a(subscriber, this.f74506r0, this.f74507s0, this.f74505q0);
        subscriber.onSubscribe(aVar);
        this.source.subscribe((FlowableSubscriber) aVar);
    }
}
