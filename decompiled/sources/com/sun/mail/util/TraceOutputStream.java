package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
public class TraceOutputStream extends FilterOutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f65587p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f65588q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final OutputStream f65589r0;

    public TraceOutputStream(OutputStream outputStream, MailLogger mailLogger) {
        super(outputStream);
        this.f65587p0 = false;
        this.f65588q0 = false;
        this.f65587p0 = mailLogger.isLoggable(Level.FINEST);
        this.f65589r0 = new LogOutputStream(mailLogger);
    }

    public final void a(int i10) throws IOException {
        int i11 = i10 & 255;
        OutputStream outputStream = this.f65589r0;
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

    public void setQuote(boolean z10) {
        this.f65588q0 = z10;
    }

    public void setTrace(boolean z10) {
        this.f65587p0 = z10;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        if (this.f65587p0) {
            if (this.f65588q0) {
                a(i10);
            } else {
                this.f65589r0.write(i10);
            }
        }
        ((FilterOutputStream) this).out.write(i10);
    }

    public TraceOutputStream(OutputStream outputStream, OutputStream outputStream2) {
        super(outputStream);
        this.f65587p0 = false;
        this.f65588q0 = false;
        this.f65589r0 = outputStream2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f65587p0) {
            if (this.f65588q0) {
                for (int i12 = 0; i12 < i11; i12++) {
                    a(bArr[i10 + i12]);
                }
            } else {
                this.f65589r0.write(bArr, i10, i11);
            }
        }
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
    }
}
