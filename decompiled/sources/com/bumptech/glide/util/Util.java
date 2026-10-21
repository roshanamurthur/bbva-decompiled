package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.model.Model;
import com.bumptech.glide.request.BaseRequestOptions;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class Util {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f38923a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f38924b = new char[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile Handler f38925c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38926a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f38926a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38926a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38926a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38926a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38926a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static Handler a() {
        if (f38925c == null) {
            synchronized (Util.class) {
                try {
                    if (f38925c == null) {
                        f38925c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f38925c;
    }

    public static void assertBackgroundThread() {
        if (!isOnBackgroundThread()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void assertMainThread() {
        if (!isOnMainThread()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean bothBaseRequestOptionsNullEquivalentOrEquals(@Nullable BaseRequestOptions<?> baseRequestOptions, @Nullable BaseRequestOptions<?> baseRequestOptions2) {
        if (baseRequestOptions == null) {
            return baseRequestOptions2 == null;
        }
        return baseRequestOptions.isEquivalentTo(baseRequestOptions2);
    }

    public static boolean bothModelsNullEquivalentOrEquals(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof Model ? ((Model) obj).isEquivalentTo(obj2) : obj.equals(obj2);
    }

    public static boolean bothNullOrEqual(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @NonNull
    public static <T> Queue<T> createQueue(int i10) {
        return new ArrayDeque(i10);
    }

    @TargetApi(19)
    public static int getBitmapByteSize(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + Constant.BRACKET_OPEN + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int getBytesPerPixel(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f38926a[config.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return i10 != 4 ? 4 : 8;
    }

    @Deprecated
    public static int getSize(@NonNull Bitmap bitmap) {
        return getBitmapByteSize(bitmap);
    }

    @NonNull
    public static <T> List<T> getSnapshot(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t10 : collection) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static int hashCode(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static boolean isOnBackgroundThread() {
        return !isOnMainThread();
    }

    public static boolean isOnMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isValidDimension(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    public static boolean isValidDimensions(int i10, int i11) {
        return isValidDimension(i10) && isValidDimension(i11);
    }

    public static void postOnUiThread(Runnable runnable) {
        a().post(runnable);
    }

    public static void removeCallbacksOnUiThread(Runnable runnable) {
        a().removeCallbacks(runnable);
    }

    @NonNull
    public static String sha256BytesToHex(@NonNull byte[] bArr) {
        String str;
        char[] cArr = f38924b;
        synchronized (cArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                int i11 = i10 * 2;
                char[] cArr2 = f38923a;
                cArr[i11] = cArr2[(b10 & 255) >>> 4];
                cArr[i11 + 1] = cArr2[b10 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }

    public static int hashCode(int i10) {
        return hashCode(i10, 17);
    }

    public static int hashCode(float f6) {
        return hashCode(f6, 17);
    }

    public static int hashCode(float f6, int i10) {
        return hashCode(Float.floatToIntBits(f6), i10);
    }

    public static int hashCode(@Nullable Object obj, int i10) {
        return hashCode(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int hashCode(boolean z10, int i10) {
        return hashCode(z10 ? 1 : 0, i10);
    }

    public static int hashCode(boolean z10) {
        return hashCode(z10, 17);
    }

    public static int getBitmapByteSize(int i10, int i11, @Nullable Bitmap.Config config) {
        return getBytesPerPixel(config) * i10 * i11;
    }
}
