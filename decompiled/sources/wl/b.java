package wl;

import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.crypto.Encrypter;
import net.lingala.zip4j.model.ZipParameters;

/* JADX INFO: compiled from: CipherOutputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b<T extends Encrypter> extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final g f94287p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f94288q0;

    public b(g gVar, ZipParameters zipParameters, char[] cArr) throws IOException {
        this.f94287p0 = gVar;
        this.f94288q0 = (T) c(zipParameters, cArr);
    }

    public void b() throws IOException {
        this.f94287p0.f94294r0 = true;
    }

    public abstract Encrypter c(ZipParameters zipParameters, char[] cArr) throws IOException;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f94287p0.getClass();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f94287p0.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        g gVar = this.f94287p0;
        gVar.getClass();
        gVar.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f94288q0.encryptData(bArr, i10, i11);
        this.f94287p0.write(bArr, i10, i11);
    }
}
