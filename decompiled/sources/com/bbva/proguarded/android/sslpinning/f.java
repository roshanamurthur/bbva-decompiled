package com.bbva.proguarded.android.sslpinning;

import com.fasterxml.jackson.core.JsonPointer;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f36144a = new char[64];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f36145b;

    static {
        char c10 = 'A';
        int i10 = 0;
        while (c10 <= 'Z') {
            f36144a[i10] = c10;
            c10 = (char) (c10 + 1);
            i10++;
        }
        char c11 = 'a';
        while (c11 <= 'z') {
            f36144a[i10] = c11;
            c11 = (char) (c11 + 1);
            i10++;
        }
        char c12 = '0';
        while (c12 <= '9') {
            f36144a[i10] = c12;
            c12 = (char) (c12 + 1);
            i10++;
        }
        char[] cArr = f36144a;
        cArr[i10] = '+';
        cArr[i10 + 1] = JsonPointer.SEPARATOR;
        f36145b = new byte[128];
        int i11 = 0;
        while (true) {
            byte[] bArr = f36145b;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        for (int i12 = 0; i12 < 64; i12++) {
            f36145b[f36144a[i12]] = (byte) i12;
        }
    }

    public static String a(String str) {
        int i10;
        int i11;
        int i12;
        int i13;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        int i14 = ((length * 4) + 2) / 3;
        char[] cArr = new char[((length + 2) / 3) * 4];
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int i17 = i15 + 1;
            byte b10 = bytes[i15];
            int i18 = b10 & 255;
            if (i17 < length) {
                i10 = i15 + 2;
                i11 = bytes[i17] & 255;
            } else {
                i10 = i17;
                i11 = 0;
            }
            if (i10 < length) {
                i12 = i10 + 1;
                i13 = bytes[i10] & 255;
            } else {
                i12 = i10;
                i13 = 0;
            }
            int i19 = ((b10 & 3) << 4) | (i11 >>> 4);
            int i20 = ((i11 & 15) << 2) | (i13 >>> 6);
            int i21 = i13 & 63;
            char[] cArr2 = f36144a;
            cArr[i16] = cArr2[i18 >>> 2];
            int i22 = i16 + 2;
            cArr[i16 + 1] = cArr2[i19];
            char c10 = '=';
            cArr[i22] = i22 < i14 ? cArr2[i20] : '=';
            int i23 = i16 + 3;
            if (i23 < i14) {
                c10 = cArr2[i21];
            }
            cArr[i23] = c10;
            i16 += 4;
            i15 = i12;
        }
        return new String(cArr);
    }

    public static String b(String str) throws UnsupportedEncodingException {
        return new String(c(str));
    }

    public static byte[] c(String str) {
        char c10;
        char[] charArray = str.replaceAll(" ", "+").toCharArray();
        int length = charArray.length;
        if (length % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (length > 0 && charArray[length - 1] == '=') {
            length--;
        }
        int i10 = (length * 3) / 4;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            char c11 = charArray[i11];
            int i13 = i11 + 2;
            char c12 = charArray[i11 + 1];
            char c13 = 'A';
            if (i13 < length) {
                i11 += 3;
                c10 = charArray[i13];
            } else {
                i11 = i13;
                c10 = 'A';
            }
            if (i11 < length) {
                c13 = charArray[i11];
                i11++;
            }
            if (c11 > 127 || c12 > 127 || c10 > 127 || c13 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = f36145b;
            byte b10 = bArr2[c11];
            byte b11 = bArr2[c12];
            byte b12 = bArr2[c10];
            byte b13 = bArr2[c13];
            if (b10 < 0 || b11 < 0 || b12 < 0 || b13 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            int i14 = (b10 << 2) | (b11 >>> 4);
            int i15 = ((b11 & 15) << 4) | (b12 >>> 2);
            int i16 = ((b12 & 3) << 6) | b13;
            int i17 = i12 + 1;
            bArr[i12] = (byte) i14;
            if (i17 < i10) {
                bArr[i17] = (byte) i15;
                i17 = i12 + 2;
            }
            if (i17 < i10) {
                i12 = i17 + 1;
                bArr[i17] = (byte) i16;
            } else {
                i12 = i17;
            }
        }
        return bArr;
    }
}
