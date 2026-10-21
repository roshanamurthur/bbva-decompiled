package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.subscribers.SubscriberResourceWrapper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableReplay<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, ResettableConnectable {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final c f71016u0 = new c();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f71017q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<j<T>> f71018r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Callable<? extends g<T>> f71019s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Publisher<T> f71020t0;

    public static final class b<T> extends ConnectableFlowable<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ConnectableFlowable<T> f71024q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Flowable<T> f71025r0;

        public b(ConnectableFlowable<T> connectableFlowable, Flowable<T> flowable) {
            this.f71024q0 = connectableFlowable;
            this.f71025r0 = flowable;
        }

        @Override // io.reactivex.flowables.ConnectableFlowable
        public final void connect(Consumer<? super Disposable> consumer) {
            this.f71024q0.connect(consumer);
        }

        @Override // io.reactivex.Flowable
        public final void subscribeActual(Subscriber<? super T> subscriber) {
            this.f71025r0.subscribe(subscriber);
        }
    }

    public static final class c implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return new n(16);
        }
    }

    public static final class d<T> extends AtomicLong implements Subscription, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final j<T> f71026p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Subscriber<? super T> f71027q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Serializable f71028r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f71029s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f71030t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f71031u0;

        public d(j<T> jVar, Subscriber<? super T> subscriber) {
            this.f71026p0 = jVar;
            this.f71027q0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                j<T> jVar = this.f71026p0;
                jVar.b(this);
                jVar.a();
                this.f71028r0 = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (!SubscriptionHelper.validate(j10) || BackpressureHelper.addCancel(this, j10) == Long.MIN_VALUE) {
                return;
            }
            BackpressureHelper.add(this.f71029s0, j10);
            j<T> jVar = this.f71026p0;
            jVar.a();
            jVar.f71042p0.b(this);
        }
    }

    public static final class e<R, U> extends Flowable<R> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Callable<? extends ConnectableFlowable<U>> f71032q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super Flowable<U>, ? extends Publisher<R>> f71033r0;

        public final class a implements Consumer<Disposable> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final SubscriberResourceWrapper<R> f71034p0;

            public a(SubscriberResourceWrapper subscriberResourceWrapper) {
                this.f71034p0 = subscriberResourceWrapper;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) throws Exception {
                this.f71034p0.setResource(disposable);
            }
        }

        public e(Function function, Callable callable) {
            this.f71032q0 = callable;
            this.f71033r0 = function;
        }

        @Override // io.reactivex.Flowable
        public final void subscribeActual(Subscriber<? super R> subscriber) {
            try {
                ConnectableFlowable connectableFlowable = (ConnectableFlowable) ObjectHelper.requireNonNull(this.f71032q0.call(), "The connectableFactory returned null");
                try {
                    Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f71033r0.apply(connectableFlowable), "The selector returned a null Publisher");
                    SubscriberResourceWrapper subscriberResourceWrapper = new SubscriberResourceWrapper(subscriber);
                    publisher.subscribe(subscriberResourceWrapper);
                    connectableFlowable.connect(new a(subscriberResourceWrapper));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, subscriber);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, subscriber);
            }
        }
    }

    public static final class f extends AtomicReference<f> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Object f71035p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71036q0;

        public f(long j10, Object obj) {
            this.f71035p0 = obj;
            this.f71036q0 = j10;
        }
    }

    public interface g<T> {
        void a(T t10);

        void b(d<T> dVar);

        void complete();

        void error(Throwable th2);
    }

    public static final class h<T> implements Callable<g<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f71037p0;

        public h(int i10) {
            this.f71037p0 = i10;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return new m(this.f71037p0);
        }
    }

    public static final class i<T> implements Publisher<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<j<T>> f71038p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Callable<? extends g<T>> f71039q0;

        public i(AtomicReference<j<T>> atomicReference, Callable<? extends g<T>> callable) {
            this.f71038p0 = atomicReference;
            this.f71039q0 = callable;
        }

        @Override // org.reactivestreams.Publisher
        public final void subscribe(Subscriber<? super T> subscriber) {
            j<T> jVar;
            loop0: while (true) {
                AtomicReference<j<T>> atomicReference = this.f71038p0;
                jVar = atomicReference.get();
                if (jVar != null) {
                    break;
                }
                try {
                    j<T> jVar2 = new j<>(this.f71039q0.call());
                    do {
                        if (atomicReference.compareAndSet(null, jVar2)) {
                            jVar = jVar2;
                            break loop0;
                        }
                    } while (atomicReference.get() == null);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, subscriber);
                    return;
                }
            }
            d<T> dVar = new d<>(jVar, subscriber);
            subscriber.onSubscribe(dVar);
            loop2: while (true) {
                AtomicReference<d<T>[]> atomicReference2 = jVar.f71044r0;
                d<T>[] dVarArr = atomicReference2.get();
                if (dVarArr == j.f71041x0) {
                    break;
                }
                int length = dVarArr.length;
                d<T>[] dVarArr2 = new d[length + 1];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
                do {
                    if (atomicReference2.compareAndSet(dVarArr, dVarArr2)) {
                        break loop2;
                    }
                } while (atomicReference2.get() == dVarArr);
            }
            if (dVar.isDisposed()) {
                jVar.b(dVar);
            } else {
                jVar.a();
                jVar.f71042p0.b(dVar);
            }
        }
    }

    public static final class j<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final d[] f71040w0 = new d[0];

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final d[] f71041x0 = new d[0];

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final g<T> f71042p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f71043q0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f71047u0;
        public long v0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f71046t0 = new AtomicInteger();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<d<T>[]> f71044r0 = new AtomicReference<>(f71040w0);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f71045s0 = new AtomicBoolean();

        public j(g<T> gVar) {
            this.f71042p0 = gVar;
        }

        public final void a() {
            AtomicInteger atomicInteger = this.f71046t0;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                d<T>[] dVarArr = this.f71044r0.get();
                long j10 = this.f71047u0;
                long jMax = j10;
                for (d<T> dVar : dVarArr) {
                    jMax = Math.max(jMax, dVar.f71029s0.get());
                }
                long j11 = this.v0;
                Subscription subscription = get();
                long j12 = jMax - j10;
                if (j12 != 0) {
                    this.f71047u0 = jMax;
                    if (subscription == null) {
                        long j13 = j11 + j12;
                        if (j13 < 0) {
                            j13 = Long.MAX_VALUE;
                        }
                        this.v0 = j13;
                    } else if (j11 != 0) {
                        this.v0 = 0L;
                        subscription.request(j11 + j12);
                    } else {
                        subscription.request(j12);
                    }
                } else if (j11 != 0 && subscription != null) {
                    this.v0 = 0L;
                    subscription.request(j11);
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public final void b(d<T> dVar) {
            d<T>[] dVarArr;
            while (true) {
                AtomicReference<d<T>[]> atomicReference = this.f71044r0;
                d<T>[] dVarArr2 = atomicReference.get();
                int length = dVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (dVarArr2[i10].equals(dVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    dVarArr = f71040w0;
                } else {
                    d<T>[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr2, 0, dVarArr3, 0, i10);
                    System.arraycopy(dVarArr2, i10 + 1, dVarArr3, i10, (length - i10) - 1);
                    dVarArr = dVarArr3;
                }
                while (!atomicReference.compareAndSet(dVarArr2, dVarArr)) {
                    if (atomicReference.get() != dVarArr2) {
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71044r0.set(f71041x0);
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71044r0.get() == f71041x0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71043q0) {
                return;
            }
            this.f71043q0 = true;
            g<T> gVar = this.f71042p0;
            gVar.complete();
            for (d<T> dVar : this.f71044r0.getAndSet(f71041x0)) {
                gVar.b(dVar);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71043q0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f71043q0 = true;
            g<T> gVar = this.f71042p0;
            gVar.error(th2);
            for (d<T> dVar : this.f71044r0.getAndSet(f71041x0)) {
                gVar.b(dVar);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71043q0) {
                return;
            }
            g<T> gVar = this.f71042p0;
            gVar.a(t10);
            for (d<T> dVar : this.f71044r0.get()) {
                gVar.b(dVar);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                a();
                for (d<T> dVar : this.f71044r0.get()) {
                    this.f71042p0.b(dVar);
                }
            }
        }
    }

    public static final class k<T> implements Callable<g<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f71048p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71049q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f71050r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f71051s0;

        public k(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f71048p0 = i10;
            this.f71049q0 = j10;
            this.f71050r0 = timeUnit;
            this.f71051s0 = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return new l(this.f71048p0, this.f71049q0, this.f71050r0, this.f71051s0);
        }
    }

    public static final class l<T> extends a<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f71052s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final long f71053t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final TimeUnit f71054u0;
        public final int v0;

        public l(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f71052s0 = scheduler;
            this.v0 = i10;
            this.f71053t0 = j10;
            this.f71054u0 = timeUnit;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public final Object c(Object obj) {
            Scheduler scheduler = this.f71052s0;
            TimeUnit timeUnit = this.f71054u0;
            return new Timed(obj, scheduler.now(timeUnit), timeUnit);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public final f d() {
            f fVar;
            long jNow = this.f71052s0.now(this.f71054u0) - this.f71053t0;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                Timed timed = (Timed) fVar2.f71035p0;
                if (NotificationLite.isComplete(timed.value()) || NotificationLite.isError(timed.value()) || timed.time() > jNow) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public final Object e(Object obj) {
            return ((Timed) obj).value();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public final void f() {
            f fVar;
            long jNow = this.f71052s0.now(this.f71054u0) - this.f71053t0;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                int i11 = this.f71022q0;
                if (i11 > this.v0 && i11 > 1) {
                    i10++;
                    this.f71022q0 = i11 - 1;
                    fVar3 = fVar2.get();
                } else {
                    if (((Timed) fVar2.f71035p0).time() > jNow) {
                        break;
                    }
                    i10++;
                    this.f71022q0--;
                    fVar3 = fVar2.get();
                }
            }
            if (i10 != 0) {
                set(fVar);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public final void g() {
            f fVar;
            long jNow = this.f71052s0.now(this.f71054u0) - this.f71053t0;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || this.f71022q0 <= 1 || ((Timed) fVar2.f71035p0).time() > jNow) {
                    break;
                }
                i10++;
                this.f71022q0--;
                fVar3 = fVar2.get();
            }
            if (i10 != 0) {
                set(fVar);
            }
        }
    }

    public static final class m<T> extends a<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f71055s0;

        public m(int i10) {
            this.f71055s0 = i10;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public final void f() {
            if (this.f71022q0 > this.f71055s0) {
                f fVar = get().get();
                if (fVar == null) {
                    throw new IllegalStateException("Empty list!");
                }
                this.f71022q0--;
                set(fVar);
            }
        }
    }

    public static final class n<T> extends ArrayList<Object> implements g<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public volatile int f71056p0;

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void a(T t10) {
            add(NotificationLite.next(t10));
            this.f71056p0++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void b(d<T> dVar) {
            synchronized (dVar) {
                try {
                    if (dVar.f71030t0) {
                        dVar.f71031u0 = true;
                        return;
                    }
                    dVar.f71030t0 = true;
                    Subscriber<? super T> subscriber = dVar.f71027q0;
                    while (!dVar.isDisposed()) {
                        int i10 = this.f71056p0;
                        Integer num = (Integer) dVar.f71028r0;
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j10 = dVar.get();
                        long j11 = j10;
                        long j12 = 0;
                        while (j11 != 0 && iIntValue < i10) {
                            Object obj = get(iIntValue);
                            try {
                                if (NotificationLite.accept(obj, subscriber) || dVar.isDisposed()) {
                                    return;
                                }
                                iIntValue++;
                                j11--;
                                j12++;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                dVar.dispose();
                                if (NotificationLite.isError(obj) || NotificationLite.isComplete(obj)) {
                                    return;
                                }
                                subscriber.onError(th2);
                                return;
                            }
                        }
                        if (j12 != 0) {
                            dVar.f71028r0 = Integer.valueOf(iIntValue);
                            if (j10 != Long.MAX_VALUE) {
                                BackpressureHelper.producedCancel(dVar, j12);
                            }
                        }
                        synchronized (dVar) {
                            try {
                                if (!dVar.f71031u0) {
                                    dVar.f71030t0 = false;
                                    return;
                                }
                                dVar.f71031u0 = false;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void complete() {
            add(NotificationLite.complete());
            this.f71056p0++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void error(Throwable th2) {
            add(NotificationLite.error(th2));
            this.f71056p0++;
        }
    }

    public FlowableReplay(i iVar, Flowable flowable, AtomicReference atomicReference, Callable callable) {
        this.f71020t0 = iVar;
        this.f71017q0 = flowable;
        this.f71018r0 = atomicReference;
        this.f71019s0 = callable;
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i10) {
        return i10 == Integer.MAX_VALUE ? createFrom(flowable) : e(flowable, new h(i10));
    }

    public static <T> ConnectableFlowable<T> createFrom(Flowable<? extends T> flowable) {
        return e(flowable, f71016u0);
    }

    public static <T> ConnectableFlowable<T> e(Flowable<T> flowable, Callable<? extends g<T>> callable) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowableReplay(new i(atomicReference, callable), flowable, atomicReference, callable));
    }

    public static <U, R> Flowable<R> multicastSelector(Callable<? extends ConnectableFlowable<U>> callable, Function<? super Flowable<U>, ? extends Publisher<R>> function) {
        return new e(function, callable);
    }

    public static <T> ConnectableFlowable<T> observeOn(ConnectableFlowable<T> connectableFlowable, Scheduler scheduler) {
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new b(connectableFlowable, connectableFlowable.observeOn(scheduler)));
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        j<T> jVar;
        loop0: while (true) {
            AtomicReference<j<T>> atomicReference = this.f71018r0;
            jVar = atomicReference.get();
            if (jVar != null && !jVar.isDisposed()) {
                break;
            }
            try {
                j<T> jVar2 = new j<>(this.f71019s0.call());
                do {
                    if (atomicReference.compareAndSet(jVar, jVar2)) {
                        jVar = jVar2;
                        break loop0;
                    }
                } while (atomicReference.get() == jVar);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                throw ExceptionHelper.wrapOrThrow(th2);
            }
        }
        AtomicBoolean atomicBoolean = jVar.f71045s0;
        boolean z10 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            consumer.accept(jVar);
            if (z10) {
                this.f71017q0.subscribe((FlowableSubscriber) jVar);
            }
        } catch (Throwable th3) {
            if (z10) {
                atomicBoolean.compareAndSet(true, false);
            }
            Exceptions.throwIfFatal(th3);
            throw ExceptionHelper.wrapOrThrow(th3);
        }
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable) {
        AtomicReference<j<T>> atomicReference;
        j<T> jVar = (j) disposable;
        do {
            atomicReference = this.f71018r0;
            if (atomicReference.compareAndSet(jVar, null)) {
                return;
            }
        } while (atomicReference.get() == jVar);
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.f71017q0;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f71020t0.subscribe(subscriber);
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return create(flowable, j10, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
        return e(flowable, new k(i10, j10, timeUnit, scheduler));
    }

    public static class a<T> extends AtomicReference<f> implements g<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public f f71021p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f71022q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f71023r0;

        public a() {
            f fVar = new f(0L, null);
            this.f71021p0 = fVar;
            set(fVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void a(T t10) {
            Object objC = c(NotificationLite.next(t10));
            long j10 = this.f71023r0 + 1;
            this.f71023r0 = j10;
            f fVar = new f(j10, objC);
            this.f71021p0.set(fVar);
            this.f71021p0 = fVar;
            this.f71022q0++;
            f();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void b(d<T> dVar) {
            f fVar;
            synchronized (dVar) {
                try {
                    if (dVar.f71030t0) {
                        dVar.f71031u0 = true;
                        return;
                    }
                    dVar.f71030t0 = true;
                    while (!dVar.isDisposed()) {
                        long j10 = dVar.get();
                        boolean z10 = j10 == Long.MAX_VALUE;
                        f fVarD = (f) dVar.f71028r0;
                        if (fVarD == null) {
                            fVarD = d();
                            dVar.f71028r0 = fVarD;
                            BackpressureHelper.add(dVar.f71029s0, fVarD.f71036q0);
                        }
                        long j11 = 0;
                        while (j10 != 0 && (fVar = fVarD.get()) != null) {
                            Object objE = e(fVar.f71035p0);
                            try {
                                if (NotificationLite.accept(objE, dVar.f71027q0)) {
                                    dVar.f71028r0 = null;
                                    return;
                                }
                                j11++;
                                j10--;
                                if (dVar.isDisposed()) {
                                    dVar.f71028r0 = null;
                                    return;
                                }
                                fVarD = fVar;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                dVar.f71028r0 = null;
                                dVar.dispose();
                                if (NotificationLite.isError(objE) || NotificationLite.isComplete(objE)) {
                                    return;
                                }
                                dVar.f71027q0.onError(th2);
                                return;
                            }
                        }
                        if (j11 != 0) {
                            dVar.f71028r0 = fVarD;
                            if (!z10) {
                                BackpressureHelper.producedCancel(dVar, j11);
                            }
                        }
                        synchronized (dVar) {
                            try {
                                if (!dVar.f71031u0) {
                                    dVar.f71030t0 = false;
                                    return;
                                }
                                dVar.f71031u0 = false;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    dVar.f71028r0 = null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void complete() {
            Object objC = c(NotificationLite.complete());
            long j10 = this.f71023r0 + 1;
            this.f71023r0 = j10;
            f fVar = new f(j10, objC);
            this.f71021p0.set(fVar);
            this.f71021p0 = fVar;
            this.f71022q0++;
            g();
        }

        public f d() {
            return get();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void error(Throwable th2) {
            Object objC = c(NotificationLite.error(th2));
            long j10 = this.f71023r0 + 1;
            this.f71023r0 = j10;
            f fVar = new f(j10, objC);
            this.f71021p0.set(fVar);
            this.f71021p0 = fVar;
            this.f71022q0++;
            g();
        }

        public void f() {
            throw null;
        }

        public void g() {
            f fVar = get();
            if (fVar.f71035p0 != null) {
                f fVar2 = new f(0L, null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        public Object c(Object obj) {
            return obj;
        }

        public Object e(Object obj) {
            return obj;
        }
    }
}
