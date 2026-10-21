package com.sun.mail.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
public class TraceInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f65584p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f65585q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final OutputStream f65586r0;

    public TraceInputStream(InputStream inputStream, MailLogger mailLogger) {
        super(inputStream);
        this.f65584p0 = false;
        this.f65585q0 = false;
        this.f65584p0 = mailLogger.isLoggable(Level.FINEST);
        this.f65586r0 = new LogOutputStream(mailLogger);
    }

    public final void a(int i10) throws IOException {
        int i11 = i10 & 255;
        OutputStream outputStream = this.f65586r0;
        if (i11 > 127) {
            outputStream.write(77);
            outputStream.write(45);
            i11 = i10 & 127;
        }
        if (i11 == 13) {
            outputStream.write(92);
            outputStream.write(114);
            return;
        }
        if (i11 == 10) {
            outputStream.write(92);
            outputStream.write(110);
            outputStream.write(10);
        } else if (i11 == 9) {
            outputStream.write(92);
            outputStream.write(116);
        } else if (i11 >= 32) {
            outputStream.write(i11);
        } else {
            outputStream.write(94);
            outputStream.write(i11 + 64);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (this.f65584p0 && i10 != -1) {
            if (this.f65585q0) {
                a(i10);
            } else {
                this.f65586r0.write(i10);
            }
        }
        return i10;
    }

    public void setQuote(boolean z10) {
        this.f65585q0 = z10;
    }

    public void setTrace(boolean z10) {
        this.f65584p0 = z10;
    }

    public TraceInputStream(InputStream inputStream, OutputStream outputStream) {
        super(inputStream);
        this.f65584p0 = false;
        this.f65585q0 = false;
        this.f65586r0 = outputStream;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (this.f65584p0 && i12 != -1) {
            if (this.f65585q0) {
                for (int i13 = 0; i13 < i12; i13++) {
                    a(bArr[i10 + i13]);
                }
            } else {
                this.f65586r0.write(bArr, i10, i12);
            }
        }
        return i12;
    }
}
