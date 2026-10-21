package com.sun.mail.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WriteTimeoutSocket.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final OutputStream f65608p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ScheduledExecutorService f65609q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final a f65610r0 = new a();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f65611s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f65612t0;

    /* JADX INFO: compiled from: WriteTimeoutSocket.java */
    public class a implements Callable<Object> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            b.this.f65608p0.close();
            return null;
        }
    }

    public b(OutputStream outputStream, ScheduledExecutorService scheduledExecutorService, int i10) throws IOException {
        this.f65608p0 = outputStream;
        this.f65609q0 = scheduledExecutorService;
        this.f65611s0 = i10;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f65608p0.close();
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) throws IOException {
        try {
            if (this.f65612t0 == null) {
                this.f65612t0 = new byte[1];
            }
            byte[] bArr = this.f65612t0;
            bArr[0] = (byte) i10;
            write(bArr);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        if (i10 >= 0) {
            if (i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
                if (i11 == 0) {
                    return;
                }
                ScheduledFuture scheduledFutureSchedule = null;
                try {
                    try {
                        int i13 = this.f65611s0;
                        if (i13 > 0) {
                            scheduledFutureSchedule = this.f65609q0.schedule(this.f65610r0, i13, TimeUnit.MILLISECONDS);
                        }
                    } catch (Throwable th2) {
                        if (scheduledFutureSchedule != null) {
                            scheduledFutureSchedule.cancel(true);
                        }
                        throw th2;
                    }
                } catch (RejectedExecutionException unused) {
                }
                this.f65608p0.write(bArr, i10, i11);
                if (scheduledFutureSchedule != null) {
                    scheduledFutureSchedule.cancel(true);
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
