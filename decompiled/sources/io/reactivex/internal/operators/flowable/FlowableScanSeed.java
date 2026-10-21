package io.reactivex.internal.operators.flowable;

import a.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableScanSeed<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<R, ? super T, R> f71102q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Callable<R> f71103r0;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public R E0;
        public int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71104p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<R, ? super T, R> f71105q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SpscArrayQueue f71106r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f71107s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f71108t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f71109u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f71110w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Throwable f71111x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Subscription f71112y0;

        public a(Subscriber<? super R> subscriber, BiFunction<R, ? super T, R> biFunction, R r3, int i10) {
            this.f71104p0 = subscriber;
            this.f71105q0 = biFunction;
            this.E0 = r3;
            this.f71108t0 = i10;
            this.f71109u0 = i10 - (i10 >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i10);
            this.f71106r0 = spscArrayQueue;
            spscArrayQueue.offer(r3);
            this.f71107s0 = new AtomicLong();
        }

        public final void a() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f71104p0;
            SpscArrayQueue spscArrayQueue = this.f71106r0;
            int i10 = this.f71109u0;
            int i11 = this.F0;
            int iAddAndGet = 1;
            do {
                long j10 = this.f71107s0.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.v0) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z10 = this.f71110w0;
                    if (z10 && (th2 = this.f71111x0) != null) {
                        spscArrayQueue.clear();
                        subscriber.onError(th2);
                        return;
                    }
                    d dVar = (Object) spscArrayQueue.poll();
                    boolean z11 = dVar == null;
                    if (z10 && z11) {
                        subscriber.onComplete();
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(dVar);
                    j11++;
                    i11++;
                    if (i11 == i10) {
                        this.f71112y0.request(i10);
                        i11 = 0;
                    }
                }
                if (j11 == j10 && this.f71110w0) {
                    Throwable th3 = this.f71111x0;
                    if (th3 != null) {
                        spscArrayQueue.clear();
                        subscriber.onError(th3);
                        return;
                    } else if (spscArrayQueue.isEmpty()) {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (j11 != 0) {
                    BackpressureHelper.produced(this.f71107s0, j11);
                }
                this.F0 = i11;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.v0 = true;
            this.f71112y0.cancel();
            if (getAndIncrement() == 0) {
                this.f71106r0.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71110w0) {
                return;
            }
            this.f71110w0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71110w0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f71111x0 = th2;
            this.f71110w0 = true;
            a();
        }

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
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71110w0) {
                return;
            }
            try {
                R r3 = (R) ObjectHelper.requireNonNull(this.f71105q0.apply(this.E0, t10), "The accumulator returned a null value");
                this.E0 = r3;
                this.f71106r0.offer(r3);
                a();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f71112y0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71112y0, subscription)) {
                this.f71112y0 = subscription;
                this.f71104p0.onSubscribe(this);
                subscription.request(this.f71108t0 - 1);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71107s0, j10);
                a();
            }
        }
    }

    public FlowableScanSeed(Flowable<T> flowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(flowable);
        this.f71102q0 = biFunction;
        this.f71103r0 = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        try {
            this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f71102q0, ObjectHelper.requireNonNull(this.f71103r0.call(), "The seed supplied is null"), Flowable.bufferSize()));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
