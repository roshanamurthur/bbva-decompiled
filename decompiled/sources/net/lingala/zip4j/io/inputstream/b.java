package net.lingala.zip4j.io.inputstream;

import java.io.IOException;
import java.io.InputStream;
import net.lingala.zip4j.crypto.Decrypter;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: compiled from: CipherInputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b<T extends Decrypter> extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final f f84968p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f84969q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f84970r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f84971s0 = new byte[1];

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final LocalFileHeader f84972t0;

    public b(f fVar, LocalFileHeader localFileHeader, char[] cArr, int i10) throws IOException {
        this.f84968p0 = fVar;
        this.f84969q0 = (T) b(localFileHeader, cArr);
        this.f84972t0 = localFileHeader;
        if (Zip4jUtil.getCompressionMethod(localFileHeader).equals(CompressionMethod.DEFLATE)) {
            this.f84970r0 = new byte[i10];
        }
    }

    public abstract T b(LocalFileHeader localFileHeader, char[] cArr) throws IOException;

    public final void c(byte[] bArr) throws IOException {
        InputStream inputStream = this.f84968p0.f84974p0;
        int i10 = inputStream.read(bArr);
        if (i10 != bArr.length) {
            int length = bArr.length - i10;
            int i11 = 0;
            for (int i12 = 0; i10 < bArr.length && i11 != -1 && i12 < 15; i12++) {
                i11 += inputStream.read(bArr, i10, length);
                if (i11 > 0) {
                    i10 += i11;
                    length -= i11;
                }
            }
            if (i10 != bArr.length) {
                throw new IOException("Cannot read fully into byte buffer");
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f84968p0.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f84971s0;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int fully = Zip4jUtil.readFully(this.f84968p0, bArr, i10, i11);
        if (fully > 0) {
            byte[] bArr2 = this.f84970r0;
            if (bArr2 != null) {
                System.arraycopy(bArr, 0, bArr2, 0, fully);
            }
            this.f84969q0.decryptData(bArr, i10, fully);
        }
        return fully;
    }

    public void a(InputStream inputStream) throws IOException {
    }
}
