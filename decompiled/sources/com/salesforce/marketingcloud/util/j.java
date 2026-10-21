package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public final class j {
    private j() {
    }

    public static <T extends CharSequence> T a(T t10, String str) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException(str);
        }
        return t10;
    }

    public static <T> T a(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static <T extends Collection> T a(T t10, String str) {
        if (t10.isEmpty()) {
            throw new IllegalArgumentException(str);
        }
        return t10;
    }

    public static boolean a(boolean z10, String str) {
        if (z10) {
            return true;
        }
        throw new IllegalArgumentException(str);
    }
}
