package com.fasterxml.jackson.databind.util;

import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ObjectBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedNode<Object[]> f43520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedNode<Object[]> f43521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f43523d;

    public final void _copyTo(Object obj, int i10, Object[] objArr, int i11) {
        int i12 = 0;
        for (LinkedNode<Object[]> next = this.f43520a; next != null; next = next.next()) {
            Object[] objArrValue = next.value();
            int length = objArrValue.length;
            System.arraycopy(objArrValue, 0, obj, i12, length);
            i12 += length;
        }
        System.arraycopy(objArr, 0, obj, i12, i11);
        int i13 = i12 + i11;
        if (i13 != i10) {
            throw new IllegalStateException(n1.e("Should have gotten ", i10, " entries, got ", i13));
        }
    }

    public void _reset() {
        LinkedNode<Object[]> linkedNode = this.f43521b;
        if (linkedNode != null) {
            this.f43523d = linkedNode.value();
        }
        this.f43521b = null;
        this.f43520a = null;
        this.f43522c = 0;
    }

    public Object[] appendCompletedChunk(Object[] objArr) {
        LinkedNode<Object[]> linkedNode = new LinkedNode<>(objArr, null);
        if (this.f43520a == null) {
            this.f43521b = linkedNode;
            this.f43520a = linkedNode;
        } else {
            this.f43521b.linkNext(linkedNode);
            this.f43521b = linkedNode;
        }
        int length = objArr.length;
        this.f43522c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public int bufferedSize() {
        return this.f43522c;
    }

    public Object[] completeAndClearBuffer(Object[] objArr, int i10) {
        int i11 = this.f43522c + i10;
        Object[] objArr2 = new Object[i11];
        _copyTo(objArr2, i11, objArr, i10);
        _reset();
        return objArr2;
    }

    public int initialCapacity() {
        Object[] objArr = this.f43523d;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] resetAndStart() {
        _reset();
        Object[] objArr = this.f43523d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.f43523d = objArr2;
        return objArr2;
    }

    public Object[] resetAndStart(Object[] objArr, int i10) {
        _reset();
        Object[] objArr2 = this.f43523d;
        if (objArr2 == null || objArr2.length < i10) {
            this.f43523d = new Object[Math.max(12, i10)];
        }
        System.arraycopy(objArr, 0, this.f43523d, 0, i10);
        return this.f43523d;
    }

    public <T> T[] completeAndClearBuffer(Object[] objArr, int i10, Class<T> cls) {
        int i11 = this.f43522c + i10;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i11));
        _copyTo(tArr, i11, objArr, i10);
        _reset();
        return tArr;
    }

    public void completeAndClearBuffer(Object[] objArr, int i10, List<Object> list) {
        int i11;
        LinkedNode<Object[]> next = this.f43520a;
        while (true) {
            i11 = 0;
            if (next == null) {
                break;
            }
            Object[] objArrValue = next.value();
            int length = objArrValue.length;
            while (i11 < length) {
                list.add(objArrValue[i11]);
                i11++;
            }
            next = next.next();
        }
        while (i11 < i10) {
            list.add(objArr[i11]);
            i11++;
        }
        _reset();
    }
}
