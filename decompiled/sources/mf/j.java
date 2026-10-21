package mf;

import androidx.annotation.RequiresApi;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.google.crypto.tink.subtle.StreamSegmentDecrypter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: StreamingAeadSeekableDecryptingChannel.java */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(24)
public final class j implements SeekableByteChannel {
    public final long E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public boolean I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SeekableByteChannel f83456p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ByteBuffer f83457q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ByteBuffer f83458r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ByteBuffer f83459s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final long f83460t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f83461u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f83462w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final StreamSegmentDecrypter f83463x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public long f83464y0;

    public j(e eVar, SeekableByteChannel seekableByteChannel, byte[] bArr) throws GeneralSecurityException, IOException {
        this.f83463x0 = eVar.newStreamSegmentDecrypter();
        this.f83456p0 = seekableByteChannel;
        this.f83459s0 = ByteBuffer.allocate(eVar.getHeaderLength());
        int ciphertextSegmentSize = eVar.getCiphertextSegmentSize();
        this.K0 = ciphertextSegmentSize;
        this.f83457q0 = ByteBuffer.allocate(ciphertextSegmentSize);
        int plaintextSegmentSize = eVar.getPlaintextSegmentSize();
        this.J0 = plaintextSegmentSize;
        this.f83458r0 = ByteBuffer.allocate(plaintextSegmentSize + 16);
        this.f83464y0 = 0L;
        this.F0 = false;
        this.H0 = -1;
        this.G0 = false;
        long size = seekableByteChannel.size();
        this.f83460t0 = size;
        this.f83462w0 = Arrays.copyOf(bArr, bArr.length);
        this.I0 = seekableByteChannel.isOpen();
        int i10 = (int) (size / ((long) ciphertextSegmentSize));
        int i11 = (int) (size % ((long) ciphertextSegmentSize));
        int ciphertextOverhead = eVar.getCiphertextOverhead();
        if (i11 > 0) {
            this.f83461u0 = i10 + 1;
            if (i11 < ciphertextOverhead) {
                throw new IOException("Invalid ciphertext size");
            }
            this.v0 = i11;
        } else {
            this.f83461u0 = i10;
            this.v0 = ciphertextSegmentSize;
        }
        int ciphertextOffset = eVar.getCiphertextOffset();
        this.L0 = ciphertextOffset;
        int headerLength = ciphertextOffset - eVar.getHeaderLength();
        this.M0 = headerLength;
        if (headerLength < 0) {
            throw new IOException("Invalid ciphertext offset or header length");
        }
        long j10 = (((long) this.f83461u0) * ((long) ciphertextOverhead)) + ((long) ciphertextOffset);
        if (j10 > size) {
            throw new IOException("Ciphertext is too short");
        }
        this.E0 = size - j10;
    }

    public final boolean a(int i10) throws IOException {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f83461u0)) {
            throw new IOException("Invalid position");
        }
        boolean z10 = i10 == i11 - 1;
        if (i10 != this.H0) {
            int i12 = this.K0;
            long j10 = ((long) i10) * ((long) i12);
            if (z10) {
                i12 = this.v0;
            }
            if (i10 == 0) {
                int i13 = this.L0;
                i12 -= i13;
                j10 = i13;
            }
            this.f83456p0.position(j10);
            this.f83457q0.clear();
            this.f83457q0.limit(i12);
            this.H0 = i10;
            this.G0 = false;
        } else if (this.G0) {
            return true;
        }
        if (this.f83457q0.remaining() > 0) {
            this.f83456p0.read(this.f83457q0);
        }
        if (this.f83457q0.remaining() > 0) {
            return false;
        }
        this.f83457q0.flip();
        this.f83458r0.clear();
        try {
            this.f83463x0.decryptSegment(this.f83457q0, i10, z10, this.f83458r0);
            this.f83458r0.flip();
            this.G0 = true;
            return true;
        } catch (GeneralSecurityException e5) {
            this.H0 = -1;
            throw new IOException(KeyStoreProvider.DECRYPTION_ERROR_MESSAGE, e5);
        }
    }

    public final boolean b() throws IOException {
        this.f83456p0.position(this.f83459s0.position() + this.M0);
        this.f83456p0.read(this.f83459s0);
        if (this.f83459s0.remaining() > 0) {
            return false;
        }
        this.f83459s0.flip();
        try {
            this.f83463x0.init(this.f83459s0, this.f83462w0);
            this.F0 = true;
            return true;
        } catch (GeneralSecurityException e5) {
            throw new IOException(e5);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f83456p0.close();
        this.I0 = false;
    }

    @Override // java.nio.channels.Channel
    public final synchronized boolean isOpen() {
        return this.I0;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final synchronized long position() {
        return this.f83464y0;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public final synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (!this.I0) {
            throw new ClosedChannelException();
        }
        if (!this.F0 && !b()) {
            return 0;
        }
        int iPosition = byteBuffer.position();
        while (byteBuffer.remaining() > 0) {
            long j10 = this.f83464y0;
            if (j10 >= this.E0) {
                break;
            }
            int i10 = this.L0;
            int i11 = this.J0;
            int i12 = (int) ((((long) i10) + j10) / ((long) i11));
            if (i12 != 0) {
                j10 = (j10 + ((long) i10)) % ((long) i11);
            }
            int i13 = (int) j10;
            if (!a(i12)) {
                break;
            }
            this.f83458r0.position(i13);
            if (this.f83458r0.remaining() <= byteBuffer.remaining()) {
                this.f83464y0 += (long) this.f83458r0.remaining();
                byteBuffer.put(this.f83458r0);
            } else {
                int iRemaining = byteBuffer.remaining();
                ByteBuffer byteBufferDuplicate = this.f83458r0.duplicate();
                byteBufferDuplicate.limit(byteBufferDuplicate.position() + iRemaining);
                byteBuffer.put(byteBufferDuplicate);
                this.f83464y0 += (long) iRemaining;
                ByteBuffer byteBuffer2 = this.f83458r0;
                byteBuffer2.position(byteBuffer2.position() + iRemaining);
            }
        }
        int iPosition2 = byteBuffer.position() - iPosition;
        if (iPosition2 == 0 && this.G0 && this.H0 == this.f83461u0 - 1 && this.f83458r0.remaining() == 0) {
            return -1;
        }
        return iPosition2;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final long size() {
        return this.E0;
    }

    public final synchronized String toString() {
        StringBuilder sb2;
        String str;
        sb2 = new StringBuilder("StreamingAeadSeekableDecryptingChannel\nciphertextChannel");
        try {
            str = "position:" + this.f83456p0.position();
        } catch (IOException unused) {
            str = "position: n/a";
        }
        sb2.append(str);
        sb2.append("\nciphertextChannelSize:");
        sb2.append(this.f83460t0);
        sb2.append("\nplaintextSize:");
        sb2.append(this.E0);
        sb2.append("\nciphertextSegmentSize:");
        sb2.append(this.K0);
        sb2.append("\nnumberOfSegments:");
        sb2.append(this.f83461u0);
        sb2.append("\nheaderRead:");
        sb2.append(this.F0);
        sb2.append("\nplaintextPosition:");
        sb2.append(this.f83464y0);
        sb2.append("\nHeader position:");
        sb2.append(this.f83459s0.position());
        sb2.append(" limit:");
        sb2.append(this.f83459s0.position());
        sb2.append("\ncurrentSegmentNr:");
        sb2.append(this.H0);
        sb2.append("\nciphertextSgement position:");
        sb2.append(this.f83457q0.position());
        sb2.append(" limit:");
        sb2.append(this.f83457q0.limit());
        sb2.append("\nisCurrentSegmentDecrypted:");
        sb2.append(this.G0);
        sb2.append("\nplaintextSegment position:");
        sb2.append(this.f83458r0.position());
        sb2.append(" limit:");
        sb2.append(this.f83458r0.limit());
        return sb2.toString();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final SeekableByteChannel truncate(long j10) throws NonWritableChannelException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws NonWritableChannelException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel
    @CanIgnoreReturnValue
    public final synchronized SeekableByteChannel position(long j10) {
        this.f83464y0 = j10;
        return this;
    }
}
