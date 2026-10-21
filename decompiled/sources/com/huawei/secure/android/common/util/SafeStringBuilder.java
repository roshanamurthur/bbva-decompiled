package com.huawei.secure.android.common.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class SafeStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50668a = "SafeStringBuilder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50669b = "";

    public static String substring(StringBuilder sb2, int i10) {
        if (!TextUtils.isEmpty(sb2) && sb2.length() >= i10 && i10 >= 0) {
            try {
                return sb2.substring(i10);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return "";
    }

    public static String substring(StringBuilder sb2, int i10, int i11) {
        if (!TextUtils.isEmpty(sb2) && i10 >= 0 && i11 <= sb2.length() && i11 >= i10) {
            try {
                return sb2.substring(i10, i11);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return "";
    }
}
