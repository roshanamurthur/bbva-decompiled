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

/* JADX INFO: compiled from: WeightTypefaceApi26.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(26)
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f19924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f19925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor<Typeface> f19926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("sWeightCacheLock")
    public static final LongSparseArray<SparseArray<Typeface>> f19927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f19928e;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        f19924a = declaredField;
        f19925b = declaredMethod;
        f19926c = declaredConstructor;
        f19927d = new LongSparseArray<>(3);
        f19928e = new Object();
    }

    @Nullable
    public static Typeface a(@NonNull Typeface typeface, int i10, boolean z10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Field field = f19924a;
        Typeface typefaceNewInstance = null;
        if (field == null) {
            return null;
        }
        int i11 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f19928e) {
            try {
                try {
                    long j10 = field.getLong(typeface);
                    LongSparseArray<SparseArray<Typeface>> longSparseArray = f19927d;
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
                    try {
                        typefaceNewInstance = f19926c.newInstance(Long.valueOf(b(i10, z10, j10)));
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                    }
                    sparseArray.put(i11 == true ? 1 : 0, typefaceNewInstance);
                    return typefaceNewInstance;
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static long b(int i10, boolean z10, long j10) {
        try {
            return ((Long) f19925b.invoke(null, Long.valueOf(j10), Integer.valueOf(i10), Boolean.valueOf(z10))).longValue();
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }
}
