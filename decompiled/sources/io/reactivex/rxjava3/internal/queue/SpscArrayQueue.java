package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes12.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Integer f77900u0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f77901p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicLong f77902q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f77903r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicLong f77904s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f77905t0;

    public SpscArrayQueue(int i10) {
        super(Pow2.roundToPowerOfTwo(i10));
        this.f77901p0 = length() - 1;
        this.f77902q0 = new AtomicLong();
        this.f77904s0 = new AtomicLong();
        this.f77905t0 = Math.min(i10 / 4, f77900u0.intValue());
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
        return this.f77902q0.get() == this.f77904s0.get();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(E e5) {
        if (e5 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f77902q0;
        long j10 = atomicLong.get();
        int i10 = this.f77901p0;
        int i11 = ((int) j10) & i10;
        if (j10 >= this.f77903r0) {
            long j11 = ((long) this.f77905t0) + j10;
            if (get(i10 & ((int) j11)) == null) {
                this.f77903r0 = j11;
            } else if (get(i11) != null) {
                return false;
            }
        }
        lazySet(i11, e5);
        atomicLong.lazySet(j10 + 1);
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue, io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    @Nullable
    public E poll() {
        AtomicLong atomicLong = this.f77904s0;
        long j10 = atomicLong.get();
        int i10 = ((int) j10) & this.f77901p0;
        E e5 = get(i10);
        if (e5 == null) {
            return null;
        }
        atomicLong.lazySet(j10 + 1);
        lazySet(i10, null);
        return e5;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
    public boolean offer(E e5, E e7) {
        return offer(e5) && offer(e7);
    }
}
