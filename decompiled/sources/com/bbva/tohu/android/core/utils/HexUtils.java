package com.bbva.tohu.android.core.utils;

import androidx.camera.camera2.internal.h0;
import java.util.regex.Pattern;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes6.dex */
public class HexUtils {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String HEX_PREFIX = "0x";
    private static final String HEX_REGEX = "^([A-Fa-f0-9]{2})+$";

    public static byte[] byteArrayFromHexString(String str) {
        int i10 = 0;
        if (str == null || str.isEmpty() || str.equals(HEX_PREFIX)) {
            return new byte[0];
        }
        if (str.startsWith(HEX_PREFIX)) {
            str = str.substring(2);
        }
        if (str.length() % 2 != 0) {
            str = "0".concat(str);
        }
        if (!Pattern.compile(HEX_REGEX, 2).matcher(str).matches()) {
            throw new IllegalArgumentException(h0.b("invalid hex string [", str, Constant.BRACKET_CLOSE));
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        while (i10 < length) {
            int i11 = i10 / 2;
            int i12 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 16) << 4;
            i10 += 2;
            bArr[i11] = (byte) (Character.digit(str.charAt(i12), 16) + iDigit);
        }
        return bArr;
    }

    public static String byteArrayToHexString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            char[] cArr = new char[bArr.length * 2];
            int i10 = 0;
            for (byte b10 : bArr) {
                int i11 = i10 + 1;
                char[] cArr2 = HEX_DIGITS;
                cArr[i10] = cArr2[(b10 >>> 4) & 15];
                i10 += 2;
                cArr[i11] = cArr2[b10 & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Invalid Input");
        }
    }
}
