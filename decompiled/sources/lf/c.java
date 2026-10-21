package lf;

import androidx.annotation.RequiresApi;
import com.google.crypto.tink.StreamingAead;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: SeekableByteChannelDecrypter.java */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(24)
public final class c implements SeekableByteChannel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @GuardedBy("this")
    public SeekableByteChannel f83203p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @GuardedBy("this")
    public SeekableByteChannel f83204q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @GuardedBy("this")
    public SeekableByteChannel f83205r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @GuardedBy("this")
    public long f83206s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @GuardedBy("this")
    public long f83207t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayDeque f83208u0;
    public byte[] v0;

    @GuardedBy("this")
    public final synchronized SeekableByteChannel b() throws IOException {
        SeekableByteChannel seekableByteChannelNewSeekableDecryptingChannel;
        while (!this.f83208u0.isEmpty()) {
            this.f83205r0.position(this.f83207t0);
            try {
                seekableByteChannelNewSeekableDecryptingChannel = ((StreamingAead) this.f83208u0.removeFirst()).newSeekableDecryptingChannel(this.f83205r0, this.v0);
                long j10 = this.f83206s0;
                if (j10 >= 0) {
                    seekableByteChannelNewSeekableDecryptingChannel.position(j10);
                }
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
        return seekableByteChannelNewSeekableDecryptingChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    @GuardedBy("this")
    public final synchronized void close() throws IOException {
        this.f83205r0.close();
    }

    @Override // java.nio.channels.Channel
    @GuardedBy("this")
    public final synchronized boolean isOpen() {
        return this.f83205r0.isOpen();
    }

    @Override // java.nio.channels.SeekableByteChannel
    @CanIgnoreReturnValue
    @GuardedBy("this")
    public final synchronized SeekableByteChannel position(long j10) throws IOException {
        try {
            SeekableByteChannel seekableByteChannel = this.f83204q0;
            if (seekableByteChannel != null) {
                seekableByteChannel.position(j10);
            } else {
                if (j10 < 0) {
                    throw new IllegalArgumentException("Position must be non-negative");
                }
                this.f83206s0 = j10;
                SeekableByteChannel seekableByteChannel2 = this.f83203p0;
                if (seekableByteChannel2 != null) {
                    seekableByteChannel2.position(j10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    @GuardedBy("this")
    public final synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() == 0) {
            return 0;
        }
        SeekableByteChannel seekableByteChannel = this.f83204q0;
        if (seekableByteChannel != null) {
            return seekableByteChannel.read(byteBuffer);
        }
        if (this.f83203p0 == null) {
            this.f83203p0 = b();
        }
        while (true) {
            try {
                int i10 = this.f83203p0.read(byteBuffer);
                if (i10 == 0) {
                    return 0;
                }
                this.f83204q0 = this.f83203p0;
                this.f83203p0 = null;
                return i10;
            } catch (IOException unused) {
                this.f83203p0 = b();
            }
            throw th;
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    @GuardedBy("this")
    public final synchronized long size() throws IOException {
        SeekableByteChannel seekableByteChannel;
        seekableByteChannel = this.f83204q0;
        if (seekableByteChannel == null) {
            throw new IOException("Cannot determine size before first read()-call.");
        }
        return seekableByteChannel.size();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final SeekableByteChannel truncate(long j10) throws IOException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel
    @GuardedBy("this")
    public final synchronized long position() throws IOException {
        SeekableByteChannel seekableByteChannel = this.f83204q0;
        if (seekableByteChannel != null) {
            return seekableByteChannel.position();
        }
        return this.f83206s0;
    }
}
