package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.processors.UnicastProcessor;
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
public final class FlowableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<TLeft, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends TRight> f74978q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super TLeft, ? extends Publisher<TLeftEnd>> f74979r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Function<? super TRight, ? extends Publisher<TRightEnd>> f74980s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> f74981t0;

    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Subscription, b {
        public static final Integer I0 = 1;
        public static final Integer J0 = 2;
        public static final Integer K0 = 3;
        public static final Integer L0 = 4;
        public int F0;
        public int G0;
        public volatile boolean H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f74982p0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Function<? super TLeft, ? extends Publisher<TLeftEnd>> f74988w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final Function<? super TRight, ? extends Publisher<TRightEnd>> f74989x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> f74990y0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicLong f74983q0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final CompositeDisposable f74985s0 = new CompositeDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f74984r0 = new SpscLinkedArrayQueue<>(Flowable.bufferSize());

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final LinkedHashMap f74986t0 = new LinkedHashMap();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final LinkedHashMap f74987u0 = new LinkedHashMap();
        public final AtomicReference<Throwable> v0 = new AtomicReference<>();
        public final AtomicInteger E0 = new AtomicInteger(2);

        public a(Subscriber<? super R> subscriber, Function<? super TLeft, ? extends Publisher<TLeftEnd>> function, Function<? super TRight, ? extends Publisher<TRightEnd>> function2, BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> biFunction) {
            this.f74982p0 = subscriber;
            this.f74988w0 = function;
            this.f74989x0 = function2;
            this.f74990y0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin.b
        public final void a(Throwable th2) {
            if (!ExceptionHelper.addThrowable(this.v0, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.E0.decrementAndGet();
                f();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin.b
        public final void b(Throwable th2) {
            if (ExceptionHelper.addThrowable(this.v0, th2)) {
                f();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin.b
        public final void c(Object obj, boolean z10) {
            synchronized (this) {
                try {
                    this.f74984r0.offer(z10 ? I0 : J0, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.H0) {
                return;
            }
            this.H0 = true;
            this.f74985s0.dispose();
            if (getAndIncrement() == 0) {
                this.f74984r0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin.b
        public final void d(d dVar) {
            this.f74985s0.delete(dVar);
            this.E0.decrementAndGet();
            f();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableGroupJoin.b
        public final void e(boolean z10, c cVar) {
            synchronized (this) {
                try {
                    this.f74984r0.offer(z10 ? K0 : L0, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f();
        }

        public final void f() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f74984r0;
            Subscriber<? super R> subscriber = this.f74982p0;
            int iAddAndGet = 1;
            while (!this.H0) {
                if (this.v0.get() != null) {
                    spscLinkedArrayQueue.clear();
                    this.f74985s0.dispose();
                    g(subscriber);
                    return;
                }
                boolean z10 = this.E0.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z11 = num == null;
                if (z10 && z11) {
                    Iterator it = this.f74986t0.values().iterator();
                    while (it.hasNext()) {
                        ((UnicastProcessor) it.next()).onComplete();
                    }
                    this.f74986t0.clear();
                    this.f74987u0.clear();
                    this.f74985s0.dispose();
                    subscriber.onComplete();
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == I0) {
                        UnicastProcessor unicastProcessorCreate = UnicastProcessor.create();
                        int i10 = this.F0;
                        this.F0 = i10 + 1;
                        this.f74986t0.put(Integer.valueOf(i10), unicastProcessorCreate);
                        try {
                            Publisher publisherApply = this.f74988w0.apply(objPoll);
                            Objects.requireNonNull(publisherApply, "The leftEnd returned a null Publisher");
                            Publisher publisher = publisherApply;
                            c cVar = new c(this, true, i10);
                            this.f74985s0.add(cVar);
                            publisher.subscribe(cVar);
                            if (this.v0.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f74985s0.dispose();
                                g(subscriber);
                                return;
                            }
                            try {
                                R rApply = this.f74990y0.apply(objPoll, unicastProcessorCreate);
                                Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                                if (this.f74983q0.get() == 0) {
                                    h(new MissingBackpressureException("Could not emit value due to lack of requests"), subscriber, spscLinkedArrayQueue);
                                    return;
                                }
                                subscriber.onNext(rApply);
                                BackpressureHelper.produced(this.f74983q0, 1L);
                                Iterator it2 = this.f74987u0.values().iterator();
                                while (it2.hasNext()) {
                                    unicastProcessorCreate.onNext(it2.next());
                                }
                            } catch (Throwable th2) {
                                h(th2, subscriber, spscLinkedArrayQueue);
                                return;
                            }
                        } catch (Throwable th3) {
                            h(th3, subscriber, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == J0) {
                        int i11 = this.G0;
                        this.G0 = i11 + 1;
                        this.f74987u0.put(Integer.valueOf(i11), objPoll);
                        try {
                            Publisher publisherApply2 = this.f74989x0.apply(objPoll);
                            Objects.requireNonNull(publisherApply2, "The rightEnd returned a null Publisher");
                            Publisher publisher2 = publisherApply2;
                            c cVar2 = new c(this, false, i11);
                            this.f74985s0.add(cVar2);
                            publisher2.subscribe(cVar2);
                            if (this.v0.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f74985s0.dispose();
                                g(subscriber);
                                return;
                            } else {
                                Iterator it3 = this.f74986t0.values().iterator();
                                while (it3.hasNext()) {
                                    ((UnicastProcessor) it3.next()).onNext(objPoll);
                                }
                            }
                        } catch (Throwable th4) {
                            h(th4, subscriber, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == K0) {
                        c cVar3 = (c) objPoll;
                        UnicastProcessor unicastProcessor = (UnicastProcessor) this.f74986t0.remove(Integer.valueOf(cVar3.f74993r0));
                        this.f74985s0.remove(cVar3);
                        if (unicastProcessor != null) {
                            unicastProcessor.onComplete();
                        }
                    } else {
                        c cVar4 = (c) objPoll;
                        this.f74987u0.remove(Integer.valueOf(cVar4.f74993r0));
                        this.f74985s0.remove(cVar4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public final void g(Subscriber<?> subscriber) {
            Throwable thTerminate = ExceptionHelper.terminate(this.v0);
            LinkedHashMap linkedHashMap = this.f74986t0;
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((UnicastProcessor) it.next()).onError(thTerminate);
            }
            linkedHashMap.clear();
            this.f74987u0.clear();
            subscriber.onError(thTerminate);
        }

        public final void h(Throwable th2, Subscriber subscriber, SpscLinkedArrayQueue spscLinkedArrayQueue) {
            Exceptions.throwIfFatal(th2);
            ExceptionHelper.addThrowable(this.v0, th2);
            spscLinkedArrayQueue.clear();
            this.f74985s0.dispose();
            g(subscriber);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f74983q0, j10);
            }
        }
    }

    public interface b {
        void a(Throwable th2);

        void b(Throwable th2);

        void c(Object obj, boolean z10);

        void d(d dVar);

        void e(boolean z10, c cVar);
    }

    public static final class c extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b f74991p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f74992q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74993r0;

        public c(b bVar, boolean z10, int i10) {
            this.f74991p0 = bVar;
            this.f74992q0 = z10;
            this.f74993r0 = i10;
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
            this.f74991p0.e(this.f74992q0, this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74991p0.b(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.f74991p0.e(this.f74992q0, this);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public static final class d extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b f74994p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f74995q0;

        public d(b bVar, boolean z10) {
            this.f74994p0 = bVar;
            this.f74995q0 = z10;
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
            this.f74994p0.d(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74994p0.a(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f74994p0.c(obj, this.f74995q0);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public FlowableGroupJoin(Flowable<TLeft> flowable, Publisher<? extends TRight> publisher, Function<? super TLeft, ? extends Publisher<TLeftEnd>> function, Function<? super TRight, ? extends Publisher<TRightEnd>> function2, BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> biFunction) {
        super(flowable);
        this.f74978q0 = publisher;
        this.f74979r0 = function;
        this.f74980s0 = function2;
        this.f74981t0 = biFunction;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        a aVar = new a(subscriber, this.f74979r0, this.f74980s0, this.f74981t0);
        subscriber.onSubscribe(aVar);
        d dVar = new d(aVar, true);
        CompositeDisposable compositeDisposable = aVar.f74985s0;
        compositeDisposable.add(dVar);
        d dVar2 = new d(aVar, false);
        compositeDisposable.add(dVar2);
        this.source.subscribe((FlowableSubscriber) dVar);
        this.f74978q0.subscribe(dVar2);
    }
}
