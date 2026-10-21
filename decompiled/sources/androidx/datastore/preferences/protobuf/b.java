package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Android.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f21015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f21016b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f21015a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f21016b = cls2 != null;
    }

    public static boolean a() {
        return (f21015a == null || f21016b) ? false : true;
    }
}
