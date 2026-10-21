package com.vasco.digipass.sdk.obfuscated;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static byte a(byte b10) {
        int i10;
        if (b10 >= 48 && b10 <= 57) {
            i10 = b10 - 48;
        } else if (b10 >= 97 && b10 <= 102) {
            i10 = b10 - 87;
        } else {
            if (b10 < 65 || b10 > 70) {
                return (byte) -1;
            }
            i10 = b10 - 55;
        }
        return (byte) i10;
    }

    public static long b(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException(b());
        }
        if (bArr.length == 4) {
            return (((long) (bArr[0] & 255)) << 24) + (((long) (bArr[1] & 255)) << 16) + (((long) (bArr[2] & 255)) << 8) + ((long) (bArr[3] & 255));
        }
        throw new IllegalArgumentException(c());
    }

    public static String c() {
        byte[] bArr = new byte[26];
        int[] iArr = {94, 148, 142, 126, 139, 55, 119, 135, 134, 116, 139, 49, 131, 120, 136, 114, 44, 120, 127, 124, 124, 39, 104, 106, 36, 55};
        for (int i10 = 0; i10 < 26; i10++) {
            bArr[i10] = (byte) ((iArr[i10] + i10) - 28);
        }
        return new String(bArr);
    }

    public static byte[] a(long j10) {
        return new byte[]{(byte) (((byte) (j10 >> 24)) & 255), (byte) (((byte) (j10 >> 16)) & 255), (byte) (((byte) (j10 >> 8)) & 255), (byte) (((byte) j10) & 255)};
    }

    public static String a(byte[] bArr) {
        if (bArr.length % 4 == 0) {
            String strA = q.a(bArr);
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            while (i10 < strA.length()) {
                int i11 = i10 + 8;
                String string = Long.toString(Long.parseLong(strA.substring(i10, i11), 16));
                for (int i12 = 0; i12 < 10 - string.length(); i12++) {
                    sb2.append('0');
                }
                sb2.append(string);
                i10 = i11;
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException(a());
    }

    public static int b(String str) {
        return Integer.parseInt(str, 16);
    }

    public static String b(long j10) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO};
        int i10 = 64;
        char[] cArr2 = new char[64];
        long j11 = 15;
        do {
            i10--;
            cArr2[i10] = cArr[(int) (j10 & j11)];
            j10 >>>= 4;
        } while (j10 != 0);
        return new String(cArr2, i10, 64 - i10);
    }

    public static String b() {
        byte[] bArr = new byte[26];
        int[] iArr = {207, 6, 1, 242, 0, 173, 238, 255, 255, 238, 6, 173, 240, 238, 251, 251, 252, 1, 173, 239, 242, 173, 251, 2, 249, 249};
        for (int i10 = 0; i10 < 26; i10++) {
            bArr[i10] = (byte) (iArr[i10] + 115);
        }
        return new String(bArr);
    }

    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < str.length() / 10) {
            i10++;
            int length = str.length() - (10 * i10);
            String strB = b(Long.parseLong(str.substring(length, length + 10)));
            int i11 = 0;
            while (i11 < 8 - strB.length()) {
                sb2.insert(0, '0');
                i11++;
            }
            sb2.insert(i11, strB);
        }
        int length2 = str.length() % 10;
        if (length2 != 0) {
            sb2.insert(0, b(Long.parseLong(str.substring(0, length2))));
        }
        return sb2.toString();
    }

    public static String a() {
        byte[] bArr = new byte[36];
        int[] iArr = {66, 121, 116, 101, 115, 32, 97, 114, 114, 97, 121, 32, 109, 117, 115, 116, 32, 98, 101, 32, 52, 32, 98, 121, 116, 101, 115, 32, 109, 117, 108, 116, 105, 112, 108, 101};
        for (int i10 = 0; i10 < 36; i10++) {
            bArr[i10] = (byte) ((iArr[i10] ^ i10) ^ i10);
        }
        return new String(bArr);
    }

    public static byte[] a(CharSequence charSequence) {
        ByteBuffer byteBufferEncode = StandardCharsets.UTF_8.encode(CharBuffer.wrap(charSequence));
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }
}
