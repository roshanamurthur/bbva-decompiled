package lf;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: InputStreamDecrypter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f83193p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @GuardedBy("this")
    public InputStream f83194q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @GuardedBy("this")
    public InputStream f83195r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public PrimitiveSet<StreamingAead> f83196s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f83197t0;

    @Override // java.io.InputStream
    @GuardedBy("this")
    public final synchronized int available() throws IOException {
        InputStream inputStream = this.f83194q0;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    @GuardedBy("this")
    public final synchronized void close() throws IOException {
        this.f83195r0.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    @GuardedBy("this")
    public final synchronized int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    @GuardedBy("this")
    public final synchronized int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    @GuardedBy("this")
    public final synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = this.f83194q0;
        if (inputStream != null) {
            return inputStream.read(bArr, i10, i11);
        }
        if (!this.f83193p0) {
            this.f83193p0 = true;
            Iterator<PrimitiveSet.Entry<StreamingAead>> it = this.f83196s0.getRawPrimitives().iterator();
            while (it.hasNext()) {
                try {
                    try {
                        InputStream inputStreamNewDecryptingStream = it.next().getPrimitive().newDecryptingStream(this.f83195r0, this.f83197t0);
                        int i12 = inputStreamNewDecryptingStream.read(bArr, i10, i11);
                        if (i12 != 0) {
                            this.f83194q0 = inputStreamNewDecryptingStream;
                            this.f83195r0.mark(0);
                            return i12;
                        }
                        throw new IOException("Could not read bytes from the ciphertext stream");
                    } catch (IOException unused) {
                        this.f83195r0.reset();
                    }
                } catch (GeneralSecurityException unused2) {
                    this.f83195r0.reset();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }
}
