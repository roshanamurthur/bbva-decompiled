package io.reactivex.processors;

import com.bbva.image.transform.ScaleToMaxSideTransformer;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Object[] f73893t0 = new Object[0];

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final c[] f73894u0 = new c[0];
    public static final c[] v0 = new c[0];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final b<T> f73895q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f73896r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicReference<c<T>[]> f73897s0 = new AtomicReference<>(f73894u0);

    public static final class a<T> extends AtomicReference<a<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f73898p0;

        public a(T t10) {
            this.f73898p0 = t10;
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
        public final Subscriber<? super T> f73899p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ReplayProcessor<T> f73900q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Serializable f73901r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f73902s0 = new AtomicLong();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f73903t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f73904u0;

        public c(Subscriber<? super T> subscriber, ReplayProcessor<T> replayProcessor) {
            this.f73899p0 = subscriber;
            this.f73900q0 = replayProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f73903t0) {
                return;
            }
            this.f73903t0 = true;
            this.f73900q0.e(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f73902s0, j10);
                this.f73900q0.f73895q0.d(this);
            }
        }
    }

    public static final class d<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f73906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f73907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Scheduler f73908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f73909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile f<T> f73910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public f<T> f73911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Throwable f73912h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f73913i;

        public d(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f73905a = ObjectHelper.verifyPositive(i10, ScaleToMaxSideTransformer.SIDE);
            this.f73906b = ObjectHelper.verifyPositive(j10, "maxAge");
            this.f73907c = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.f73908d = (Scheduler) ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            f<T> fVar = new f<>(0L, null);
            this.f73911g = fVar;
            this.f73910f = fVar;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void a(T t10) {
            f<T> fVar = new f<>(this.f73908d.now(this.f73907c), t10);
            f<T> fVar2 = this.f73911g;
            this.f73911g = fVar;
            this.f73909e++;
            fVar2.set(fVar);
            int i10 = this.f73909e;
            if (i10 > this.f73905a) {
                this.f73909e = i10 - 1;
                this.f73910f = this.f73910f.get();
            }
            long jNow = this.f73908d.now(this.f73907c) - this.f73906b;
            f<T> fVar3 = this.f73910f;
            while (this.f73909e > 1) {
                f<T> fVar4 = fVar3.get();
                if (fVar4 == null) {
                    this.f73910f = fVar3;
                    return;
                } else if (fVar4.f73921q0 > jNow) {
                    this.f73910f = fVar3;
                    return;
                } else {
                    this.f73909e--;
                    fVar3 = fVar4;
                }
            }
            this.f73910f = fVar3;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void b() {
            if (this.f73910f.f73920p0 != null) {
                f<T> fVar = new f<>(0L, null);
                fVar.lazySet(this.f73910f.get());
                this.f73910f = fVar;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
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
                    tArr[i11] = fVarE.f73920p0;
                }
                if (tArr.length > i10) {
                    tArr[i10] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void complete() {
            f();
            this.f73913i = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = cVar.f73899p0;
            f<T> fVarE = (f) cVar.f73901r0;
            if (fVarE == null) {
                fVarE = e();
            }
            long j10 = cVar.f73904u0;
            int iAddAndGet = 1;
            do {
                long j11 = cVar.f73902s0.get();
                while (j10 != j11) {
                    if (cVar.f73903t0) {
                        cVar.f73901r0 = null;
                        return;
                    }
                    boolean z10 = this.f73913i;
                    f<T> fVar = fVarE.get();
                    boolean z11 = fVar == null;
                    if (z10 && z11) {
                        cVar.f73901r0 = null;
                        cVar.f73903t0 = true;
                        Throwable th2 = this.f73912h;
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
                    subscriber.onNext(fVar.f73920p0);
                    j10++;
                    fVarE = fVar;
                }
                if (j10 == j11) {
                    if (cVar.f73903t0) {
                        cVar.f73901r0 = null;
                        return;
                    }
                    if (this.f73913i && fVarE.get() == null) {
                        cVar.f73901r0 = null;
                        cVar.f73903t0 = true;
                        Throwable th3 = this.f73912h;
                        if (th3 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th3);
                            return;
                        }
                    }
                }
                cVar.f73901r0 = fVarE;
                cVar.f73904u0 = j10;
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final f<T> e() {
            f<T> fVar;
            f<T> fVar2 = this.f73910f;
            long jNow = this.f73908d.now(this.f73907c) - this.f73906b;
            f<T> fVar3 = fVar2.get();
            while (true) {
                f<T> fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || fVar2.f73921q0 > jNow) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void error(Throwable th2) {
            f();
            this.f73912h = th2;
            this.f73913i = true;
        }

        public final void f() {
            long jNow = this.f73908d.now(this.f73907c) - this.f73906b;
            f<T> fVar = this.f73910f;
            while (true) {
                f<T> fVar2 = fVar.get();
                if (fVar2 == null) {
                    if (fVar.f73920p0 != null) {
                        this.f73910f = new f<>(0L, null);
                        return;
                    } else {
                        this.f73910f = fVar;
                        return;
                    }
                }
                if (fVar2.f73921q0 > jNow) {
                    if (fVar.f73920p0 == null) {
                        this.f73910f = fVar;
                        return;
                    }
                    f<T> fVar3 = new f<>(0L, null);
                    fVar3.lazySet(fVar.get());
                    this.f73910f = fVar3;
                    return;
                }
                fVar = fVar2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final Throwable getError() {
            return this.f73912h;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        @Nullable
        public final T getValue() {
            f<T> fVar = this.f73910f;
            while (true) {
                f<T> fVar2 = fVar.get();
                if (fVar2 == null) {
                    break;
                }
                fVar = fVar2;
            }
            if (fVar.f73921q0 < this.f73908d.now(this.f73907c) - this.f73906b) {
                return null;
            }
            return fVar.f73920p0;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final boolean isDone() {
            return this.f73913i;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
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
        public final int f73914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f73915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile a<T> f73916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<T> f73917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Throwable f73918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f73919f;

        public e(int i10) {
            this.f73914a = ObjectHelper.verifyPositive(i10, ScaleToMaxSideTransformer.SIDE);
            a<T> aVar = new a<>(null);
            this.f73917d = aVar;
            this.f73916c = aVar;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void a(T t10) {
            a<T> aVar = new a<>(t10);
            a<T> aVar2 = this.f73917d;
            this.f73917d = aVar;
            this.f73915b++;
            aVar2.set(aVar);
            int i10 = this.f73915b;
            if (i10 > this.f73914a) {
                this.f73915b = i10 - 1;
                this.f73916c = this.f73916c.get();
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void b() {
            if (this.f73916c.f73898p0 != null) {
                a<T> aVar = new a<>(null);
                aVar.lazySet(this.f73916c.get());
                this.f73916c = aVar;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final T[] c(T[] tArr) {
            a<T> aVar = this.f73916c;
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
                tArr[i11] = aVar.f73898p0;
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void complete() {
            b();
            this.f73919f = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = cVar.f73899p0;
            a<T> aVar = (a) cVar.f73901r0;
            if (aVar == null) {
                aVar = this.f73916c;
            }
            long j10 = cVar.f73904u0;
            int iAddAndGet = 1;
            do {
                long j11 = cVar.f73902s0.get();
                while (j10 != j11) {
                    if (cVar.f73903t0) {
                        cVar.f73901r0 = null;
                        return;
                    }
                    boolean z10 = this.f73919f;
                    a<T> aVar2 = aVar.get();
                    boolean z11 = aVar2 == null;
                    if (z10 && z11) {
                        cVar.f73901r0 = null;
                        cVar.f73903t0 = true;
                        Throwable th2 = this.f73918e;
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
                    subscriber.onNext(aVar2.f73898p0);
                    j10++;
                    aVar = aVar2;
                }
                if (j10 == j11) {
                    if (cVar.f73903t0) {
                        cVar.f73901r0 = null;
                        return;
                    }
                    if (this.f73919f && aVar.get() == null) {
                        cVar.f73901r0 = null;
                        cVar.f73903t0 = true;
                        Throwable th3 = this.f73918e;
                        if (th3 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th3);
                            return;
                        }
                    }
                }
                cVar.f73901r0 = aVar;
                cVar.f73904u0 = j10;
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void error(Throwable th2) {
            this.f73918e = th2;
            b();
            this.f73919f = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final Throwable getError() {
            return this.f73918e;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final T getValue() {
            a<T> aVar = this.f73916c;
            while (true) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    return aVar.f73898p0;
                }
                aVar = aVar2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final boolean isDone() {
            return this.f73919f;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final int size() {
            a<T> aVar = this.f73916c;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (aVar = aVar.get()) != null) {
                i10++;
            }
            return i10;
        }
    }

    public static final class f<T> extends AtomicReference<f<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f73920p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73921q0;

        /* JADX WARN: Multi-variable type inference failed */
        public f(long j10, Object obj) {
            this.f73920p0 = obj;
            this.f73921q0 = j10;
        }
    }

    public ReplayProcessor(b<T> bVar) {
        this.f73895q0 = bVar;
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create() {
        return new ReplayProcessor<>(new g(16));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithSize(int i10) {
        return new ReplayProcessor<>(new e(i10));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTime(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new ReplayProcessor<>(new d(Integer.MAX_VALUE, j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTimeAndSize(long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
        return new ReplayProcessor<>(new d(i10, j10, timeUnit, scheduler));
    }

    public void cleanupBuffer() {
        this.f73895q0.b();
    }

    public final void e(c<T> cVar) {
        c<T>[] cVarArr;
        while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f73897s0;
            c<T>[] cVarArr2 = atomicReference.get();
            if (cVarArr2 == v0 || cVarArr2 == (cVarArr = f73894u0)) {
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

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        b<T> bVar = this.f73895q0;
        if (bVar.isDone()) {
            return bVar.getError();
        }
        return null;
    }

    public T getValue() {
        return this.f73895q0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f73893t0;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        b<T> bVar = this.f73895q0;
        return bVar.isDone() && bVar.getError() == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.f73897s0.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        b<T> bVar = this.f73895q0;
        return bVar.isDone() && bVar.getError() != null;
    }

    public boolean hasValue() {
        return this.f73895q0.size() != 0;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f73896r0) {
            return;
        }
        this.f73896r0 = true;
        b<T> bVar = this.f73895q0;
        bVar.complete();
        for (c<T> cVar : this.f73897s0.getAndSet(v0)) {
            bVar.d(cVar);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f73896r0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f73896r0 = true;
        b<T> bVar = this.f73895q0;
        bVar.error(th2);
        for (c<T> cVar : this.f73897s0.getAndSet(v0)) {
            bVar.d(cVar);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        ObjectHelper.requireNonNull(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f73896r0) {
            return;
        }
        b<T> bVar = this.f73895q0;
        bVar.a(t10);
        for (c<T> cVar : this.f73897s0.get()) {
            bVar.d(cVar);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f73896r0) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        c<T> cVar = new c<>(subscriber, this);
        subscriber.onSubscribe(cVar);
        loop0: while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f73897s0;
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
                    if (!cVar.f73903t0) {
                        break loop0;
                    }
                    e(cVar);
                    return;
                }
            } while (atomicReference.get() == cVarArr);
        }
        this.f73895q0.d(cVar);
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create(int i10) {
        return new ReplayProcessor<>(new g(i10));
    }

    public T[] getValues(T[] tArr) {
        return this.f73895q0.c(tArr);
    }

    public static final class g<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f73922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Throwable f73923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f73924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile int f73925d;

        public g(int i10) {
            this.f73922a = new ArrayList(ObjectHelper.verifyPositive(i10, "capacityHint"));
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void a(T t10) {
            this.f73922a.add(t10);
            this.f73925d++;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final T[] c(T[] tArr) {
            int i10 = this.f73925d;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            ArrayList arrayList = this.f73922a;
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

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void complete() {
            this.f73924c = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void d(c<T> cVar) {
            int iIntValue;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            ArrayList arrayList = this.f73922a;
            Subscriber<? super T> subscriber = cVar.f73899p0;
            Integer num = (Integer) cVar.f73901r0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                cVar.f73901r0 = 0;
            }
            long j10 = cVar.f73904u0;
            int iAddAndGet = 1;
            do {
                long j11 = cVar.f73902s0.get();
                while (j10 != j11) {
                    if (cVar.f73903t0) {
                        cVar.f73901r0 = null;
                        return;
                    }
                    boolean z10 = this.f73924c;
                    int i10 = this.f73925d;
                    if (z10 && iIntValue == i10) {
                        cVar.f73901r0 = null;
                        cVar.f73903t0 = true;
                        Throwable th2 = this.f73923b;
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
                    if (cVar.f73903t0) {
                        cVar.f73901r0 = null;
                        return;
                    }
                    boolean z11 = this.f73924c;
                    int i11 = this.f73925d;
                    if (z11 && iIntValue == i11) {
                        cVar.f73901r0 = null;
                        cVar.f73903t0 = true;
                        Throwable th3 = this.f73923b;
                        if (th3 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th3);
                            return;
                        }
                    }
                }
                cVar.f73901r0 = Integer.valueOf(iIntValue);
                cVar.f73904u0 = j10;
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void error(Throwable th2) {
            this.f73923b = th2;
            this.f73924c = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final Throwable getError() {
            return this.f73923b;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        @Nullable
        public final T getValue() {
            int i10 = this.f73925d;
            if (i10 == 0) {
                return null;
            }
            return (T) this.f73922a.get(i10 - 1);
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final boolean isDone() {
            return this.f73924c;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final int size() {
            return this.f73925d;
        }

        @Override // io.reactivex.processors.ReplayProcessor.b
        public final void b() {
        }
    }
}
