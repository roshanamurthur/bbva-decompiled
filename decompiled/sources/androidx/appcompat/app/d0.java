package androidx.appcompat.app;

import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ResourcesFlusher.java */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f705h;

    public static void a(@NonNull Object obj) {
        LongSparseArray longSparseArray;
        if (!f701d) {
            try {
                f700c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f701d = true;
        }
        Class<?> cls = f700c;
        if (cls == null) {
            return;
        }
        if (!f703f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f702e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f703f = true;
        }
        Field field = f702e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
