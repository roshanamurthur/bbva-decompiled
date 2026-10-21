package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes10.dex */
public final class RewindableReadableByteChannel implements ReadableByteChannel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @GuardedBy("this")
    public final ReadableByteChannel f47481p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @GuardedBy("this")
    public ByteBuffer f47482q0 = null;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f47483r0 = true;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f47484s0 = false;

    public RewindableReadableByteChannel(ReadableByteChannel readableByteChannel) {
        this.f47481p0 = readableByteChannel;
    }

    public final synchronized void a(int i10) {
        try {
            if (this.f47482q0.capacity() < i10) {
                int iPosition = this.f47482q0.position();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Math.max(this.f47482q0.capacity() * 2, i10));
                this.f47482q0.rewind();
                byteBufferAllocate.put(this.f47482q0);
                byteBufferAllocate.position(iPosition);
                this.f47482q0 = byteBufferAllocate;
            }
            this.f47482q0.limit(i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f47483r0 = false;
        this.f47484s0 = true;
        this.f47481p0.close();
    }

    public synchronized void disableRewinding() {
        this.f47483r0 = false;
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
        return this.f47481p0.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (this.f47484s0) {
            return this.f47481p0.read(byteBuffer);
        }
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return 0;
        }
        ByteBuffer byteBuffer2 = this.f47482q0;
        if (byteBuffer2 == null) {
            if (!this.f47483r0) {
                this.f47484s0 = true;
                return this.f47481p0.read(byteBuffer);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
            this.f47482q0 = byteBufferAllocate;
            int i10 = this.f47481p0.read(byteBufferAllocate);
            this.f47482q0.flip();
            if (i10 > 0) {
                byteBuffer.put(this.f47482q0);
            }
            return i10;
        }
        if (byteBuffer2.remaining() >= iRemaining) {
            int iLimit = this.f47482q0.limit();
            ByteBuffer byteBuffer3 = this.f47482q0;
            byteBuffer3.limit(byteBuffer3.position() + iRemaining);
            byteBuffer.put(this.f47482q0);
            this.f47482q0.limit(iLimit);
            if (!this.f47483r0 && !this.f47482q0.hasRemaining()) {
                this.f47482q0 = null;
                this.f47484s0 = true;
            }
            return iRemaining;
        }
        int iRemaining2 = this.f47482q0.remaining();
        int iPosition = this.f47482q0.position();
        int iLimit2 = this.f47482q0.limit();
        a((iRemaining - iRemaining2) + iLimit2);
        this.f47482q0.position(iLimit2);
        int i11 = this.f47481p0.read(this.f47482q0);
        this.f47482q0.flip();
        this.f47482q0.position(iPosition);
        byteBuffer.put(this.f47482q0);
        if (iRemaining2 == 0 && i11 < 0) {
            return -1;
        }
        int iPosition2 = this.f47482q0.position() - iPosition;
        if (!this.f47483r0 && !this.f47482q0.hasRemaining()) {
            this.f47482q0 = null;
            this.f47484s0 = true;
        }
        return iPosition2;
    }

    public synchronized void rewind() throws IOException {
        if (!this.f47483r0) {
            throw new IOException("Cannot rewind anymore.");
        }
        ByteBuffer byteBuffer = this.f47482q0;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
    }
}
