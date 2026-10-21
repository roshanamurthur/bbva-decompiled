package com.sun.mail.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes9.dex */
public class UUEncoderStream extends FilterOutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f65599p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f65600q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f65601r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f65602s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f65603t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f65604u0;

    public UUEncoderStream(OutputStream outputStream) {
        this(outputStream, "encoder.buf", TypedValues.CycleType.TYPE_EASING);
    }

    public final void b() throws IOException {
        byte b10;
        ((FilterOutputStream) this).out.write((this.f65600q0 & 63) + 32);
        int i10 = 0;
        while (true) {
            int i11 = this.f65600q0;
            if (i10 >= i11) {
                ((FilterOutputStream) this).out.write(10);
                return;
            }
            int i12 = i10 + 1;
            byte[] bArr = this.f65599p0;
            byte b11 = bArr[i10];
            byte b12 = 1;
            if (i12 < i11) {
                int i13 = i10 + 2;
                byte b13 = bArr[i12];
                if (i13 < i11) {
                    i10 += 3;
                    b10 = bArr[i13];
                } else {
                    b10 = 1;
                    i10 = i13;
                }
                b12 = b13;
            } else {
                i10 = i12;
                b10 = 1;
            }
            ((FilterOutputStream) this).out.write(((b11 >>> 2) & 63) + 32);
            ((FilterOutputStream) this).out.write((((b11 << 4) & 48) | ((b12 >>> 4) & 15)) + 32);
            ((FilterOutputStream) this).out.write((((b12 << 2) & 60) | ((b10 >>> 6) & 3)) + 32);
            ((FilterOutputStream) this).out.write((b10 & 63) + 32);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        ((FilterOutputStream) this).out.close();
    }

    public final void e() throws IOException {
        if (this.f65601r0) {
            return;
        }
        PrintStream printStream = new PrintStream(((FilterOutputStream) this).out, false, "utf-8");
        printStream.format("begin %o %s%n", Integer.valueOf(this.f65604u0), this.f65603t0);
        printStream.flush();
        this.f65601r0 = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.f65600q0 > 0) {
            e();
            b();
            this.f65600q0 = 0;
        }
        if (!this.f65602s0) {
            PrintStream printStream = new PrintStream(((FilterOutputStream) this).out, false, "us-ascii");
            printStream.println(" \nend");
            printStream.flush();
            this.f65602s0 = true;
        }
        ((FilterOutputStream) this).out.flush();
    }

    public void setNameMode(String str, int i10) {
        this.f65603t0 = str;
        this.f65604u0 = i10;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            write(bArr[i10 + i12]);
        }
    }

    public UUEncoderStream(OutputStream outputStream, String str) {
        this(outputStream, str, TypedValues.CycleType.TYPE_EASING);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public UUEncoderStream(OutputStream outputStream, String str, int i10) {
        super(outputStream);
        this.f65600q0 = 0;
        this.f65601r0 = false;
        this.f65602s0 = false;
        this.f65603t0 = str;
        this.f65604u0 = i10;
        this.f65599p0 = new byte[45];
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        int i11 = this.f65600q0;
        int i12 = i11 + 1;
        this.f65600q0 = i12;
        this.f65599p0[i11] = (byte) i10;
        if (i12 == 45) {
            e();
            b();
            this.f65600q0 = 0;
        }
    }
}
