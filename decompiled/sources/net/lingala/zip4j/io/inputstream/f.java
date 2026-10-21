package net.lingala.zip4j.io.inputstream;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ZipEntryInputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public InputStream f84974p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f84975q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f84976r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f84977s0;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f84974p0.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f84976r0;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f84977s0;
        if (j10 != -1) {
            long j11 = this.f84975q0;
            if (j11 >= j10) {
                return -1;
            }
            if (i11 > j10 - j11) {
                i11 = (int) (j10 - j11);
            }
        }
        int i12 = this.f84974p0.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f84975q0 += (long) i12;
        }
        return i12;
    }
}
