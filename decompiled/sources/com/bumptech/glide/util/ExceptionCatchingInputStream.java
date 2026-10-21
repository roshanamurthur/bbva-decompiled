package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class ExceptionCatchingInputStream extends InputStream {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Queue<ExceptionCatchingInputStream> f38901r0 = Util.createQueue(0);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public InputStream f38902p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public IOException f38903q0;

    @NonNull
    public static ExceptionCatchingInputStream obtain(@NonNull InputStream inputStream) {
        ExceptionCatchingInputStream exceptionCatchingInputStreamPoll;
        Queue<ExceptionCatchingInputStream> queue = f38901r0;
        synchronized (queue) {
            exceptionCatchingInputStreamPoll = queue.poll();
        }
        if (exceptionCatchingInputStreamPoll == null) {
            exceptionCatchingInputStreamPoll = new ExceptionCatchingInputStream();
        }
        exceptionCatchingInputStreamPoll.f38902p0 = inputStream;
        return exceptionCatchingInputStreamPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f38902p0.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f38902p0.close();
    }

    @Nullable
    public IOException getException() {
        return this.f38903q0;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f38902p0.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f38902p0.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f38902p0.read(bArr);
        } catch (IOException e5) {
            this.f38903q0 = e5;
            return -1;
        }
    }

    public void release() {
        this.f38903q0 = null;
        this.f38902p0 = null;
        Queue<ExceptionCatchingInputStream> queue = f38901r0;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f38902p0.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.f38902p0.skip(j10);
        } catch (IOException e5) {
            this.f38903q0 = e5;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f38902p0.read(bArr, i10, i11);
        } catch (IOException e5) {
            this.f38903q0 = e5;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f38902p0.read();
        } catch (IOException e5) {
            this.f38903q0 = e5;
            return -1;
        }
    }
}
