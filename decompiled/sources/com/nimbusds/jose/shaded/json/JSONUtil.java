package com.nimbusds.jose.shaded.json;

/* JADX INFO: loaded from: classes10.dex */
public class JSONUtil {
    public static String getGetterName(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[3] = cCharAt;
        for (int i10 = 1; i10 < length; i10++) {
            cArr[i10 + 3] = str.charAt(i10);
        }
        return new String(cArr);
    }

    public static String getIsName(String str) {
        int length = str.length();
        char[] cArr = new char[length + 2];
        cArr[0] = 'i';
        cArr[1] = 's';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[2] = cCharAt;
        for (int i10 = 1; i10 < length; i10++) {
            cArr[i10 + 2] = str.charAt(i10);
        }
        return new String(cArr);
    }

    public static String getSetterName(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 's';
        cArr[1] = 'e';
        cArr[2] = 't';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[3] = cCharAt;
        for (int i10 = 1; i10 < length; i10++) {
            cArr[i10 + 3] = str.charAt(i10);
        }
        return new String(cArr);
    }
}
