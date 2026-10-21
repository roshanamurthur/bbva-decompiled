package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(26)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TypefaceCompatApi26Impl extends r {
    protected final Method mAbortCreation;
    protected final Method mAddFontFromAssetManager;
    protected final Method mAddFontFromBuffer;
    protected final Method mCreateFromFamiliesWithDefault;
    protected final Class<?> mFontFamily;
    protected final Constructor<?> mFontFamilyCtor;
    protected final Method mFreeze;

    public TypefaceCompatApi26Impl() {
        Class<?> clsObtainFontFamily;
        Constructor<?> constructorObtainFontFamilyCtor;
        Method methodObtainAddFontFromAssetManagerMethod;
        Method methodObtainAddFontFromBufferMethod;
        Method methodObtainFreezeMethod;
        Method methodObtainAbortCreationMethod;
        Method methodObtainCreateFromFamiliesWithDefaultMethod;
        try {
            clsObtainFontFamily = obtainFontFamily();
            constructorObtainFontFamilyCtor = obtainFontFamilyCtor(clsObtainFontFamily);
            methodObtainAddFontFromAssetManagerMethod = obtainAddFontFromAssetManagerMethod(clsObtainFontFamily);
            methodObtainAddFontFromBufferMethod = obtainAddFontFromBufferMethod(clsObtainFontFamily);
            methodObtainFreezeMethod = obtainFreezeMethod(clsObtainFontFamily);
            methodObtainAbortCreationMethod = obtainAbortCreationMethod(clsObtainFontFamily);
            methodObtainCreateFromFamiliesWithDefaultMethod = obtainCreateFromFamiliesWithDefaultMethod(clsObtainFontFamily);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            clsObtainFontFamily = null;
            constructorObtainFontFamilyCtor = null;
            methodObtainAddFontFromAssetManagerMethod = null;
            methodObtainAddFontFromBufferMethod = null;
            methodObtainFreezeMethod = null;
            methodObtainAbortCreationMethod = null;
            methodObtainCreateFromFamiliesWithDefaultMethod = null;
        }
        this.mFontFamily = clsObtainFontFamily;
        this.mFontFamilyCtor = constructorObtainFontFamilyCtor;
        this.mAddFontFromAssetManager = methodObtainAddFontFromAssetManagerMethod;
        this.mAddFontFromBuffer = methodObtainAddFontFromBufferMethod;
        this.mFreeze = methodObtainFreezeMethod;
        this.mAbortCreation = methodObtainAbortCreationMethod;
        this.mCreateFromFamiliesWithDefault = methodObtainCreateFromFamiliesWithDefaultMethod;
    }

    @Override // androidx.core.graphics.r, androidx.core.graphics.t
    @NonNull
    public Typeface a(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Typeface typefaceA;
        try {
            typefaceA = w.a(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? super.a(context, typeface, i10, z10) : typefaceA;
    }

    @Nullable
    public Typeface createFromFamiliesWithDefault(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.mFontFamily, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.mCreateFromFamiliesWithDefault.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.r, androidx.core.graphics.t
    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i10) {
        if (!h()) {
            return super.createFromFontFamilyFilesResourceEntry(context, fontFamilyFilesResourceEntry, resources, i10);
        }
        Object objI = i();
        if (objI == null) {
            return null;
        }
        for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
            if (!f(context, objI, fontFileResourceEntry.getFileName(), fontFileResourceEntry.getTtcIndex(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFileResourceEntry.getVariationSettings()))) {
                e(objI);
                return null;
            }
        }
        if (g(objI)) {
            return createFromFamiliesWithDefault(objI);
        }
        return null;
    }

    @Override // androidx.core.graphics.r, androidx.core.graphics.t
    @Nullable
    public Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i10) {
        Typeface typefaceCreateFromFamiliesWithDefault;
        if (fontInfoArr.length < 1) {
            return null;
        }
        if (!h()) {
            FontsContractCompat.FontInfo fontInfoFindBestInfo = findBestInfo(fontInfoArr, i10);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fontInfoFindBestInfo.getUri(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(fontInfoFindBestInfo.getWeight()).setItalic(fontInfoFindBestInfo.isItalic()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> fontInfoIntoByteBuffer = TypefaceCompatUtil.readFontInfoIntoByteBuffer(context, fontInfoArr, cancellationSignal);
        Object objI = i();
        if (objI == null) {
            return null;
        }
        int length = fontInfoArr.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            FontsContractCompat.FontInfo fontInfo = fontInfoArr[i11];
            ByteBuffer byteBuffer = fontInfoIntoByteBuffer.get(fontInfo.getUri());
            if (byteBuffer != null) {
                try {
                    if (!((Boolean) this.mAddFontFromBuffer.invoke(objI, byteBuffer, Integer.valueOf(fontInfo.getTtcIndex()), null, Integer.valueOf(fontInfo.getWeight()), Integer.valueOf(fontInfo.isItalic() ? 1 : 0))).booleanValue()) {
                        e(objI);
                        return null;
                    }
                    z10 = true;
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
            i11++;
            z10 = z10;
        }
        if (!z10) {
            e(objI);
            return null;
        }
        if (g(objI) && (typefaceCreateFromFamiliesWithDefault = createFromFamiliesWithDefault(objI)) != null) {
            return Typeface.create(typefaceCreateFromFamiliesWithDefault, i10);
        }
        return null;
    }

    @Override // androidx.core.graphics.t
    @Nullable
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i10, String str, int i11) {
        if (!h()) {
            return super.createFromResourcesFontFile(context, resources, i10, str, i11);
        }
        Object objI = i();
        if (objI == null) {
            return null;
        }
        if (!f(context, objI, str, 0, -1, -1, null)) {
            e(objI);
            return null;
        }
        if (g(objI)) {
            return createFromFamiliesWithDefault(objI);
        }
        return null;
    }

    public final void e(Object obj) {
        try {
            this.mAbortCreation.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean f(Context context, Object obj, String str, int i10, int i11, int i12, @Nullable FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.mAddFontFromAssetManager.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean g(Object obj) {
        try {
            return ((Boolean) this.mFreeze.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean h() {
        if (this.mAddFontFromAssetManager == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.mAddFontFromAssetManager != null;
    }

    @Nullable
    public final Object i() {
        try {
            return this.mFontFamilyCtor.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method obtainAbortCreationMethod(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    public Method obtainAddFontFromAssetManagerMethod(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method obtainAddFontFromBufferMethod(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method obtainCreateFromFamiliesWithDefaultMethod(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> obtainFontFamily() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> obtainFontFamilyCtor(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    public Method obtainFreezeMethod(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }
}
