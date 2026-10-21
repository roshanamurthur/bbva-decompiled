package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class MergedStream extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final IOContext f43055p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final InputStream f43056q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f43057r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f43058s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f43059t0;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i10, int i11) {
        this.f43055p0 = iOContext;
        this.f43056q0 = inputStream;
        this.f43057r0 = bArr;
        this.f43058s0 = i10;
        this.f43059t0 = i11;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f43057r0 != null ? this.f43059t0 - this.f43058s0 : this.f43056q0.available();
    }

    public final void b() {
        byte[] bArr = this.f43057r0;
        if (bArr != null) {
            this.f43057r0 = null;
            IOContext iOContext = this.f43055p0;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b();
        this.f43056q0.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        if (this.f43057r0 == null) {
            this.f43056q0.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f43057r0 == null && this.f43056q0.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f43057r0;
        if (bArr == null) {
            return this.f43056q0.read();
        }
        int i10 = this.f43058s0;
        int i11 = i10 + 1;
        this.f43058s0 = i11;
        int i12 = bArr[i10] & 255;
        if (i11 >= this.f43059t0) {
            b();
        }
        return i12;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (this.f43057r0 == null) {
            this.f43056q0.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11;
        if (this.f43057r0 != null) {
            int i10 = this.f43058s0;
            j11 = this.f43059t0 - i10;
            if (j11 > j10) {
                this.f43058s0 = i10 + ((int) j10);
                return j10;
            }
            b();
            j10 -= j11;
        } else {
            j11 = 0;
        }
        return j10 > 0 ? j11 + this.f43056q0.skip(j10) : j11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArr2 = this.f43057r0;
        if (bArr2 != null) {
            int i12 = this.f43058s0;
            int i13 = this.f43059t0;
            int i14 = i13 - i12;
            if (i11 > i14) {
                i11 = i14;
            }
            System.arraycopy(bArr2, i12, bArr, i10, i11);
            int i15 = this.f43058s0 + i11;
            this.f43058s0 = i15;
            if (i15 >= i13) {
                b();
            }
            return i11;
        }
        return this.f43056q0.read(bArr, i10, i11);
    }
}
