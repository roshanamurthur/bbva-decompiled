package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.rxjava3.internal.subscribers.SubscriberResourceWrapper;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Timed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableReplay<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final b f75273u0 = new b();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f75274q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<i<T>> f75275r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Supplier<? extends f<T>> f75276s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Publisher<T> f75277t0;

    public static final class b implements Supplier<Object> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new m(16);
        }
    }

    public static final class c<T> extends AtomicLong implements Subscription, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final i<T> f75282p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Subscriber<? super T> f75283q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Serializable f75284r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f75285s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f75286t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f75287u0;

        public c(i<T> iVar, Subscriber<? super T> subscriber) {
            this.f75282p0 = iVar;
            this.f75283q0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                i<T> iVar = this.f75282p0;
                iVar.b(this);
                iVar.a();
                this.f75284r0 = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (!SubscriptionHelper.validate(j10) || BackpressureHelper.addCancel(this, j10) == Long.MIN_VALUE) {
                return;
            }
            BackpressureHelper.add(this.f75285s0, j10);
            i<T> iVar = this.f75282p0;
            iVar.a();
            iVar.f75299p0.b(this);
        }
    }

    public static final class d<R, U> extends Flowable<R> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Supplier<? extends ConnectableFlowable<U>> f75288q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super Flowable<U>, ? extends Publisher<R>> f75289r0;

        public final class a implements Consumer<Disposable> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final SubscriberResourceWrapper<R> f75290p0;

            public a(SubscriberResourceWrapper subscriberResourceWrapper) {
                this.f75290p0 = subscriberResourceWrapper;
            }

            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(Disposable disposable) throws Throwable {
                this.f75290p0.setResource(disposable);
            }
        }

        public d(Function function, Supplier supplier) {
            this.f75288q0 = supplier;
            this.f75289r0 = function;
        }

        @Override // io.reactivex.rxjava3.core.Flowable
        public final void subscribeActual(Subscriber<? super R> subscriber) {
            try {
                ConnectableFlowable connectableFlowable = (ConnectableFlowable) ExceptionHelper.nullCheck(this.f75288q0.get(), "The connectableFactory returned a null ConnectableFlowable.");
                try {
                    Publisher publisher = (Publisher) ExceptionHelper.nullCheck(this.f75289r0.apply(connectableFlowable), "The selector returned a null Publisher.");
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

    public static final class e extends AtomicReference<e> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Object f75291p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f75292q0;

        public e(long j10, Object obj) {
            this.f75291p0 = obj;
            this.f75292q0 = j10;
        }
    }

    public interface f<T> {
        void a(T t10);

        void b(c<T> cVar);

        void complete();

        void error(Throwable th2);
    }

    public static final class g<T> implements Supplier<f<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f75293p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f75294q0;

        public g(int i10, boolean z10) {
            this.f75293p0 = i10;
            this.f75294q0 = z10;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() throws Throwable {
            return new l(this.f75293p0, this.f75294q0);
        }
    }

    public static final class h<T> implements Publisher<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<i<T>> f75295p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Supplier<? extends f<T>> f75296q0;

        public h(AtomicReference<i<T>> atomicReference, Supplier<? extends f<T>> supplier) {
            this.f75295p0 = atomicReference;
            this.f75296q0 = supplier;
        }

        @Override // org.reactivestreams.Publisher
        public final void subscribe(Subscriber<? super T> subscriber) {
            i<T> iVar;
            loop0: while (true) {
                AtomicReference<i<T>> atomicReference = this.f75295p0;
                iVar = atomicReference.get();
                if (iVar != null) {
                    break;
                }
                try {
                    i<T> iVar2 = new i<>(this.f75296q0.get(), atomicReference);
                    do {
                        if (atomicReference.compareAndSet(null, iVar2)) {
                            iVar = iVar2;
                            break loop0;
                        }
                    } while (atomicReference.get() == null);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, subscriber);
                    return;
                }
            }
            c<T> cVar = new c<>(iVar, subscriber);
            subscriber.onSubscribe(cVar);
            loop2: while (true) {
                AtomicReference<c<T>[]> atomicReference2 = iVar.f75301r0;
                c<T>[] cVarArr = atomicReference2.get();
                if (cVarArr == i.f75298x0) {
                    break;
                }
                int length = cVarArr.length;
                c<T>[] cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
                do {
                    if (atomicReference2.compareAndSet(cVarArr, cVarArr2)) {
                        break loop2;
                    }
                } while (atomicReference2.get() == cVarArr);
            }
            if (cVar.isDisposed()) {
                iVar.b(cVar);
            } else {
                iVar.a();
                iVar.f75299p0.b(cVar);
            }
        }
    }

    public static final class i<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final c[] f75297w0 = new c[0];

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final c[] f75298x0 = new c[0];

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final f<T> f75299p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f75300q0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f75304u0;
        public final AtomicReference<i<T>> v0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicInteger f75303t0 = new AtomicInteger();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<c<T>[]> f75301r0 = new AtomicReference<>(f75297w0);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicBoolean f75302s0 = new AtomicBoolean();

        public i(f<T> fVar, AtomicReference<i<T>> atomicReference) {
            this.f75299p0 = fVar;
            this.v0 = atomicReference;
        }

        public final void a() {
            AtomicInteger atomicInteger = this.f75303t0;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                Subscription subscription = get();
                if (subscription != null) {
                    long j10 = this.f75304u0;
                    long jMax = j10;
                    for (c<T> cVar : this.f75301r0.get()) {
                        jMax = Math.max(jMax, cVar.f75285s0.get());
                    }
                    long j11 = jMax - j10;
                    if (j11 != 0) {
                        this.f75304u0 = jMax;
                        subscription.request(j11);
                    }
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public final void b(c<T> cVar) {
            c<T>[] cVarArr;
            while (true) {
                AtomicReference<c<T>[]> atomicReference = this.f75301r0;
                c<T>[] cVarArr2 = atomicReference.get();
                int length = cVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (cVarArr2[i10].equals(cVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    cVarArr = f75297w0;
                } else {
                    c<T>[] cVarArr3 = new c[length - 1];
                    System.arraycopy(cVarArr2, 0, cVarArr3, 0, i10);
                    System.arraycopy(cVarArr2, i10 + 1, cVarArr3, i10, (length - i10) - 1);
                    cVarArr = cVarArr3;
                }
                while (!atomicReference.compareAndSet(cVarArr2, cVarArr)) {
                    if (atomicReference.get() != cVarArr2) {
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            AtomicReference<i<T>> atomicReference;
            this.f75301r0.set(f75298x0);
            do {
                atomicReference = this.v0;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75301r0.get() == f75298x0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75300q0) {
                return;
            }
            this.f75300q0 = true;
            f<T> fVar = this.f75299p0;
            fVar.complete();
            for (c<T> cVar : this.f75301r0.getAndSet(f75298x0)) {
                fVar.b(cVar);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75300q0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f75300q0 = true;
            f<T> fVar = this.f75299p0;
            fVar.error(th2);
            for (c<T> cVar : this.f75301r0.getAndSet(f75298x0)) {
                fVar.b(cVar);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75300q0) {
                return;
            }
            f<T> fVar = this.f75299p0;
            fVar.a(t10);
            for (c<T> cVar : this.f75301r0.get()) {
                fVar.b(cVar);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                a();
                for (c<T> cVar : this.f75301r0.get()) {
                    this.f75299p0.b(cVar);
                }
            }
        }
    }

    public static final class j<T> implements Supplier<f<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f75305p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f75306q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f75307r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f75308s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f75309t0;

        public j(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            this.f75305p0 = i10;
            this.f75306q0 = j10;
            this.f75307r0 = timeUnit;
            this.f75308s0 = scheduler;
            this.f75309t0 = z10;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() throws Throwable {
            return new k(this.f75305p0, this.f75306q0, this.f75307r0, this.f75308s0, this.f75309t0);
        }
    }

    public static final class k<T> extends a<T> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler f75310t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final long f75311u0;
        public final TimeUnit v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final int f75312w0;

        public k(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            super(z10);
            this.f75310t0 = scheduler;
            this.f75312w0 = i10;
            this.f75311u0 = j10;
            this.v0 = timeUnit;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.a
        public final Object c(Object obj, boolean z10) {
            TimeUnit timeUnit = this.v0;
            return new Timed(obj, z10 ? Long.MAX_VALUE : this.f75310t0.now(timeUnit), timeUnit);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.a
        public final e d() {
            e eVar;
            long jNow = this.f75310t0.now(this.v0) - this.f75311u0;
            e eVar2 = get();
            e eVar3 = eVar2.get();
            while (true) {
                e eVar4 = eVar3;
                eVar = eVar2;
                eVar2 = eVar4;
                if (eVar2 == null) {
                    break;
                }
                Timed timed = (Timed) eVar2.f75291p0;
                if (NotificationLite.isComplete(timed.value()) || NotificationLite.isError(timed.value()) || timed.time() > jNow) {
                    break;
                }
                eVar3 = eVar2.get();
            }
            return eVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.a
        public final Object e(Object obj) {
            return ((Timed) obj).value();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.a
        public final void g() {
            e eVar;
            long jNow = this.f75310t0.now(this.v0) - this.f75311u0;
            e eVar2 = get();
            e eVar3 = eVar2.get();
            int i10 = 0;
            while (true) {
                e eVar4 = eVar3;
                eVar = eVar2;
                eVar2 = eVar4;
                int i11 = this.f75280r0;
                if (i11 > 1) {
                    if (i11 <= this.f75312w0) {
                        if (((Timed) eVar2.f75291p0).time() > jNow) {
                            break;
                        }
                        i10++;
                        this.f75280r0--;
                        eVar3 = eVar2.get();
                    } else {
                        i10++;
                        this.f75280r0 = i11 - 1;
                        eVar3 = eVar2.get();
                    }
                } else {
                    break;
                }
            }
            if (i10 != 0) {
                f(eVar);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.a
        public final void h() {
            e eVar;
            long jNow = this.f75310t0.now(this.v0) - this.f75311u0;
            e eVar2 = get();
            e eVar3 = eVar2.get();
            int i10 = 0;
            while (true) {
                e eVar4 = eVar3;
                eVar = eVar2;
                eVar2 = eVar4;
                if (this.f75280r0 <= 1 || ((Timed) eVar2.f75291p0).time() > jNow) {
                    break;
                }
                i10++;
                this.f75280r0--;
                eVar3 = eVar2.get();
            }
            if (i10 != 0) {
                f(eVar);
            }
        }
    }

    public static final class l<T> extends a<T> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f75313t0;

        public l(int i10, boolean z10) {
            super(z10);
            this.f75313t0 = i10;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.a
        public final void g() {
            if (this.f75280r0 > this.f75313t0) {
                e eVar = get().get();
                if (eVar == null) {
                    throw new IllegalStateException("Empty list!");
                }
                this.f75280r0--;
                f(eVar);
            }
        }
    }

    public static final class m<T> extends ArrayList<Object> implements f<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public volatile int f75314p0;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.f
        public final void a(T t10) {
            add(NotificationLite.next(t10));
            this.f75314p0++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.f
        public final void b(c<T> cVar) {
            synchronized (cVar) {
                try {
                    if (cVar.f75286t0) {
                        cVar.f75287u0 = true;
                        return;
                    }
                    cVar.f75286t0 = true;
                    Subscriber<? super T> subscriber = cVar.f75283q0;
                    while (!cVar.isDisposed()) {
                        int i10 = this.f75314p0;
                        Integer num = (Integer) cVar.f75284r0;
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j10 = cVar.get();
                        long j11 = j10;
                        long j12 = 0;
                        while (j11 != 0 && iIntValue < i10) {
                            Object obj = get(iIntValue);
                            try {
                                if (NotificationLite.accept(obj, subscriber) || cVar.isDisposed()) {
                                    return;
                                }
                                iIntValue++;
                                j11--;
                                j12++;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                cVar.dispose();
                                if (NotificationLite.isError(obj) || NotificationLite.isComplete(obj)) {
                                    RxJavaPlugins.onError(th2);
                                    return;
                                } else {
                                    subscriber.onError(th2);
                                    return;
                                }
                            }
                        }
                        if (j12 != 0) {
                            cVar.f75284r0 = Integer.valueOf(iIntValue);
                            if (j10 != Long.MAX_VALUE) {
                                BackpressureHelper.producedCancel(cVar, j12);
                            }
                        }
                        synchronized (cVar) {
                            try {
                                if (!cVar.f75287u0) {
                                    cVar.f75286t0 = false;
                                    return;
                                }
                                cVar.f75287u0 = false;
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

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.f
        public final void complete() {
            add(NotificationLite.complete());
            this.f75314p0++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.f
        public final void error(Throwable th2) {
            add(NotificationLite.error(th2));
            this.f75314p0++;
        }
    }

    public FlowableReplay(h hVar, Flowable flowable, AtomicReference atomicReference, Supplier supplier) {
        this.f75277t0 = hVar;
        this.f75274q0 = flowable;
        this.f75275r0 = atomicReference;
        this.f75276s0 = supplier;
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i10, boolean z10) {
        return i10 == Integer.MAX_VALUE ? createFrom(flowable) : e(flowable, new g(i10, z10));
    }

    public static <T> ConnectableFlowable<T> createFrom(Flowable<? extends T> flowable) {
        return e(flowable, f75273u0);
    }

    public static <T> ConnectableFlowable<T> e(Flowable<T> flowable, Supplier<? extends f<T>> supplier) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowableReplay(new h(atomicReference, supplier), flowable, atomicReference, supplier));
    }

    public static <U, R> Flowable<R> multicastSelector(Supplier<? extends ConnectableFlowable<U>> supplier, Function<? super Flowable<U>, ? extends Publisher<R>> function) {
        return new d(function, supplier);
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        i<T> iVar;
        loop0: while (true) {
            AtomicReference<i<T>> atomicReference = this.f75275r0;
            iVar = atomicReference.get();
            if (iVar != null && !iVar.isDisposed()) {
                break;
            }
            try {
                i<T> iVar2 = new i<>(this.f75276s0.get(), atomicReference);
                do {
                    if (atomicReference.compareAndSet(iVar, iVar2)) {
                        iVar = iVar2;
                        break loop0;
                    }
                } while (atomicReference.get() == iVar);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                throw ExceptionHelper.wrapOrThrow(th2);
            }
        }
        AtomicBoolean atomicBoolean = iVar.f75302s0;
        boolean z10 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            consumer.accept(iVar);
            if (z10) {
                this.f75274q0.subscribe((FlowableSubscriber) iVar);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            if (z10) {
                atomicBoolean.compareAndSet(true, false);
            }
            Exceptions.throwIfFatal(th3);
            throw ExceptionHelper.wrapOrThrow(th3);
        }
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    public void reset() {
        AtomicReference<i<T>> atomicReference = this.f75275r0;
        i<T> iVar = atomicReference.get();
        if (iVar == null || !iVar.isDisposed()) {
            return;
        }
        while (!atomicReference.compareAndSet(iVar, null) && atomicReference.get() == iVar) {
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.f75274q0;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f75277t0.subscribe(subscriber);
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        return create(flowable, j10, timeUnit, scheduler, Integer.MAX_VALUE, z10);
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        return e(flowable, new j(i10, j10, timeUnit, scheduler, z10));
    }

    public static abstract class a<T> extends AtomicReference<e> implements f<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f75278p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public e f75279q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f75280r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f75281s0;

        public a(boolean z10) {
            this.f75278p0 = z10;
            e eVar = new e(0L, null);
            this.f75279q0 = eVar;
            set(eVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.f
        public final void a(T t10) {
            Object objC = c(NotificationLite.next(t10), false);
            long j10 = this.f75281s0 + 1;
            this.f75281s0 = j10;
            e eVar = new e(j10, objC);
            this.f75279q0.set(eVar);
            this.f75279q0 = eVar;
            this.f75280r0++;
            g();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.f
        public final void b(c<T> cVar) {
            synchronized (cVar) {
                try {
                    if (cVar.f75286t0) {
                        cVar.f75287u0 = true;
                        return;
                    }
                    cVar.f75286t0 = true;
                    while (true) {
                        long j10 = cVar.get();
                        boolean z10 = j10 == Long.MAX_VALUE;
                        e eVarD = (e) cVar.f75284r0;
                        if (eVarD == null) {
                            eVarD = d();
                            cVar.f75284r0 = eVarD;
                            BackpressureHelper.add(cVar.f75285s0, eVarD.f75292q0);
                        }
                        long j11 = 0;
                        while (j10 != 0) {
                            if (!cVar.isDisposed()) {
                                e eVar = eVarD.get();
                                if (eVar == null) {
                                    break;
                                }
                                Object objE = e(eVar.f75291p0);
                                try {
                                    if (NotificationLite.accept(objE, cVar.f75283q0)) {
                                        cVar.f75284r0 = null;
                                        return;
                                    } else {
                                        j11++;
                                        j10--;
                                        eVarD = eVar;
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    cVar.f75284r0 = null;
                                    cVar.dispose();
                                    if (NotificationLite.isError(objE) || NotificationLite.isComplete(objE)) {
                                        RxJavaPlugins.onError(th2);
                                        return;
                                    } else {
                                        cVar.f75283q0.onError(th2);
                                        return;
                                    }
                                }
                            } else {
                                cVar.f75284r0 = null;
                                return;
                            }
                        }
                        if (j10 == 0 && cVar.isDisposed()) {
                            cVar.f75284r0 = null;
                            return;
                        }
                        if (j11 != 0) {
                            cVar.f75284r0 = eVarD;
                            if (!z10) {
                                BackpressureHelper.producedCancel(cVar, j11);
                            }
                        }
                        synchronized (cVar) {
                            try {
                                if (!cVar.f75287u0) {
                                    cVar.f75286t0 = false;
                                    return;
                                }
                                cVar.f75287u0 = false;
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

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.f
        public final void complete() {
            Object objC = c(NotificationLite.complete(), true);
            long j10 = this.f75281s0 + 1;
            this.f75281s0 = j10;
            e eVar = new e(j10, objC);
            this.f75279q0.set(eVar);
            this.f75279q0 = eVar;
            this.f75280r0++;
            h();
        }

        public e d() {
            return get();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.f
        public final void error(Throwable th2) {
            Object objC = c(NotificationLite.error(th2), true);
            long j10 = this.f75281s0 + 1;
            this.f75281s0 = j10;
            e eVar = new e(j10, objC);
            this.f75279q0.set(eVar);
            this.f75279q0 = eVar;
            this.f75280r0++;
            h();
        }

        public final void f(e eVar) {
            if (this.f75278p0) {
                e eVar2 = new e(eVar.f75292q0, null);
                eVar2.lazySet(eVar.get());
                eVar = eVar2;
            }
            set(eVar);
        }

        public abstract void g();

        public void h() {
            e eVar = get();
            if (eVar.f75291p0 != null) {
                e eVar2 = new e(0L, null);
                eVar2.lazySet(eVar.get());
                set(eVar2);
            }
        }

        public Object e(Object obj) {
            return obj;
        }

        public Object c(Object obj, boolean z10) {
            return obj;
        }
    }
}
