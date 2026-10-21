package com.facetec.sdk;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class fa {
    private static String c(int i10) {
        if (i10 == 0 || i10 == 1) {
            return "h:mm:ss a z";
        }
        if (i10 == 2) {
            return "h:mm:ss a";
        }
        if (i10 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i10)));
    }

    public static DateFormat d(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(i10));
        sb2.append(" ");
        sb2.append(c(i11));
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }

    private static String d(int i10) {
        if (i10 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i10 == 1) {
            return "MMMM d, yyyy";
        }
        if (i10 == 2) {
            return "MMM d, yyyy";
        }
        if (i10 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i10)));
    }
}
