package com.adobe.marketing.mobile;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
class HexStringUtil {
    private static final char[] BYTE_TO_HEX = "000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F202122232425262728292A2B2C2D2E2F303132333435363738393A3B3C3D3E3F404142434445464748494A4B4C4D4E4F505152535455565758595A5B5C5D5E5F606162636465666768696A6B6C6D6E6F707172737475767778797A7B7C7D7E7F808182838485868788898A8B8C8D8E8F909192939495969798999A9B9C9D9E9FA0A1A2A3A4A5A6A7A8A9AAABACADAEAFB0B1B2B3B4B5B6B7B8B9BABBBCBDBEBFC0C1C2C3C4C5C6C7C8C9CACBCCCDCECFD0D1D2D3D4D5D6D7D8D9DADBDCDDDEDFE0E1E2E3E4E5E6E7E8E9EAEBECEDEEEFF0F1F2F3F4F5F6F7F8F9FAFBFCFDFEFF".toCharArray();
    private static final String LOG_TAG = "HexStringUtil";
    private static final int OXFF = 255;

    public static String getHexString(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        int i10 = 0;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            char[] cArr = new char[length << 1];
            int i11 = 0;
            while (i10 < length) {
                int i12 = i10 + 1;
                int i13 = (bytes[i10] & 255) << 1;
                char[] cArr2 = BYTE_TO_HEX;
                cArr[i11] = cArr2[i13];
                i11 += 2;
                cArr[i11 + 1] = cArr2[i13 + 1];
                i10 = i12;
            }
            return new String(cArr);
        } catch (UnsupportedEncodingException e5) {
            Log.warning(LOG_TAG, "Failed to get hex from string (%s)", e5.getMessage());
            return null;
        }
    }

    public static String hexToString(String str) {
        if (str == null || str.length() <= 0 || str.length() % 2 != 0) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            Log.warning(LOG_TAG, "Failed to get string from hex (%s)", e5.getMessage());
            return null;
        }
    }
}
