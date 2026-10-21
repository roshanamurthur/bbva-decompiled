package com.fasterxml.jackson.databind.util;

import androidx.camera.camera2.internal.n1;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PrimitiveArrayBuilder<T> {
    protected a<T> _bufferHead;
    protected a<T> _bufferTail;
    protected int _bufferedEntryCount;
    protected T _freeBuffer;

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f43524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<T> f43526c;

        public a(T t10, int i10) {
            this.f43524a = t10;
            this.f43525b = i10;
        }
    }

    public abstract T _constructArray(int i10);

    public void _reset() {
        a<T> aVar = this._bufferTail;
        if (aVar != null) {
            this._freeBuffer = aVar.f43524a;
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final T appendCompletedChunk(T t10, int i10) {
        a<T> aVar = new a<>(t10, i10);
        if (this._bufferHead == null) {
            this._bufferTail = aVar;
            this._bufferHead = aVar;
        } else {
            a<T> aVar2 = this._bufferTail;
            if (aVar2.f43526c != null) {
                throw new IllegalStateException();
            }
            aVar2.f43526c = aVar;
            this._bufferTail = aVar;
        }
        this._bufferedEntryCount += i10;
        return _constructArray(i10 < 16384 ? i10 + i10 : i10 + (i10 >> 2));
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T completeAndClearBuffer(T t10, int i10) {
        int i11 = this._bufferedEntryCount + i10;
        T t_constructArray = _constructArray(i11);
        int i12 = 0;
        for (a<T> aVar = this._bufferHead; aVar != null; aVar = aVar.f43526c) {
            T t11 = aVar.f43524a;
            int i13 = aVar.f43525b;
            System.arraycopy(t11, 0, t_constructArray, i12, i13);
            i12 += i13;
        }
        System.arraycopy(t10, 0, t_constructArray, i12, i10);
        int i14 = i12 + i10;
        if (i14 == i11) {
            return t_constructArray;
        }
        throw new IllegalStateException(n1.e("Should have gotten ", i11, " entries, got ", i14));
    }

    public T resetAndStart() {
        _reset();
        T t10 = this._freeBuffer;
        return t10 == null ? _constructArray(12) : t10;
    }
}
