package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class MarkEnforcingInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f38919p0;

    public MarkEnforcingInputStream(@NonNull InputStream inputStream) {
        super(inputStream);
        this.f38919p0 = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i10 = this.f38919p0;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public final long d(long j10) {
        int i10 = this.f38919p0;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    public final void e(long j10) {
        int i10 = this.f38919p0;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f38919p0 = (int) (((long) i10) - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f38919p0 = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (d(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        e(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f38919p0 = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jD = d(j10);
        if (jD == -1) {
            return 0L;
        }
        long jSkip = super.skip(jD);
        e(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int iD = (int) d(i11);
        if (iD == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iD);
        e(i12);
        return i12;
    }
}
