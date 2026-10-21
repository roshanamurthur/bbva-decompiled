package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class QPEncoderStream extends FilterOutputStream {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final char[] f65575t0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f65576p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f65577q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f65578r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f65579s0;

    public QPEncoderStream(OutputStream outputStream, int i10) {
        super(outputStream);
        this.f65576p0 = 0;
        this.f65578r0 = false;
        this.f65579s0 = false;
        this.f65577q0 = i10 - 1;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.f65578r0) {
            output(32, true);
            this.f65578r0 = false;
        }
        ((FilterOutputStream) this).out.flush();
    }

    public void output(int i10, boolean z10) throws IOException {
        int i11 = this.f65577q0;
        if (!z10) {
            int i12 = this.f65576p0 + 1;
            this.f65576p0 = i12;
            if (i12 > i11) {
                ((FilterOutputStream) this).out.write(61);
                ((FilterOutputStream) this).out.write(13);
                ((FilterOutputStream) this).out.write(10);
                this.f65576p0 = 1;
            }
            ((FilterOutputStream) this).out.write(i10);
            return;
        }
        int i13 = this.f65576p0 + 3;
        this.f65576p0 = i13;
        if (i13 > i11) {
            ((FilterOutputStream) this).out.write(61);
            ((FilterOutputStream) this).out.write(13);
            ((FilterOutputStream) this).out.write(10);
            this.f65576p0 = 3;
        }
        ((FilterOutputStream) this).out.write(61);
        OutputStream outputStream = ((FilterOutputStream) this).out;
        char[] cArr = f65575t0;
        outputStream.write(cArr[i10 >> 4]);
        ((FilterOutputStream) this).out.write(cArr[i10 & 15]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            write(bArr[i10 + i12]);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        int i11 = i10 & 255;
        if (this.f65578r0) {
            if (i11 != 13 && i11 != 10) {
                output(32, false);
            } else {
                output(32, true);
            }
            this.f65578r0 = false;
        }
        if (i11 == 13) {
            this.f65579s0 = true;
            ((FilterOutputStream) this).out.write(13);
            ((FilterOutputStream) this).out.write(10);
            this.f65576p0 = 0;
            return;
        }
        if (i11 == 10) {
            if (!this.f65579s0) {
                ((FilterOutputStream) this).out.write(13);
                ((FilterOutputStream) this).out.write(10);
                this.f65576p0 = 0;
            }
        } else if (i11 == 32) {
            this.f65578r0 = true;
        } else if (i11 >= 32 && i11 < 127 && i11 != 61) {
            output(i11, false);
        } else {
            output(i11, true);
        }
        this.f65579s0 = false;
    }

    public QPEncoderStream(OutputStream outputStream) {
        this(outputStream, 76);
    }
}
