package com.sun.mail.util;

import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.compat.u;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class BASE64DecoderStream extends FilterInputStream {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final char[] f65532w0 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', JsonPointer.SEPARATOR};

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f65533x0 = new byte[256];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f65534p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f65535q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f65536r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f65537s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f65538t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f65539u0;
    public final boolean v0;

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 255; i11++) {
            f65533x0[i11] = -1;
        }
        while (true) {
            char[] cArr = f65532w0;
            if (i10 >= cArr.length) {
                return;
            }
            f65533x0[cArr[i10]] = (byte) i10;
            i10++;
        }
    }

    public BASE64DecoderStream(InputStream inputStream) {
        super(inputStream);
        this.f65534p0 = new byte[3];
        this.f65535q0 = 0;
        this.f65536r0 = 0;
        this.f65537s0 = new byte[8190];
        this.f65538t0 = 0;
        this.f65539u0 = 0;
        this.v0 = false;
        this.v0 = PropUtil.getBooleanSystemProperty("mail.mime.base64.ignoreerrors", false);
    }

    public static byte[] decode(byte[] bArr) {
        int i10;
        int length = (bArr.length / 4) * 3;
        if (length == 0) {
            return bArr;
        }
        if (bArr[bArr.length - 1] == 61) {
            length = bArr[bArr.length - 2] == 61 ? length - 2 : length - 1;
        }
        byte[] bArr2 = new byte[length];
        int length2 = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (length2 > 0) {
            byte[] bArr3 = f65533x0;
            int i13 = i11 + 2;
            int i14 = (bArr3[bArr[i11 + 1] & 255] | (bArr3[bArr[i11] & 255] << 6)) << 6;
            byte b10 = bArr[i13];
            if (b10 != 61) {
                i13 = i11 + 3;
                i14 |= bArr3[b10 & 255];
                i10 = 3;
            } else {
                i10 = 2;
            }
            int i15 = i14 << 6;
            byte b11 = bArr[i13];
            if (b11 != 61) {
                i13++;
                i15 |= bArr3[b11 & 255];
            } else {
                i10--;
            }
            if (i10 > 2) {
                bArr2[i12 + 2] = (byte) (i15 & 255);
            }
            int i16 = i15 >> 8;
            if (i10 > 1) {
                bArr2[i12 + 1] = (byte) (i16 & 255);
            }
            bArr2[i12] = (byte) ((i15 >> 16) & 255);
            i12 += i10;
            length2 -= 4;
            i11 = i13;
        }
        return bArr2;
    }

    public final int a(int i10, int i11, byte[] bArr) throws IOException {
        int i12 = i10;
        while (i11 >= 3) {
            boolean z10 = false;
            int i13 = 0;
            int i14 = 0;
            while (i13 < 4) {
                int iB = b();
                if (iB == -1 || iB == -2) {
                    boolean z11 = this.v0;
                    if (iB == -1) {
                        if (i13 == 0) {
                            return i12 - i10;
                        }
                        if (!z11) {
                            StringBuilder sbC = o1.c("BASE64Decoder: Error in encoded stream: needed 4 valid base64 characters but only got ", i13, " before EOF");
                            sbC.append(e());
                            throw new DecodingException(sbC.toString());
                        }
                        z10 = true;
                    } else {
                        if (i13 < 2 && !z11) {
                            StringBuilder sbC2 = o1.c("BASE64Decoder: Error in encoded stream: needed at least 2 valid base64 characters, but only got ", i13, " before padding character (=)");
                            sbC2.append(e());
                            throw new DecodingException(sbC2.toString());
                        }
                        if (i13 == 0) {
                            return i12 - i10;
                        }
                    }
                    int i15 = i13 - 1;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = i14 << 6;
                    for (int i17 = i13 + 1; i17 < 4; i17++) {
                        if (!z10) {
                            int iB2 = b();
                            if (iB2 == -1) {
                                if (!z11) {
                                    throw new DecodingException("BASE64Decoder: Error in encoded stream: hit EOF while looking for padding characters (=)" + e());
                                }
                            } else if (iB2 != -2 && !z11) {
                                throw new DecodingException("BASE64Decoder: Error in encoded stream: found valid base64 character after a padding character (=)" + e());
                            }
                        }
                        i16 <<= 6;
                    }
                    int i18 = i16 >> 8;
                    if (i15 == 2) {
                        bArr[i12 + 1] = (byte) (i18 & 255);
                    }
                    bArr[i12] = (byte) ((i16 >> 16) & 255);
                    return (i12 + i15) - i10;
                }
                i13++;
                i14 = (i14 << 6) | iB;
            }
            bArr[i12 + 2] = (byte) (i14 & 255);
            bArr[i12 + 1] = (byte) ((i14 >> 8) & 255);
            bArr[i12] = (byte) ((i14 >> 16) & 255);
            i11 -= 3;
            i12 += 3;
        }
        return i12 - i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return (this.f65535q0 - this.f65536r0) + ((((FilterInputStream) this).in.available() * 3) / 4);
    }

    public final int b() throws IOException {
        byte b10;
        do {
            if (this.f65538t0 >= this.f65539u0) {
                try {
                    int i10 = ((FilterInputStream) this).in.read(this.f65537s0);
                    this.f65539u0 = i10;
                    if (i10 <= 0) {
                        return -1;
                    }
                    this.f65538t0 = 0;
                } catch (EOFException unused) {
                    return -1;
                }
            }
            byte[] bArr = this.f65537s0;
            int i11 = this.f65538t0;
            this.f65538t0 = i11 + 1;
            int i12 = bArr[i11] & 255;
            if (i12 == 61) {
                return -2;
            }
            b10 = f65533x0[i12];
        } while (b10 == -1);
        return b10;
    }

    public final String e() {
        String strF;
        int i10 = this.f65538t0;
        if (i10 > 10) {
            i10 = 10;
        }
        if (i10 <= 0) {
            return "";
        }
        String strA = androidx.camera.core.impl.utils.b.a(", the ", i10, " most recent characters were: \"");
        for (int i11 = this.f65538t0 - i10; i11 < this.f65538t0; i11++) {
            char c10 = (char) (this.f65537s0[i11] & 255);
            if (c10 == '\t') {
                strF = u.f(strA, "\\t");
            } else if (c10 == '\n') {
                strF = u.f(strA, "\\n");
            } else if (c10 == '\r') {
                strF = u.f(strA, "\\r");
            } else if (c10 < ' ' || c10 >= 127) {
                strF = strA + "\\" + ((int) c10);
            } else {
                strF = strA + c10;
            }
            strA = strF;
        }
        return u.f(strA, "\"");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f65536r0;
        int i11 = this.f65535q0;
        byte[] bArr = this.f65534p0;
        if (i10 >= i11) {
            int iA = a(0, bArr.length, bArr);
            this.f65535q0 = iA;
            if (iA <= 0) {
                return -1;
            }
            this.f65536r0 = 0;
        }
        int i12 = this.f65536r0;
        this.f65536r0 = i12 + 1;
        return bArr[i12] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11 = 0;
        while (true) {
            long j12 = j10 - 1;
            if (j10 <= 0 || read() < 0) {
                break;
            }
            j11++;
            j10 = j12;
        }
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        int i14 = i10;
        while (true) {
            i12 = this.f65536r0;
            i13 = this.f65535q0;
            if (i12 >= i13 || i11 <= 0) {
                break;
            }
            this.f65536r0 = i12 + 1;
            bArr[i14] = this.f65534p0[i12];
            i11--;
            i14++;
        }
        if (i12 >= i13) {
            this.f65536r0 = 0;
            this.f65535q0 = 0;
        }
        int i15 = (i11 / 3) * 3;
        if (i15 > 0) {
            int iA = a(i14, i15, bArr);
            i14 += iA;
            i11 -= iA;
            if (iA != i15) {
                if (i14 == i10) {
                    return -1;
                }
                return i14 - i10;
            }
        }
        while (i11 > 0) {
            int i16 = read();
            if (i16 == -1) {
                break;
            }
            bArr[i14] = (byte) i16;
            i11--;
            i14++;
        }
        if (i14 == i10) {
            return -1;
        }
        return i14 - i10;
    }

    public BASE64DecoderStream(InputStream inputStream, boolean z10) {
        super(inputStream);
        this.f65534p0 = new byte[3];
        this.f65535q0 = 0;
        this.f65536r0 = 0;
        this.f65537s0 = new byte[8190];
        this.f65538t0 = 0;
        this.f65539u0 = 0;
        this.v0 = z10;
    }
}
