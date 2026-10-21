package io.reactivex.rxjava3.processors;

import com.bbva.image.transform.ScaleToMaxSideTransformer;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Object[] f78302t0 = new Object[0];

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final c[] f78303u0 = new c[0];
    public static final c[] v0 = new c[0];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final b<T> f78304q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f78305r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicReference<c<T>[]> f78306s0 = new AtomicReference<>(f78303u0);

    public static final class a<T> extends AtomicReference<a<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f78307p0;

        public a(T t10) {
            this.f78307p0 = t10;
        }
    }

    public interface b<T> {
        void a(T t10);

        void b();

        T[] c(T[] tArr);

        void complete();

        void d(c<T> cVar);

        void error(Throwable th2);

        Throwable getError();

        @Nullable
        T getValue();

        boolean isDone();

        int size();
    }

    public static final class c<T> extends AtomicInteger implements Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f78308p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ReplayProcessor<T> f78309q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Serializable f78310r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f78311s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f78312t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f78313u0;

        public c(Subscriber<? super T> subscriber, ReplayProcessor<T> replayProcessor) {
            this.f78308p0 = subscriber;
            this.f78309q0 = replayProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f78312t0) {
                return;
            }
            this.f78312t0 = true;
            this.f78309q0.e(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f78311s0, j10);
                this.f78309q0.f78304q0.d(this);
            }
        }
    }

    public static final class d<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f78315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f78316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Scheduler f78317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f78318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile f<T> f78319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public f<T> f78320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Throwable f78321h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f78322i;

        public d(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f78314a = i10;
            this.f78315b = j10;
            this.f78316c = timeUnit;
            this.f78317d = scheduler;
            f<T> fVar = new f<>(0L, null);
            this.f78320g = fVar;
            this.f78319f = fVar;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void a(T t10) {
            f<T> fVar = new f<>(this.f78317d.now(this.f78316c), t10);
            f<T> fVar2 = this.f78320g;
            this.f78320g = fVar;
            this.f78318e++;
            fVar2.set(fVar);
            int i10 = this.f78318e;
            if (i10 > this.f78314a) {
                this.f78318e = i10 - 1;
                this.f78319f = this.f78319f.get();
            }
            long jNow = this.f78317d.now(this.f78316c) - this.f78315b;
            f<T> fVar3 = this.f78319f;
            while (this.f78318e > 1) {
                f<T> fVar4 = fVar3.get();
                if (fVar4.f78330q0 > jNow) {
                    this.f78319f = fVar3;
                    return;
                } else {
                    this.f78318e--;
                    fVar3 = fVar4;
                }
            }
            this.f78319f = fVar3;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void b() {
            if (this.f78319f.f78329p0 != null) {
                f<T> fVar = new f<>(0L, null);
                fVar.lazySet(this.f78319f.get());
                this.f78319f = fVar;
            }
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final T[] c(T[] tArr) {
            f<T> fVarE = e();
            f<T> fVar = fVarE;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (fVar = fVar.get()) != null) {
                i10++;
            }
            if (i10 != 0) {
                if (tArr.length < i10) {
                    tArr = (T[]) ((Object[]) androidx.collection.a.b(tArr, i10));
                }
                for (int i11 = 0; i11 != i10; i11++) {
                    fVarE = fVarE.get();
                    tArr[i11] = fVarE.f78329p0;
                }
                if (tArr.length > i10) {
                    tArr[i10] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void complete() {
            f();
            this.f78322i = true;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = cVar.f78308p0;
            f<T> fVarE = (f) cVar.f78310r0;
            if (fVarE == null) {
                fVarE = e();
            }
            long j10 = cVar.f78313u0;
            int iAddAndGet = 1;
            do {
                long j11 = cVar.f78311s0.get();
                while (j10 != j11) {
                    if (cVar.f78312t0) {
                        cVar.f78310r0 = null;
                        return;
                    }
                    boolean z10 = this.f78322i;
                    f<T> fVar = fVarE.get();
                    boolean z11 = fVar == null;
                    if (z10 && z11) {
                        cVar.f78310r0 = null;
                        cVar.f78312t0 = true;
                        Throwable th2 = this.f78321h;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(fVar.f78329p0);
                    j10++;
                    fVarE = fVar;
                }
                if (j10 == j11) {
                    if (cVar.f78312t0) {
                        cVar.f78310r0 = null;
                        return;
                    }
                    if (this.f78322i && fVarE.get() == null) {
                        cVar.f78310r0 = null;
                        cVar.f78312t0 = true;
                        Throwable th3 = this.f78321h;
                        if (th3 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th3);
                            return;
                        }
                    }
                }
                cVar.f78310r0 = fVarE;
                cVar.f78313u0 = j10;
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final f<T> e() {
            f<T> fVar;
            f<T> fVar2 = this.f78319f;
            long jNow = this.f78317d.now(this.f78316c) - this.f78315b;
            f<T> fVar3 = fVar2.get();
            while (true) {
                f<T> fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || fVar2.f78330q0 > jNow) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void error(Throwable th2) {
            f();
            this.f78321h = th2;
            this.f78322i = true;
        }

        public final void f() {
            long jNow = this.f78317d.now(this.f78316c) - this.f78315b;
            f<T> fVar = this.f78319f;
            while (true) {
                f<T> fVar2 = fVar.get();
                if (fVar2 == null) {
                    if (fVar.f78329p0 != null) {
                        this.f78319f = new f<>(0L, null);
                        return;
                    } else {
                        this.f78319f = fVar;
                        return;
                    }
                }
                if (fVar2.f78330q0 > jNow) {
                    if (fVar.f78329p0 == null) {
                        this.f78319f = fVar;
                        return;
                    }
                    f<T> fVar3 = new f<>(0L, null);
                    fVar3.lazySet(fVar.get());
                    this.f78319f = fVar3;
                    return;
                }
                fVar = fVar2;
            }
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final Throwable getError() {
            return this.f78321h;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        @Nullable
        public final T getValue() {
            f<T> fVar = this.f78319f;
            while (true) {
                f<T> fVar2 = fVar.get();
                if (fVar2 == null) {
                    break;
                }
                fVar = fVar2;
            }
            if (fVar.f78330q0 < this.f78317d.now(this.f78316c) - this.f78315b) {
                return null;
            }
            return fVar.f78329p0;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final boolean isDone() {
            return this.f78322i;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final int size() {
            f<T> fVarE = e();
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (fVarE = fVarE.get()) != null) {
                i10++;
            }
            return i10;
        }
    }

    public static final class e<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f78324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile a<T> f78325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<T> f78326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Throwable f78327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f78328f;

        public e(int i10) {
            this.f78323a = i10;
            a<T> aVar = new a<>(null);
            this.f78326d = aVar;
            this.f78325c = aVar;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void a(T t10) {
            a<T> aVar = new a<>(t10);
            a<T> aVar2 = this.f78326d;
            this.f78326d = aVar;
            this.f78324b++;
            aVar2.set(aVar);
            int i10 = this.f78324b;
            if (i10 > this.f78323a) {
                this.f78324b = i10 - 1;
                this.f78325c = this.f78325c.get();
            }
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void b() {
            if (this.f78325c.f78307p0 != null) {
                a<T> aVar = new a<>(null);
                aVar.lazySet(this.f78325c.get());
                this.f78325c = aVar;
            }
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final T[] c(T[] tArr) {
            a<T> aVar = this.f78325c;
            a<T> aVar2 = aVar;
            int i10 = 0;
            while (true) {
                aVar2 = aVar2.get();
                if (aVar2 == null) {
                    break;
                }
                i10++;
            }
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) androidx.collection.a.b(tArr, i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                aVar = aVar.get();
                tArr[i11] = aVar.f78307p0;
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void complete() {
            b();
            this.f78328f = true;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = cVar.f78308p0;
            a<T> aVar = (a) cVar.f78310r0;
            if (aVar == null) {
                aVar = this.f78325c;
            }
            long j10 = cVar.f78313u0;
            int iAddAndGet = 1;
            do {
                long j11 = cVar.f78311s0.get();
                while (j10 != j11) {
                    if (cVar.f78312t0) {
                        cVar.f78310r0 = null;
                        return;
                    }
                    boolean z10 = this.f78328f;
                    a<T> aVar2 = aVar.get();
                    boolean z11 = aVar2 == null;
                    if (z10 && z11) {
                        cVar.f78310r0 = null;
                        cVar.f78312t0 = true;
                        Throwable th2 = this.f78327e;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(aVar2.f78307p0);
                    j10++;
                    aVar = aVar2;
                }
                if (j10 == j11) {
                    if (cVar.f78312t0) {
                        cVar.f78310r0 = null;
                        return;
                    }
                    if (this.f78328f && aVar.get() == null) {
                        cVar.f78310r0 = null;
                        cVar.f78312t0 = true;
                        Throwable th3 = this.f78327e;
                        if (th3 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th3);
                            return;
                        }
                    }
                }
                cVar.f78310r0 = aVar;
                cVar.f78313u0 = j10;
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void error(Throwable th2) {
            this.f78327e = th2;
            b();
            this.f78328f = true;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final Throwable getError() {
            return this.f78327e;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final T getValue() {
            a<T> aVar = this.f78325c;
            while (true) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    return aVar.f78307p0;
                }
                aVar = aVar2;
            }
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final boolean isDone() {
            return this.f78328f;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final int size() {
            a<T> aVar = this.f78325c;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (aVar = aVar.get()) != null) {
                i10++;
            }
            return i10;
        }
    }

    public static final class f<T> extends AtomicReference<f<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f78329p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f78330q0;

        /* JADX WARN: Multi-variable type inference failed */
        public f(long j10, Object obj) {
            this.f78329p0 = obj;
            this.f78330q0 = j10;
        }
    }

    public ReplayProcessor(b<T> bVar) {
        this.f78304q0 = bVar;
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create() {
        return new ReplayProcessor<>(new g(16));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithSize(int i10) {
        ObjectHelper.verifyPositive(i10, ScaleToMaxSideTransformer.SIDE);
        return new ReplayProcessor<>(new e(i10));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTime(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler) {
        ObjectHelper.verifyPositive(j10, "maxAge");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ReplayProcessor<>(new d(Integer.MAX_VALUE, j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTimeAndSize(long j10, @NonNull TimeUnit timeUnit, @NonNull Scheduler scheduler, int i10) {
        ObjectHelper.verifyPositive(i10, ScaleToMaxSideTransformer.SIDE);
        ObjectHelper.verifyPositive(j10, "maxAge");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ReplayProcessor<>(new d(i10, j10, timeUnit, scheduler));
    }

    public void cleanupBuffer() {
        this.f78304q0.b();
    }

    public final void e(c<T> cVar) {
        c<T>[] cVarArr;
        while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f78306s0;
            c<T>[] cVarArr2 = atomicReference.get();
            if (cVarArr2 == v0 || cVarArr2 == (cVarArr = f78303u0)) {
                return;
            }
            int length = cVarArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (cVarArr2[i10] == cVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length != 1) {
                cVarArr = new c[length - 1];
                System.arraycopy(cVarArr2, 0, cVarArr, 0, i10);
                System.arraycopy(cVarArr2, i10 + 1, cVarArr, i10, (length - i10) - 1);
            }
            while (!atomicReference.compareAndSet(cVarArr2, cVarArr)) {
                if (atomicReference.get() != cVarArr2) {
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    @Nullable
    public Throwable getThrowable() {
        b<T> bVar = this.f78304q0;
        if (bVar.isDone()) {
            return bVar.getError();
        }
        return null;
    }

    @CheckReturnValue
    public T getValue() {
        return this.f78304q0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    public Object[] getValues() {
        Object[] objArr = f78302t0;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasComplete() {
        b<T> bVar = this.f78304q0;
        return bVar.isDone() && bVar.getError() == null;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasSubscribers() {
        return this.f78306s0.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.FlowableProcessor
    @CheckReturnValue
    public boolean hasThrowable() {
        b<T> bVar = this.f78304q0;
        return bVar.isDone() && bVar.getError() != null;
    }

    @CheckReturnValue
    public boolean hasValue() {
        return this.f78304q0.size() != 0;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f78305r0) {
            return;
        }
        this.f78305r0 = true;
        b<T> bVar = this.f78304q0;
        bVar.complete();
        for (c<T> cVar : this.f78306s0.getAndSet(v0)) {
            bVar.d(cVar);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        ExceptionHelper.nullCheck(th2, "onError called with a null Throwable.");
        if (this.f78305r0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78305r0 = true;
        b<T> bVar = this.f78304q0;
        bVar.error(th2);
        for (c<T> cVar : this.f78306s0.getAndSet(v0)) {
            bVar.d(cVar);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        ExceptionHelper.nullCheck(t10, "onNext called with a null value.");
        if (this.f78305r0) {
            return;
        }
        b<T> bVar = this.f78304q0;
        bVar.a(t10);
        for (c<T> cVar : this.f78306s0.get()) {
            bVar.d(cVar);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f78305r0) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        c<T> cVar = new c<>(subscriber, this);
        subscriber.onSubscribe(cVar);
        loop0: while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f78306s0;
            c<T>[] cVarArr = atomicReference.get();
            if (cVarArr == v0) {
                break;
            }
            int length = cVarArr.length;
            c<T>[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            do {
                if (atomicReference.compareAndSet(cVarArr, cVarArr2)) {
                    if (!cVar.f78312t0) {
                        break loop0;
                    }
                    e(cVar);
                    return;
                }
            } while (atomicReference.get() == cVarArr);
        }
        this.f78304q0.d(cVar);
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create(int i10) {
        ObjectHelper.verifyPositive(i10, "capacityHint");
        return new ReplayProcessor<>(new g(i10));
    }

    @CheckReturnValue
    public T[] getValues(T[] tArr) {
        return this.f78304q0.c(tArr);
    }

    public static final class g<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f78331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Throwable f78332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f78333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile int f78334d;

        public g(int i10) {
            this.f78331a = new ArrayList(i10);
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void a(T t10) {
            this.f78331a.add(t10);
            this.f78334d++;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final T[] c(T[] tArr) {
            int i10 = this.f78334d;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            ArrayList arrayList = this.f78331a;
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) androidx.collection.a.b(tArr, i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                tArr[i11] = arrayList.get(i11);
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void complete() {
            this.f78333c = true;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void d(c<T> cVar) {
            int iIntValue;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            ArrayList arrayList = this.f78331a;
            Subscriber<? super T> subscriber = cVar.f78308p0;
            Integer num = (Integer) cVar.f78310r0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                cVar.f78310r0 = 0;
            }
            long j10 = cVar.f78313u0;
            int iAddAndGet = 1;
            do {
                long j11 = cVar.f78311s0.get();
                while (j10 != j11) {
                    if (cVar.f78312t0) {
                        cVar.f78310r0 = null;
                        return;
                    }
                    boolean z10 = this.f78333c;
                    int i10 = this.f78334d;
                    if (z10 && iIntValue == i10) {
                        cVar.f78310r0 = null;
                        cVar.f78312t0 = true;
                        Throwable th2 = this.f78332b;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                    if (iIntValue == i10) {
                        break;
                    }
                    subscriber.onNext((Object) arrayList.get(iIntValue));
                    iIntValue++;
                    j10++;
                }
                if (j10 == j11) {
                    if (cVar.f78312t0) {
                        cVar.f78310r0 = null;
                        return;
                    }
                    boolean z11 = this.f78333c;
                    int i11 = this.f78334d;
                    if (z11 && iIntValue == i11) {
                        cVar.f78310r0 = null;
                        cVar.f78312t0 = true;
                        Throwable th3 = this.f78332b;
                        if (th3 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th3);
                            return;
                        }
                    }
                }
                cVar.f78310r0 = Integer.valueOf(iIntValue);
                cVar.f78313u0 = j10;
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void error(Throwable th2) {
            this.f78332b = th2;
            this.f78333c = true;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final Throwable getError() {
            return this.f78332b;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        @Nullable
        public final T getValue() {
            int i10 = this.f78334d;
            if (i10 == 0) {
                return null;
            }
            return (T) this.f78331a.get(i10 - 1);
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final boolean isDone() {
            return this.f78333c;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final int size() {
            return this.f78334d;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.b
        public final void b() {
        }
    }
}
