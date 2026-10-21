package wl;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: ZipEntryOutputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f94292p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public OutputStream f94293q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f94294r0;

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f94294r0) {
            this.f94293q0.write(bArr, i10, i11);
            this.f94292p0 += (long) i11;
            return;
        }
        throw new IllegalStateException("ZipEntryOutputStream is closed");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
