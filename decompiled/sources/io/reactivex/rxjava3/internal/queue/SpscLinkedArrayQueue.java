package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes12.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f77906x0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Object f77907y0 = new Object();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicLong f77908p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f77909q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f77910r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f77911s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public AtomicReferenceArray<Object> f77912t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f77913u0;
    public AtomicReferenceArray<Object> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final AtomicLong f77914w0;

    public SpscLinkedArrayQueue(int i10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f77908p0 = atomicLong;
        this.f77914w0 = new AtomicLong();
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i10));
        int i11 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.f77912t0 = atomicReferenceArray;
        this.f77911s0 = i11;
        this.f77909q0 = Math.min(iRoundToPowerOfTwo / 4, f77906x0);
        this.v0 = atomicReferenceArray;
        this.f77913u0 = i11;
        this.f77910r0 = iRoundToPowerOfTwo - 2;
        atomicLong.lazySet(0L);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f77908p0.get() == this.f77914w0.get();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f77912t0;
        AtomicLong atomicLong = this.f77908p0;
        long j10 = atomicLong.get();
        int i10 = this.f77911s0;
        int i11 = ((int) j10) & i10;
        if (j10 < this.f77910r0) {
            atomicReferenceArray.lazySet(i11, t10);
            atomicLong.lazySet(j10 + 1);
            return true;
        }
        long j11 = ((long) this.f77909q0) + j10;
        if (atomicReferenceArray.get(((int) j11) & i10) == null) {
            this.f77910r0 = j11 - 1;
            atomicReferenceArray.lazySet(i11, t10);
            atomicLong.lazySet(j10 + 1);
            return true;
        }
        long j12 = j10 + 1;
        if (atomicReferenceArray.get(((int) j12) & i10) == null) {
            atomicReferenceArray.lazySet(i11, t10);
            atomicLong.lazySet(j12);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f77912t0 = atomicReferenceArray2;
        this.f77910r0 = (j10 + ((long) i10)) - 1;
        atomicReferenceArray2.lazySet(i11, t10);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i11, f77907y0);
        atomicLong.lazySet(j12);
        return true;
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.v0;
        int i10 = (int) this.f77914w0.get();
        int i11 = this.f77913u0;
        int i12 = i10 & i11;
        T t10 = (T) atomicReferenceArray.get(i12);
        if (t10 != f77907y0) {
            return t10;
        }
        int i13 = i11 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i13);
        atomicReferenceArray.lazySet(i13, null);
        this.v0 = atomicReferenceArray2;
        return (T) atomicReferenceArray2.get(i12);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue, io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.v0;
        AtomicLong atomicLong = this.f77914w0;
        long j10 = atomicLong.get();
        int i10 = this.f77913u0;
        int i11 = ((int) j10) & i10;
        T t10 = (T) atomicReferenceArray.get(i11);
        boolean z10 = t10 == f77907y0;
        if (t10 != null && !z10) {
            atomicReferenceArray.lazySet(i11, null);
            atomicLong.lazySet(j10 + 1);
            return t10;
        }
        if (!z10) {
            return null;
        }
        int i12 = i10 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i12);
        atomicReferenceArray.lazySet(i12, null);
        this.v0 = atomicReferenceArray2;
        T t11 = (T) atomicReferenceArray2.get(i11);
        if (t11 != null) {
            atomicReferenceArray2.lazySet(i11, null);
            atomicLong.lazySet(j10 + 1);
        }
        return t11;
    }

    public int size() {
        AtomicLong atomicLong = this.f77914w0;
        long j10 = atomicLong.get();
        while (true) {
            long j11 = this.f77908p0.get();
            long j12 = atomicLong.get();
            if (j10 == j12) {
                return (int) (j11 - j12);
            }
            j10 = j12;
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(T t10, T t11) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f77912t0;
        AtomicLong atomicLong = this.f77908p0;
        long j10 = atomicLong.get();
        long j11 = 2 + j10;
        int i10 = this.f77911s0;
        if (atomicReferenceArray.get(((int) j11) & i10) == null) {
            int i11 = ((int) j10) & i10;
            atomicReferenceArray.lazySet(i11 + 1, t11);
            atomicReferenceArray.lazySet(i11, t10);
            atomicLong.lazySet(j11);
        } else {
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.f77912t0 = atomicReferenceArray2;
            int i12 = ((int) j10) & i10;
            atomicReferenceArray2.lazySet(i12 + 1, t11);
            atomicReferenceArray2.lazySet(i12, t10);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i12, f77907y0);
            atomicLong.lazySet(j11);
        }
        return true;
    }
}
