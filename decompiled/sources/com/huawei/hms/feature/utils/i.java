package com.huawei.hms.feature.utils;

import android.text.TextUtils;
import com.huawei.secure.android.common.util.SafeString;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50592a = "StringUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50593b = null;

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (i10 % 2 == 1) {
                charArray[i10] = '*';
            }
        }
        return new String(charArray);
    }

    public static byte[] b(String str) {
        byte[] bArr = new byte[0];
        if (str == null) {
            return bArr;
        }
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            Logger.w("StringUtils", "the content has error while it is converted to bytes");
            return bArr;
        }
    }

    public static byte[] c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e5) {
            Logger.w("StringUtils", "StringUtils.str2Byte error: UnsupportedEncodingException", e5);
            return new byte[0];
        }
    }

    public static String d(String str) {
        return str == null ? f50593b : str.toLowerCase(Locale.ROOT);
    }

    public static String a(String str, String str2, int i10) {
        if (str == null || "".equals(str)) {
            return "";
        }
        String[] strArrSplit = str.split(str2);
        if (strArrSplit.length < i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int length = strArrSplit.length - i10; length < strArrSplit.length; length++) {
            sb2.append(strArrSplit[length]);
            sb2.append(str2);
        }
        String string = sb2.toString();
        return string.length() != 0 ? SafeString.substring(string, 0, string.length() - str2.length()) : string;
    }

    public static String a(String str, Object... objArr) {
        return str == null ? "" : String.format(Locale.ROOT, str, objArr);
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            Logger.w("StringUtils", "StringUtils.byte2str error: UnsupportedEncodingException", e5);
            return "";
        }
    }

    public static boolean a(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    public static byte[] a(long j10) {
        return b(String.valueOf(j10));
    }
}
