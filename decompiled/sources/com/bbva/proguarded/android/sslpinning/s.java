package com.bbva.proguarded.android.sslpinning;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f36170a = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f36171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f36172c;

    static {
        Pattern.compile("^::[fF]{4}:(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
        f36171b = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
        f36172c = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");
    }

    public static boolean a(String str) {
        return f36170a.matcher(str).matches();
    }

    public static boolean b(String str) {
        if (f36171b.matcher(str).matches()) {
            return true;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == ':') {
                i10++;
            }
        }
        return i10 <= 7 && f36172c.matcher(str).matches();
    }
}
