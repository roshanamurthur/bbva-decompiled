package lf;

import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.subtle.RewindableReadableByteChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: ReadableByteChannelDecrypter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements ReadableByteChannel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @GuardedBy("this")
    public ReadableByteChannel f83198p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @GuardedBy("this")
    public ReadableByteChannel f83199q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @GuardedBy("this")
    public RewindableReadableByteChannel f83200r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ArrayDeque f83201s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f83202t0;

    @GuardedBy("this")
    public final synchronized ReadableByteChannel b() throws IOException {
        while (!this.f83201s0.isEmpty()) {
            try {
            } catch (GeneralSecurityException unused) {
                this.f83200r0.rewind();
            }
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
        return ((StreamingAead) this.f83201s0.removeFirst()).newDecryptingChannel(this.f83200r0, this.f83202t0);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f83200r0.close();
    }

    @Override // java.nio.channels.Channel
    public final synchronized boolean isOpen() {
        return this.f83200r0.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() == 0) {
            return 0;
        }
        ReadableByteChannel readableByteChannel = this.f83199q0;
        if (readableByteChannel != null) {
            return readableByteChannel.read(byteBuffer);
        }
        if (this.f83198p0 == null) {
            this.f83198p0 = b();
        }
        while (true) {
            try {
                int i10 = this.f83198p0.read(byteBuffer);
                if (i10 == 0) {
                    return 0;
                }
                this.f83199q0 = this.f83198p0;
                this.f83198p0 = null;
                this.f83200r0.disableRewinding();
                return i10;
            } catch (IOException unused) {
                this.f83200r0.rewind();
                this.f83198p0 = b();
            }
            throw th;
        }
    }
}
