package com.bumptech.glide.util;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
public final class ExceptionPassthroughInputStream extends InputStream {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @GuardedBy("POOL")
    public static final Queue<ExceptionPassthroughInputStream> f38904r0 = Util.createQueue(0);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public InputStream f38905p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public IOException f38906q0;

    @NonNull
    public static ExceptionPassthroughInputStream obtain(@NonNull InputStream inputStream) {
        ExceptionPassthroughInputStream exceptionPassthroughInputStreamPoll;
        Queue<ExceptionPassthroughInputStream> queue = f38904r0;
        synchronized (queue) {
            exceptionPassthroughInputStreamPoll = queue.poll();
        }
        if (exceptionPassthroughInputStreamPoll == null) {
            exceptionPassthroughInputStreamPoll = new ExceptionPassthroughInputStream();
        }
        exceptionPassthroughInputStreamPoll.f38905p0 = inputStream;
        return exceptionPassthroughInputStreamPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f38905p0.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f38905p0.close();
    }

    @Nullable
    public IOException getException() {
        return this.f38906q0;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f38905p0.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f38905p0.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f38905p0.read();
        } catch (IOException e5) {
            this.f38906q0 = e5;
            throw e5;
        }
    }

    public void release() {
        this.f38906q0 = null;
        this.f38905p0 = null;
        Queue<ExceptionPassthroughInputStream> queue = f38904r0;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f38905p0.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f38905p0.skip(j10);
        } catch (IOException e5) {
            this.f38906q0 = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f38905p0.read(bArr);
        } catch (IOException e5) {
            this.f38906q0 = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f38905p0.read(bArr, i10, i11);
        } catch (IOException e5) {
            this.f38906q0 = e5;
            throw e5;
        }
    }
}
