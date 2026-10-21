package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.base.GeneratorBase;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* JADX INFO: loaded from: classes9.dex */
public final class UTF8Writer extends Writer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final IOContext f43068p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public OutputStream f43069q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f43070r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f43071s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f43072t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f43073u0;

    public UTF8Writer(IOContext iOContext, OutputStream outputStream) {
        this.f43068p0 = iOContext;
        this.f43069q0 = outputStream;
        byte[] bArrAllocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this.f43070r0 = bArrAllocWriteEncodingBuffer;
        this.f43071s0 = bArrAllocWriteEncodingBuffer.length - 4;
        this.f43072t0 = 0;
    }

    public static void illegalSurrogate(int i10) throws IOException {
        throw new IOException(illegalSurrogateDesc(i10));
    }

    public static String illegalSurrogateDesc(int i10) {
        if (i10 > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i10) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i10 < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i10) + ") to output";
        }
        if (i10 <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i10) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i10) + ")";
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f43069q0;
        if (outputStream != null) {
            int i10 = this.f43072t0;
            if (i10 > 0) {
                outputStream.write(this.f43070r0, 0, i10);
                this.f43072t0 = 0;
            }
            OutputStream outputStream2 = this.f43069q0;
            this.f43069q0 = null;
            byte[] bArr = this.f43070r0;
            if (bArr != null) {
                this.f43070r0 = null;
                this.f43068p0.releaseWriteEncodingBuffer(bArr);
            }
            outputStream2.close();
            int i11 = this.f43073u0;
            this.f43073u0 = 0;
            if (i11 > 0) {
                illegalSurrogate(i11);
            }
        }
    }

    public int convertSurrogate(int i10) throws IOException {
        int i11 = this.f43073u0;
        this.f43073u0 = 0;
        if (i10 >= 56320 && i10 <= 57343) {
            return (i10 - 56320) + ((i11 - GeneratorBase.SURR1_FIRST) << 10) + 65536;
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i11) + ", second 0x" + Integer.toHexString(i10) + "; illegal combination");
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f43069q0;
        if (outputStream != null) {
            int i10 = this.f43072t0;
            if (i10 > 0) {
                outputStream.write(this.f43070r0, 0, i10);
                this.f43072t0 = 0;
            }
            this.f43069q0.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        write(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        if (i11 < 2) {
            if (i11 == 1) {
                write(cArr[i10]);
                return;
            }
            return;
        }
        if (this.f43073u0 > 0) {
            i11--;
            write(convertSurrogate(cArr[i10]));
            i10++;
        }
        int i12 = this.f43072t0;
        byte[] bArr = this.f43070r0;
        int i13 = i11 + i10;
        while (i10 < i13) {
            int i14 = this.f43071s0;
            if (i12 >= i14) {
                this.f43069q0.write(bArr, 0, i12);
                i12 = 0;
            }
            int i15 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 < 128) {
                int i16 = i12 + 1;
                bArr[i12] = (byte) c10;
                int i17 = i13 - i15;
                int i18 = i14 - i16;
                if (i17 > i18) {
                    i17 = i18;
                }
                int i19 = i17 + i15;
                while (true) {
                    i10 = i15;
                    i12 = i16;
                    if (i10 >= i19) {
                        continue;
                    } else {
                        i15 = i10 + 1;
                        c10 = cArr[i10];
                        if (c10 < 128) {
                            i16 = i12 + 1;
                            bArr[i12] = (byte) c10;
                        }
                    }
                }
            }
            if (c10 < 2048) {
                int i20 = i12 + 1;
                bArr[i12] = (byte) ((c10 >> 6) | 192);
                i12 += 2;
                bArr[i20] = (byte) ((c10 & '?') | 128);
            } else if (c10 < 55296 || c10 > 57343) {
                bArr[i12] = (byte) ((c10 >> '\f') | 224);
                int i21 = i12 + 2;
                bArr[i12 + 1] = (byte) (((c10 >> 6) & 63) | 128);
                i12 += 3;
                bArr[i21] = (byte) ((c10 & '?') | 128);
            } else {
                if (c10 > 56319) {
                    this.f43072t0 = i12;
                    illegalSurrogate(c10);
                }
                this.f43073u0 = c10;
                if (i15 >= i13) {
                    break;
                }
                i10 = i15 + 1;
                int iConvertSurrogate = convertSurrogate(cArr[i15]);
                if (iConvertSurrogate > 1114111) {
                    this.f43072t0 = i12;
                    illegalSurrogate(iConvertSurrogate);
                }
                bArr[i12] = (byte) ((iConvertSurrogate >> 18) | 240);
                bArr[i12 + 1] = (byte) (((iConvertSurrogate >> 12) & 63) | 128);
                int i22 = i12 + 3;
                bArr[i12 + 2] = (byte) (((iConvertSurrogate >> 6) & 63) | 128);
                i12 += 4;
                bArr[i22] = (byte) ((iConvertSurrogate & 63) | 128);
            }
            i10 = i15;
        }
        this.f43072t0 = i12;
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        int i11;
        if (this.f43073u0 > 0) {
            i10 = convertSurrogate(i10);
        } else if (i10 >= 55296 && i10 <= 57343) {
            if (i10 > 56319) {
                illegalSurrogate(i10);
            }
            this.f43073u0 = i10;
            return;
        }
        int i12 = this.f43072t0;
        if (i12 >= this.f43071s0) {
            this.f43069q0.write(this.f43070r0, 0, i12);
            this.f43072t0 = 0;
        }
        if (i10 < 128) {
            byte[] bArr = this.f43070r0;
            int i13 = this.f43072t0;
            this.f43072t0 = i13 + 1;
            bArr[i13] = (byte) i10;
            return;
        }
        int i14 = this.f43072t0;
        if (i10 < 2048) {
            byte[] bArr2 = this.f43070r0;
            int i15 = i14 + 1;
            bArr2[i14] = (byte) ((i10 >> 6) | 192);
            i11 = i14 + 2;
            bArr2[i15] = (byte) ((i10 & 63) | 128);
        } else if (i10 <= 65535) {
            byte[] bArr3 = this.f43070r0;
            bArr3[i14] = (byte) ((i10 >> 12) | 224);
            int i16 = i14 + 2;
            bArr3[i14 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            i11 = i14 + 3;
            bArr3[i16] = (byte) ((i10 & 63) | 128);
        } else {
            if (i10 > 1114111) {
                illegalSurrogate(i10);
            }
            byte[] bArr4 = this.f43070r0;
            bArr4[i14] = (byte) ((i10 >> 18) | 240);
            bArr4[i14 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            int i17 = i14 + 3;
            bArr4[i14 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            i11 = i14 + 4;
            bArr4[i17] = (byte) ((i10 & 63) | 128);
        }
        this.f43072t0 = i11;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        if (i11 < 2) {
            if (i11 == 1) {
                write(str.charAt(i10));
                return;
            }
            return;
        }
        if (this.f43073u0 > 0) {
            i11--;
            write(convertSurrogate(str.charAt(i10)));
            i10++;
        }
        int i12 = this.f43072t0;
        byte[] bArr = this.f43070r0;
        int i13 = i11 + i10;
        while (i10 < i13) {
            int i14 = this.f43071s0;
            if (i12 >= i14) {
                this.f43069q0.write(bArr, 0, i12);
                i12 = 0;
            }
            int i15 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                int i16 = i12 + 1;
                bArr[i12] = (byte) cCharAt;
                int i17 = i13 - i15;
                int i18 = i14 - i16;
                if (i17 > i18) {
                    i17 = i18;
                }
                int i19 = i17 + i15;
                while (true) {
                    i10 = i15;
                    i12 = i16;
                    if (i10 >= i19) {
                        continue;
                    } else {
                        i15 = i10 + 1;
                        cCharAt = str.charAt(i10);
                        if (cCharAt < 128) {
                            i16 = i12 + 1;
                            bArr[i12] = (byte) cCharAt;
                        }
                    }
                }
            }
            if (cCharAt < 2048) {
                int i20 = i12 + 1;
                bArr[i12] = (byte) ((cCharAt >> 6) | 192);
                i12 += 2;
                bArr[i20] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                if (cCharAt > 56319) {
                    this.f43072t0 = i12;
                    illegalSurrogate(cCharAt);
                }
                this.f43073u0 = cCharAt;
                if (i15 >= i13) {
                    break;
                }
                i10 = i15 + 1;
                int iConvertSurrogate = convertSurrogate(str.charAt(i15));
                if (iConvertSurrogate > 1114111) {
                    this.f43072t0 = i12;
                    illegalSurrogate(iConvertSurrogate);
                }
                bArr[i12] = (byte) ((iConvertSurrogate >> 18) | 240);
                bArr[i12 + 1] = (byte) (((iConvertSurrogate >> 12) & 63) | 128);
                int i21 = i12 + 3;
                bArr[i12 + 2] = (byte) (((iConvertSurrogate >> 6) & 63) | 128);
                i12 += 4;
                bArr[i21] = (byte) ((iConvertSurrogate & 63) | 128);
            } else {
                bArr[i12] = (byte) ((cCharAt >> '\f') | 224);
                int i22 = i12 + 2;
                bArr[i12 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i12 += 3;
                bArr[i22] = (byte) ((cCharAt & '?') | 128);
            }
            i10 = i15;
        }
        this.f43072t0 = i12;
    }
}
