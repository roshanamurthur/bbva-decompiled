package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class TypefaceCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f19886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LruCache<String, Typeface> f19887b;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final ResourcesCompat.FontCallback f19888a;

        public ResourcesCallbackAdapter(@Nullable ResourcesCompat.FontCallback fontCallback) {
            this.f19888a = fontCallback;
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int i10) {
            ResourcesCompat.FontCallback fontCallback = this.f19888a;
            if (fontCallback != null) {
                fontCallback.lambda$callbackFailAsync$1(i10);
            }
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(@NonNull Typeface typeface) {
            ResourcesCompat.FontCallback fontCallback = this.f19888a;
            if (fontCallback != null) {
                fontCallback.lambda$callbackSuccessAsync$0(typeface);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f19886a = new TypefaceCompatApi29Impl();
        } else if (i10 >= 28) {
            f19886a = new TypefaceCompatApi28Impl();
        } else if (i10 >= 26) {
            f19886a = new TypefaceCompatApi26Impl();
        } else if (i10 < 24) {
            f19886a = new r();
        } else {
            Method method = s.f19912d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f19886a = new s();
            } else {
                f19886a = new r();
            }
        }
        f19887b = new LruCache<>(16);
    }

    public static String a(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @VisibleForTesting
    public static void clearCache() {
        f19887b.evictAll();
    }

    @NonNull
    public static Typeface create(@NonNull Context context, @Nullable Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface createFromFontInfo(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i10) {
        return f19886a.createFromFontInfo(context, cancellationSignal, fontInfoArr, i10);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface createFromResourcesFamilyXml(@NonNull Context context, @NonNull FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, @NonNull Resources resources, int i10, @Nullable String str, int i11, int i12, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean z10) {
        Typeface typefaceCreateFromFontFamilyFilesResourceEntry;
        if (familyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            String systemFontFamilyName = providerResourceEntry.getSystemFontFamilyName();
            Typeface typeface = null;
            if (systemFontFamilyName != null && !systemFontFamilyName.isEmpty()) {
                Typeface typefaceCreate = Typeface.create(systemFontFamilyName, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                    typeface = typefaceCreate;
                }
            }
            if (typeface != null) {
                if (fontCallback != null) {
                    fontCallback.callbackSuccessAsync(typeface, handler);
                }
                return typeface;
            }
            typefaceCreateFromFontFamilyFilesResourceEntry = FontsContractCompat.requestFont(context, providerResourceEntry.getRequest(), i12, !z10 ? fontCallback != null : providerResourceEntry.getFetchStrategy() != 0, z10 ? providerResourceEntry.getTimeout() : -1, ResourcesCompat.FontCallback.getHandler(handler), new ResourcesCallbackAdapter(fontCallback));
        } else {
            typefaceCreateFromFontFamilyFilesResourceEntry = f19886a.createFromFontFamilyFilesResourceEntry(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i12);
            if (fontCallback != null) {
                if (typefaceCreateFromFontFamilyFilesResourceEntry != null) {
                    fontCallback.callbackSuccessAsync(typefaceCreateFromFontFamilyFilesResourceEntry, handler);
                } else {
                    fontCallback.callbackFailAsync(-3, handler);
                }
            }
        }
        if (typefaceCreateFromFontFamilyFilesResourceEntry != null) {
            f19887b.put(a(resources, i10, str, i11, i12), typefaceCreateFromFontFamilyFilesResourceEntry);
        }
        return typefaceCreateFromFontFamilyFilesResourceEntry;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface createFromResourcesFontFile(@NonNull Context context, @NonNull Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceCreateFromResourcesFontFile = f19886a.createFromResourcesFontFile(context, resources, i10, str, i12);
        if (typefaceCreateFromResourcesFontFile != null) {
            f19887b.put(a(resources, i10, str, i11, i12), typefaceCreateFromResourcesFontFile);
        }
        return typefaceCreateFromResourcesFontFile;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface findFromCache(@NonNull Resources resources, int i10, @Nullable String str, int i11, int i12) {
        return f19887b.get(a(resources, i10, str, i11, i12));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface findFromCache(@NonNull Resources resources, int i10, int i11) {
        return findFromCache(resources, i10, null, 0, i11);
    }

    @NonNull
    public static Typeface create(@NonNull Context context, @Nullable Typeface typeface, @IntRange(from = 1, to = 1000) int i10, boolean z10) {
        if (context != null) {
            Preconditions.checkArgumentInRange(i10, 1, 1000, "weight");
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return f19886a.a(context, typeface, i10, z10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface createFromResourcesFontFile(@NonNull Context context, @NonNull Resources resources, int i10, String str, int i11) {
        return createFromResourcesFontFile(context, resources, i10, str, 0, i11);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface createFromResourcesFamilyXml(@NonNull Context context, @NonNull FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, @NonNull Resources resources, int i10, int i11, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean z10) {
        return createFromResourcesFamilyXml(context, familyResourceEntry, resources, i10, null, 0, i11, fontCallback, handler, z10);
    }
}
