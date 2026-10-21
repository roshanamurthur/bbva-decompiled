package org.bouncycastle.jcajce.io;

import c2.b;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.crypto.io.InvalidCipherTextIOException;

/* JADX INFO: loaded from: classes6.dex */
public class CipherOutputStream extends FilterOutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Cipher f89742p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89743q0;

    public CipherOutputStream(OutputStream outputStream, Cipher cipher) {
        super(outputStream);
        this.f89743q0 = new byte[1];
        this.f89742p0 = cipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOException iOException;
        IOException iOException2;
        try {
            byte[] bArrDoFinal = this.f89742p0.doFinal();
            if (bArrDoFinal != null) {
                ((FilterOutputStream) this).out.write(bArrDoFinal);
            }
            iOException2 = null;
        } catch (GeneralSecurityException e5) {
            iOException = new InvalidCipherTextIOException("Error during cipher finalisation", e5);
            iOException2 = iOException;
        } catch (Exception e7) {
            iOException = new IOException(b.d("Error closing stream: ", e7));
            iOException2 = iOException;
        }
        try {
            flush();
            ((FilterOutputStream) this).out.close();
        } catch (IOException e10) {
            if (iOException2 == null) {
                iOException2 = e10;
            }
        }
        if (iOException2 != null) {
            throw iOException2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f89743q0;
        bArr[0] = (byte) i10;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArrUpdate = this.f89742p0.update(bArr, i10, i11);
        if (bArrUpdate != null) {
            ((FilterOutputStream) this).out.write(bArrUpdate);
        }
    }
}
