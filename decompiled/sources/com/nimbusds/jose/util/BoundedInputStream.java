package com.nimbusds.jose.util;

import androidx.datastore.preferences.protobuf.e;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public class BoundedInputStream extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final InputStream f62820p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f62821q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f62822r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f62823s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f62824t0;

    public BoundedInputStream(InputStream inputStream, long j10) {
        this.f62822r0 = 0L;
        this.f62823s0 = -1L;
        this.f62824t0 = true;
        this.f62821q0 = j10;
        this.f62820p0 = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long j10 = this.f62821q0;
        if (j10 < 0 || this.f62822r0 < j10) {
            return this.f62820p0.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f62824t0) {
            this.f62820p0.close();
        }
    }

    public long getLimitBytes() {
        return this.f62821q0;
    }

    public boolean isPropagateClose() {
        return this.f62824t0;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        this.f62820p0.mark(i10);
        this.f62823s0 = this.f62822r0;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f62820p0.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j10 = this.f62821q0;
        if (j10 >= 0 && this.f62822r0 >= j10) {
            throw new IOException(e.f("Exceeded configured input limit of ", j10, " bytes"));
        }
        int i10 = this.f62820p0.read();
        this.f62822r0++;
        return i10;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f62820p0.reset();
        this.f62822r0 = this.f62823s0;
    }

    public void setPropagateClose(boolean z10) {
        this.f62824t0 = z10;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11 = this.f62821q0;
        if (j11 >= 0) {
            j10 = Math.min(j10, j11 - this.f62822r0);
        }
        long jSkip = this.f62820p0.skip(j10);
        this.f62822r0 += jSkip;
        return jSkip;
    }

    public String toString() {
        return this.f62820p0.toString();
    }

    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1L);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f62821q0;
        if (j10 >= 0 && this.f62822r0 >= j10) {
            throw new IOException(e.f("Exceeded configured input limit of ", j10, " bytes"));
        }
        int i12 = this.f62820p0.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f62822r0 + ((long) i12);
        this.f62822r0 = j11;
        if (j10 < 0 || j11 < j10) {
            return i12;
        }
        throw new IOException(e.f("Exceeded configured input limit of ", j10, " bytes"));
    }
}
