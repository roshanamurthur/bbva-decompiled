package net.lingala.zip4j.io.inputstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: DecompressedInputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class c extends InputStream {
    protected byte[] oneByteBuffer = new byte[1];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final b f84973p0;

    public c(b bVar) {
        this.f84973p0 = bVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f84973p0.close();
    }

    public void endOfEntryReached(InputStream inputStream) throws IOException {
        this.f84973p0.a(inputStream);
    }

    public byte[] getLastReadRawDataCache() {
        return this.f84973p0.f84970r0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.oneByteBuffer) == -1) {
            return -1;
        }
        return this.oneByteBuffer[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f84973p0.read(bArr, i10, i11);
    }

    public void pushBackInputStreamIfNecessary(PushbackInputStream pushbackInputStream) throws IOException {
    }
}
