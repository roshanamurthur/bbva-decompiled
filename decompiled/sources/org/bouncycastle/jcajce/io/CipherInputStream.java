package org.bouncycastle.jcajce.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.crypto.io.InvalidCipherTextIOException;

/* JADX INFO: loaded from: classes6.dex */
public class CipherInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Cipher f89736p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89737q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f89738r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f89739s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f89740t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f89741u0;

    public CipherInputStream(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.f89737q0 = new byte[512];
        this.f89738r0 = false;
        this.f89736p0 = cipher;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.f89740t0 - this.f89741u0;
    }

    public final byte[] b() throws InvalidCipherTextIOException {
        try {
            if (this.f89738r0) {
                return null;
            }
            this.f89738r0 = true;
            return this.f89736p0.doFinal();
        } catch (GeneralSecurityException e5) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e5);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
            if (!this.f89738r0) {
                b();
            }
            this.f89741u0 = 0;
            this.f89740t0 = 0;
        } catch (Throwable th2) {
            if (!this.f89738r0) {
                b();
            }
            throw th2;
        }
    }

    public final int e() throws IOException {
        if (this.f89738r0) {
            return -1;
        }
        this.f89741u0 = 0;
        this.f89740t0 = 0;
        while (true) {
            int i10 = this.f89740t0;
            if (i10 != 0) {
                return i10;
            }
            int i11 = ((FilterInputStream) this).in.read(this.f89737q0);
            if (i11 == -1) {
                byte[] bArrB = b();
                this.f89739s0 = bArrB;
                if (bArrB == null || bArrB.length == 0) {
                    return -1;
                }
                int length = bArrB.length;
                this.f89740t0 = length;
                return length;
            }
            byte[] bArrUpdate = this.f89736p0.update(this.f89737q0, 0, i11);
            this.f89739s0 = bArrUpdate;
            if (bArrUpdate != null) {
                this.f89740t0 = bArrUpdate.length;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f89741u0 >= this.f89740t0 && e() < 0) {
            return -1;
        }
        byte[] bArr = this.f89739s0;
        int i10 = this.f89741u0;
        this.f89741u0 = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        if (j10 <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j10, available());
        this.f89741u0 += iMin;
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f89741u0 >= this.f89740t0 && e() < 0) {
            return -1;
        }
        int iMin = Math.min(i11, available());
        System.arraycopy(this.f89739s0, this.f89741u0, bArr, i10, iMin);
        this.f89741u0 += iMin;
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
    }
}
