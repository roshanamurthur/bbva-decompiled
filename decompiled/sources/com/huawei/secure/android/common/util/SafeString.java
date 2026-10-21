package com.huawei.secure.android.common.util;

/* JADX INFO: loaded from: classes10.dex */
public class SafeString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50664a = "SafeString";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50665b = "";

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (str != null && charSequence != null && charSequence2 != null) {
            try {
                return str.replace(charSequence, charSequence2);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return str;
    }

    public static String substring(String str, int i10) {
        if (str != null && str.length() >= i10 && i10 >= 0) {
            try {
                return str.substring(i10);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return "";
    }

    public static String substring(String str, int i10, int i11) {
        if (str != null && i10 >= 0 && i11 <= str.length() && i11 >= i10) {
            try {
                return str.substring(i10, i11);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return "";
    }
}
