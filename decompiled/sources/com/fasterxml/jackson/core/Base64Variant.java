package com.fasterxml.jackson.core;

import androidx.camera.core.impl.utils.a;
import androidx.camera.core.impl.utils.b;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class Base64Variant implements Serializable {
    public static final int BASE64_VALUE_INVALID = -1;
    public static final int BASE64_VALUE_PADDING = -2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final transient int[] f43029p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final transient char[] f43030q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final transient byte[] f43031r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f43032s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final transient boolean f43033t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final transient char f43034u0;
    public final transient int v0;

    public Base64Variant(String str, String str2, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this.f43029p0 = iArr;
        char[] cArr = new char[64];
        this.f43030q0 = cArr;
        this.f43031r0 = new byte[64];
        this.f43032s0 = str;
        this.f43033t0 = z10;
        this.f43034u0 = c10;
        this.v0 = i10;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException(b.a("Base64Alphabet length must be exactly 64 (was ", length, ")"));
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < length; i11++) {
            char c11 = this.f43030q0[i11];
            this.f43031r0[i11] = (byte) c11;
            this.f43029p0[c11] = i11;
        }
        if (z10) {
            this.f43029p0[c10] = -2;
        }
    }

    public void _reportBase64EOF() throws IllegalArgumentException {
        throw new IllegalArgumentException(missingPaddingMessage());
    }

    public void _reportInvalidBase64(char c10, int i10, String str) throws IllegalArgumentException {
        String strB;
        if (c10 <= ' ') {
            strB = "Illegal white space character (code 0x" + Integer.toHexString(c10) + ") as character #" + (i10 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c10)) {
            strB = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i10 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c10) || Character.isISOControl(c10)) {
            strB = "Illegal character (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        } else {
            strB = "Illegal character '" + c10 + "' (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        }
        if (str != null) {
            strB = a.b(strB, ": ", str);
        }
        throw new IllegalArgumentException(strB);
    }

    public byte[] decode(String str) throws IllegalArgumentException {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder();
        decode(str, byteArrayBuilder);
        return byteArrayBuilder.toByteArray();
    }

    public int decodeBase64Byte(byte b10) {
        if (b10 < 0) {
            return -1;
        }
        return this.f43029p0[b10];
    }

    public int decodeBase64Char(char c10) {
        if (c10 <= 127) {
            return this.f43029p0[c10];
        }
        return -1;
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public byte encodeBase64BitsAsByte(int i10) {
        return this.f43031r0[i10];
    }

    public char encodeBase64BitsAsChar(int i10) {
        return this.f43030q0[i10];
    }

    public int encodeBase64Chunk(int i10, char[] cArr, int i11) {
        char[] cArr2 = this.f43030q0;
        cArr[i11] = cArr2[(i10 >> 18) & 63];
        cArr[i11 + 1] = cArr2[(i10 >> 12) & 63];
        int i12 = i11 + 3;
        cArr[i11 + 2] = cArr2[(i10 >> 6) & 63];
        int i13 = i11 + 4;
        cArr[i12] = cArr2[i10 & 63];
        return i13;
    }

    public int encodeBase64Partial(int i10, int i11, char[] cArr, int i12) {
        char[] cArr2 = this.f43030q0;
        cArr[i12] = cArr2[(i10 >> 18) & 63];
        int i13 = i12 + 2;
        cArr[i12 + 1] = cArr2[(i10 >> 12) & 63];
        if (!this.f43033t0) {
            if (i11 != 2) {
                return i13;
            }
            int i14 = i12 + 3;
            cArr[i13] = cArr2[(i10 >> 6) & 63];
            return i14;
        }
        int i15 = i12 + 3;
        char c10 = this.f43034u0;
        cArr[i13] = i11 == 2 ? cArr2[(i10 >> 6) & 63] : c10;
        int i16 = i12 + 4;
        cArr[i15] = c10;
        return i16;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int getMaxLineLength() {
        return this.v0;
    }

    public String getName() {
        return this.f43032s0;
    }

    public byte getPaddingByte() {
        return (byte) this.f43034u0;
    }

    public char getPaddingChar() {
        return this.f43034u0;
    }

    public int hashCode() {
        return this.f43032s0.hashCode();
    }

    public String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end", getName(), Character.valueOf(getPaddingChar()));
    }

    public Object readResolve() {
        return Base64Variants.valueOf(this.f43032s0);
    }

    public String toString() {
        return this.f43032s0;
    }

    public boolean usesPadding() {
        return this.f43033t0;
    }

    public boolean usesPaddingChar(char c10) {
        return c10 == this.f43034u0;
    }

    public int decodeBase64Char(int i10) {
        if (i10 <= 127) {
            return this.f43029p0[i10];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z10) {
            sb2.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i10 = length - 3;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = i11 + 2;
            int i13 = ((bArr[i11 + 1] & 255) | (bArr[i11] << 8)) << 8;
            i11 += 3;
            encodeBase64Chunk(sb2, i13 | (bArr[i12] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb2.append(AbstractJsonLexerKt.STRING_ESC);
                sb2.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
        }
        int i14 = length - i11;
        if (i14 > 0) {
            int i15 = i11 + 1;
            int i16 = bArr[i11] << 16;
            if (i14 == 2) {
                i16 |= (bArr[i15] & 255) << 8;
            }
            encodeBase64Partial(sb2, i16, i14);
        }
        if (z10) {
            sb2.append('\"');
        }
        return sb2.toString();
    }

    public boolean usesPaddingChar(int i10) {
        return i10 == this.f43034u0;
    }

    public void decode(String str, ByteArrayBuilder byteArrayBuilder) throws IllegalArgumentException {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt > ' ') {
                int iDecodeBase64Char = decodeBase64Char(cCharAt);
                if (iDecodeBase64Char < 0) {
                    _reportInvalidBase64(cCharAt, 0, null);
                }
                if (i11 >= length) {
                    _reportBase64EOF();
                }
                int i12 = i10 + 2;
                char cCharAt2 = str.charAt(i11);
                int iDecodeBase64Char2 = decodeBase64Char(cCharAt2);
                if (iDecodeBase64Char2 < 0) {
                    _reportInvalidBase64(cCharAt2, 1, null);
                }
                int i13 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (i12 >= length) {
                    if (!usesPadding()) {
                        byteArrayBuilder.append(i13 >> 4);
                        return;
                    }
                    _reportBase64EOF();
                }
                int i14 = i10 + 3;
                char cCharAt3 = str.charAt(i12);
                int iDecodeBase64Char3 = decodeBase64Char(cCharAt3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        _reportInvalidBase64(cCharAt3, 2, null);
                    }
                    if (i14 >= length) {
                        _reportBase64EOF();
                    }
                    i10 += 4;
                    char cCharAt4 = str.charAt(i14);
                    if (!usesPaddingChar(cCharAt4)) {
                        _reportInvalidBase64(cCharAt4, 3, "expected padding character '" + getPaddingChar() + "'");
                    }
                    byteArrayBuilder.append(i13 >> 4);
                } else {
                    int i15 = (i13 << 6) | iDecodeBase64Char3;
                    if (i14 >= length) {
                        if (!usesPadding()) {
                            byteArrayBuilder.appendTwoBytes(i15 >> 2);
                            return;
                        }
                        _reportBase64EOF();
                    }
                    i10 += 4;
                    char cCharAt5 = str.charAt(i14);
                    int iDecodeBase64Char4 = decodeBase64Char(cCharAt5);
                    if (iDecodeBase64Char4 < 0) {
                        if (iDecodeBase64Char4 != -2) {
                            _reportInvalidBase64(cCharAt5, 3, null);
                        }
                        byteArrayBuilder.appendTwoBytes(i15 >> 2);
                    } else {
                        byteArrayBuilder.appendThreeBytes((i15 << 6) | iDecodeBase64Char4);
                    }
                }
            } else {
                i10 = i11;
            }
        }
    }

    public void encodeBase64Chunk(StringBuilder sb2, int i10) {
        char[] cArr = this.f43030q0;
        sb2.append(cArr[(i10 >> 18) & 63]);
        sb2.append(cArr[(i10 >> 12) & 63]);
        sb2.append(cArr[(i10 >> 6) & 63]);
        sb2.append(cArr[i10 & 63]);
    }

    public void encodeBase64Partial(StringBuilder sb2, int i10, int i11) {
        char[] cArr = this.f43030q0;
        sb2.append(cArr[(i10 >> 18) & 63]);
        sb2.append(cArr[(i10 >> 12) & 63]);
        if (this.f43033t0) {
            char c10 = this.f43034u0;
            sb2.append(i11 == 2 ? cArr[(i10 >> 6) & 63] : c10);
            sb2.append(c10);
        } else if (i11 == 2) {
            sb2.append(cArr[(i10 >> 6) & 63]);
        }
    }

    public int encodeBase64Chunk(int i10, byte[] bArr, int i11) {
        byte[] bArr2 = this.f43031r0;
        bArr[i11] = bArr2[(i10 >> 18) & 63];
        bArr[i11 + 1] = bArr2[(i10 >> 12) & 63];
        int i12 = i11 + 3;
        bArr[i11 + 2] = bArr2[(i10 >> 6) & 63];
        int i13 = i11 + 4;
        bArr[i12] = bArr2[i10 & 63];
        return i13;
    }

    public int encodeBase64Partial(int i10, int i11, byte[] bArr, int i12) {
        byte[] bArr2 = this.f43031r0;
        bArr[i12] = bArr2[(i10 >> 18) & 63];
        int i13 = i12 + 2;
        bArr[i12 + 1] = bArr2[(i10 >> 12) & 63];
        if (!this.f43033t0) {
            if (i11 != 2) {
                return i13;
            }
            int i14 = i12 + 3;
            bArr[i13] = bArr2[(i10 >> 6) & 63];
            return i14;
        }
        byte b10 = (byte) this.f43034u0;
        int i15 = i12 + 3;
        bArr[i13] = i11 == 2 ? bArr2[(i10 >> 6) & 63] : b10;
        int i16 = i12 + 4;
        bArr[i15] = b10;
        return i16;
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i10) {
        this(base64Variant, str, base64Variant.f43033t0, base64Variant.f43034u0, i10);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this.f43029p0 = iArr;
        char[] cArr = new char[64];
        this.f43030q0 = cArr;
        byte[] bArr = new byte[64];
        this.f43031r0 = bArr;
        this.f43032s0 = str;
        byte[] bArr2 = base64Variant.f43031r0;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant.f43030q0;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant.f43029p0;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f43033t0 = z10;
        this.f43034u0 = c10;
        this.v0 = i10;
    }
}
