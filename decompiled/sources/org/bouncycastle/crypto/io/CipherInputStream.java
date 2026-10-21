package org.bouncycastle.crypto.io;

import androidx.datastore.preferences.protobuf.e;
import c2.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SkippingCipher;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class CipherInputStream extends FilterInputStream {
    public long E0;
    public int F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SkippingCipher f88794p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f88795q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BufferedBlockCipher f88796r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final StreamCipher f88797s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AEADBlockCipher f88798t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f88799u0;
    public byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f88800w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f88801x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f88802y0;

    public CipherInputStream(InputStream inputStream, BufferedBlockCipher bufferedBlockCipher) {
        this(inputStream, bufferedBlockCipher, 2048);
    }

    public final void a(int i10, boolean z10) {
        AEADBlockCipher aEADBlockCipher = this.f88798t0;
        BufferedBlockCipher bufferedBlockCipher = this.f88796r0;
        if (z10) {
            if (bufferedBlockCipher != null) {
                i10 = bufferedBlockCipher.getOutputSize(i10);
            } else if (aEADBlockCipher != null) {
                i10 = aEADBlockCipher.getOutputSize(i10);
            }
        } else if (bufferedBlockCipher != null) {
            i10 = bufferedBlockCipher.getUpdateOutputSize(i10);
        } else if (aEADBlockCipher != null) {
            i10 = aEADBlockCipher.getUpdateOutputSize(i10);
        }
        byte[] bArr = this.f88799u0;
        if (bArr == null || bArr.length < i10) {
            this.f88799u0 = new byte[i10];
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.f88801x0 - this.f88800w0;
    }

    public final void b() throws IOException {
        int iDoFinal;
        try {
            this.f88802y0 = true;
            a(0, true);
            BufferedBlockCipher bufferedBlockCipher = this.f88796r0;
            if (bufferedBlockCipher != null) {
                iDoFinal = bufferedBlockCipher.doFinal(this.f88799u0, 0);
            } else {
                AEADBlockCipher aEADBlockCipher = this.f88798t0;
                if (aEADBlockCipher == null) {
                    this.f88801x0 = 0;
                    return;
                }
                iDoFinal = aEADBlockCipher.doFinal(this.f88799u0, 0);
            }
            this.f88801x0 = iDoFinal;
        } catch (InvalidCipherTextException e5) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e5);
        } catch (Exception e7) {
            throw new IOException(b.d("Error finalising cipher ", e7));
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
            if (!this.f88802y0) {
                b();
            }
            this.f88800w0 = 0;
            this.f88801x0 = 0;
            this.F0 = 0;
            this.E0 = 0L;
            byte[] bArr = this.v0;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
                this.v0 = null;
            }
            byte[] bArr2 = this.f88799u0;
            if (bArr2 != null) {
                Arrays.fill(bArr2, (byte) 0);
                this.f88799u0 = null;
            }
            Arrays.fill(this.f88795q0, (byte) 0);
        } catch (Throwable th2) {
            if (!this.f88802y0) {
                b();
            }
            throw th2;
        }
    }

    public final int e() throws IOException {
        if (this.f88802y0) {
            return -1;
        }
        this.f88800w0 = 0;
        this.f88801x0 = 0;
        while (true) {
            int i10 = this.f88801x0;
            if (i10 != 0) {
                return i10;
            }
            int iProcessBytes = ((FilterInputStream) this).in.read(this.f88795q0);
            if (iProcessBytes == -1) {
                b();
                int i11 = this.f88801x0;
                if (i11 == 0) {
                    return -1;
                }
                return i11;
            }
            try {
                a(iProcessBytes, false);
                BufferedBlockCipher bufferedBlockCipher = this.f88796r0;
                if (bufferedBlockCipher != null) {
                    iProcessBytes = bufferedBlockCipher.processBytes(this.f88795q0, 0, iProcessBytes, this.f88799u0, 0);
                } else {
                    AEADBlockCipher aEADBlockCipher = this.f88798t0;
                    if (aEADBlockCipher != null) {
                        iProcessBytes = aEADBlockCipher.processBytes(this.f88795q0, 0, iProcessBytes, this.f88799u0, 0);
                    } else {
                        this.f88797s0.processBytes(this.f88795q0, 0, iProcessBytes, this.f88799u0, 0);
                    }
                }
                this.f88801x0 = iProcessBytes;
            } catch (Exception e5) {
                throw new CipherIOException("Error processing stream ", e5);
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        SkippingCipher skippingCipher = this.f88794p0;
        if (skippingCipher != null) {
            this.E0 = skippingCipher.getPosition();
        }
        byte[] bArr = this.f88799u0;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.v0 = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.F0 = this.f88800w0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        if (this.f88794p0 != null) {
            return ((FilterInputStream) this).in.markSupported();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f88800w0 >= this.f88801x0 && e() < 0) {
            return -1;
        }
        byte[] bArr = this.f88799u0;
        int i10 = this.f88800w0;
        this.f88800w0 = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (this.f88794p0 == null) {
            throw new IOException("cipher must implement SkippingCipher to be used with reset()");
        }
        ((FilterInputStream) this).in.reset();
        this.f88794p0.seekTo(this.E0);
        byte[] bArr = this.v0;
        if (bArr != null) {
            this.f88799u0 = bArr;
        }
        this.f88800w0 = this.F0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        if (j10 <= 0) {
            return 0L;
        }
        if (this.f88794p0 == null) {
            int iMin = (int) Math.min(j10, available());
            this.f88800w0 += iMin;
            return iMin;
        }
        long jAvailable = available();
        if (j10 <= jAvailable) {
            this.f88800w0 = (int) (((long) this.f88800w0) + j10);
            return j10;
        }
        this.f88800w0 = this.f88801x0;
        long jSkip = ((FilterInputStream) this).in.skip(j10 - jAvailable);
        if (jSkip == this.f88794p0.skip(jSkip)) {
            return jSkip + jAvailable;
        }
        throw new IOException(e.f("Unable to skip cipher ", jSkip, " bytes."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CipherInputStream(InputStream inputStream, BufferedBlockCipher bufferedBlockCipher, int i10) {
        super(inputStream);
        this.f88796r0 = bufferedBlockCipher;
        this.f88795q0 = new byte[i10];
        this.f88794p0 = bufferedBlockCipher instanceof SkippingCipher ? (SkippingCipher) bufferedBlockCipher : null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public CipherInputStream(InputStream inputStream, StreamCipher streamCipher) {
        this(inputStream, streamCipher, 2048);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f88800w0 >= this.f88801x0 && e() < 0) {
            return -1;
        }
        int iMin = Math.min(i11, available());
        System.arraycopy(this.f88799u0, this.f88800w0, bArr, i10, iMin);
        this.f88800w0 += iMin;
        return iMin;
    }

    public CipherInputStream(InputStream inputStream, StreamCipher streamCipher, int i10) {
        super(inputStream);
        this.f88797s0 = streamCipher;
        this.f88795q0 = new byte[i10];
        this.f88794p0 = streamCipher instanceof SkippingCipher ? (SkippingCipher) streamCipher : null;
    }

    public CipherInputStream(InputStream inputStream, AEADBlockCipher aEADBlockCipher) {
        this(inputStream, aEADBlockCipher, 2048);
    }

    public CipherInputStream(InputStream inputStream, AEADBlockCipher aEADBlockCipher, int i10) {
        super(inputStream);
        this.f88798t0 = aEADBlockCipher;
        this.f88795q0 = new byte[i10];
        this.f88794p0 = aEADBlockCipher instanceof SkippingCipher ? (SkippingCipher) aEADBlockCipher : null;
    }
}
