package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public class FontsContractCompat {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String PARCEL_FONT_RESULTS = "font_results";

    public static final class Columns implements BaseColumns {
        public static final String FILE_ID = "file_id";
        public static final String ITALIC = "font_italic";
        public static final String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final String TTC_INDEX = "font_ttc_index";
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        public static final String WEIGHT = "font_weight";
    }

    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FontInfo[] f20021b;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public FontFamilyResult(int i10, @Nullable FontInfo[] fontInfoArr) {
            this.f20020a = i10;
            this.f20021b = fontInfoArr;
        }

        public FontInfo[] getFonts() {
            return this.f20021b;
        }

        public int getStatusCode() {
            return this.f20020a;
        }
    }

    public static class FontInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f20022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f20025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20026e;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public FontInfo(@NonNull Uri uri, @IntRange(from = 0) int i10, @IntRange(from = 1, to = 1000) int i11, boolean z10, int i12) {
            this.f20022a = (Uri) Preconditions.checkNotNull(uri);
            this.f20023b = i10;
            this.f20024c = i11;
            this.f20025d = z10;
            this.f20026e = i12;
        }

        public int getResultCode() {
            return this.f20026e;
        }

        @IntRange(from = 0)
        public int getTtcIndex() {
            return this.f20023b;
        }

        @NonNull
        public Uri getUri() {
            return this.f20022a;
        }

        @IntRange(from = 1, to = 1000)
        public int getWeight() {
            return this.f20024c;
        }

        public boolean isItalic() {
            return this.f20025d;
        }
    }

    @Nullable
    public static Typeface buildTypeface(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontInfo[] fontInfoArr) {
        return TypefaceCompat.createFromFontInfo(context, cancellationSignal, fontInfoArr, 0);
    }

    @NonNull
    public static FontFamilyResult fetchFonts(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontRequest fontRequest) throws PackageManager.NameNotFoundException {
        return d.a(context, cancellationSignal, fontRequest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface getFontSync(Context context, FontRequest fontRequest, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean z10, int i10, int i11) {
        return requestFont(context, fontRequest, i11, z10, i10, ResourcesCompat.FontCallback.getHandler(handler), new TypefaceCompat.ResourcesCallbackAdapter(fontCallback));
    }

    @VisibleForTesting
    @Deprecated
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ProviderInfo getProvider(@NonNull PackageManager packageManager, @NonNull FontRequest fontRequest, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
        return d.b(packageManager, fontRequest, resources);
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Map<Uri, ByteBuffer> prepareFontData(Context context, FontInfo[] fontInfoArr, CancellationSignal cancellationSignal) {
        return TypefaceCompatUtil.readFontInfoIntoByteBuffer(context, fontInfoArr, cancellationSignal);
    }

    public static void requestFont(@NonNull Context context, @NonNull FontRequest fontRequest, @NonNull FontRequestCallback fontRequestCallback, @NonNull Handler handler) {
        c cVar = new c(fontRequestCallback);
        i.b(context.getApplicationContext(), fontRequest, 0, new k2.d(handler), cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void resetCache() {
        i.f20063a.evictAll();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static void resetTypefaceCache() {
        i.f20063a.evictAll();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface requestFont(@NonNull Context context, @NonNull FontRequest fontRequest, int i10, boolean z10, @IntRange(from = 0) int i11, @NonNull Handler handler, @NonNull FontRequestCallback fontRequestCallback) {
        c cVar = new c(fontRequestCallback, handler);
        if (z10) {
            LruCache<String, Typeface> lruCache = i.f20063a;
            String str = fontRequest.f20019f + Constant.DASH_STRING + i10;
            Typeface typeface = i.f20063a.get(str);
            if (typeface != null) {
                handler.post(new a(fontRequestCallback, typeface));
                return typeface;
            }
            if (i11 == -1) {
                i.a aVarA = i.a(str, context, fontRequest, i10);
                cVar.a(aVarA);
                return aVarA.f20067a;
            }
            try {
                try {
                    try {
                        i.a aVar = (i.a) i.f20064b.submit(new e(str, context, fontRequest, i10)).get(i11, TimeUnit.MILLISECONDS);
                        cVar.a(aVar);
                        return aVar.f20067a;
                    } catch (InterruptedException e5) {
                        throw e5;
                    }
                } catch (ExecutionException e7) {
                    throw new RuntimeException(e7);
                } catch (TimeoutException unused) {
                    throw new InterruptedException("timeout");
                }
            } catch (InterruptedException unused2) {
                cVar.f20051b.post(new b(cVar.f20050a, -3));
                return null;
            }
        }
        return i.b(context, fontRequest, i10, null, cVar);
    }

    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int RESULT_OK = 0;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i10) {
        }

        public void onTypefaceRetrieved(Typeface typeface) {
        }
    }
}
