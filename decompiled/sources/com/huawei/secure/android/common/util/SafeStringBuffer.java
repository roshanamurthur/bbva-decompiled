package com.huawei.secure.android.common.util;

/* JADX INFO: loaded from: classes10.dex */
public class SafeStringBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50666a = "SafeStringBuffer";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50667b = "";

    public static String substring(StringBuffer stringBuffer, int i10) {
        if (stringBuffer != null && stringBuffer.length() >= i10 && i10 >= 0) {
            try {
                return stringBuffer.substring(i10);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return "";
    }

    public static String substring(StringBuffer stringBuffer, int i10, int i11) {
        if (stringBuffer != null && i10 >= 0 && i11 <= stringBuffer.length() && i11 >= i10) {
            try {
                return stringBuffer.substring(i10, i11);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return "";
    }
}
