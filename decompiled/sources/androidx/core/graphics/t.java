package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public final ConcurrentHashMap<Long, FontResourcesParserCompat.FontFamilyFilesResourceEntry> f19914a = new ConcurrentHashMap<>();

    public static long b(@Nullable Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    @NonNull
    public Typeface a(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceA;
        try {
            typefaceA = u.a(this, context, typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? typeface : typefaceA;
    }

    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i10) {
        FontResourcesParserCompat.FontFileResourceEntry[] entries = fontFamilyFilesResourceEntry.getEntries();
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        int i12 = Integer.MAX_VALUE;
        FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = null;
        for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry2 : entries) {
            int iAbs = (Math.abs(fontFileResourceEntry2.getWeight() - i11) * 2) + (fontFileResourceEntry2.isItalic() == z10 ? 0 : 1);
            if (fontFileResourceEntry == null || i12 > iAbs) {
                fontFileResourceEntry = fontFileResourceEntry2;
                i12 = iAbs;
            }
        }
        if (fontFileResourceEntry == null) {
            return null;
        }
        Typeface typefaceCreateFromResourcesFontFile = TypefaceCompat.createFromResourcesFontFile(context, resources, fontFileResourceEntry.getResourceId(), fontFileResourceEntry.getFileName(), 0, i10);
        long jB = b(typefaceCreateFromResourcesFontFile);
        if (jB != 0) {
            this.f19914a.put(Long.valueOf(jB), fontFamilyFilesResourceEntry);
        }
        return typefaceCreateFromResourcesFontFile;
    }

    @Nullable
    public Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i10) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(findBestInfo(fontInfoArr, i10).getUri());
            try {
                Typeface typefaceCreateFromInputStream = createFromInputStream(context, inputStreamOpenInputStream);
                TypefaceCompatUtil.closeQuietly(inputStreamOpenInputStream);
                return typefaceCreateFromInputStream;
            } catch (IOException unused) {
                TypefaceCompatUtil.closeQuietly(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                TypefaceCompatUtil.closeQuietly(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public Typeface createFromInputStream(Context context, InputStream inputStream) {
        File tempFile = TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.copyToFile(tempFile, inputStream)) {
                return Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    @Nullable
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i10, String str, int i11) {
        File tempFile = TypefaceCompatUtil.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.copyToFile(tempFile, resources, i10)) {
                return Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    public FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] fontInfoArr, int i10) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        FontsContractCompat.FontInfo fontInfo = null;
        int i12 = Integer.MAX_VALUE;
        for (FontsContractCompat.FontInfo fontInfo2 : fontInfoArr) {
            int iAbs = (Math.abs(fontInfo2.getWeight() - i11) * 2) + (fontInfo2.isItalic() == z10 ? 0 : 1);
            if (fontInfo == null || i12 > iAbs) {
                fontInfo = fontInfo2;
                i12 = iAbs;
            }
        }
        return fontInfo;
    }
}
