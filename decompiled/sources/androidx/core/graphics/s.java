package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: TypefaceCompatApi24Impl.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class s extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f19910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor<?> f19911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f19912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f19913e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f19911c = constructor;
        f19910b = cls;
        f19912d = method2;
        f19913e = method;
    }

    public static boolean c(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f19912d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface d(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f19910b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f19913e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.t
    @NonNull
    public final Typeface a(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceB;
        try {
            typefaceB = v.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.a(context, typeface, i10, z10) : typefaceB;
    }

    @Override // androidx.core.graphics.t
    @Nullable
    public final Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i10) {
        Object objNewInstance;
        try {
            objNewInstance = f19911c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
            ByteBuffer byteBufferCopyToDirectBuffer = TypefaceCompatUtil.copyToDirectBuffer(context, resources, fontFileResourceEntry.getResourceId());
            if (byteBufferCopyToDirectBuffer == null || !c(objNewInstance, byteBufferCopyToDirectBuffer, fontFileResourceEntry.getTtcIndex(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic())) {
                return null;
            }
        }
        return d(objNewInstance);
    }

    @Override // androidx.core.graphics.t
    @Nullable
    public final Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i10) {
        Object objNewInstance;
        try {
            objNewInstance = f19911c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            Uri uri = fontInfo.getUri();
            ByteBuffer byteBufferMmap = (ByteBuffer) simpleArrayMap.get(uri);
            if (byteBufferMmap == null) {
                byteBufferMmap = TypefaceCompatUtil.mmap(context, cancellationSignal, uri);
                simpleArrayMap.put(uri, byteBufferMmap);
            }
            if (byteBufferMmap == null || !c(objNewInstance, byteBufferMmap, fontInfo.getTtcIndex(), fontInfo.getWeight(), fontInfo.isItalic())) {
                return null;
            }
        }
        Typeface typefaceD = d(objNewInstance);
        if (typefaceD == null) {
            return null;
        }
        return Typeface.create(typefaceD, i10);
    }
}
