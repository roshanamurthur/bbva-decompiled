package org.junit.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class Checks {
    public static <T> T notNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T notNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }
}
