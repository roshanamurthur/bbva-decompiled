package mf;

import com.google.crypto.tink.subtle.StreamSegmentEncrypter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: StreamingAeadEncryptingChannel.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements WritableByteChannel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public WritableByteChannel f83445p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public StreamSegmentEncrypter f83446q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ByteBuffer f83447r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ByteBuffer f83448s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f83449t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f83450u0;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f83450u0) {
            while (this.f83448s0.remaining() > 0) {
                if (this.f83445p0.write(this.f83448s0) <= 0) {
                    throw new IOException("Failed to write ciphertext before closing");
                }
            }
            try {
                this.f83448s0.clear();
                this.f83447r0.flip();
                this.f83446q0.encryptSegment(this.f83447r0, true, this.f83448s0);
                this.f83448s0.flip();
                while (this.f83448s0.remaining() > 0) {
                    if (this.f83445p0.write(this.f83448s0) <= 0) {
                        throw new IOException("Failed to write ciphertext before closing");
                    }
                }
                this.f83445p0.close();
                this.f83450u0 = false;
            } catch (GeneralSecurityException e5) {
                throw new IOException(e5);
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f83450u0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final synchronized int write(ByteBuffer byteBuffer) throws IOException {
        try {
            if (!this.f83450u0) {
                throw new ClosedChannelException();
            }
            if (this.f83448s0.remaining() > 0) {
                this.f83445p0.write(this.f83448s0);
            }
            int iPosition = byteBuffer.position();
            while (byteBuffer.remaining() > this.f83447r0.remaining()) {
                if (this.f83448s0.remaining() > 0) {
                    return byteBuffer.position() - iPosition;
                }
                int iRemaining = this.f83447r0.remaining();
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit(iRemaining);
                byteBuffer.position(byteBuffer.position() + iRemaining);
                try {
                    this.f83447r0.flip();
                    this.f83448s0.clear();
                    if (byteBufferSlice.remaining() != 0) {
                        this.f83446q0.encryptSegment(this.f83447r0, byteBufferSlice, false, this.f83448s0);
                    } else {
                        this.f83446q0.encryptSegment(this.f83447r0, false, this.f83448s0);
                    }
                    this.f83448s0.flip();
                    this.f83445p0.write(this.f83448s0);
                    this.f83447r0.clear();
                    this.f83447r0.limit(this.f83449t0);
                } catch (GeneralSecurityException e5) {
                    throw new IOException(e5);
                }
            }
            this.f83447r0.put(byteBuffer);
            return byteBuffer.position() - iPosition;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
