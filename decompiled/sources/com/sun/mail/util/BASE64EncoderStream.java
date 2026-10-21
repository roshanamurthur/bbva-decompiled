package com.sun.mail.util;

import com.fasterxml.jackson.core.JsonPointer;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class BASE64EncoderStream extends FilterOutputStream {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f65540w0 = {13, 10};

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final char[] f65541x0 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', JsonPointer.SEPARATOR};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f65542p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f65543q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f65544r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f65545s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f65546t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f65547u0;
    public final boolean v0;

    public BASE64EncoderStream(OutputStream outputStream, int i10) {
        super(outputStream);
        this.f65543q0 = 0;
        this.f65545s0 = 0;
        this.v0 = false;
        this.f65542p0 = new byte[3];
        if (i10 == Integer.MAX_VALUE || i10 < 4) {
            this.v0 = true;
            i10 = 76;
        }
        int i11 = (i10 / 4) * 4;
        this.f65546t0 = i11;
        this.f65547u0 = (i11 / 4) * 3;
        if (this.v0) {
            this.f65544r0 = new byte[i11];
            return;
        }
        byte[] bArr = new byte[i11 + 2];
        this.f65544r0 = bArr;
        bArr[i11] = 13;
        bArr[i11 + 1] = 10;
    }

    public static byte[] c(byte[] bArr, int i10, int i11, byte[] bArr2) {
        char[] cArr;
        if (bArr2 == null) {
            bArr2 = new byte[((i11 + 2) / 3) * 4];
        }
        int i12 = 0;
        while (true) {
            cArr = f65541x0;
            if (i11 < 3) {
                break;
            }
            int i13 = i10 + 2;
            int i14 = ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8)) << 8;
            i10 += 3;
            int i15 = i14 | (bArr[i13] & 255);
            bArr2[i12 + 3] = (byte) cArr[i15 & 63];
            bArr2[i12 + 2] = (byte) cArr[(i15 >> 6) & 63];
            bArr2[i12 + 1] = (byte) cArr[(i15 >> 12) & 63];
            bArr2[i12] = (byte) cArr[(i15 >> 18) & 63];
            i11 -= 3;
            i12 += 4;
        }
        if (i11 == 1) {
            int i16 = (bArr[i10] & 255) << 4;
            bArr2[i12 + 3] = Base64.padSymbol;
            bArr2[i12 + 2] = Base64.padSymbol;
            bArr2[i12 + 1] = (byte) cArr[i16 & 63];
            bArr2[i12] = (byte) cArr[(i16 >> 6) & 63];
        } else if (i11 == 2) {
            int i17 = ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8)) << 2;
            bArr2[i12 + 3] = Base64.padSymbol;
            bArr2[i12 + 2] = (byte) cArr[i17 & 63];
            bArr2[i12 + 1] = (byte) cArr[(i17 >> 6) & 63];
            bArr2[i12] = (byte) cArr[(i17 >> 12) & 63];
        }
        return bArr2;
    }

    public static byte[] encode(byte[] bArr) {
        return bArr.length == 0 ? bArr : c(bArr, 0, bArr.length, null);
    }

    public final void b() throws IOException {
        int i10 = this.f65543q0;
        int i11 = ((i10 + 2) / 3) * 4;
        ((FilterOutputStream) this).out.write(c(this.f65542p0, 0, i10, this.f65544r0), 0, i11);
        int i12 = this.f65545s0 + i11;
        this.f65545s0 = i12;
        if (i12 >= this.f65546t0) {
            if (!this.v0) {
                ((FilterOutputStream) this).out.write(f65540w0);
            }
            this.f65545s0 = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            flush();
            if (this.f65545s0 > 0 && !this.v0) {
                ((FilterOutputStream) this).out.write(f65540w0);
                ((FilterOutputStream) this).out.flush();
            }
            ((FilterOutputStream) this).out.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        try {
            if (this.f65543q0 > 0) {
                b();
                this.f65543q0 = 0;
            }
            ((FilterOutputStream) this).out.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        while (this.f65543q0 != 0 && i10 < i12) {
            try {
                write(bArr[i10]);
                i10++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i13 = ((this.f65546t0 - this.f65545s0) / 4) * 3;
        int i14 = i10 + i13;
        if (i14 <= i12) {
            int i15 = ((i13 + 2) / 3) * 4;
            if (!this.v0) {
                byte[] bArr2 = this.f65544r0;
                int i16 = i15 + 1;
                bArr2[i15] = 13;
                i15 += 2;
                bArr2[i16] = 10;
            }
            ((FilterOutputStream) this).out.write(c(bArr, i10, i13, this.f65544r0), 0, i15);
            this.f65545s0 = 0;
            i10 = i14;
        }
        while (true) {
            int i17 = this.f65547u0;
            if (i10 + i17 > i12) {
                break;
            }
            ((FilterOutputStream) this).out.write(c(bArr, i10, i17, this.f65544r0));
            i10 += this.f65547u0;
        }
        if (i10 + 3 <= i12) {
            int i18 = ((i12 - i10) / 3) * 3;
            int i19 = ((i18 + 2) / 3) * 4;
            ((FilterOutputStream) this).out.write(c(bArr, i10, i18, this.f65544r0), 0, i19);
            i10 += i18;
            this.f65545s0 += i19;
        }
        while (i10 < i12) {
            write(bArr[i10]);
            i10++;
        }
    }

    public BASE64EncoderStream(OutputStream outputStream) {
        this(outputStream, 76);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int i10) throws IOException {
        byte[] bArr = this.f65542p0;
        int i11 = this.f65543q0;
        int i12 = i11 + 1;
        this.f65543q0 = i12;
        bArr[i11] = (byte) i10;
        if (i12 == 3) {
            b();
            this.f65543q0 = 0;
        }
    }
}
