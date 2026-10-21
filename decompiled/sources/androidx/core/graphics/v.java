package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: WeightTypefaceApi21.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f19918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f19919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f19920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Constructor<Typeface> f19921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("sWeightCacheLock")
    public static final LongSparseArray<SparseArray<Typeface>> f19922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f19923f;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
        f19918a = declaredField;
        f19919b = declaredMethod;
        f19920c = declaredMethod2;
        f19921d = declaredConstructor;
        f19922e = new LongSparseArray<>(3);
        f19923f = new Object();
    }

    @Nullable
    public static Typeface a(long j10) {
        try {
            return f19921d.newInstance(Long.valueOf(j10));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    public static Typeface b(@NonNull Typeface typeface, int i10, boolean z10) {
        Field field = f19918a;
        if (field == null) {
            return null;
        }
        int i11 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f19923f) {
            try {
                try {
                    long j10 = field.getLong(typeface);
                    LongSparseArray<SparseArray<Typeface>> longSparseArray = f19922e;
                    SparseArray<Typeface> sparseArray = longSparseArray.get(j10);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray<>(4);
                        longSparseArray.put(j10, sparseArray);
                    } else {
                        Typeface typeface2 = sparseArray.get(i11 == true ? 1 : 0);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    Typeface typefaceA = z10 == typeface.isItalic() ? a(d(i10, j10)) : a(c(i10, z10, j10));
                    sparseArray.put(i11 == true ? 1 : 0, typefaceA);
                    return typefaceA;
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long c(int i10, boolean z10, long j10) {
        try {
            return ((Long) f19920c.invoke(null, Long.valueOf(((Long) f19919b.invoke(null, Long.valueOf(j10), Integer.valueOf(z10 ? 2 : 0))).longValue()), Integer.valueOf(i10))).longValue();
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long d(int i10, long j10) {
        try {
            return ((Long) f19920c.invoke(null, Long.valueOf(j10), Integer.valueOf(i10))).longValue();
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }
}
