package com.facetec.sdk;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
final class am extends Exception {

    public enum e {
        UNKNOWN(0),
        PERMISSION_DENIED(1),
        OPEN_TIMEOUT(2),
        LOCK_OPEN_TIMEOUT(3),
        CLOSE_ERROR(4),
        FRONT_FACING_NOT_FOUND(5),
        NO_OUTPUT_SIZES(6),
        ACCESS_ERROR(7);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f40332f;

        e(int i10) {
            this.f40332f = i10;
        }
    }

    public am(e eVar) {
        this(eVar, "");
    }

    private static String a(e eVar, String str) {
        String str2 = String.format(Locale.US, "Camera error (%d)", Integer.valueOf(eVar.f40332f));
        if (str.isEmpty()) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(str);
        return sb2.toString();
    }

    public am(e eVar, String str) {
        super(a(eVar, str));
    }

    public am(Throwable th2) {
        super(a(e.UNKNOWN, ""), th2);
    }

    public am(e eVar, Throwable th2) {
        super(a(eVar, ""), th2);
    }
}
