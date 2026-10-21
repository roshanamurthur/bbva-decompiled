package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: Android.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f47179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f47180b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f47179a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f47180b = cls2 != null;
    }

    public static boolean a() {
        return (f47179a == null || f47180b) ? false : true;
    }
}
