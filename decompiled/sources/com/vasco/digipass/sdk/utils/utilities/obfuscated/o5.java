package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class o5 {
    private static byte a(char c10) {
        int i10;
        if (c10 >= 'a') {
            i10 = c10 - 'W';
        } else {
            i10 = c10 >= 'A' ? c10 - '7' : c10 - '0';
        }
        return (byte) i10;
    }

    private static boolean b(byte[] bArr) {
        if (c(bArr)) {
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

    public static boolean c(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            for (byte b10 : bArr) {
                if (b10 != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void d(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
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

    private static boolean d(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean b(String str) {
        byte[] bytes = str != null ? str.getBytes() : null;
        boolean zB = b(bytes);
        d(bytes);
        return zB;
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

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        a(str, bArr);
        return bArr;
    }

    private static void a(String str, byte[] bArr) {
        int length = str.length() / 2;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((a(str.charAt(i11)) << 4) + (a(str.charAt(i11 + 1)) & 255));
        }
    }
}
