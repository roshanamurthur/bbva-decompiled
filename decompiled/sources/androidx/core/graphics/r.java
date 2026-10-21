package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: TypefaceCompatApi21Impl.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class r extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class<?> f19905b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor<?> f19906c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f19907d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f19908e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f19909f = false;

    public static boolean c(Object obj, String str, int i10, boolean z10) {
        d();
        try {
            return ((Boolean) f19907d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static void d() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f19909f) {
            return;
        }
        f19909f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f19906c = constructor;
        f19905b = cls;
        f19907d = method2;
        f19908e = method;
    }

    @Override // androidx.core.graphics.t
    @NonNull
    public Typeface a(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceB;
        try {
            typefaceB = v.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.a(context, typeface, i10, z10) : typefaceB;
    }

    @Override // androidx.core.graphics.t
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i10) {
        d();
        try {
            Object objNewInstance = f19906c.newInstance(new Object[0]);
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
                File tempFile = TypefaceCompatUtil.getTempFile(context);
                if (tempFile == null) {
                    return null;
                }
                try {
                    if (!TypefaceCompatUtil.copyToFile(tempFile, resources, fontFileResourceEntry.getResourceId())) {
                        return null;
                    }
                    if (!c(objNewInstance, tempFile.getPath(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic())) {
                        return null;
                    }
                    tempFile.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    tempFile.delete();
                }
            }
            d();
            try {
                Object objNewInstance2 = Array.newInstance(f19905b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f19908e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e5) {
                throw new RuntimeException(e5);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // androidx.core.graphics.t
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i10) {
        File file;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(findBestInfo(fontInfoArr, i10).getUri(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                    file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (ErrnoException unused) {
            }
            if (file != null && file.canRead()) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceCreateFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                Typeface typefaceCreateFromInputStream = super.createFromInputStream(context, fileInputStream);
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceCreateFromInputStream;
            } catch (Throwable th4) {
                try {
                    fileInputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
