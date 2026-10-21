package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.GroupedFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.EmptyComponent;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableGroupBy<T, K, V> extends io.reactivex.internal.operators.flowable.a<T, GroupedFlowable<K, V>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends K> f70676q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends V> f70677r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f70678s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f70679t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Function<? super Consumer<Object>, ? extends Map<K, Object>> f70680u0;

    public static final class GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<GroupedFlowable<K, V>> implements FlowableSubscriber<T> {
        public static final Object K0 = new Object();
        public Throwable G0;
        public volatile boolean H0;
        public boolean I0;
        public boolean J0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super GroupedFlowable<K, V>> f70681p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends K> f70682q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends V> f70683r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f70684s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f70685t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final Map<Object, b<K, V>> f70686u0;
        public final SpscLinkedArrayQueue<GroupedFlowable<K, V>> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Queue<b<K, V>> f70687w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f70688x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicBoolean f70689y0 = new AtomicBoolean();
        public final AtomicLong E0 = new AtomicLong();
        public final AtomicInteger F0 = new AtomicInteger(1);

        public GroupBySubscriber(Subscriber<? super GroupedFlowable<K, V>> subscriber, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i10, boolean z10, Map<Object, b<K, V>> map, Queue<b<K, V>> queue) {
            this.f70681p0 = subscriber;
            this.f70682q0 = function;
            this.f70683r0 = function2;
            this.f70684s0 = i10;
            this.f70685t0 = z10;
            this.f70686u0 = map;
            this.f70687w0 = queue;
            this.v0 = new SpscLinkedArrayQueue<>(i10);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f70689y0.compareAndSet(false, true)) {
                f();
                if (this.F0.decrementAndGet() == 0) {
                    this.f70688x0.cancel();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.v0.clear();
        }

        public final void drain() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            if (this.J0) {
                SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.v0;
                Subscriber<? super GroupedFlowable<K, V>> subscriber = this.f70681p0;
                while (!this.f70689y0.get()) {
                    boolean z10 = this.H0;
                    if (z10 && !this.f70685t0 && (th2 = this.G0) != null) {
                        spscLinkedArrayQueue.clear();
                        subscriber.onError(th2);
                        return;
                    }
                    subscriber.onNext(null);
                    if (z10) {
                        Throwable th3 = this.G0;
                        if (th3 != null) {
                            subscriber.onError(th3);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                return;
            }
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue2 = this.v0;
            Subscriber<? super GroupedFlowable<K, V>> subscriber2 = this.f70681p0;
            int iAddAndGet2 = 1;
            do {
                long j10 = this.E0.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z11 = this.H0;
                    GroupedFlowable<K, V> groupedFlowablePoll = spscLinkedArrayQueue2.poll();
                    boolean z12 = groupedFlowablePoll == null;
                    if (e(z11, z12, subscriber2, spscLinkedArrayQueue2)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    subscriber2.onNext(groupedFlowablePoll);
                    j11++;
                }
                if (j11 == j10 && e(this.H0, spscLinkedArrayQueue2.isEmpty(), subscriber2, spscLinkedArrayQueue2)) {
                    return;
                }
                if (j11 != 0) {
                    if (j10 != Long.MAX_VALUE) {
                        this.E0.addAndGet(-j11);
                    }
                    this.f70688x0.request(j11);
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
            } while (iAddAndGet2 != 0);
        }

        public final boolean e(boolean z10, boolean z11, Subscriber<?> subscriber, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.f70689y0.get()) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (this.f70685t0) {
                if (!z10 || !z11) {
                    return false;
                }
                Throwable th2 = this.G0;
                if (th2 != null) {
                    subscriber.onError(th2);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th3 = this.G0;
            if (th3 != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        public final void f() {
            Queue<b<K, V>> queue = this.f70687w0;
            if (queue != null) {
                int i10 = 0;
                while (true) {
                    b<K, V> bVarPoll = queue.poll();
                    if (bVarPoll == null) {
                        break;
                    }
                    c<V, K> cVar = bVarPoll.f70692r0;
                    cVar.f70698u0 = true;
                    cVar.drain();
                    i10++;
                }
                if (i10 != 0) {
                    this.F0.addAndGet(-i10);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.v0.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.I0) {
                return;
            }
            Iterator<b<K, V>> it = this.f70686u0.values().iterator();
            while (it.hasNext()) {
                c<V, K> cVar = it.next().f70692r0;
                cVar.f70698u0 = true;
                cVar.drain();
            }
            this.f70686u0.clear();
            Queue<b<K, V>> queue = this.f70687w0;
            if (queue != null) {
                queue.clear();
            }
            this.I0 = true;
            this.H0 = true;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.I0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.I0 = true;
            Iterator<b<K, V>> it = this.f70686u0.values().iterator();
            while (it.hasNext()) {
                c<V, K> cVar = it.next().f70692r0;
                cVar.v0 = th2;
                cVar.f70698u0 = true;
                cVar.drain();
            }
            this.f70686u0.clear();
            Queue<b<K, V>> queue = this.f70687w0;
            if (queue != null) {
                queue.clear();
            }
            this.G0 = th2;
            this.H0 = true;
            drain();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t10) {
            boolean z10;
            if (this.I0) {
                return;
            }
            try {
                K kApply = this.f70682q0.apply(t10);
                Object obj = kApply != null ? kApply : K0;
                Map<Object, b<K, V>> map = this.f70686u0;
                b<K, V> bVar = map.get(obj);
                if (bVar != null) {
                    z10 = false;
                } else {
                    if (this.f70689y0.get()) {
                        return;
                    }
                    int i10 = b.f70691s0;
                    b<K, V> bVar2 = new b<>(kApply, new c(this.f70684s0, this, kApply, this.f70685t0));
                    map.put(obj, bVar2);
                    this.F0.getAndIncrement();
                    z10 = true;
                    bVar = bVar2;
                }
                try {
                    Object objRequireNonNull = ObjectHelper.requireNonNull(this.f70683r0.apply(t10), "The valueSelector returned null");
                    c<V, K> cVar = bVar.f70692r0;
                    cVar.f70694q0.offer((T) objRequireNonNull);
                    cVar.drain();
                    f();
                    if (z10) {
                        this.v0.offer(bVar);
                        drain();
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f70688x0.cancel();
                    onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f70688x0.cancel();
                onError(th3);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70688x0, subscription)) {
                this.f70688x0 = subscription;
                this.f70681p0.onSubscribe(this);
                subscription.request(this.f70684s0);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.E0, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.J0 = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public GroupedFlowable<K, V> poll() {
            return this.v0.poll();
        }

        public void cancel(K k10) {
            if (k10 == null) {
                k10 = (K) K0;
            }
            this.f70686u0.remove(k10);
            if (this.F0.decrementAndGet() == 0) {
                this.f70688x0.cancel();
                if (this.J0 || getAndIncrement() != 0) {
                    return;
                }
                this.v0.clear();
            }
        }
    }

    public static final class a<K, V> implements Consumer<b<K, V>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Queue<b<K, V>> f70690p0;

        public a(ConcurrentLinkedQueue concurrentLinkedQueue) {
            this.f70690p0 = concurrentLinkedQueue;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) throws Exception {
            this.f70690p0.offer((b) obj);
        }
    }

    public static final class b<K, T> extends GroupedFlowable<K, T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final /* synthetic */ int f70691s0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c<T, K> f70692r0;

        public b(K k10, c<T, K> cVar) {
            super(k10);
            this.f70692r0 = cVar;
        }

        @Override // io.reactivex.Flowable
        public final void subscribeActual(Subscriber<? super T> subscriber) {
            this.f70692r0.subscribe(subscriber);
        }
    }

    public static final class c<T, K> extends BasicIntQueueSubscription<T> implements Publisher<T> {
        public boolean E0;
        public int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final K f70693p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f70694q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final GroupBySubscriber<?, K, T> f70695r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f70696s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f70698u0;
        public Throwable v0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f70697t0 = new AtomicLong();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicBoolean f70699w0 = new AtomicBoolean();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<Subscriber<? super T>> f70700x0 = new AtomicReference<>();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicBoolean f70701y0 = new AtomicBoolean();

        public c(int i10, GroupBySubscriber<?, K, T> groupBySubscriber, K k10, boolean z10) {
            this.f70694q0 = new SpscLinkedArrayQueue<>(i10);
            this.f70695r0 = groupBySubscriber;
            this.f70693p0 = k10;
            this.f70696s0 = z10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f70699w0.compareAndSet(false, true)) {
                this.f70695r0.cancel(this.f70693p0);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            while (this.f70694q0.poll() != null) {
                this.F0++;
            }
            f();
        }

        public final void drain() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.E0) {
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f70694q0;
                Subscriber<? super T> subscriber = this.f70700x0.get();
                int iAddAndGet = 1;
                while (true) {
                    if (subscriber != null) {
                        if (this.f70699w0.get()) {
                            return;
                        }
                        boolean z10 = this.f70698u0;
                        if (z10 && !this.f70696s0 && (th2 = this.v0) != null) {
                            spscLinkedArrayQueue.clear();
                            subscriber.onError(th2);
                            return;
                        }
                        subscriber.onNext(null);
                        if (z10) {
                            Throwable th3 = this.v0;
                            if (th3 != null) {
                                subscriber.onError(th3);
                                return;
                            } else {
                                subscriber.onComplete();
                                return;
                            }
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                    if (subscriber == null) {
                        subscriber = this.f70700x0.get();
                    }
                }
            } else {
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = this.f70694q0;
                boolean z11 = this.f70696s0;
                Subscriber<? super T> subscriber2 = this.f70700x0.get();
                int iAddAndGet2 = 1;
                while (true) {
                    if (subscriber2 != null) {
                        long j10 = this.f70697t0.get();
                        long j11 = 0;
                        while (j11 != j10) {
                            boolean z12 = this.f70698u0;
                            T tPoll = spscLinkedArrayQueue2.poll();
                            boolean z13 = tPoll == null;
                            long j12 = j11;
                            if (e(z12, z13, subscriber2, z11, j11)) {
                                return;
                            }
                            if (z13) {
                                j11 = j12;
                                break;
                            } else {
                                subscriber2.onNext(tPoll);
                                j11 = j12 + 1;
                            }
                        }
                        if (j11 == j10) {
                            long j13 = j11;
                            if (e(this.f70698u0, spscLinkedArrayQueue2.isEmpty(), subscriber2, z11, j11)) {
                                return;
                            } else {
                                j11 = j13;
                            }
                        }
                        if (j11 != 0) {
                            if (j10 != Long.MAX_VALUE) {
                                this.f70697t0.addAndGet(-j11);
                            }
                            this.f70695r0.f70688x0.request(j11);
                        }
                    }
                    iAddAndGet2 = addAndGet(-iAddAndGet2);
                    if (iAddAndGet2 == 0) {
                        return;
                    }
                    if (subscriber2 == null) {
                        subscriber2 = this.f70700x0.get();
                    }
                }
            }
        }

        public final boolean e(boolean z10, boolean z11, Subscriber<? super T> subscriber, boolean z12, long j10) {
            boolean z13 = this.f70699w0.get();
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f70694q0;
            if (z13) {
                while (spscLinkedArrayQueue.poll() != null) {
                    j10++;
                }
                if (j10 != 0) {
                    this.f70695r0.f70688x0.request(j10);
                }
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.v0;
                if (th2 != null) {
                    subscriber.onError(th2);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            Throwable th3 = this.v0;
            if (th3 != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        public final void f() {
            int i10 = this.F0;
            if (i10 != 0) {
                this.F0 = 0;
                this.f70695r0.f70688x0.request(i10);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            if (!this.f70694q0.isEmpty()) {
                return false;
            }
            f();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            T tPoll = this.f70694q0.poll();
            if (tPoll != null) {
                this.F0++;
                return tPoll;
            }
            f();
            return null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f70697t0, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.E0 = true;
            return 2;
        }

        @Override // org.reactivestreams.Publisher
        public final void subscribe(Subscriber<? super T> subscriber) {
            if (!this.f70701y0.compareAndSet(false, true)) {
                EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), subscriber);
                return;
            }
            subscriber.onSubscribe(this);
            this.f70700x0.lazySet(subscriber);
            drain();
        }
    }

    public FlowableGroupBy(Flowable<T> flowable, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i10, boolean z10, Function<? super Consumer<Object>, ? extends Map<K, Object>> function3) {
        super(flowable);
        this.f70676q0 = function;
        this.f70677r0 = function2;
        this.f70678s0 = i10;
        this.f70679t0 = z10;
        this.f70680u0 = function3;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super GroupedFlowable<K, V>> subscriber) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> mapApply;
        Function<? super Consumer<Object>, ? extends Map<K, Object>> function = this.f70680u0;
        try {
            if (function == null) {
                mapApply = new ConcurrentHashMap<>();
                concurrentLinkedQueue = null;
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                mapApply = function.apply(new a(concurrentLinkedQueue));
            }
            this.source.subscribe((FlowableSubscriber) new GroupBySubscriber(subscriber, this.f70676q0, this.f70677r0, this.f70678s0, this.f70679t0, mapApply, concurrentLinkedQueue));
        } catch (Exception e5) {
            Exceptions.throwIfFatal(e5);
            subscriber.onSubscribe(EmptyComponent.INSTANCE);
            subscriber.onError(e5);
        }
    }
}
