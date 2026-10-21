package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableWindowTimed<T> extends io.reactivex.internal.operators.flowable.a<T, Flowable<T>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f71426q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f71427r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TimeUnit f71428s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Scheduler f71429t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final long f71430u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f71431w0;

    public static final class a<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription {
        public long E0;
        public Subscription F0;
        public UnicastProcessor<T> G0;
        public volatile boolean H0;
        public final SequentialDisposable I0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f71432r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f71433s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f71434t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f71435u0;
        public final boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final long f71436w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final Scheduler.Worker f71437x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public long f71438y0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$a$a, reason: collision with other inner class name */
        public static final class RunnableC0316a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final long f71439p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final a<?> f71440q0;

            public RunnableC0316a(long j10, a<?> aVar) {
                this.f71439p0 = j10;
                this.f71440q0 = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a<?> aVar = this.f71440q0;
                if (((QueueDrainSubscriber) aVar).cancelled) {
                    aVar.H0 = true;
                } else {
                    ((QueueDrainSubscriber) aVar).queue.offer(this);
                }
                if (aVar.enter()) {
                    aVar.d();
                }
            }
        }

        public a(int i10, long j10, long j11, Scheduler scheduler, TimeUnit timeUnit, SerializedSubscriber serializedSubscriber, boolean z10) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.I0 = new SequentialDisposable();
            this.f71432r0 = j10;
            this.f71433s0 = timeUnit;
            this.f71434t0 = scheduler;
            this.f71435u0 = i10;
            this.f71436w0 = j11;
            this.v0 = z10;
            if (z10) {
                this.f71437x0 = scheduler.createWorker();
            } else {
                this.f71437x0 = null;
            }
        }

        public final void c() {
            this.I0.dispose();
            Scheduler.Worker worker = this.f71437x0;
            if (worker != null) {
                worker.dispose();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void d() {
            UnicastProcessor<T> unicastProcessorCreate;
            SimpleQueue simpleQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.G0;
            int iLeave = 1;
            while (!this.H0) {
                boolean z10 = this.done;
                Object objPoll = simpleQueue.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof RunnableC0316a;
                if (z10 && (z11 || z12)) {
                    this.G0 = null;
                    simpleQueue.clear();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        ((UnicastProcessor) unicastProcessor).onError(th2);
                    } else {
                        ((UnicastProcessor) unicastProcessor).onComplete();
                    }
                    c();
                    return;
                }
                if (z11) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else {
                    int i10 = iLeave;
                    if (z12) {
                        RunnableC0316a runnableC0316a = (RunnableC0316a) objPoll;
                        if (!this.v0 || this.E0 == runnableC0316a.f71439p0) {
                            unicastProcessor = unicastProcessor;
                            ((UnicastProcessor) unicastProcessor).onComplete();
                            this.f71438y0 = 0L;
                            unicastProcessorCreate = UnicastProcessor.create(this.f71435u0);
                            this.G0 = unicastProcessorCreate;
                            long jRequested = requested();
                            if (jRequested == 0) {
                                this.G0 = null;
                                this.queue.clear();
                                this.F0.cancel();
                                subscriber.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                c();
                                return;
                            }
                            subscriber.onNext(unicastProcessorCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                unicastProcessor = unicastProcessorCreate;
                                produced(1L);
                                unicastProcessor = unicastProcessorCreate;
                            }
                        }
                    } else {
                        ((UnicastProcessor) unicastProcessor).onNext(NotificationLite.getValue(objPoll));
                        long j10 = this.f71438y0 + 1;
                        if (j10 >= this.f71436w0) {
                            this.E0++;
                            this.f71438y0 = 0L;
                            ((UnicastProcessor) unicastProcessor).onComplete();
                            long jRequested2 = requested();
                            if (jRequested2 == 0) {
                                this.G0 = null;
                                this.F0.cancel();
                                this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                                c();
                                return;
                            }
                            UnicastProcessor<T> unicastProcessorCreate2 = UnicastProcessor.create(this.f71435u0);
                            this.G0 = unicastProcessorCreate2;
                            this.downstream.onNext(unicastProcessorCreate2);
                            if (jRequested2 != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            unicastProcessor = unicastProcessorCreate2;
                            if (this.v0) {
                                this.I0.get().dispose();
                                Scheduler.Worker worker = this.f71437x0;
                                RunnableC0316a runnableC0316a2 = new RunnableC0316a(this.E0, this);
                                long j11 = this.f71432r0;
                                this.I0.replace(worker.schedulePeriodically(runnableC0316a2, j11, j11, this.f71433s0));
                                unicastProcessor = unicastProcessorCreate2;
                            }
                        } else {
                            this.f71438y0 = j10;
                            unicastProcessor = unicastProcessor;
                        }
                    }
                    unicastProcessor = unicastProcessorCreate;
                    unicastProcessor = unicastProcessor;
                    iLeave = i10;
                }
            }
            this.F0.cancel();
            simpleQueue.clear();
            c();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                d();
            }
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                d();
            }
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.H0) {
                return;
            }
            if (fastEnter()) {
                UnicastProcessor<T> unicastProcessor = this.G0;
                unicastProcessor.onNext(t10);
                long j10 = this.f71438y0 + 1;
                if (j10 >= this.f71436w0) {
                    this.E0++;
                    this.f71438y0 = 0L;
                    unicastProcessor.onComplete();
                    long jRequested = requested();
                    if (jRequested == 0) {
                        this.G0 = null;
                        this.F0.cancel();
                        this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                        c();
                        return;
                    }
                    UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.f71435u0);
                    this.G0 = unicastProcessorCreate;
                    this.downstream.onNext(unicastProcessorCreate);
                    if (jRequested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (this.v0) {
                        this.I0.get().dispose();
                        Scheduler.Worker worker = this.f71437x0;
                        RunnableC0316a runnableC0316a = new RunnableC0316a(this.E0, this);
                        long j11 = this.f71432r0;
                        this.I0.replace(worker.schedulePeriodically(runnableC0316a, j11, j11, this.f71433s0));
                    }
                } else {
                    this.f71438y0 = j10;
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
            d();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            Disposable disposableSchedulePeriodicallyDirect;
            if (SubscriptionHelper.validate(this.F0, subscription)) {
                this.F0 = subscription;
                Subscriber<? super V> subscriber = this.downstream;
                subscriber.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.f71435u0);
                this.G0 = unicastProcessorCreate;
                long jRequested = requested();
                if (jRequested == 0) {
                    this.cancelled = true;
                    subscription.cancel();
                    subscriber.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                    return;
                }
                subscriber.onNext(unicastProcessorCreate);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                RunnableC0316a runnableC0316a = new RunnableC0316a(this.E0, this);
                if (this.v0) {
                    Scheduler.Worker worker = this.f71437x0;
                    long j10 = this.f71432r0;
                    disposableSchedulePeriodicallyDirect = worker.schedulePeriodically(runnableC0316a, j10, j10, this.f71433s0);
                } else {
                    Scheduler scheduler = this.f71434t0;
                    long j11 = this.f71432r0;
                    disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(runnableC0316a, j11, j11, this.f71433s0);
                }
                if (this.I0.replace(disposableSchedulePeriodicallyDirect)) {
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }
    }

    public static final class b<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription, Runnable {
        public static final Object E0 = new Object();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f71441r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f71442s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f71443t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f71444u0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public UnicastProcessor<T> f71445w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final SequentialDisposable f71446x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f71447y0;

        public b(SerializedSubscriber serializedSubscriber, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f71446x0 = new SequentialDisposable();
            this.f71441r0 = j10;
            this.f71442s0 = timeUnit;
            this.f71443t0 = scheduler;
            this.f71444u0 = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.processors.UnicastProcessor<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a() {
            SimpleQueue simpleQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.f71445w0;
            int iLeave = 1;
            while (true) {
                boolean z10 = this.f71447y0;
                boolean z11 = this.done;
                Object objPoll = simpleQueue.poll();
                Object obj = E0;
                if (z11 && (objPoll == null || objPoll == obj)) {
                    break;
                }
                if (objPoll == null) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll == obj) {
                    unicastProcessor.onComplete();
                    if (z10) {
                        this.v0.cancel();
                    } else {
                        unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.create(this.f71444u0);
                        this.f71445w0 = unicastProcessor;
                        long jRequested = requested();
                        if (jRequested == 0) {
                            this.f71445w0 = null;
                            this.queue.clear();
                            this.v0.cancel();
                            subscriber.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                            this.f71446x0.dispose();
                            return;
                        }
                        subscriber.onNext(unicastProcessor);
                        if (jRequested != Long.MAX_VALUE) {
                            produced(1L);
                        }
                    }
                } else {
                    unicastProcessor.onNext(NotificationLite.getValue(objPoll));
                }
            }
            this.f71445w0 = null;
            simpleQueue.clear();
            Throwable th2 = this.error;
            if (th2 != null) {
                unicastProcessor.onError(th2);
            } else {
                unicastProcessor.onComplete();
            }
            this.f71446x0.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                a();
            }
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                a();
            }
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71447y0) {
                return;
            }
            if (fastEnter()) {
                this.f71445w0.onNext(t10);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t10));
                if (!enter()) {
                    return;
                }
            }
            a();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f71445w0 = UnicastProcessor.create(this.f71444u0);
                Subscriber<? super V> subscriber = this.downstream;
                subscriber.onSubscribe(this);
                long jRequested = requested();
                if (jRequested == 0) {
                    this.cancelled = true;
                    subscription.cancel();
                    subscriber.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                    return;
                }
                subscriber.onNext(this.f71445w0);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (this.cancelled) {
                    return;
                }
                SequentialDisposable sequentialDisposable = this.f71446x0;
                Scheduler scheduler = this.f71443t0;
                long j10 = this.f71441r0;
                if (sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j10, j10, this.f71442s0))) {
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public final void run() {
            if (this.cancelled) {
                this.f71447y0 = true;
            }
            this.queue.offer((U) E0);
            if (enter()) {
                a();
            }
        }
    }

    public static final class c<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription, Runnable {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f71448r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f71449s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final TimeUnit f71450t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final Scheduler.Worker f71451u0;
        public final int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final LinkedList f71452w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Subscription f71453x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f71454y0;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final UnicastProcessor<T> f71455p0;

            public a(UnicastProcessor<T> unicastProcessor) {
                this.f71455p0 = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.this.a(this.f71455p0);
            }
        }

        public static final class b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UnicastProcessor<T> f71457a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f71458b;

            public b(UnicastProcessor<T> unicastProcessor, boolean z10) {
                this.f71457a = unicastProcessor;
                this.f71458b = z10;
            }
        }

        public c(SerializedSubscriber serializedSubscriber, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker, int i10) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f71448r0 = j10;
            this.f71449s0 = j11;
            this.f71450t0 = timeUnit;
            this.f71451u0 = worker;
            this.v0 = i10;
            this.f71452w0 = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void a(UnicastProcessor<T> unicastProcessor) {
            this.queue.offer((U) new b(unicastProcessor, false));
            if (enter()) {
                b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void b() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            LinkedList linkedList = this.f71452w0;
            int iLeave = 1;
            while (!this.f71454y0) {
                boolean z10 = this.done;
                Object objPoll = simplePlainQueue.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof b;
                if (z10 && (z11 || z12)) {
                    simplePlainQueue.clear();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            ((UnicastProcessor) it.next()).onError(th2);
                        }
                    } else {
                        Iterator it2 = linkedList.iterator();
                        while (it2.hasNext()) {
                            ((UnicastProcessor) it2.next()).onComplete();
                        }
                    }
                    linkedList.clear();
                    this.f71451u0.dispose();
                    return;
                }
                if (z11) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z12) {
                    b bVar = (b) objPoll;
                    if (!bVar.f71458b) {
                        linkedList.remove(bVar.f71457a);
                        bVar.f71457a.onComplete();
                        if (linkedList.isEmpty() && this.cancelled) {
                            this.f71454y0 = true;
                        }
                    } else if (!this.cancelled) {
                        long jRequested = requested();
                        if (jRequested != 0) {
                            UnicastProcessor unicastProcessorCreate = UnicastProcessor.create(this.v0);
                            linkedList.add(unicastProcessorCreate);
                            subscriber.onNext(unicastProcessorCreate);
                            if (jRequested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            this.f71451u0.schedule(new a(unicastProcessorCreate), this.f71448r0, this.f71450t0);
                        } else {
                            subscriber.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator it3 = linkedList.iterator();
                    while (it3.hasNext()) {
                        ((UnicastProcessor) it3.next()).onNext(objPoll);
                    }
                }
            }
            this.f71453x0.cancel();
            simplePlainQueue.clear();
            linkedList.clear();
            this.f71451u0.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                b();
            }
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                b();
            }
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (fastEnter()) {
                Iterator it = this.f71452w0.iterator();
                while (it.hasNext()) {
                    ((UnicastProcessor) it.next()).onNext(t10);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) t10);
                if (!enter()) {
                    return;
                }
            }
            b();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71453x0, subscription)) {
                this.f71453x0 = subscription;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                long jRequested = requested();
                if (jRequested == 0) {
                    subscription.cancel();
                    this.downstream.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
                    return;
                }
                UnicastProcessor unicastProcessorCreate = UnicastProcessor.create(this.v0);
                this.f71452w0.add(unicastProcessorCreate);
                this.downstream.onNext(unicastProcessorCreate);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                this.f71451u0.schedule(new a(unicastProcessorCreate), this.f71448r0, this.f71450t0);
                Scheduler.Worker worker = this.f71451u0;
                long j10 = this.f71449s0;
                worker.schedulePeriodically(this, j10, j10, this.f71450t0);
                subscription.request(Long.MAX_VALUE);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public final void run() {
            Object bVar = new b(UnicastProcessor.create(this.v0), true);
            if (!this.cancelled) {
                this.queue.offer((U) bVar);
            }
            if (enter()) {
                b();
            }
        }
    }

    public FlowableWindowTimed(Flowable<T> flowable, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, long j12, int i10, boolean z10) {
        super(flowable);
        this.f71426q0 = j10;
        this.f71427r0 = j11;
        this.f71428s0 = timeUnit;
        this.f71429t0 = scheduler;
        this.f71430u0 = j12;
        this.v0 = i10;
        this.f71431w0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        long j10 = this.f71426q0;
        long j11 = this.f71427r0;
        if (j10 != j11) {
            this.source.subscribe((FlowableSubscriber) new c(serializedSubscriber, j10, j11, this.f71428s0, this.f71429t0.createWorker(), this.v0));
            return;
        }
        long j12 = this.f71430u0;
        if (j12 == Long.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new b(serializedSubscriber, this.f71426q0, this.f71428s0, this.f71429t0, this.v0));
            return;
        }
        Flowable<T> flowable = this.source;
        TimeUnit timeUnit = this.f71428s0;
        flowable.subscribe((FlowableSubscriber) new a(this.v0, j10, j12, this.f71429t0, timeUnit, serializedSubscriber, this.f71431w0));
    }
}
