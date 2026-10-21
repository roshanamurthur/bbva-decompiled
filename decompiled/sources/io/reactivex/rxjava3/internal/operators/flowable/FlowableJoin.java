package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
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
public final class FlowableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<TLeft, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends TRight> f75045q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super TLeft, ? extends Publisher<TLeftEnd>> f75046r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Function<? super TRight, ? extends Publisher<TRightEnd>> f75047s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final BiFunction<? super TLeft, ? super TRight, ? extends R> f75048t0;

    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Subscription, FlowableGroupJoin.b {
        public static final Integer I0 = 1;
        public static final Integer J0 = 2;
        public static final Integer K0 = 3;
        public static final Integer L0 = 4;
        public int F0;
        public int G0;
        public volatile boolean H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f75049p0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Function<? super TLeft, ? extends Publisher<TLeftEnd>> f75055w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final Function<? super TRight, ? extends Publisher<TRightEnd>> f75056x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final BiFunction<? super TLeft, ? super TRight, ? extends R> f75057y0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicLong f75050q0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final CompositeDisposable f75052s0 = new CompositeDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f75051r0 = new SpscLinkedArrayQueue<>(Flowable.bufferSize());

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final LinkedHashMap f75053t0 = new LinkedHashMap();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final LinkedHashMap f75054u0 = new LinkedHashMap();
        public final AtomicReference<Throwable> v0 = new AtomicReference<>();
        public final AtomicInteger E0 = new AtomicInteger(2);

        public a(Subscriber<? super R> subscriber, Function<? super TLeft, ? extends Publisher<TLeftEnd>> function, Function<? super TRight, ? extends Publisher<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.f75049p0 = subscriber;
            this.f75055w0 = function;
            this.f75056x0 = function2;
            this.f75057y0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin.b
        public final void a(Throwable th2) {
            if (!ExceptionHelper.addThrowable(this.v0, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.E0.decrementAndGet();
                g();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin.b
        public final void b(Throwable th2) {
            if (ExceptionHelper.addThrowable(this.v0, th2)) {
                g();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin.b
        public final void c(Object obj, boolean z10) {
            synchronized (this) {
                try {
                    this.f75051r0.offer(z10 ? I0 : J0, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.H0) {
                return;
            }
            this.H0 = true;
            f();
            if (getAndIncrement() == 0) {
                this.f75051r0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin.b
        public final void d(FlowableGroupJoin.d dVar) {
            this.f75052s0.delete(dVar);
            this.E0.decrementAndGet();
            g();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin.b
        public final void e(boolean z10, FlowableGroupJoin.c cVar) {
            synchronized (this) {
                try {
                    this.f75051r0.offer(z10 ? K0 : L0, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        public final void f() {
            this.f75052s0.dispose();
        }

        public final void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f75051r0;
            Subscriber<? super R> subscriber = this.f75049p0;
            boolean z10 = true;
            int iAddAndGet = 1;
            while (!this.H0) {
                if (this.v0.get() != null) {
                    spscLinkedArrayQueue.clear();
                    f();
                    h(subscriber);
                    return;
                }
                boolean z11 = this.E0.get() == 0 ? z10 : false;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z12 = num == null ? z10 : false;
                if (z11 && z12) {
                    this.f75053t0.clear();
                    this.f75054u0.clear();
                    this.f75052s0.dispose();
                    subscriber.onComplete();
                    return;
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == I0) {
                        int i10 = this.F0;
                        this.F0 = i10 + 1;
                        this.f75053t0.put(Integer.valueOf(i10), objPoll);
                        try {
                            Publisher publisherApply = this.f75055w0.apply(objPoll);
                            Objects.requireNonNull(publisherApply, "The leftEnd returned a null Publisher");
                            Publisher publisher = publisherApply;
                            FlowableGroupJoin.c cVar = new FlowableGroupJoin.c(this, z10, i10);
                            this.f75052s0.add(cVar);
                            publisher.subscribe(cVar);
                            if (this.v0.get() != null) {
                                spscLinkedArrayQueue.clear();
                                f();
                                h(subscriber);
                                return;
                            }
                            long j10 = this.f75050q0.get();
                            Iterator it = this.f75054u0.values().iterator();
                            long j11 = 0;
                            while (it.hasNext()) {
                                try {
                                    R rApply = this.f75057y0.apply(objPoll, it.next());
                                    Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                                    if (j11 == j10) {
                                        ExceptionHelper.addThrowable(this.v0, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        spscLinkedArrayQueue.clear();
                                        f();
                                        h(subscriber);
                                        return;
                                    }
                                    subscriber.onNext(rApply);
                                    j11++;
                                } catch (Throwable th2) {
                                    i(th2, subscriber, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                            if (j11 != 0) {
                                BackpressureHelper.produced(this.f75050q0, j11);
                            }
                        } catch (Throwable th3) {
                            i(th3, subscriber, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == J0) {
                        int i11 = this.G0;
                        this.G0 = i11 + 1;
                        this.f75054u0.put(Integer.valueOf(i11), objPoll);
                        try {
                            Publisher publisherApply2 = this.f75056x0.apply(objPoll);
                            Objects.requireNonNull(publisherApply2, "The rightEnd returned a null Publisher");
                            Publisher publisher2 = publisherApply2;
                            FlowableGroupJoin.c cVar2 = new FlowableGroupJoin.c(this, false, i11);
                            this.f75052s0.add(cVar2);
                            publisher2.subscribe(cVar2);
                            if (this.v0.get() != null) {
                                spscLinkedArrayQueue.clear();
                                f();
                                h(subscriber);
                                return;
                            }
                            long j12 = this.f75050q0.get();
                            Iterator it2 = this.f75053t0.values().iterator();
                            long j13 = 0;
                            while (it2.hasNext()) {
                                try {
                                    R rApply2 = this.f75057y0.apply(it2.next(), objPoll);
                                    Objects.requireNonNull(rApply2, "The resultSelector returned a null value");
                                    if (j13 == j12) {
                                        ExceptionHelper.addThrowable(this.v0, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        spscLinkedArrayQueue.clear();
                                        f();
                                        h(subscriber);
                                        return;
                                    }
                                    subscriber.onNext(rApply2);
                                    j13++;
                                } catch (Throwable th4) {
                                    i(th4, subscriber, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                            if (j13 != 0) {
                                BackpressureHelper.produced(this.f75050q0, j13);
                            }
                        } catch (Throwable th5) {
                            i(th5, subscriber, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == K0) {
                        FlowableGroupJoin.c cVar3 = (FlowableGroupJoin.c) objPoll;
                        this.f75053t0.remove(Integer.valueOf(cVar3.f74993r0));
                        this.f75052s0.remove(cVar3);
                    } else {
                        FlowableGroupJoin.c cVar4 = (FlowableGroupJoin.c) objPoll;
                        this.f75054u0.remove(Integer.valueOf(cVar4.f74993r0));
                        this.f75052s0.remove(cVar4);
                    }
                    z10 = true;
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public final void h(Subscriber<?> subscriber) {
            Throwable thTerminate = ExceptionHelper.terminate(this.v0);
            this.f75053t0.clear();
            this.f75054u0.clear();
            subscriber.onError(thTerminate);
        }

        public final void i(Throwable th2, Subscriber subscriber, SpscLinkedArrayQueue spscLinkedArrayQueue) {
            Exceptions.throwIfFatal(th2);
            ExceptionHelper.addThrowable(this.v0, th2);
            spscLinkedArrayQueue.clear();
            f();
            h(subscriber);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75050q0, j10);
            }
        }
    }

    public FlowableJoin(Flowable<TLeft> flowable, Publisher<? extends TRight> publisher, Function<? super TLeft, ? extends Publisher<TLeftEnd>> function, Function<? super TRight, ? extends Publisher<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
        super(flowable);
        this.f75045q0 = publisher;
        this.f75046r0 = function;
        this.f75047s0 = function2;
        this.f75048t0 = biFunction;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        a aVar = new a(subscriber, this.f75046r0, this.f75047s0, this.f75048t0);
        subscriber.onSubscribe(aVar);
        FlowableGroupJoin.d dVar = new FlowableGroupJoin.d(aVar, true);
        CompositeDisposable compositeDisposable = aVar.f75052s0;
        compositeDisposable.add(dVar);
        FlowableGroupJoin.d dVar2 = new FlowableGroupJoin.d(aVar, false);
        compositeDisposable.add(dVar2);
        this.source.subscribe((FlowableSubscriber) dVar);
        this.f75045q0.subscribe(dVar2);
    }
}
