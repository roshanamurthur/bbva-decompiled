package org.bouncycastle.util.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class TeeInputStream extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final InputStream f91654p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final OutputStream f91655q0;

    public TeeInputStream(InputStream inputStream, OutputStream outputStream) {
        this.f91654p0 = inputStream;
        this.f91655q0 = outputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f91654p0.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f91654p0.close();
        this.f91655q0.close();
    }

    public OutputStream getOutputStream() {
        return this.f91655q0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f91654p0.read();
        if (i10 >= 0) {
            this.f91655q0.write(i10);
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f91654p0.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f91655q0.write(bArr, i10, i12);
        }
        return i12;
    }
}
