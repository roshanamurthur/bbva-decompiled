package mf;

import com.google.crypto.tink.subtle.StreamSegmentEncrypter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: StreamingAeadEncryptingStream.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i extends FilterOutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final StreamSegmentEncrypter f83451p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f83452q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ByteBuffer f83453r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ByteBuffer f83454s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f83455t0;

    public i(e eVar, OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        super(outputStream);
        StreamSegmentEncrypter streamSegmentEncrypterNewStreamSegmentEncrypter = eVar.newStreamSegmentEncrypter(bArr);
        this.f83451p0 = streamSegmentEncrypterNewStreamSegmentEncrypter;
        int plaintextSegmentSize = eVar.getPlaintextSegmentSize();
        this.f83452q0 = plaintextSegmentSize;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(plaintextSegmentSize);
        this.f83453r0 = byteBufferAllocate;
        this.f83454s0 = ByteBuffer.allocate(eVar.getCiphertextSegmentSize());
        byteBufferAllocate.limit(plaintextSegmentSize - eVar.getCiphertextOffset());
        ByteBuffer header = streamSegmentEncrypterNewStreamSegmentEncrypter.getHeader();
        byte[] bArr2 = new byte[header.remaining()];
        header.get(bArr2);
        ((FilterOutputStream) this).out.write(bArr2);
        this.f83455t0 = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f83455t0) {
            try {
                this.f83453r0.flip();
                this.f83454s0.clear();
                this.f83451p0.encryptSegment(this.f83453r0, true, this.f83454s0);
                this.f83454s0.flip();
                ((FilterOutputStream) this).out.write(this.f83454s0.array(), this.f83454s0.position(), this.f83454s0.remaining());
                this.f83455t0 = false;
                super.close();
            } catch (GeneralSecurityException e5) {
                throw new IOException("ptBuffer.remaining():" + this.f83453r0.remaining() + " ctBuffer.remaining():" + this.f83454s0.remaining(), e5);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (this.f83455t0) {
                while (i11 > this.f83453r0.remaining()) {
                    int iRemaining = this.f83453r0.remaining();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i10, iRemaining);
                    i10 += iRemaining;
                    i11 -= iRemaining;
                    try {
                        this.f83453r0.flip();
                        this.f83454s0.clear();
                        this.f83451p0.encryptSegment(this.f83453r0, byteBufferWrap, false, this.f83454s0);
                        this.f83454s0.flip();
                        ((FilterOutputStream) this).out.write(this.f83454s0.array(), this.f83454s0.position(), this.f83454s0.remaining());
                        this.f83453r0.clear();
                        this.f83453r0.limit(this.f83452q0);
                    } catch (GeneralSecurityException e5) {
                        throw new IOException(e5);
                    }
                }
                this.f83453r0.put(bArr, i10, i11);
            } else {
                throw new IOException("Trying to write to closed stream");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
