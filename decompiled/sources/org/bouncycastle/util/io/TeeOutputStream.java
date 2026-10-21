package org.bouncycastle.util.io;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class TeeOutputStream extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final OutputStream f91656p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final OutputStream f91657q0;

    public TeeOutputStream(OutputStream outputStream, OutputStream outputStream2) {
        this.f91656p0 = outputStream;
        this.f91657q0 = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f91656p0.close();
        this.f91657q0.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f91656p0.flush();
        this.f91657q0.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f91656p0.write(i10);
        this.f91657q0.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f91656p0.write(bArr);
        this.f91657q0.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f91656p0.write(bArr, i10, i11);
        this.f91657q0.write(bArr, i10, i11);
    }
}
