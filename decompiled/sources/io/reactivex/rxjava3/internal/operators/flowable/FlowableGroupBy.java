package io.reactivex.rxjava3.internal.operators.flowable;

import androidx.datastore.preferences.protobuf.e;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.flowables.GroupedFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.EmptyComponent;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
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

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableGroupBy<T, K, V> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, GroupedFlowable<K, V>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends K> f74952q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends V> f74953r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f74954s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f74955t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Function<? super Consumer<Object>, ? extends Map<K, Object>> f74956u0;

    public static final class a<K, V> implements Consumer<b<K, V>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Queue<b<K, V>> f74966p0;

        public a(ConcurrentLinkedQueue concurrentLinkedQueue) {
            this.f74966p0 = concurrentLinkedQueue;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) throws Throwable {
            this.f74966p0.offer((b) obj);
        }
    }

    public static final class b<K, T> extends GroupedFlowable<K, T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final /* synthetic */ int f74967s0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final c<T, K> f74968r0;

        public b(K k10, c<T, K> cVar) {
            super(k10);
            this.f74968r0 = cVar;
        }

        @Override // io.reactivex.rxjava3.core.Flowable
        public final void subscribeActual(Subscriber<? super T> subscriber) {
            this.f74968r0.subscribe(subscriber);
        }
    }

    public static final class c<T, K> extends BasicIntQueueSubscription<T> implements Publisher<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final K f74969p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f74970q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final GroupBySubscriber<?, K, T> f74971r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f74972s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f74974u0;
        public Throwable v0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f74977y0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f74973t0 = new AtomicLong();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicBoolean f74975w0 = new AtomicBoolean();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<Subscriber<? super T>> f74976x0 = new AtomicReference<>();
        public final AtomicInteger E0 = new AtomicInteger();
        public final AtomicBoolean F0 = new AtomicBoolean();

        public c(int i10, GroupBySubscriber<?, K, T> groupBySubscriber, K k10, boolean z10) {
            this.f74970q0 = new SpscLinkedArrayQueue<>(i10);
            this.f74971r0 = groupBySubscriber;
            this.f74969p0 = k10;
            this.f74972s0 = z10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f74975w0.compareAndSet(false, true)) {
                if ((this.E0.get() & 2) == 0 && this.F0.compareAndSet(false, true)) {
                    this.f74971r0.cancel(this.f74969p0);
                }
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            while (this.f74970q0.poll() != null) {
                this.f74977y0++;
            }
            h();
        }

        public final void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f74970q0;
            boolean z10 = this.f74972s0;
            Subscriber<? super T> subscriber = this.f74976x0.get();
            AtomicBoolean atomicBoolean = this.f74975w0;
            Subscriber<? super T> subscriber2 = subscriber;
            int iAddAndGet = 1;
            while (true) {
                boolean z11 = false;
                if (atomicBoolean.get()) {
                    long j10 = 0;
                    while (this.f74970q0.poll() != null) {
                        j10++;
                    }
                    f(j10, false);
                } else if (subscriber2 != null) {
                    long j11 = this.f74973t0.get();
                    long j12 = 0;
                    while (true) {
                        if (j12 != j11) {
                            boolean z12 = this.f74974u0;
                            T tPoll = spscLinkedArrayQueue.poll();
                            boolean z13 = tPoll == null ? true : z11;
                            long j13 = j12;
                            boolean z14 = z11;
                            if (e(z12, z13, subscriber2, z10, j12, !z13)) {
                                continue;
                            } else if (z13) {
                                j12 = j13;
                            } else {
                                subscriber2.onNext(tPoll);
                                j12 = j13 + 1;
                                z11 = z14;
                            }
                        }
                        if (j12 == j11) {
                            long j14 = j12;
                            if (e(this.f74974u0, spscLinkedArrayQueue.isEmpty(), subscriber2, z10, j12, false)) {
                                continue;
                            } else {
                                j12 = j14;
                            }
                        }
                        if (j12 != 0) {
                            BackpressureHelper.produced(this.f74973t0, j12);
                            g(j12);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (subscriber2 == null) {
                    subscriber2 = this.f74976x0.get();
                }
            }
        }

        public final boolean e(boolean z10, boolean z11, Subscriber<? super T> subscriber, boolean z12, long j10, boolean z13) {
            AtomicBoolean atomicBoolean = this.f74975w0;
            boolean z14 = atomicBoolean.get();
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f74970q0;
            if (z14) {
                while (spscLinkedArrayQueue.poll() != null) {
                    j10++;
                }
                f(j10, z13);
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                atomicBoolean.lazySet(true);
                Throwable th2 = this.v0;
                if (th2 != null) {
                    subscriber.onError(th2);
                } else {
                    subscriber.onComplete();
                    f(j10, z13);
                }
                return true;
            }
            Throwable th3 = this.v0;
            if (th3 != null) {
                spscLinkedArrayQueue.clear();
                atomicBoolean.lazySet(true);
                subscriber.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            atomicBoolean.lazySet(true);
            subscriber.onComplete();
            f(j10, z13);
            return true;
        }

        public final void f(long j10, boolean z10) {
            if (z10) {
                j10++;
            }
            if (j10 != 0) {
                g(j10);
            }
        }

        public final void g(long j10) {
            if ((this.E0.get() & 2) == 0) {
                this.f74971r0.b(j10);
            }
        }

        public final void h() {
            int i10 = this.f74977y0;
            if (i10 != 0) {
                this.f74977y0 = 0;
                g(i10);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            if (this.f74970q0.isEmpty()) {
                h();
                return true;
            }
            h();
            return false;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            T tPoll = this.f74970q0.poll();
            if (tPoll != null) {
                this.f74977y0++;
                return tPoll;
            }
            h();
            return null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f74973t0, j10);
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return 0;
        }

        @Override // org.reactivestreams.Publisher
        public final void subscribe(Subscriber<? super T> subscriber) {
            AtomicInteger atomicInteger;
            int i10;
            do {
                atomicInteger = this.E0;
                i10 = atomicInteger.get();
                if ((i10 & 1) != 0) {
                    EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), subscriber);
                    return;
                }
            } while (!atomicInteger.compareAndSet(i10, i10 | 1));
            subscriber.onSubscribe(this);
            AtomicReference<Subscriber<? super T>> atomicReference = this.f74976x0;
            atomicReference.lazySet(subscriber);
            if (this.f74975w0.get()) {
                atomicReference.lazySet(null);
            } else {
                drain();
            }
        }
    }

    public FlowableGroupBy(Flowable<T> flowable, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i10, boolean z10, Function<? super Consumer<Object>, ? extends Map<K, Object>> function3) {
        super(flowable);
        this.f74952q0 = function;
        this.f74953r0 = function2;
        this.f74954s0 = i10;
        this.f74955t0 = z10;
        this.f74956u0 = function3;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super GroupedFlowable<K, V>> subscriber) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> mapApply;
        Function<? super Consumer<Object>, ? extends Map<K, Object>> function = this.f74956u0;
        try {
            if (function == null) {
                mapApply = new ConcurrentHashMap<>();
                concurrentLinkedQueue = null;
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                mapApply = function.apply(new a(concurrentLinkedQueue));
            }
            this.source.subscribe((FlowableSubscriber) new GroupBySubscriber(subscriber, this.f74952q0, this.f74953r0, this.f74954s0, this.f74955t0, mapApply, concurrentLinkedQueue));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            subscriber.onSubscribe(EmptyComponent.INSTANCE);
            subscriber.onError(th2);
        }
    }

    public static final class GroupBySubscriber<T, K, V> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        public static final Object I0 = new Object();
        public long E0;
        public boolean H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super GroupedFlowable<K, V>> f74957p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends K> f74958q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends V> f74959r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f74960s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f74961t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f74962u0;
        public final Map<Object, b<K, V>> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Queue<b<K, V>> f74963w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f74964x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicBoolean f74965y0 = new AtomicBoolean();
        public final AtomicInteger F0 = new AtomicInteger(1);
        public final AtomicLong G0 = new AtomicLong();

        public GroupBySubscriber(Subscriber<? super GroupedFlowable<K, V>> subscriber, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i10, boolean z10, Map<Object, b<K, V>> map, Queue<b<K, V>> queue) {
            this.f74957p0 = subscriber;
            this.f74958q0 = function;
            this.f74959r0 = function2;
            this.f74960s0 = i10;
            this.f74961t0 = i10 - (i10 >> 2);
            this.f74962u0 = z10;
            this.v0 = map;
            this.f74963w0 = queue;
        }

        public final void a() {
            if (this.f74963w0 != null) {
                int i10 = 0;
                while (true) {
                    b<K, V> bVarPoll = this.f74963w0.poll();
                    if (bVarPoll == null) {
                        break;
                    }
                    c<V, K> cVar = bVarPoll.f74968r0;
                    boolean zCompareAndSet = cVar.F0.compareAndSet(false, true);
                    cVar.f74974u0 = true;
                    cVar.drain();
                    if (zCompareAndSet) {
                        i10++;
                    }
                }
                if (i10 != 0) {
                    this.F0.addAndGet(-i10);
                }
            }
        }

        public final void b(long j10) {
            long j11;
            long jAddCap;
            AtomicLong atomicLong = this.G0;
            do {
                j11 = atomicLong.get();
                jAddCap = BackpressureHelper.addCap(j11, j10);
            } while (!atomicLong.compareAndSet(j11, jAddCap));
            while (true) {
                long j12 = this.f74961t0;
                if (jAddCap < j12) {
                    return;
                }
                if (atomicLong.compareAndSet(jAddCap, jAddCap - j12)) {
                    this.f74964x0.request(j12);
                }
                jAddCap = atomicLong.get();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f74965y0.compareAndSet(false, true)) {
                a();
                if (this.F0.decrementAndGet() == 0) {
                    this.f74964x0.cancel();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.H0) {
                return;
            }
            Map<Object, b<K, V>> map = this.v0;
            Iterator<b<K, V>> it = map.values().iterator();
            while (it.hasNext()) {
                c<V, K> cVar = it.next().f74968r0;
                cVar.f74974u0 = true;
                cVar.drain();
            }
            map.clear();
            a();
            this.H0 = true;
            this.f74957p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.H0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.H0 = true;
            Iterator<b<K, V>> it = this.v0.values().iterator();
            while (it.hasNext()) {
                c<V, K> cVar = it.next().f74968r0;
                cVar.v0 = th2;
                cVar.f74974u0 = true;
                cVar.drain();
            }
            this.v0.clear();
            a();
            this.f74957p0.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t10) {
            boolean z10;
            Subscriber<? super GroupedFlowable<K, V>> subscriber = this.f74957p0;
            if (this.H0) {
                return;
            }
            try {
                K kApply = this.f74958q0.apply(t10);
                Object obj = kApply != null ? kApply : I0;
                Map<Object, b<K, V>> map = this.v0;
                b<K, V> bVar = map.get(obj);
                if (bVar != null) {
                    z10 = false;
                } else {
                    if (this.f74965y0.get()) {
                        return;
                    }
                    int i10 = b.f74967s0;
                    b<K, V> bVar2 = new b<>(kApply, new c(this.f74960s0, this, kApply, this.f74962u0));
                    map.put(obj, bVar2);
                    this.F0.getAndIncrement();
                    z10 = true;
                    bVar = bVar2;
                }
                try {
                    c<V, K> cVar = bVar.f74968r0;
                    cVar.f74970q0.offer((T) ExceptionHelper.nullCheck(this.f74959r0.apply(t10), "The valueSelector returned a null value."));
                    cVar.drain();
                    a();
                    if (z10) {
                        if (this.E0 == get()) {
                            this.f74964x0.cancel();
                            onError(new MissingBackpressureException(e.f("Unable to emit a new group (#", this.E0, ") due to lack of requests. Please make sure the downstream can always accept a new group as well as each group is consumed in order for the whole operator to be able to proceed.")));
                            return;
                        }
                        this.E0++;
                        subscriber.onNext(bVar);
                        AtomicInteger atomicInteger = cVar.E0;
                        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 2)) {
                            cancel(kApply);
                            c<V, K> cVar2 = bVar.f74968r0;
                            cVar2.f74974u0 = true;
                            cVar2.drain();
                            b(1L);
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f74964x0.cancel();
                    if (z10) {
                        if (this.E0 == get()) {
                            MissingBackpressureException missingBackpressureException = new MissingBackpressureException(e.f("Unable to emit a new group (#", this.E0, ") due to lack of requests. Please make sure the downstream can always accept a new group as well as each group is consumed in order for the whole operator to be able to proceed."));
                            missingBackpressureException.initCause(th2);
                            onError(missingBackpressureException);
                            return;
                        }
                        subscriber.onNext(bVar);
                    }
                    onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f74964x0.cancel();
                onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74964x0, subscription)) {
                this.f74964x0 = subscription;
                this.f74957p0.onSubscribe(this);
                subscription.request(this.f74960s0);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }

        public void cancel(K k10) {
            if (k10 == null) {
                k10 = (K) I0;
            }
            if (this.v0.remove(k10) == null || this.F0.decrementAndGet() != 0) {
                return;
            }
            this.f74964x0.cancel();
        }
    }
}
