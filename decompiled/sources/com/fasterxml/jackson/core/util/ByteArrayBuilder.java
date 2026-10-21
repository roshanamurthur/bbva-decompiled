package com.fasterxml.jackson.core.util;

import androidx.collection.k;
import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes9.dex */
public final class ByteArrayBuilder extends OutputStream {
    public static final byte[] NO_BYTES = new byte[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BufferRecycler f43143p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final LinkedList<byte[]> f43144q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f43145r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f43146s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f43147t0;

    public ByteArrayBuilder() {
        this((BufferRecycler) null);
    }

    public void append(int i10) {
        if (this.f43147t0 >= this.f43146s0.length) {
            b();
        }
        byte[] bArr = this.f43146s0;
        int i11 = this.f43147t0;
        this.f43147t0 = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public void appendFourBytes(int i10) {
        int i11 = this.f43147t0;
        int i12 = i11 + 3;
        byte[] bArr = this.f43146s0;
        if (i12 >= bArr.length) {
            append(i10 >> 24);
            append(i10 >> 16);
            append(i10 >> 8);
            append(i10);
            return;
        }
        bArr[i11] = (byte) (i10 >> 24);
        bArr[i11 + 1] = (byte) (i10 >> 16);
        bArr[i11 + 2] = (byte) (i10 >> 8);
        this.f43147t0 = i11 + 4;
        bArr[i11 + 3] = (byte) i10;
    }

    public void appendThreeBytes(int i10) {
        int i11 = this.f43147t0;
        int i12 = i11 + 2;
        byte[] bArr = this.f43146s0;
        if (i12 >= bArr.length) {
            append(i10 >> 16);
            append(i10 >> 8);
            append(i10);
        } else {
            bArr[i11] = (byte) (i10 >> 16);
            bArr[i11 + 1] = (byte) (i10 >> 8);
            this.f43147t0 = i11 + 3;
            bArr[i11 + 2] = (byte) i10;
        }
    }

    public void appendTwoBytes(int i10) {
        int i11 = this.f43147t0;
        int i12 = i11 + 1;
        byte[] bArr = this.f43146s0;
        if (i12 >= bArr.length) {
            append(i10 >> 8);
            append(i10);
        } else {
            bArr[i11] = (byte) (i10 >> 8);
            this.f43147t0 = i11 + 2;
            bArr[i11 + 1] = (byte) i10;
        }
    }

    public final void b() {
        int length = this.f43145r0 + this.f43146s0.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.f43145r0 = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 262144) {
            iMax = 262144;
        }
        this.f43144q0.add(this.f43146s0);
        this.f43146s0 = new byte[iMax];
        this.f43147t0 = 0;
    }

    public byte[] completeAndCoalesce(int i10) {
        this.f43147t0 = i10;
        return toByteArray();
    }

    public byte[] finishCurrentSegment() {
        b();
        return this.f43146s0;
    }

    public byte[] getCurrentSegment() {
        return this.f43146s0;
    }

    public int getCurrentSegmentLength() {
        return this.f43147t0;
    }

    public void release() {
        byte[] bArr;
        reset();
        BufferRecycler bufferRecycler = this.f43143p0;
        if (bufferRecycler == null || (bArr = this.f43146s0) == null) {
            return;
        }
        bufferRecycler.releaseByteBuffer(2, bArr);
        this.f43146s0 = null;
    }

    public void reset() {
        this.f43145r0 = 0;
        this.f43147t0 = 0;
        LinkedList<byte[]> linkedList = this.f43144q0;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.clear();
    }

    public byte[] resetAndGetFirstSegment() {
        reset();
        return this.f43146s0;
    }

    public void setCurrentSegmentLength(int i10) {
        this.f43147t0 = i10;
    }

    public int size() {
        return this.f43145r0 + this.f43147t0;
    }

    public byte[] toByteArray() {
        int i10 = this.f43145r0 + this.f43147t0;
        if (i10 == 0) {
            return NO_BYTES;
        }
        byte[] bArr = new byte[i10];
        LinkedList<byte[]> linkedList = this.f43144q0;
        int i11 = 0;
        for (byte[] bArr2 : linkedList) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        System.arraycopy(this.f43146s0, 0, bArr, i11, this.f43147t0);
        int i12 = i11 + this.f43147t0;
        if (i12 != i10) {
            throw new RuntimeException(k.c("Internal error: total len assumed to be ", i10, ", copied ", i12, " bytes"));
        }
        if (!linkedList.isEmpty()) {
            reset();
        }
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler) {
        this(bufferRecycler, 500);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int iMin = Math.min(this.f43146s0.length - this.f43147t0, i11);
            if (iMin > 0) {
                System.arraycopy(bArr, i10, this.f43146s0, this.f43147t0, iMin);
                i10 += iMin;
                this.f43147t0 += iMin;
                i11 -= iMin;
            }
            if (i11 <= 0) {
                return;
            } else {
                b();
            }
        }
    }

    public ByteArrayBuilder(int i10) {
        this(null, i10);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, int i10) {
        this.f43144q0 = new LinkedList<>();
        this.f43143p0 = bufferRecycler;
        this.f43146s0 = bufferRecycler == null ? new byte[i10] : bufferRecycler.allocByteBuffer(2);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        append(i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}
