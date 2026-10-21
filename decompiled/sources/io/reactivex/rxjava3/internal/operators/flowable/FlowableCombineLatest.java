package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final Publisher<? extends T>[] f74584q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final Iterable<? extends Publisher<? extends T>> f74585r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Function<? super Object[], ? extends R> f74586s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f74587t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f74588u0;

    public static final class a<T, R> extends BasicIntQueueSubscription<R> {
        public final AtomicLong E0;
        public volatile boolean F0;
        public final AtomicThrowable G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f74589p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Object[], ? extends R> f74590q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final b<T>[] f74591r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<Object> f74592s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Object[] f74593t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f74594u0;
        public boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f74595w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f74596x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public volatile boolean f74597y0;

        public a(Subscriber subscriber, Function function, boolean z10, int i10, int i11) {
            this.f74589p0 = subscriber;
            this.f74590q0 = function;
            b<T>[] bVarArr = new b[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                bVarArr[i12] = new b<>(this, i12, i11);
            }
            this.f74591r0 = bVarArr;
            this.f74593t0 = new Object[i10];
            this.f74592s0 = new SpscLinkedArrayQueue<>(i11);
            this.E0 = new AtomicLong();
            this.G0 = new AtomicThrowable();
            this.f74594u0 = z10;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74597y0 = true;
            e();
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f74592s0.clear();
        }

        public final void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            if (this.v0) {
                Subscriber<? super R> subscriber = this.f74589p0;
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f74592s0;
                while (!this.f74597y0) {
                    Throwable th2 = this.G0.get();
                    if (th2 != null) {
                        spscLinkedArrayQueue.clear();
                        subscriber.onError(th2);
                        return;
                    }
                    boolean z10 = this.F0;
                    boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                    if (!zIsEmpty) {
                        subscriber.onNext(null);
                    }
                    if (z10 && zIsEmpty) {
                        subscriber.onComplete();
                        return;
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                spscLinkedArrayQueue.clear();
                return;
            }
            Subscriber<? super R> subscriber2 = this.f74589p0;
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue2 = this.f74592s0;
            int iAddAndGet2 = 1;
            do {
                long j10 = this.E0.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z11 = this.F0;
                    Object objPoll = spscLinkedArrayQueue2.poll();
                    boolean z12 = objPoll == null;
                    if (f(z11, z12, subscriber2, spscLinkedArrayQueue2)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    try {
                        R rApply = this.f74590q0.apply((Object[]) spscLinkedArrayQueue2.poll());
                        Objects.requireNonNull(rApply, "The combiner returned a null value");
                        subscriber2.onNext(rApply);
                        ((b) objPoll).a();
                        j11++;
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        e();
                        ExceptionHelper.addThrowable(this.G0, th3);
                        subscriber2.onError(ExceptionHelper.terminate(this.G0));
                        return;
                    }
                }
                if (j11 == j10 && f(this.F0, spscLinkedArrayQueue2.isEmpty(), subscriber2, spscLinkedArrayQueue2)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.E0.addAndGet(-j11);
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
            } while (iAddAndGet2 != 0);
        }

        public final void e() {
            for (b<T> bVar : this.f74591r0) {
                bVar.getClass();
                SubscriptionHelper.cancel(bVar);
            }
        }

        public final boolean f(boolean z10, boolean z11, Subscriber<?> subscriber, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.f74597y0) {
                e();
                spscLinkedArrayQueue.clear();
                this.G0.tryTerminateAndReport();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f74594u0) {
                if (!z11) {
                    return false;
                }
                e();
                this.G0.tryTerminateConsumer(subscriber);
                return true;
            }
            Throwable thTerminate = ExceptionHelper.terminate(this.G0);
            if (thTerminate != null && thTerminate != ExceptionHelper.TERMINATED) {
                e();
                spscLinkedArrayQueue.clear();
                subscriber.onError(thTerminate);
                return true;
            }
            if (!z11) {
                return false;
            }
            e();
            subscriber.onComplete();
            return true;
        }

        public final void g(int i10) {
            int i11;
            synchronized (this) {
                try {
                    Object[] objArr = this.f74593t0;
                    if (objArr[i10] != null && (i11 = this.f74596x0 + 1) != objArr.length) {
                        this.f74596x0 = i11;
                    } else {
                        this.F0 = true;
                        drain();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f74592s0.isEmpty();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final R poll() throws Throwable {
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f74592s0;
            Object objPoll = spscLinkedArrayQueue.poll();
            if (objPoll == null) {
                return null;
            }
            R rApply = this.f74590q0.apply((Object[]) spscLinkedArrayQueue.poll());
            Objects.requireNonNull(rApply, "The combiner returned a null value");
            ((b) objPoll).a();
            return rApply;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.E0, j10);
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 4) != 0) {
                return 0;
            }
            int i11 = i10 & 2;
            this.v0 = i11 != 0;
            return i11;
        }
    }

    public static final class b<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T, ?> f74598p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f74599q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f74600r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f74601s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f74602t0;

        public b(a<T, ?> aVar, int i10, int i11) {
            this.f74598p0 = aVar;
            this.f74599q0 = i10;
            this.f74600r0 = i11;
            this.f74601s0 = i11 - (i11 >> 2);
        }

        public final void a() {
            int i10 = this.f74602t0 + 1;
            if (i10 != this.f74601s0) {
                this.f74602t0 = i10;
            } else {
                this.f74602t0 = 0;
                get().request(i10);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74598p0.g(this.f74599q0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            a<T, ?> aVar = this.f74598p0;
            int i10 = this.f74599q0;
            if (!ExceptionHelper.addThrowable(aVar.G0, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                if (aVar.f74594u0) {
                    aVar.g(i10);
                    return;
                }
                aVar.e();
                aVar.F0 = true;
                aVar.drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            boolean z10;
            a<T, ?> aVar = this.f74598p0;
            int i10 = this.f74599q0;
            synchronized (aVar) {
                try {
                    Object[] objArr = aVar.f74593t0;
                    int i11 = aVar.f74595w0;
                    if (objArr[i10] == null) {
                        i11++;
                        aVar.f74595w0 = i11;
                    }
                    objArr[i10] = t10;
                    if (objArr.length == i11) {
                        aVar.f74592s0.offer(aVar.f74591r0[i10], objArr.clone());
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                aVar.f74591r0[i10].a();
            } else {
                aVar.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, this.f74600r0);
        }
    }

    public final class c implements Function<T, R> {
        public c() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // io.reactivex.rxjava3.functions.Function
        public final R apply(T t10) throws Throwable {
            return FlowableCombineLatest.this.f74586s0.apply(new Object[]{t10});
        }
    }

    public FlowableCombineLatest(@NonNull Publisher<? extends T>[] publisherArr, @NonNull Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.f74584q0 = publisherArr;
        this.f74585r0 = null;
        this.f74586s0 = function;
        this.f74587t0 = i10;
        this.f74588u0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        int length;
        Publisher<? extends T>[] publisherArr = this.f74584q0;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            try {
                length = 0;
                for (Publisher<? extends T> publisher : this.f74585r0) {
                    if (length == publisherArr.length) {
                        Publisher<? extends T>[] publisherArr2 = new Publisher[(length >> 2) + length];
                        System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                        publisherArr = publisherArr2;
                    }
                    int i10 = length + 1;
                    Objects.requireNonNull(publisher, "The Iterator returned a null Publisher");
                    publisherArr[length] = publisher;
                    length = i10;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, subscriber);
                return;
            }
        } else {
            length = publisherArr.length;
        }
        int i11 = length;
        if (i11 == 0) {
            EmptySubscription.complete(subscriber);
            return;
        }
        if (i11 == 1) {
            publisherArr[0].subscribe(new FlowableMap.b(subscriber, new c()));
            return;
        }
        a aVar = new a(subscriber, this.f74586s0, this.f74588u0, i11, this.f74587t0);
        subscriber.onSubscribe(aVar);
        b<T>[] bVarArr = aVar.f74591r0;
        for (int i12 = 0; i12 < i11 && !aVar.F0 && !aVar.f74597y0; i12++) {
            publisherArr[i12].subscribe(bVarArr[i12]);
        }
    }

    public FlowableCombineLatest(@NonNull Iterable<? extends Publisher<? extends T>> iterable, @NonNull Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.f74584q0 = null;
        this.f74585r0 = iterable;
        this.f74586s0 = function;
        this.f74587t0 = i10;
        this.f74588u0 = z10;
    }
}
