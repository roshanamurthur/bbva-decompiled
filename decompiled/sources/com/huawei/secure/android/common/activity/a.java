package com.huawei.secure.android.common.activity;

import android.text.TextUtils;
import androidx.camera.core.processing.f;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f50599a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char f50600b = '*';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50601c = "SecurityComp10105310: ";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f50602d = 2;

    public static void a(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        b(str);
        a(str2, z10);
    }

    private static String b(String str) {
        return f.d(f50601c, str);
    }

    public static void a(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        b(str);
        th2.getMessage();
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        b(str);
        a(str2, false);
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        b(str);
        a(str2, false);
    }

    private static String a(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                sb2.append(a(str));
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static void b(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        b(str);
        a(str2, z10);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 1;
        if (1 == length) {
            return String.valueOf(f50600b);
        }
        StringBuilder sb2 = new StringBuilder(length);
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (f50599a.matcher(String.valueOf(cCharAt)).matches()) {
                if (i10 % 2 == 0) {
                    cCharAt = '*';
                }
                i10++;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }
}
