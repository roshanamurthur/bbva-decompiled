package oc;

import com.bea.xml.stream.util.CircularQueue;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: CircularQueue.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements Iterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f85386p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f85387q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f85388r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f85389s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ CircularQueue f85390t0;

    public a(CircularQueue circularQueue) {
        this.f85390t0 = circularQueue;
        int i10 = circularQueue.f37904r0;
        this.f85386p0 = i10;
        this.f85387q0 = circularQueue.f37903q0;
        this.f85388r0 = circularQueue.f37902p0;
        this.f85389s0 = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        CircularQueue circularQueue = this.f85390t0;
        if (this.f85386p0 != circularQueue.f37904r0) {
            throw new ConcurrentModificationException();
        }
        if (this.f85387q0 == circularQueue.f37903q0) {
            return this.f85388r0 > 0;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        CircularQueue circularQueue = this.f85390t0;
        if (this.f85386p0 != circularQueue.f37904r0) {
            throw new ConcurrentModificationException();
        }
        if (this.f85387q0 != circularQueue.f37903q0) {
            throw new ConcurrentModificationException();
        }
        int i10 = this.f85388r0;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        this.f85388r0 = i10 - 1;
        Object[] objArr = circularQueue.v0;
        int i11 = this.f85389s0;
        Object obj = objArr[i11];
        this.f85389s0 = circularQueue.f37907u0 & (i11 + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
