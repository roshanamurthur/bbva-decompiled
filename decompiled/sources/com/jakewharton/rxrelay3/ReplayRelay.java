package com.jakewharton.rxrelay3;

import androidx.appcompat.widget.g0;
import androidx.camera.core.impl.v;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ReplayRelay<T> extends Relay<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final c[] f50739r0 = new c[0];

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Object[] f50740s0 = new Object[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final b<T> f50741p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<c<T>[]> f50742q0 = new AtomicReference<>(f50739r0);

    public static final class a<T> extends AtomicReference<a<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f50743p0;

        public a(T t10) {
            this.f50743p0 = t10;
        }
    }

    public interface b<T> {
        void add(T t10);

        void b();

        T[] c(T[] tArr);

        void d(c<T> cVar);

        @Nullable
        T getValue();

        int size();
    }

    public static final class c<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f50744p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ReplayRelay<T> f50745q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Serializable f50746r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f50747s0;

        public c(Observer<? super T> observer, ReplayRelay<T> replayRelay) {
            this.f50744p0 = observer;
            this.f50745q0 = replayRelay;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f50747s0) {
                return;
            }
            this.f50747s0 = true;
            this.f50745q0.d(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f50747s0;
        }
    }

    public static final class d<T> extends AtomicReference<Object> implements b<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f50748p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f50749q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f50750r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f50751s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f50752t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile f<T> f50753u0;
        public f<T> v0;

        public d(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            if (i10 <= 0) {
                throw new IllegalArgumentException(g0.c("maxSize > 0 required but it was ", i10));
            }
            if (j10 <= 0) {
                throw new IllegalArgumentException(v.c("maxAge > 0 required but it was ", j10));
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (scheduler == null) {
                throw new NullPointerException("scheduler == null");
            }
            this.f50748p0 = i10;
            this.f50749q0 = j10;
            this.f50750r0 = timeUnit;
            this.f50751s0 = scheduler;
            f<T> fVar = new f<>(0L, null);
            this.v0 = fVar;
            this.f50753u0 = fVar;
        }

        public final f<T> a() {
            f<T> fVar;
            f<T> fVar2 = this.f50753u0;
            long jNow = this.f50751s0.now(this.f50750r0) - this.f50749q0;
            f<T> fVar3 = fVar2.get();
            while (true) {
                f<T> fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || fVar2.f50759q0 > jNow) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final void add(T t10) {
            f<T> fVar = new f<>(this.f50751s0.now(this.f50750r0), t10);
            f<T> fVar2 = this.v0;
            this.v0 = fVar;
            this.f50752t0++;
            fVar2.set(fVar);
            int i10 = this.f50752t0;
            if (i10 > this.f50748p0) {
                this.f50752t0 = i10 - 1;
                this.f50753u0 = this.f50753u0.get();
            }
            long jNow = this.f50751s0.now(this.f50750r0) - this.f50749q0;
            f<T> fVar3 = this.f50753u0;
            while (this.f50752t0 > 1) {
                f<T> fVar4 = fVar3.get();
                if (fVar4 == null) {
                    this.f50753u0 = fVar3;
                    return;
                } else if (fVar4.f50759q0 > jNow) {
                    this.f50753u0 = fVar3;
                    return;
                } else {
                    this.f50752t0--;
                    fVar3 = fVar4;
                }
            }
            this.f50753u0 = fVar3;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final void b() {
            f<T> fVar = this.f50753u0;
            if (fVar.f50758p0 != null) {
                f<T> fVar2 = new f<>(0L, null);
                fVar2.lazySet(fVar.get());
                this.f50753u0 = fVar2;
            }
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final T[] c(T[] tArr) {
            f<T> fVarA = a();
            f<T> fVar = fVarA;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (fVar = fVar.get()) != null) {
                i10++;
            }
            if (i10 != 0) {
                if (tArr.length < i10) {
                    tArr = (T[]) ((Object[]) androidx.collection.a.b(tArr, i10));
                }
                for (int i11 = 0; i11 != i10; i11++) {
                    fVarA = fVarA.get();
                    tArr[i11] = fVarA.f50758p0;
                }
                if (tArr.length > i10) {
                    tArr[i10] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = cVar.f50744p0;
            f<T> fVarA = (f) cVar.f50746r0;
            int iAddAndGet = 1;
            if (fVarA == null) {
                fVarA = a();
            }
            while (!cVar.f50747s0) {
                while (true) {
                    if (cVar.f50747s0) {
                        cVar.f50746r0 = null;
                        return;
                    }
                    f<T> fVar = fVarA.get();
                    if (fVar == null) {
                        break;
                    }
                    observer.onNext(fVar.f50758p0);
                    fVarA = fVar;
                }
                if (fVarA.get() == null) {
                    cVar.f50746r0 = fVarA;
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f50746r0 = null;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        @Nullable
        public final T getValue() {
            f<T> fVar = this.f50753u0;
            while (true) {
                f<T> fVar2 = fVar.get();
                if (fVar2 == null) {
                    break;
                }
                fVar = fVar2;
            }
            if (fVar.f50759q0 < this.f50751s0.now(this.f50750r0) - this.f50749q0) {
                return null;
            }
            return fVar.f50758p0;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final int size() {
            f<T> fVarA = a();
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (fVarA = fVarA.get()) != null) {
                i10++;
            }
            return i10;
        }
    }

    public static final class e<T> extends AtomicReference<Object> implements b<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f50754p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f50755q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile a<T> f50756r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public a<T> f50757s0;

        public e(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException(g0.c("maxSize > 0 required but it was ", i10));
            }
            this.f50754p0 = i10;
            a<T> aVar = new a<>(null);
            this.f50757s0 = aVar;
            this.f50756r0 = aVar;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final void add(T t10) {
            a<T> aVar = new a<>(t10);
            a<T> aVar2 = this.f50757s0;
            this.f50757s0 = aVar;
            this.f50755q0++;
            aVar2.set(aVar);
            int i10 = this.f50755q0;
            if (i10 > this.f50754p0) {
                this.f50755q0 = i10 - 1;
                this.f50756r0 = this.f50756r0.get();
            }
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final void b() {
            a<T> aVar = this.f50756r0;
            if (aVar.f50743p0 != null) {
                a<T> aVar2 = new a<>(null);
                aVar2.lazySet(aVar.get());
                this.f50756r0 = aVar2;
            }
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final T[] c(T[] tArr) {
            a<T> aVar = this.f50756r0;
            int size = size();
            if (size != 0) {
                if (tArr.length < size) {
                    tArr = (T[]) ((Object[]) androidx.collection.a.b(tArr, size));
                }
                for (int i10 = 0; i10 != size; i10++) {
                    aVar = aVar.get();
                    tArr[i10] = aVar.f50743p0;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final void d(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = cVar.f50744p0;
            a<T> aVar = (a) cVar.f50746r0;
            int iAddAndGet = 1;
            if (aVar == null) {
                aVar = this.f50756r0;
            }
            while (!cVar.f50747s0) {
                a<T> aVar2 = aVar.get();
                if (aVar2 != null) {
                    observer.onNext(aVar2.f50743p0);
                    aVar = aVar2;
                } else if (aVar.get() != null) {
                    continue;
                } else {
                    cVar.f50746r0 = aVar;
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f50746r0 = null;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        @Nullable
        public final T getValue() {
            a<T> aVar = this.f50756r0;
            while (true) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    return aVar.f50743p0;
                }
                aVar = aVar2;
            }
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final int size() {
            a<T> aVar = this.f50756r0;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (aVar = aVar.get()) != null) {
                i10++;
            }
            return i10;
        }
    }

    public static final class f<T> extends AtomicReference<f<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f50758p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f50759q0;

        /* JADX WARN: Multi-variable type inference failed */
        public f(long j10, Object obj) {
            this.f50758p0 = obj;
            this.f50759q0 = j10;
        }
    }

    public ReplayRelay(b<T> bVar) {
        this.f50741p0 = bVar;
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayRelay<T> create() {
        return new ReplayRelay<>(new g(16));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayRelay<T> createWithSize(int i10) {
        return new ReplayRelay<>(new e(i10));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayRelay<T> createWithTime(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new ReplayRelay<>(new d(Integer.MAX_VALUE, j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayRelay<T> createWithTimeAndSize(long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
        return new ReplayRelay<>(new d(i10, j10, timeUnit, scheduler));
    }

    @Override // com.jakewharton.rxrelay3.Relay, io.reactivex.rxjava3.functions.Consumer
    public void accept(@NonNull T t10) {
        if (t10 == null) {
            throw new NullPointerException("value == null");
        }
        b<T> bVar = this.f50741p0;
        bVar.add(t10);
        for (c<T> cVar : this.f50742q0.get()) {
            bVar.d(cVar);
        }
    }

    public void cleanupBuffer() {
        this.f50741p0.b();
    }

    public final void d(c<T> cVar) {
        while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f50742q0;
            c<T>[] cVarArr = atomicReference.get();
            c<T>[] cVarArr2 = f50739r0;
            if (cVarArr == cVarArr2) {
                return;
            }
            int length = cVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (cVarArr[i10] == cVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length != 1) {
                cVarArr2 = new c[length - 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, i10);
                System.arraycopy(cVarArr, i10 + 1, cVarArr2, i10, (length - i10) - 1);
            }
            while (!atomicReference.compareAndSet(cVarArr, cVarArr2)) {
                if (atomicReference.get() != cVarArr) {
                }
            }
            return;
        }
    }

    @Nullable
    public T getValue() {
        return this.f50741p0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f50740s0;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // com.jakewharton.rxrelay3.Relay
    public boolean hasObservers() {
        return this.f50742q0.get().length != 0;
    }

    public boolean hasValue() {
        return this.f50741p0.size() != 0;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        c<T> cVar = new c<>(observer, this);
        observer.onSubscribe(cVar);
        if (cVar.f50747s0) {
            return;
        }
        loop0: while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f50742q0;
            c<T>[] cVarArr = atomicReference.get();
            int length = cVarArr.length;
            c<T>[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            do {
                if (atomicReference.compareAndSet(cVarArr, cVarArr2)) {
                    break loop0;
                }
            } while (atomicReference.get() == cVarArr);
        }
        if (cVar.f50747s0) {
            d(cVar);
        } else {
            this.f50741p0.d(cVar);
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayRelay<T> create(int i10) {
        return new ReplayRelay<>(new g(i10));
    }

    public T[] getValues(T[] tArr) {
        return this.f50741p0.c(tArr);
    }

    public static final class g<T> extends AtomicReference<Object> implements b<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ArrayList f50760p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public volatile int f50761q0;

        public g(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException(g0.c("capacityHint > 0 required but it was ", i10));
            }
            this.f50760p0 = new ArrayList(i10);
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final void add(T t10) {
            this.f50760p0.add(t10);
            this.f50761q0++;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final T[] c(T[] tArr) {
            int i10 = this.f50761q0;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) androidx.collection.a.b(tArr, i10));
            }
            ArrayList arrayList = this.f50760p0;
            for (int i11 = 0; i11 < i10; i11++) {
                tArr[i11] = arrayList.get(i11);
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final void d(c<T> cVar) {
            int iIntValue;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            ArrayList arrayList = this.f50760p0;
            Observer<? super T> observer = cVar.f50744p0;
            Integer num = (Integer) cVar.f50746r0;
            int iAddAndGet = 1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                cVar.f50746r0 = 0;
            }
            while (!cVar.f50747s0) {
                int i10 = this.f50761q0;
                while (i10 != iIntValue) {
                    if (cVar.f50747s0) {
                        cVar.f50746r0 = null;
                        return;
                    } else {
                        observer.onNext((Object) arrayList.get(iIntValue));
                        iIntValue++;
                    }
                }
                if (iIntValue == this.f50761q0) {
                    cVar.f50746r0 = Integer.valueOf(iIntValue);
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f50746r0 = null;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        @Nullable
        public final T getValue() {
            int i10 = this.f50761q0;
            if (i10 != 0) {
                return (T) this.f50760p0.get(i10 - 1);
            }
            return null;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final int size() {
            return this.f50761q0;
        }

        @Override // com.jakewharton.rxrelay3.ReplayRelay.b
        public final void b() {
        }
    }
}
