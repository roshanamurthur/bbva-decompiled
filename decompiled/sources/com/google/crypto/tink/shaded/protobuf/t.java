package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: IterableByteBufferInputStream.java */
/* JADX INFO: loaded from: classes10.dex */
public final class t extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterator<ByteBuffer> f47268p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ByteBuffer f47269q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f47270r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f47271s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f47272t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f47273u0;
    public byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f47274w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f47275x0;

    public t(Iterable<ByteBuffer> iterable) {
        this.f47268p0 = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f47270r0++;
        }
        this.f47271s0 = -1;
        if (b()) {
            return;
        }
        this.f47269q0 = Internal.EMPTY_BYTE_BUFFER;
        this.f47271s0 = 0;
        this.f47272t0 = 0;
        this.f47275x0 = 0L;
    }

    public final boolean b() {
        this.f47271s0++;
        Iterator<ByteBuffer> it = this.f47268p0;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer next = it.next();
        this.f47269q0 = next;
        this.f47272t0 = next.position();
        if (this.f47269q0.hasArray()) {
            this.f47273u0 = true;
            this.v0 = this.f47269q0.array();
            this.f47274w0 = this.f47269q0.arrayOffset();
        } else {
            this.f47273u0 = false;
            this.f47275x0 = x0.b(this.f47269q0);
            this.v0 = null;
        }
        return true;
    }

    public final void c(int i10) {
        int i11 = this.f47272t0 + i10;
        this.f47272t0 = i11;
        if (i11 == this.f47269q0.limit()) {
            b();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f47271s0 == this.f47270r0) {
            return -1;
        }
        if (this.f47273u0) {
            int i10 = this.v0[this.f47272t0 + this.f47274w0] & 255;
            c(1);
            return i10;
        }
        int iF = x0.f47308c.f(((long) this.f47272t0) + this.f47275x0) & 255;
        c(1);
        return iF;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f47271s0 == this.f47270r0) {
            return -1;
        }
        int iLimit = this.f47269q0.limit();
        int i12 = this.f47272t0;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f47273u0) {
            System.arraycopy(this.v0, i12 + this.f47274w0, bArr, i10, i11);
            c(i11);
        } else {
            int iPosition = this.f47269q0.position();
            this.f47269q0.position(this.f47272t0);
            this.f47269q0.get(bArr, i10, i11);
            this.f47269q0.position(iPosition);
            c(i11);
        }
        return i11;
    }
}
