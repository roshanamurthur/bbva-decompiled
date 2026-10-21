package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, Flowable<T>> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<B> f75653q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super B, ? extends Publisher<V>> f75654r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f75655s0;

    public static final class a<T, B, V> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public long F0;
        public volatile boolean G0;
        public volatile boolean H0;
        public volatile boolean I0;
        public Subscription K0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super Flowable<T>> f75656p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Publisher<B> f75657q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super B, ? extends Publisher<V>> f75658r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f75659s0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final MpscLinkedQueue f75662w0 = new MpscLinkedQueue();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f75660t0 = new CompositeDisposable();
        public final ArrayList v0 = new ArrayList();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicLong f75663x0 = new AtomicLong(1);

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicBoolean f75664y0 = new AtomicBoolean();
        public final AtomicThrowable J0 = new AtomicThrowable();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final c<B> f75661u0 = new c<>(this);
        public final AtomicLong E0 = new AtomicLong();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowBoundarySelector$a$a, reason: collision with other inner class name */
        public static final class C0380a<T, V> extends Flowable<T> implements FlowableSubscriber<V>, Disposable {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final a<T, ?, V> f75665q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final UnicastProcessor<T> f75666r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final AtomicReference<Subscription> f75667s0 = new AtomicReference<>();

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final AtomicBoolean f75668t0 = new AtomicBoolean();

            public C0380a(a<T, ?, V> aVar, UnicastProcessor<T> unicastProcessor) {
                this.f75665q0 = aVar;
                this.f75666r0 = unicastProcessor;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                SubscriptionHelper.cancel(this.f75667s0);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return this.f75667s0.get() == SubscriptionHelper.CANCELLED;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                a<T, ?, V> aVar = this.f75665q0;
                aVar.f75662w0.offer(this);
                aVar.a();
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th2) {
                if (isDisposed()) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
                a<T, ?, V> aVar = this.f75665q0;
                aVar.K0.cancel();
                c<?> cVar = aVar.f75661u0;
                cVar.getClass();
                SubscriptionHelper.cancel(cVar);
                aVar.f75660t0.dispose();
                if (aVar.J0.tryAddThrowableOrReport(th2)) {
                    aVar.H0 = true;
                    aVar.a();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(V v3) {
                if (SubscriptionHelper.cancel(this.f75667s0)) {
                    a<T, ?, V> aVar = this.f75665q0;
                    aVar.f75662w0.offer(this);
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(Subscription subscription) {
                if (SubscriptionHelper.setOnce(this.f75667s0, subscription)) {
                    subscription.request(Long.MAX_VALUE);
                }
            }

            @Override // io.reactivex.rxjava3.core.Flowable
            public final void subscribeActual(Subscriber<? super T> subscriber) {
                this.f75666r0.subscribe(subscriber);
                this.f75668t0.set(true);
            }
        }

        public static final class b<B> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final B f75669a;

            public b(B b10) {
                this.f75669a = b10;
            }
        }

        public static final class c<B> extends AtomicReference<Subscription> implements FlowableSubscriber<B> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, B, ?> f75670p0;

            public c(a<?, B, ?> aVar) {
                this.f75670p0 = aVar;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                a<?, B, ?> aVar = this.f75670p0;
                aVar.I0 = true;
                aVar.a();
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th2) {
                a<?, B, ?> aVar = this.f75670p0;
                aVar.K0.cancel();
                aVar.f75660t0.dispose();
                if (aVar.J0.tryAddThrowableOrReport(th2)) {
                    aVar.H0 = true;
                    aVar.a();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(B b10) {
                a<?, B, ?> aVar = this.f75670p0;
                aVar.f75662w0.offer(new b(b10));
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(Subscription subscription) {
                if (SubscriptionHelper.setOnce(this, subscription)) {
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }

        public a(Subscriber<? super Flowable<T>> subscriber, Publisher<B> publisher, Function<? super B, ? extends Publisher<V>> function, int i10) {
            this.f75656p0 = subscriber;
            this.f75657q0 = publisher;
            this.f75658r0 = function;
            this.f75659s0 = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Flowable<T>> subscriber = this.f75656p0;
            MpscLinkedQueue mpscLinkedQueue = this.f75662w0;
            ArrayList arrayList = this.v0;
            int iAddAndGet = 1;
            while (true) {
                if (this.G0) {
                    mpscLinkedQueue.clear();
                    arrayList.clear();
                } else {
                    boolean z10 = this.H0;
                    T tPoll = mpscLinkedQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && (z11 || this.J0.get() != null)) {
                        b(subscriber);
                        this.G0 = true;
                    } else if (z11) {
                        if (this.I0 && arrayList.size() == 0) {
                            this.K0.cancel();
                            c<B> cVar = this.f75661u0;
                            cVar.getClass();
                            SubscriptionHelper.cancel(cVar);
                            this.f75660t0.dispose();
                            b(subscriber);
                            this.G0 = true;
                        }
                    } else if (tPoll instanceof b) {
                        if (!this.f75664y0.get()) {
                            long j10 = this.F0;
                            if (this.E0.get() != j10) {
                                this.F0 = j10 + 1;
                                try {
                                    Publisher<V> publisherApply = this.f75658r0.apply(((b) tPoll).f75669a);
                                    Objects.requireNonNull(publisherApply, "The closingIndicator returned a null Publisher");
                                    Publisher<V> publisher = publisherApply;
                                    this.f75663x0.getAndIncrement();
                                    UnicastProcessor unicastProcessorCreate = UnicastProcessor.create(this.f75659s0, this);
                                    C0380a c0380a = new C0380a(this, unicastProcessorCreate);
                                    subscriber.onNext(c0380a);
                                    AtomicBoolean atomicBoolean = c0380a.f75668t0;
                                    if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
                                        arrayList.add(unicastProcessorCreate);
                                        this.f75660t0.add(c0380a);
                                        publisher.subscribe(c0380a);
                                    } else {
                                        unicastProcessorCreate.onComplete();
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.K0.cancel();
                                    c<B> cVar2 = this.f75661u0;
                                    cVar2.getClass();
                                    SubscriptionHelper.cancel(cVar2);
                                    this.f75660t0.dispose();
                                    Exceptions.throwIfFatal(th2);
                                    this.J0.tryAddThrowableOrReport(th2);
                                    this.H0 = true;
                                }
                            } else {
                                this.K0.cancel();
                                c<B> cVar3 = this.f75661u0;
                                cVar3.getClass();
                                SubscriptionHelper.cancel(cVar3);
                                this.f75660t0.dispose();
                                this.J0.tryAddThrowableOrReport(new MissingBackpressureException(FlowableWindowTimed.e(j10)));
                                this.H0 = true;
                            }
                        }
                    } else if (tPoll instanceof C0380a) {
                        UnicastProcessor<T> unicastProcessor = ((C0380a) tPoll).f75666r0;
                        arrayList.remove(unicastProcessor);
                        this.f75660t0.delete((Disposable) tPoll);
                        unicastProcessor.onComplete();
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((UnicastProcessor) it.next()).onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public final void b(Subscriber<?> subscriber) {
            Throwable thTerminate = this.J0.terminate();
            ArrayList arrayList = this.v0;
            if (thTerminate == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((UnicastProcessor) it.next()).onComplete();
                }
                subscriber.onComplete();
                return;
            }
            if (thTerminate != ExceptionHelper.TERMINATED) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((UnicastProcessor) it2.next()).onError(thTerminate);
                }
                subscriber.onError(thTerminate);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f75664y0.compareAndSet(false, true)) {
                if (this.f75663x0.decrementAndGet() != 0) {
                    c<B> cVar = this.f75661u0;
                    cVar.getClass();
                    SubscriptionHelper.cancel(cVar);
                    return;
                }
                this.K0.cancel();
                c<B> cVar2 = this.f75661u0;
                cVar2.getClass();
                SubscriptionHelper.cancel(cVar2);
                this.f75660t0.dispose();
                this.J0.tryTerminateAndReport();
                this.G0 = true;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            c<B> cVar = this.f75661u0;
            cVar.getClass();
            SubscriptionHelper.cancel(cVar);
            this.f75660t0.dispose();
            this.H0 = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            c<B> cVar = this.f75661u0;
            cVar.getClass();
            SubscriptionHelper.cancel(cVar);
            this.f75660t0.dispose();
            if (this.J0.tryAddThrowableOrReport(th2)) {
                this.H0 = true;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f75662w0.offer(t10);
            a();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.K0, subscription)) {
                this.K0 = subscription;
                this.f75656p0.onSubscribe(this);
                this.f75657q0.subscribe(this.f75661u0);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.E0, j10);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f75663x0.decrementAndGet() == 0) {
                this.K0.cancel();
                c<B> cVar = this.f75661u0;
                cVar.getClass();
                SubscriptionHelper.cancel(cVar);
                this.f75660t0.dispose();
                this.J0.tryTerminateAndReport();
                this.G0 = true;
                a();
            }
        }
    }

    public FlowableWindowBoundarySelector(Flowable<T> flowable, Publisher<B> publisher, Function<? super B, ? extends Publisher<V>> function, int i10) {
        super(flowable);
        this.f75653q0 = publisher;
        this.f75654r0 = function;
        this.f75655s0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75653q0, this.f75654r0, this.f75655s0));
    }
}
