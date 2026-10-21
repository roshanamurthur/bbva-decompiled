package com.vasco.digipass.sdk.obfuscated;

import com.esotericsoftware.asm.Opcodes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class q {
    private static byte a(char c10) {
        int i10;
        if (c10 >= 'a') {
            i10 = c10 - 'W';
        } else {
            i10 = c10 >= 'A' ? c10 - '7' : c10 - '0';
        }
        return (byte) i10;
    }

    public static boolean b(String str) {
        byte[] bytes = str != null ? str.getBytes() : null;
        boolean zE = e(bytes);
        g(bytes);
        return zE;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static boolean d(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean e(byte[] bArr) {
        if (f(bArr)) {
            return true;
        }
        for (byte b10 : bArr) {
            char c10 = (char) b10;
            if (c10 < '0' || c10 > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean f(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            for (byte b10 : bArr) {
                if (b10 != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void g(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public static boolean a(long j10, long j11) {
        return (j10 & j11) == j11;
    }

    public static boolean d(byte[] bArr) {
        if (f(bArr)) {
            return true;
        }
        if (((bArr[0] == 48) ^ (bArr[bArr.length - 1] == 48)) && b(bArr) == bArr.length - 1) {
            return true;
        }
        int length = bArr.length;
        int i10 = length - 1;
        int[] iArr = new int[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            iArr[i11] = bArr[i11] - bArr[i12];
            i11 = i12;
        }
        int i13 = 0;
        while (i13 < length - 2) {
            int i14 = iArr[i13];
            i13++;
            if (i14 != iArr[i13]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] a(byte[] bArr, int i10, int i11) {
        if (bArr != null && i10 >= 0 && i10 < bArr.length && i11 >= 0 && i10 + i11 <= bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
        throw new IllegalArgumentException(a());
    }

    public static boolean c(String str) {
        if (d(str)) {
            return true;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'F') && (cCharAt < 'a' || cCharAt > 'f'))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(byte[] bArr, int i10) {
        if (f(bArr) || i10 < 4 || a(bArr, i10)) {
            return true;
        }
        return d(bArr);
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString().toUpperCase();
    }

    private static int b(byte[] bArr) {
        int i10 = 0;
        for (byte b10 : bArr) {
            if (b10 == 48) {
                i10++;
            }
        }
        return i10;
    }

    public static int a(String str, byte[] bArr, int i10) {
        int length = str.length() / 2;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11 + i10] = (byte) ((a(str.charAt(i12)) << 4) + (a(str.charAt(i12 + 1)) & 255));
        }
        return length;
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        a(str, bArr, 0);
        return bArr;
    }

    private static boolean a(byte[] bArr, int i10) {
        return !f(bArr) && i10 > bArr.length;
    }

    public static String a() {
        byte[] bArr = new byte[18];
        int[] iArr = {74, 107, 163, 242, 67, 35, 242, 200, 67, Opcodes.MONITORENTER, 67, 178, 11, Opcodes.MONITORENTER, 51, 178, 19, 19};
        for (int i10 = 0; i10 < 18; i10++) {
            int i11 = iArr[i10];
            bArr[i10] = (byte) (((((i11 & 255) >> 3) | (i11 << 5)) & 255) + i10);
        }
        return new String(bArr);
    }
}
