package mf;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.crypto.tink.subtle.StreamSegmentDecrypter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: StreamingAeadDecryptingChannel.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements ReadableByteChannel {
    public final StreamSegmentDecrypter E0;
    public final int F0;
    public final int G0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ReadableByteChannel f83427p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ByteBuffer f83428q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ByteBuffer f83429r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ByteBuffer f83430s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f83431t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f83432u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f83433w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final byte[] f83434x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f83435y0;

    public f(e eVar, ReadableByteChannel readableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        this.E0 = eVar.newStreamSegmentDecrypter();
        this.f83427p0 = readableByteChannel;
        this.f83430s0 = ByteBuffer.allocate(eVar.getHeaderLength());
        this.f83434x0 = Arrays.copyOf(bArr, bArr.length);
        int ciphertextSegmentSize = eVar.getCiphertextSegmentSize();
        this.F0 = ciphertextSegmentSize;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ciphertextSegmentSize + 1);
        this.f83428q0 = byteBufferAllocate;
        byteBufferAllocate.limit(0);
        this.G0 = ciphertextSegmentSize - eVar.getCiphertextOffset();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(eVar.getPlaintextSegmentSize() + 16);
        this.f83429r0 = byteBufferAllocate2;
        byteBufferAllocate2.limit(0);
        this.f83431t0 = false;
        this.f83432u0 = false;
        this.v0 = false;
        this.f83435y0 = 0;
        this.f83433w0 = true;
    }

    public final boolean b() throws IOException {
        byte b10;
        int i10;
        boolean z10 = this.f83432u0;
        ByteBuffer byteBuffer = this.f83428q0;
        if (!z10) {
            do {
                i10 = this.f83427p0.read(byteBuffer);
                if (i10 <= 0) {
                    break;
                }
            } while (byteBuffer.remaining() > 0);
            if (i10 == -1) {
                this.f83432u0 = true;
            }
        }
        if (byteBuffer.remaining() > 0 && !this.f83432u0) {
            return false;
        }
        if (this.f83432u0) {
            b10 = 0;
        } else {
            b10 = byteBuffer.get(byteBuffer.position() - 1);
            byteBuffer.position(byteBuffer.position() - 1);
        }
        byteBuffer.flip();
        ByteBuffer byteBuffer2 = this.f83429r0;
        byteBuffer2.clear();
        try {
            this.E0.decryptSegment(byteBuffer, this.f83435y0, this.f83432u0, byteBuffer2);
            this.f83435y0++;
            byteBuffer2.flip();
            byteBuffer.clear();
            if (!this.f83432u0) {
                byteBuffer.clear();
                byteBuffer.limit(this.F0 + 1);
                byteBuffer.put(b10);
            }
            return true;
        } catch (GeneralSecurityException e5) {
            this.f83433w0 = false;
            this.f83429r0.limit(0);
            throw new IOException(e5.getMessage() + RootService.LINE_BREAK + toString() + "\nsegmentNr:" + this.f83435y0 + " endOfCiphertext:" + this.f83432u0, e5);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f83427p0.close();
    }

    public final boolean e() throws IOException {
        int i10;
        if (this.f83432u0) {
            throw new IOException("Ciphertext is too short");
        }
        ByteBuffer byteBuffer = this.f83430s0;
        do {
            i10 = this.f83427p0.read(byteBuffer);
            if (i10 <= 0) {
                break;
            }
        } while (byteBuffer.remaining() > 0);
        if (i10 == -1) {
            this.f83432u0 = true;
        }
        if (byteBuffer.remaining() > 0) {
            return false;
        }
        byteBuffer.flip();
        try {
            this.E0.init(byteBuffer, this.f83434x0);
            this.f83431t0 = true;
            return true;
        } catch (GeneralSecurityException e5) {
            this.f83433w0 = false;
            this.f83429r0.limit(0);
            throw new IOException(e5);
        }
    }

    @Override // java.nio.channels.Channel
    public final synchronized boolean isOpen() {
        return this.f83427p0.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final synchronized int read(ByteBuffer byteBuffer) throws IOException {
        try {
            if (!this.f83433w0) {
                throw new IOException("This StreamingAeadDecryptingChannel is in an undefined state");
            }
            if (!this.f83431t0) {
                if (!e()) {
                    return 0;
                }
                this.f83428q0.clear();
                this.f83428q0.limit(this.G0 + 1);
            }
            if (this.v0) {
                return -1;
            }
            int iPosition = byteBuffer.position();
            while (byteBuffer.remaining() > 0) {
                if (this.f83429r0.remaining() == 0) {
                    if (!this.f83432u0) {
                        if (!b()) {
                            break;
                        }
                    } else {
                        this.v0 = true;
                        break;
                    }
                }
                if (this.f83429r0.remaining() <= byteBuffer.remaining()) {
                    byteBuffer.put(this.f83429r0);
                } else {
                    int iRemaining = byteBuffer.remaining();
                    ByteBuffer byteBufferDuplicate = this.f83429r0.duplicate();
                    byteBufferDuplicate.limit(byteBufferDuplicate.position() + iRemaining);
                    byteBuffer.put(byteBufferDuplicate);
                    ByteBuffer byteBuffer2 = this.f83429r0;
                    byteBuffer2.position(byteBuffer2.position() + iRemaining);
                }
            }
            int iPosition2 = byteBuffer.position() - iPosition;
            if (iPosition2 == 0 && this.v0) {
                return -1;
            }
            return iPosition2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingChannel\nsegmentNr:" + this.f83435y0 + "\nciphertextSegmentSize:" + this.F0 + "\nheaderRead:" + this.f83431t0 + "\nendOfCiphertext:" + this.f83432u0 + "\nendOfPlaintext:" + this.v0 + "\ndefinedState:" + this.f83433w0 + "\nHeader position:" + this.f83430s0.position() + " limit:" + this.f83430s0.position() + "\nciphertextSgement position:" + this.f83428q0.position() + " limit:" + this.f83428q0.limit() + "\nplaintextSegment position:" + this.f83429r0.position() + " limit:" + this.f83429r0.limit();
    }
}
