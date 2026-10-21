package io.reactivex.subjects;

import com.bbva.image.transform.ScaleToMaxSideTransformer;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ReplaySubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final c[] f78651s0 = new c[0];

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final c[] f78652t0 = new c[0];

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Object[] f78653u0 = new Object[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final b<T> f78654p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<c<T>[]> f78655q0 = new AtomicReference<>(f78651s0);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f78656r0;

    public static final class a<T> extends AtomicReference<a<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f78657p0;

        public a(T t10) {
            this.f78657p0 = t10;
        }
    }

    public interface b<T> {
        void a(Object obj);

        void add(T t10);

        void b();

        T[] c(T[] tArr);

        boolean compareAndSet(Object obj, Object obj2);

        void d(c<T> cVar);

        Object get();

        @Nullable
        T getValue();

        int size();
    }

    public static final class c<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f78658p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ReplaySubject<T> f78659q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Serializable f78660r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f78661s0;

        public c(Observer<? super T> observer, ReplaySubject<T> replaySubject) {
            this.f78658p0 = observer;
            this.f78659q0 = replaySubject;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f78661s0) {
                return;
            }
            this.f78661s0 = true;
            this.f78659q0.d(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f78661s0;
        }
    }

    public static final class d<T> extends AtomicReference<Object> implements b<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f78662p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f78663q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f78664r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f78665s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f78666t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile f<Object> f78667u0;
        public f<Object> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f78668w0;

        public d(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f78662p0 = ObjectHelper.verifyPositive(i10, ScaleToMaxSideTransformer.SIDE);
            this.f78663q0 = ObjectHelper.verifyPositive(j10, "maxAge");
            this.f78664r0 = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.f78665s0 = (Scheduler) ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            f<Object> fVar = new f<>(0L, null);
            this.v0 = fVar;
            this.f78667u0 = fVar;
        }

        public static int f(f fVar) {
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE) {
                f<T> fVar2 = fVar.get();
                if (fVar2 == null) {
                    T t10 = fVar.f78674p0;
                    return (NotificationLite.isComplete(t10) || NotificationLite.isError(t10)) ? i10 - 1 : i10;
                }
                i10++;
                fVar = fVar2;
            }
            return i10;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void a(Object obj) {
            f<Object> fVar = new f<>(Long.MAX_VALUE, obj);
            f<Object> fVar2 = this.v0;
            this.v0 = fVar;
            this.f78666t0++;
            fVar2.lazySet(fVar);
            long jNow = this.f78665s0.now(this.f78664r0) - this.f78663q0;
            f<Object> fVar3 = this.f78667u0;
            while (true) {
                f<T> fVar4 = fVar3.get();
                if (fVar4.get() == null) {
                    if (fVar3.f78674p0 == null) {
                        this.f78667u0 = fVar3;
                        break;
                    }
                    f<Object> fVar5 = new f<>(0L, null);
                    fVar5.lazySet(fVar3.get());
                    this.f78667u0 = fVar5;
                    break;
                }
                if (fVar4.f78675q0 > jNow) {
                    if (fVar3.f78674p0 == null) {
                        this.f78667u0 = fVar3;
                        break;
                    }
                    f<Object> fVar6 = new f<>(0L, null);
                    fVar6.lazySet(fVar3.get());
                    this.f78667u0 = fVar6;
                    break;
                }
                fVar3 = fVar4;
            }
            this.f78668w0 = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void add(T t10) {
            f<Object> fVar = new f<>(this.f78665s0.now(this.f78664r0), t10);
            f<Object> fVar2 = this.v0;
            this.v0 = fVar;
            this.f78666t0++;
            fVar2.set(fVar);
            int i10 = this.f78666t0;
            if (i10 > this.f78662p0) {
                this.f78666t0 = i10 - 1;
                this.f78667u0 = this.f78667u0.get();
            }
            long jNow = this.f78665s0.now(this.f78664r0) - this.f78663q0;
            f<Object> fVar3 = this.f78667u0;
            while (this.f78666t0 > 1) {
                f<T> fVar4 = fVar3.get();
                if (fVar4 == null) {
                    this.f78667u0 = fVar3;
                    return;
                } else if (fVar4.f78675q0 > jNow) {
                    this.f78667u0 = fVar3;
                    return;
                } else {
                    this.f78666t0--;
                    fVar3 = fVar4;
                }
            }
            this.f78667u0 = fVar3;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void b() {
            f<Object> fVar = this.f78667u0;
            if (fVar.f78674p0 != null) {
                f<Object> fVar2 = new f<>(0L, null);
                fVar2.lazySet(fVar.get());
                this.f78667u0 = fVar2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final T[] c(T[] tArr) {
            f<T> fVarE = e();
            int iF = f(fVarE);
            if (iF != 0) {
                if (tArr.length < iF) {
                    tArr = (T[]) ((Object[]) androidx.collection.a.b(tArr, iF));
                }
                for (int i10 = 0; i10 != iF; i10++) {
                    fVarE = fVarE.get();
                    tArr[i10] = fVarE.f78674p0;
                }
                if (tArr.length > iF) {
                    tArr[iF] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = cVar.f78658p0;
            f<Object> fVarE = (f) cVar.f78660r0;
            if (fVarE == null) {
                fVarE = e();
            }
            int iAddAndGet = 1;
            while (!cVar.f78661s0) {
                while (true) {
                    if (cVar.f78661s0) {
                        cVar.f78660r0 = null;
                        return;
                    }
                    f<T> fVar = fVarE.get();
                    if (fVar == null) {
                        break;
                    }
                    T t10 = fVar.f78674p0;
                    if (this.f78668w0 && fVar.get() == null) {
                        if (NotificationLite.isComplete(t10)) {
                            observer.onComplete();
                        } else {
                            observer.onError(NotificationLite.getError(t10));
                        }
                        cVar.f78660r0 = null;
                        cVar.f78661s0 = true;
                        return;
                    }
                    observer.onNext(t10);
                    fVarE = fVar;
                }
                if (fVarE.get() == null) {
                    cVar.f78660r0 = fVarE;
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f78660r0 = null;
        }

        public final f<Object> e() {
            f<Object> fVar;
            f<Object> fVar2 = this.f78667u0;
            long jNow = this.f78665s0.now(this.f78664r0) - this.f78663q0;
            f<T> fVar3 = fVar2.get();
            while (true) {
                f<T> fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || fVar2.f78675q0 > jNow) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        @Nullable
        public final T getValue() {
            T t10;
            f<Object> fVar = this.f78667u0;
            f<Object> fVar2 = null;
            while (true) {
                f<T> fVar3 = fVar.get();
                if (fVar3 == null) {
                    break;
                }
                fVar2 = fVar;
                fVar = fVar3;
            }
            if (fVar.f78675q0 >= this.f78665s0.now(this.f78664r0) - this.f78663q0 && (t10 = (T) fVar.f78674p0) != null) {
                return (NotificationLite.isComplete(t10) || NotificationLite.isError(t10)) ? (T) fVar2.f78674p0 : t10;
            }
            return null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final int size() {
            return f(e());
        }
    }

    public static final class e<T> extends AtomicReference<Object> implements b<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f78669p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f78670q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile a<Object> f78671r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public a<Object> f78672s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f78673t0;

        public e(int i10) {
            this.f78669p0 = ObjectHelper.verifyPositive(i10, ScaleToMaxSideTransformer.SIDE);
            a<Object> aVar = new a<>(null);
            this.f78672s0 = aVar;
            this.f78671r0 = aVar;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void a(Object obj) {
            a<Object> aVar = new a<>(obj);
            a<Object> aVar2 = this.f78672s0;
            this.f78672s0 = aVar;
            this.f78670q0++;
            aVar2.lazySet(aVar);
            b();
            this.f78673t0 = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void add(T t10) {
            a<Object> aVar = new a<>(t10);
            a<Object> aVar2 = this.f78672s0;
            this.f78672s0 = aVar;
            this.f78670q0++;
            aVar2.set(aVar);
            int i10 = this.f78670q0;
            if (i10 > this.f78669p0) {
                this.f78670q0 = i10 - 1;
                this.f78671r0 = this.f78671r0.get();
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void b() {
            a<Object> aVar = this.f78671r0;
            if (aVar.f78657p0 != null) {
                a<Object> aVar2 = new a<>(null);
                aVar2.lazySet(aVar.get());
                this.f78671r0 = aVar2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final T[] c(T[] tArr) {
            a<T> aVar = this.f78671r0;
            int size = size();
            if (size != 0) {
                if (tArr.length < size) {
                    tArr = (T[]) ((Object[]) androidx.collection.a.b(tArr, size));
                }
                for (int i10 = 0; i10 != size; i10++) {
                    aVar = aVar.get();
                    tArr[i10] = aVar.f78657p0;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = cVar.f78658p0;
            a<Object> aVar = (a) cVar.f78660r0;
            if (aVar == null) {
                aVar = this.f78671r0;
            }
            int iAddAndGet = 1;
            while (!cVar.f78661s0) {
                a<T> aVar2 = aVar.get();
                if (aVar2 != null) {
                    T t10 = aVar2.f78657p0;
                    if (this.f78673t0 && aVar2.get() == null) {
                        if (NotificationLite.isComplete(t10)) {
                            observer.onComplete();
                        } else {
                            observer.onError(NotificationLite.getError(t10));
                        }
                        cVar.f78660r0 = null;
                        cVar.f78661s0 = true;
                        return;
                    }
                    observer.onNext(t10);
                    aVar = aVar2;
                } else if (aVar.get() != null) {
                    continue;
                } else {
                    cVar.f78660r0 = aVar;
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f78660r0 = null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        @Nullable
        public final T getValue() {
            a<Object> aVar = this.f78671r0;
            a<Object> aVar2 = null;
            while (true) {
                a<T> aVar3 = aVar.get();
                if (aVar3 == null) {
                    break;
                }
                aVar2 = aVar;
                aVar = aVar3;
            }
            T t10 = (T) aVar.f78657p0;
            if (t10 == null) {
                return null;
            }
            return (NotificationLite.isComplete(t10) || NotificationLite.isError(t10)) ? (T) aVar2.f78657p0 : t10;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final int size() {
            a<Object> aVar = this.f78671r0;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    Object obj = aVar.f78657p0;
                    return (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? i10 - 1 : i10;
                }
                i10++;
                aVar = aVar2;
            }
            return i10;
        }
    }

    public static final class f<T> extends AtomicReference<f<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f78674p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f78675q0;

        /* JADX WARN: Multi-variable type inference failed */
        public f(long j10, Object obj) {
            this.f78674p0 = obj;
            this.f78675q0 = j10;
        }
    }

    public ReplaySubject(b<T> bVar) {
        this.f78654p0 = bVar;
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> create() {
        return new ReplaySubject<>(new g(16));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithSize(int i10) {
        return new ReplaySubject<>(new e(i10));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithTime(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new ReplaySubject<>(new d(Integer.MAX_VALUE, j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> createWithTimeAndSize(long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
        return new ReplaySubject<>(new d(i10, j10, timeUnit, scheduler));
    }

    public void cleanupBuffer() {
        this.f78654p0.b();
    }

    public final void d(c<T> cVar) {
        c<T>[] cVarArr;
        while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f78655q0;
            c<T>[] cVarArr2 = atomicReference.get();
            if (cVarArr2 == f78652t0 || cVarArr2 == (cVarArr = f78651s0)) {
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

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        Object obj = this.f78654p0.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        return this.f78654p0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f78653u0;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.f78654p0.get());
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.f78655q0.get().length != 0;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return NotificationLite.isError(this.f78654p0.get());
    }

    public boolean hasValue() {
        return this.f78654p0.size() != 0;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f78656r0) {
            return;
        }
        this.f78656r0 = true;
        Object objComplete = NotificationLite.complete();
        b<T> bVar = this.f78654p0;
        bVar.a(objComplete);
        boolean zCompareAndSet = bVar.compareAndSet(null, objComplete);
        c<T>[] andSet = f78652t0;
        if (zCompareAndSet) {
            andSet = this.f78655q0.getAndSet(andSet);
        }
        for (c<T> cVar : andSet) {
            bVar.d(cVar);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f78656r0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f78656r0 = true;
        Object objError = NotificationLite.error(th2);
        b<T> bVar = this.f78654p0;
        bVar.a(objError);
        boolean zCompareAndSet = bVar.compareAndSet(null, objError);
        c<T>[] andSet = f78652t0;
        if (zCompareAndSet) {
            andSet = this.f78655q0.getAndSet(andSet);
        }
        for (c<T> cVar : andSet) {
            bVar.d(cVar);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        ObjectHelper.requireNonNull(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f78656r0) {
            return;
        }
        b<T> bVar = this.f78654p0;
        bVar.add(t10);
        for (c<T> cVar : this.f78655q0.get()) {
            bVar.d(cVar);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f78656r0) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        c<T> cVar = new c<>(observer, this);
        observer.onSubscribe(cVar);
        if (cVar.f78661s0) {
            return;
        }
        loop0: while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f78655q0;
            c<T>[] cVarArr = atomicReference.get();
            if (cVarArr == f78652t0) {
                break;
            }
            int length = cVarArr.length;
            c<T>[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            do {
                if (atomicReference.compareAndSet(cVarArr, cVarArr2)) {
                    if (!cVar.f78661s0) {
                        break loop0;
                    }
                    d(cVar);
                    return;
                }
            } while (atomicReference.get() == cVarArr);
        }
        this.f78654p0.d(cVar);
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplaySubject<T> create(int i10) {
        return new ReplaySubject<>(new g(i10));
    }

    public T[] getValues(T[] tArr) {
        return this.f78654p0.c(tArr);
    }

    public static final class g<T> extends AtomicReference<Object> implements b<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ArrayList f78676p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public volatile boolean f78677q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile int f78678r0;

        public g(int i10) {
            this.f78676p0 = new ArrayList(ObjectHelper.verifyPositive(i10, "capacityHint"));
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void a(Object obj) {
            this.f78676p0.add(obj);
            this.f78678r0++;
            this.f78677q0 = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void add(T t10) {
            this.f78676p0.add(t10);
            this.f78678r0++;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final T[] c(T[] tArr) {
            int i10 = this.f78678r0;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            ArrayList arrayList = this.f78676p0;
            Object obj = arrayList.get(i10 - 1);
            if ((NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) && (i10 = i10 - 1) == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
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

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void d(c<T> cVar) {
            int iIntValue;
            int i10;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            ArrayList arrayList = this.f78676p0;
            Observer<? super T> observer = cVar.f78658p0;
            Integer num = (Integer) cVar.f78660r0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                cVar.f78660r0 = 0;
            }
            int iAddAndGet = 1;
            while (!cVar.f78661s0) {
                int i11 = this.f78678r0;
                while (i11 != iIntValue) {
                    if (cVar.f78661s0) {
                        cVar.f78660r0 = null;
                        return;
                    }
                    a.d dVar = (Object) arrayList.get(iIntValue);
                    if (this.f78677q0 && (i10 = iIntValue + 1) == i11 && i10 == (i11 = this.f78678r0)) {
                        if (NotificationLite.isComplete(dVar)) {
                            observer.onComplete();
                        } else {
                            observer.onError(NotificationLite.getError(dVar));
                        }
                        cVar.f78660r0 = null;
                        cVar.f78661s0 = true;
                        return;
                    }
                    observer.onNext(dVar);
                    iIntValue++;
                }
                if (iIntValue == this.f78678r0) {
                    cVar.f78660r0 = Integer.valueOf(iIntValue);
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f78660r0 = null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        @Nullable
        public final T getValue() {
            int i10 = this.f78678r0;
            if (i10 == 0) {
                return null;
            }
            ArrayList arrayList = this.f78676p0;
            T t10 = (T) arrayList.get(i10 - 1);
            if (!NotificationLite.isComplete(t10) && !NotificationLite.isError(t10)) {
                return t10;
            }
            if (i10 == 1) {
                return null;
            }
            return (T) arrayList.get(i10 - 2);
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final int size() {
            int i10 = this.f78678r0;
            if (i10 == 0) {
                return 0;
            }
            int i11 = i10 - 1;
            Object obj = this.f78676p0.get(i11);
            return (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? i11 : i10;
        }

        @Override // io.reactivex.subjects.ReplaySubject.b
        public final void b() {
        }
    }
}
