package mf;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.crypto.tink.subtle.StreamSegmentDecrypter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: StreamingAeadDecryptingStream.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends FilterInputStream {
    public final int E0;
    public final int F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ByteBuffer f83436p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ByteBuffer f83437q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f83438r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f83439s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f83440t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f83441u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f83442w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f83443x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final StreamSegmentDecrypter f83444y0;

    public g(e eVar, InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        super(inputStream);
        this.f83444y0 = eVar.newStreamSegmentDecrypter();
        this.f83438r0 = eVar.getHeaderLength();
        this.f83442w0 = Arrays.copyOf(bArr, bArr.length);
        int ciphertextSegmentSize = eVar.getCiphertextSegmentSize();
        this.E0 = ciphertextSegmentSize;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ciphertextSegmentSize + 1);
        this.f83436p0 = byteBufferAllocate;
        byteBufferAllocate.limit(0);
        this.F0 = ciphertextSegmentSize - eVar.getCiphertextOffset();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(eVar.getPlaintextSegmentSize() + 16);
        this.f83437q0 = byteBufferAllocate2;
        byteBufferAllocate2.limit(0);
        this.f83439s0 = false;
        this.f83440t0 = false;
        this.f83441u0 = false;
        this.f83443x0 = 0;
        this.v0 = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return this.f83437q0.remaining();
    }

    public final void b() throws IOException {
        byte b10;
        while (!this.f83440t0 && this.f83436p0.remaining() > 0) {
            int i10 = ((FilterInputStream) this).in.read(this.f83436p0.array(), this.f83436p0.position(), this.f83436p0.remaining());
            if (i10 > 0) {
                ByteBuffer byteBuffer = this.f83436p0;
                byteBuffer.position(byteBuffer.position() + i10);
            } else if (i10 == -1) {
                this.f83440t0 = true;
            } else if (i10 == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
        }
        if (this.f83440t0) {
            b10 = 0;
        } else {
            ByteBuffer byteBuffer2 = this.f83436p0;
            b10 = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.f83436p0;
            byteBuffer3.position(byteBuffer3.position() - 1);
        }
        this.f83436p0.flip();
        this.f83437q0.clear();
        try {
            this.f83444y0.decryptSegment(this.f83436p0, this.f83443x0, this.f83440t0, this.f83437q0);
            this.f83443x0++;
            this.f83437q0.flip();
            this.f83436p0.clear();
            if (this.f83440t0) {
                return;
            }
            this.f83436p0.clear();
            this.f83436p0.limit(this.E0 + 1);
            this.f83436p0.put(b10);
        } catch (GeneralSecurityException e5) {
            this.v0 = true;
            this.f83437q0.limit(0);
            throw new IOException(e5.getMessage() + RootService.LINE_BREAK + toString() + "\nsegmentNr:" + this.f83443x0 + " endOfCiphertext:" + this.f83440t0, e5);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        super.close();
    }

    public final void e() throws IOException {
        if (this.f83439s0) {
            this.v0 = true;
            this.f83437q0.limit(0);
            throw new IOException("Decryption failed.");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f83438r0);
        while (byteBufferAllocate.remaining() > 0) {
            int i10 = ((FilterInputStream) this).in.read(byteBufferAllocate.array(), byteBufferAllocate.position(), byteBufferAllocate.remaining());
            if (i10 == -1) {
                this.v0 = true;
                this.f83437q0.limit(0);
                throw new IOException("Ciphertext is too short");
            }
            if (i10 == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
            byteBufferAllocate.position(byteBufferAllocate.position() + i10);
        }
        byteBufferAllocate.flip();
        try {
            this.f83444y0.init(byteBufferAllocate, this.f83442w0);
            this.f83439s0 = true;
        } catch (GeneralSecurityException e5) {
            throw new IOException(e5);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i10 = read(bArr, 0, 1);
        if (i10 == 1) {
            return bArr[0] & 255;
        }
        if (i10 == -1) {
            return i10;
        }
        throw new IOException("Reading failed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        int i10;
        long j11 = this.E0;
        if (j10 <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j11, j10);
        byte[] bArr = new byte[iMin];
        long j12 = j10;
        while (j12 > 0 && (i10 = read(bArr, 0, (int) Math.min(iMin, j12))) > 0) {
            j12 -= (long) i10;
        }
        return j10 - j12;
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.f83443x0 + "\nciphertextSegmentSize:" + this.E0 + "\nheaderRead:" + this.f83439s0 + "\nendOfCiphertext:" + this.f83440t0 + "\nendOfPlaintext:" + this.f83441u0 + "\ndecryptionErrorOccured:" + this.v0 + "\nciphertextSgement position:" + this.f83436p0.position() + " limit:" + this.f83436p0.limit() + "\nplaintextSegment position:" + this.f83437q0.position() + " limit:" + this.f83437q0.limit();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (!this.v0) {
                if (!this.f83439s0) {
                    e();
                    this.f83436p0.clear();
                    this.f83436p0.limit(this.F0 + 1);
                }
                if (this.f83441u0) {
                    return -1;
                }
                int i12 = 0;
                while (i12 < i11) {
                    if (this.f83437q0.remaining() == 0) {
                        if (this.f83440t0) {
                            this.f83441u0 = true;
                            break;
                        }
                        b();
                    }
                    int iMin = Math.min(this.f83437q0.remaining(), i11 - i12);
                    this.f83437q0.get(bArr, i12 + i10, iMin);
                    i12 += iMin;
                }
                if (i12 == 0 && this.f83441u0) {
                    return -1;
                }
                return i12;
            }
            throw new IOException("Decryption failed.");
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
