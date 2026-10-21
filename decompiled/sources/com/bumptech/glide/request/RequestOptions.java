package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* JADX INFO: loaded from: classes9.dex */
public class RequestOptions extends BaseRequestOptions<RequestOptions> {

    @Nullable
    public static RequestOptions U0;

    @Nullable
    public static RequestOptions V0;

    @Nullable
    public static RequestOptions W0;

    @Nullable
    public static RequestOptions X0;

    @Nullable
    public static RequestOptions Y0;

    @Nullable
    public static RequestOptions Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @Nullable
    public static RequestOptions f38780a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @Nullable
    public static RequestOptions f38781b1;

    @NonNull
    @CheckResult
    public static RequestOptions bitmapTransform(@NonNull Transformation<Bitmap> transformation) {
        return new RequestOptions().transform(transformation);
    }

    @NonNull
    @CheckResult
    public static RequestOptions centerCropTransform() {
        if (Y0 == null) {
            Y0 = new RequestOptions().centerCrop().autoClone();
        }
        return Y0;
    }

    @NonNull
    @CheckResult
    public static RequestOptions centerInsideTransform() {
        if (X0 == null) {
            X0 = new RequestOptions().centerInside().autoClone();
        }
        return X0;
    }

    @NonNull
    @CheckResult
    public static RequestOptions circleCropTransform() {
        if (Z0 == null) {
            Z0 = new RequestOptions().circleCrop().autoClone();
        }
        return Z0;
    }

    @NonNull
    @CheckResult
    public static RequestOptions decodeTypeOf(@NonNull Class<?> cls) {
        return new RequestOptions().decode(cls);
    }

    @NonNull
    @CheckResult
    public static RequestOptions diskCacheStrategyOf(@NonNull DiskCacheStrategy diskCacheStrategy) {
        return new RequestOptions().diskCacheStrategy(diskCacheStrategy);
    }

    @NonNull
    @CheckResult
    public static RequestOptions downsampleOf(@NonNull DownsampleStrategy downsampleStrategy) {
        return new RequestOptions().downsample(downsampleStrategy);
    }

    @NonNull
    @CheckResult
    public static RequestOptions encodeFormatOf(@NonNull Bitmap.CompressFormat compressFormat) {
        return new RequestOptions().encodeFormat(compressFormat);
    }

    @NonNull
    @CheckResult
    public static RequestOptions encodeQualityOf(@IntRange(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i10) {
        return new RequestOptions().encodeQuality(i10);
    }

    @NonNull
    @CheckResult
    public static RequestOptions errorOf(@Nullable Drawable drawable) {
        return new RequestOptions().error(drawable);
    }

    @NonNull
    @CheckResult
    public static RequestOptions fitCenterTransform() {
        if (W0 == null) {
            W0 = new RequestOptions().fitCenter().autoClone();
        }
        return W0;
    }

    @NonNull
    @CheckResult
    public static RequestOptions formatOf(@NonNull DecodeFormat decodeFormat) {
        return new RequestOptions().format(decodeFormat);
    }

    @NonNull
    @CheckResult
    public static RequestOptions frameOf(@IntRange(from = 0) long j10) {
        return new RequestOptions().frame(j10);
    }

    @NonNull
    @CheckResult
    public static RequestOptions noAnimation() {
        if (f38781b1 == null) {
            f38781b1 = new RequestOptions().dontAnimate().autoClone();
        }
        return f38781b1;
    }

    @NonNull
    @CheckResult
    public static RequestOptions noTransformation() {
        if (f38780a1 == null) {
            f38780a1 = new RequestOptions().dontTransform().autoClone();
        }
        return f38780a1;
    }

    @NonNull
    @CheckResult
    public static <T> RequestOptions option(@NonNull Option<T> option, @NonNull T t10) {
        return new RequestOptions().set(option, t10);
    }

    @NonNull
    @CheckResult
    public static RequestOptions overrideOf(int i10, int i11) {
        return new RequestOptions().override(i10, i11);
    }

    @NonNull
    @CheckResult
    public static RequestOptions placeholderOf(@Nullable Drawable drawable) {
        return new RequestOptions().placeholder(drawable);
    }

    @NonNull
    @CheckResult
    public static RequestOptions priorityOf(@NonNull Priority priority) {
        return new RequestOptions().priority(priority);
    }

    @NonNull
    @CheckResult
    public static RequestOptions signatureOf(@NonNull Key key) {
        return new RequestOptions().signature(key);
    }

    @NonNull
    @CheckResult
    public static RequestOptions sizeMultiplierOf(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        return new RequestOptions().sizeMultiplier(f6);
    }

    @NonNull
    @CheckResult
    public static RequestOptions skipMemoryCacheOf(boolean z10) {
        if (z10) {
            if (U0 == null) {
                U0 = new RequestOptions().skipMemoryCache(true).autoClone();
            }
            return U0;
        }
        if (V0 == null) {
            V0 = new RequestOptions().skipMemoryCache(false).autoClone();
        }
        return V0;
    }

    @NonNull
    @CheckResult
    public static RequestOptions timeoutOf(@IntRange(from = 0) int i10) {
        return new RequestOptions().timeout(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public boolean equals(Object obj) {
        return (obj instanceof RequestOptions) && super.equals(obj);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    @CheckResult
    public static RequestOptions errorOf(@DrawableRes int i10) {
        return new RequestOptions().error(i10);
    }

    @NonNull
    @CheckResult
    public static RequestOptions overrideOf(int i10) {
        return overrideOf(i10, i10);
    }

    @NonNull
    @CheckResult
    public static RequestOptions placeholderOf(@DrawableRes int i10) {
        return new RequestOptions().placeholder(i10);
    }
}
