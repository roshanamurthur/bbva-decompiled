package com.huawei.secure.android.common.intent;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class SafeUri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50643a = "SafeUri";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50644b = "";

    private SafeUri() {
    }

    @SuppressLint({"NewApi"})
    public static boolean getBooleanQueryParameter(Uri uri, String str, boolean z10) {
        if (uri != null && !TextUtils.isEmpty(str)) {
            try {
                return uri.getBooleanQueryParameter(str, z10);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return z10;
    }

    public static String getQueryParameter(Uri uri, String str) {
        if (uri != null && !TextUtils.isEmpty(str)) {
            try {
                return uri.getQueryParameter(str);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return "";
    }

    @SuppressLint({"NewApi"})
    public static Set<String> getQueryParameterNames(Uri uri) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (uri == null) {
            return linkedHashSet;
        }
        try {
            return uri.getQueryParameterNames();
        } catch (Exception e5) {
            e5.getMessage();
            return linkedHashSet;
        }
    }

    public static List<String> getQueryParameters(Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        if (uri != null && !TextUtils.isEmpty(str)) {
            try {
                return uri.getQueryParameters(str);
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
        return arrayList;
    }
}
