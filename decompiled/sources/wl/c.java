package wl;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: CompressedOutputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class c extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final b f94289p0;

    public c(b bVar) {
        this.f94289p0 = bVar;
    }

    public void b() throws IOException {
        this.f94289p0.b();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f94289p0.close();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f94289p0.write(bArr, i10, i11);
    }
}
