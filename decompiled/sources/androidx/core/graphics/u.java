package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.FontResourcesParserCompat;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: WeightTypefaceApi14.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f19915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("sWeightCacheLock")
    public static final LongSparseArray<SparseArray<Typeface>> f19916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f19917c;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
            declaredField = null;
        }
        f19915a = declaredField;
        f19916b = new LongSparseArray<>(3);
        f19917c = new Object();
    }

    @Nullable
    public static Typeface a(@NonNull t tVar, @NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceCreateFromResourcesFontFile;
        int i11;
        Field field = f19915a;
        if (field == null) {
            return null;
        }
        int i12 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f19917c) {
            try {
                try {
                    long jLongValue = ((Number) field.get(typeface)).longValue();
                    LongSparseArray<SparseArray<Typeface>> longSparseArray = f19916b;
                    SparseArray<Typeface> sparseArray = longSparseArray.get(jLongValue);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray<>(4);
                        longSparseArray.put(jLongValue, sparseArray);
                    } else {
                        Typeface typeface2 = sparseArray.get(i12 == true ? 1 : 0);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    tVar.getClass();
                    long jB = t.b(typeface);
                    FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry = jB == 0 ? null : tVar.f19914a.get(Long.valueOf(jB));
                    if (fontFamilyFilesResourceEntry == null) {
                        typefaceCreateFromResourcesFontFile = null;
                    } else {
                        Resources resources = context.getResources();
                        int i13 = Integer.MAX_VALUE;
                        FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = null;
                        for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry2 : fontFamilyFilesResourceEntry.getEntries()) {
                            int iAbs = (Math.abs(fontFileResourceEntry2.getWeight() - i10) * 2) + (fontFileResourceEntry2.isItalic() == z10 ? 0 : 1);
                            if (fontFileResourceEntry == null || i13 > iAbs) {
                                i13 = iAbs;
                                fontFileResourceEntry = fontFileResourceEntry2;
                            }
                        }
                        if (fontFileResourceEntry == null) {
                            typefaceCreateFromResourcesFontFile = null;
                        } else {
                            typefaceCreateFromResourcesFontFile = TypefaceCompat.createFromResourcesFontFile(context, resources, fontFileResourceEntry.getResourceId(), fontFileResourceEntry.getFileName(), 0, 0);
                            long jB2 = t.b(typefaceCreateFromResourcesFontFile);
                            if (jB2 != 0) {
                                tVar.f19914a.put(Long.valueOf(jB2), fontFamilyFilesResourceEntry);
                            }
                        }
                    }
                    if (typefaceCreateFromResourcesFontFile == null) {
                        boolean z11 = i10 >= 600;
                        if (!z11 && !z10) {
                            i11 = 0;
                        } else if (z11) {
                            i11 = !z10 ? 1 : 3;
                        } else {
                            i11 = 2;
                        }
                        typefaceCreateFromResourcesFontFile = Typeface.create(typeface, i11);
                    }
                    sparseArray.put(i12 == true ? 1 : 0, typefaceCreateFromResourcesFontFile);
                    return typefaceCreateFromResourcesFontFile;
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
