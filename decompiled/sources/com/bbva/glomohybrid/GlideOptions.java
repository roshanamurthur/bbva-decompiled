package com.bbva.glomohybrid;

import android.content.res.Resources;
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
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;

/* JADX INFO: loaded from: classes5.dex */
public final class GlideOptions extends RequestOptions {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static GlideOptions f30996c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static GlideOptions f30997d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static GlideOptions f30998e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static GlideOptions f30999f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static GlideOptions f31000g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static GlideOptions f31001h1;

    @NonNull
    @CheckResult
    public static GlideOptions bitmapTransform(@NonNull Transformation<Bitmap> transformation) {
        return new GlideOptions().transform(transformation);
    }

    @NonNull
    @CheckResult
    public static GlideOptions centerCropTransform() {
        if (f30998e1 == null) {
            f30998e1 = new GlideOptions().centerCrop().autoClone();
        }
        return f30998e1;
    }

    @NonNull
    @CheckResult
    public static GlideOptions centerInsideTransform() {
        if (f30997d1 == null) {
            f30997d1 = new GlideOptions().centerInside().autoClone();
        }
        return f30997d1;
    }

    @NonNull
    @CheckResult
    public static GlideOptions circleCropTransform() {
        if (f30999f1 == null) {
            f30999f1 = new GlideOptions().circleCrop().autoClone();
        }
        return f30999f1;
    }

    @NonNull
    @CheckResult
    public static GlideOptions decodeTypeOf(@NonNull Class<?> cls) {
        return new GlideOptions().decode(cls);
    }

    @NonNull
    @CheckResult
    public static GlideOptions diskCacheStrategyOf(@NonNull DiskCacheStrategy diskCacheStrategy) {
        return new GlideOptions().diskCacheStrategy(diskCacheStrategy);
    }

    @NonNull
    @CheckResult
    public static GlideOptions downsampleOf(@NonNull DownsampleStrategy downsampleStrategy) {
        return new GlideOptions().downsample(downsampleStrategy);
    }

    @NonNull
    @CheckResult
    public static GlideOptions encodeFormatOf(@NonNull Bitmap.CompressFormat compressFormat) {
        return new GlideOptions().encodeFormat(compressFormat);
    }

    @NonNull
    @CheckResult
    public static GlideOptions encodeQualityOf(@IntRange(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i10) {
        return new GlideOptions().encodeQuality(i10);
    }

    @NonNull
    @CheckResult
    public static GlideOptions errorOf(@Nullable Drawable drawable) {
        return new GlideOptions().error(drawable);
    }

    @NonNull
    @CheckResult
    public static GlideOptions fitCenterTransform() {
        if (f30996c1 == null) {
            f30996c1 = new GlideOptions().fitCenter().autoClone();
        }
        return f30996c1;
    }

    @NonNull
    @CheckResult
    public static GlideOptions formatOf(@NonNull DecodeFormat decodeFormat) {
        return new GlideOptions().format(decodeFormat);
    }

    @NonNull
    @CheckResult
    public static GlideOptions frameOf(@IntRange(from = 0) long j10) {
        return new GlideOptions().frame(j10);
    }

    @NonNull
    @CheckResult
    public static GlideOptions noAnimation() {
        if (f31001h1 == null) {
            f31001h1 = new GlideOptions().dontAnimate().autoClone();
        }
        return f31001h1;
    }

    @NonNull
    @CheckResult
    public static GlideOptions noTransformation() {
        if (f31000g1 == null) {
            f31000g1 = new GlideOptions().dontTransform().autoClone();
        }
        return f31000g1;
    }

    @NonNull
    @CheckResult
    public static <T> GlideOptions option(@NonNull Option<T> option, @NonNull T t10) {
        return new GlideOptions().set(option, t10);
    }

    @NonNull
    @CheckResult
    public static GlideOptions overrideOf(int i10, int i11) {
        return new GlideOptions().override(i10, i11);
    }

    @NonNull
    @CheckResult
    public static GlideOptions placeholderOf(@Nullable Drawable drawable) {
        return new GlideOptions().placeholder(drawable);
    }

    @NonNull
    @CheckResult
    public static GlideOptions priorityOf(@NonNull Priority priority) {
        return new GlideOptions().priority(priority);
    }

    @NonNull
    @CheckResult
    public static GlideOptions signatureOf(@NonNull Key key) {
        return new GlideOptions().signature(key);
    }

    @NonNull
    @CheckResult
    public static GlideOptions sizeMultiplierOf(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        return new GlideOptions().sizeMultiplier(f6);
    }

    @NonNull
    @CheckResult
    public static GlideOptions skipMemoryCacheOf(boolean z10) {
        return new GlideOptions().skipMemoryCache(z10);
    }

    @NonNull
    @CheckResult
    public static GlideOptions timeoutOf(@IntRange(from = 0) int i10) {
        return new GlideOptions().timeout(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ BaseRequestOptions apply(@NonNull BaseRequestOptions baseRequestOptions) {
        return apply((BaseRequestOptions<?>) baseRequestOptions);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ BaseRequestOptions decode(@NonNull Class cls) {
        return decode((Class<?>) cls);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ BaseRequestOptions optionalTransform(@NonNull Transformation transformation) {
        return optionalTransform((Transformation<Bitmap>) transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ BaseRequestOptions set(@NonNull Option option, @NonNull Object obj) {
        return set((Option<Object>) option, obj);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ BaseRequestOptions transform(@NonNull Transformation transformation) {
        return transform((Transformation<Bitmap>) transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @Deprecated
    @SafeVarargs
    @CheckResult
    public /* bridge */ /* synthetic */ BaseRequestOptions transforms(@NonNull Transformation[] transformationArr) {
        return transforms((Transformation<Bitmap>[]) transformationArr);
    }

    @NonNull
    @CheckResult
    public static GlideOptions errorOf(@DrawableRes int i10) {
        return new GlideOptions().error(i10);
    }

    @NonNull
    @CheckResult
    public static GlideOptions overrideOf(int i10) {
        return new GlideOptions().override(i10);
    }

    @NonNull
    @CheckResult
    public static GlideOptions placeholderOf(@DrawableRes int i10) {
        return new GlideOptions().placeholder(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions apply(@NonNull BaseRequestOptions<?> baseRequestOptions) {
        return (GlideOptions) super.apply(baseRequestOptions);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    public GlideOptions autoClone() {
        return (GlideOptions) super.autoClone();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions centerCrop() {
        return (GlideOptions) super.centerCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions centerInside() {
        return (GlideOptions) super.centerInside();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions circleCrop() {
        return (GlideOptions) super.circleCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions decode(@NonNull Class<?> cls) {
        return (GlideOptions) super.decode(cls);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions disallowHardwareConfig() {
        return (GlideOptions) super.disallowHardwareConfig();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy) {
        return (GlideOptions) super.diskCacheStrategy(diskCacheStrategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions dontAnimate() {
        return (GlideOptions) super.dontAnimate();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions dontTransform() {
        return (GlideOptions) super.dontTransform();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions downsample(@NonNull DownsampleStrategy downsampleStrategy) {
        return (GlideOptions) super.downsample(downsampleStrategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return (GlideOptions) super.encodeFormat(compressFormat);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions encodeQuality(@IntRange(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i10) {
        return (GlideOptions) super.encodeQuality(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions fitCenter() {
        return (GlideOptions) super.fitCenter();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions format(@NonNull DecodeFormat decodeFormat) {
        return (GlideOptions) super.format(decodeFormat);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions frame(@IntRange(from = 0) long j10) {
        return (GlideOptions) super.frame(j10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    public GlideOptions lock() {
        return (GlideOptions) super.lock();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions onlyRetrieveFromCache(boolean z10) {
        return (GlideOptions) super.onlyRetrieveFromCache(z10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions optionalCenterCrop() {
        return (GlideOptions) super.optionalCenterCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions optionalCenterInside() {
        return (GlideOptions) super.optionalCenterInside();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions optionalCircleCrop() {
        return (GlideOptions) super.optionalCircleCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions optionalFitCenter() {
        return (GlideOptions) super.optionalFitCenter();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions priority(@NonNull Priority priority) {
        return (GlideOptions) super.priority(priority);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public <Y> GlideOptions set(@NonNull Option<Y> option, @NonNull Y y7) {
        return (GlideOptions) super.set((Option) option, (Object) y7);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions signature(@NonNull Key key) {
        return (GlideOptions) super.signature(key);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions sizeMultiplier(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        return (GlideOptions) super.sizeMultiplier(f6);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions skipMemoryCache(boolean z10) {
        return (GlideOptions) super.skipMemoryCache(z10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions theme(@Nullable Resources.Theme theme) {
        return (GlideOptions) super.theme(theme);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions timeout(@IntRange(from = 0) int i10) {
        return (GlideOptions) super.timeout(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @Deprecated
    @SafeVarargs
    @CheckResult
    public final GlideOptions transforms(@NonNull Transformation<Bitmap>... transformationArr) {
        return (GlideOptions) super.transforms(transformationArr);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions useAnimationPool(boolean z10) {
        return (GlideOptions) super.useAnimationPool(z10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions useUnlimitedSourceGeneratorsPool(boolean z10) {
        return (GlideOptions) super.useUnlimitedSourceGeneratorsPool(z10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    /* JADX INFO: renamed from: clone */
    public GlideOptions mo4900clone() {
        return (GlideOptions) super.mo4900clone();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions error(@Nullable Drawable drawable) {
        return (GlideOptions) super.error(drawable);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions fallback(@Nullable Drawable drawable) {
        return (GlideOptions) super.fallback(drawable);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions optionalTransform(@NonNull Transformation<Bitmap> transformation) {
        return (GlideOptions) super.optionalTransform(transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions override(int i10, int i11) {
        return (GlideOptions) super.override(i10, i11);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions placeholder(@Nullable Drawable drawable) {
        return (GlideOptions) super.placeholder(drawable);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @SafeVarargs
    @CheckResult
    public /* bridge */ /* synthetic */ BaseRequestOptions transform(@NonNull Transformation[] transformationArr) {
        return transform((Transformation<Bitmap>[]) transformationArr);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions error(@DrawableRes int i10) {
        return (GlideOptions) super.error(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions fallback(@DrawableRes int i10) {
        return (GlideOptions) super.fallback(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public <Y> GlideOptions optionalTransform(@NonNull Class<Y> cls, @NonNull Transformation<Y> transformation) {
        return (GlideOptions) super.optionalTransform((Class) cls, (Transformation) transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions override(int i10) {
        return (GlideOptions) super.override(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions placeholder(@DrawableRes int i10) {
        return (GlideOptions) super.placeholder(i10);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public GlideOptions transform(@NonNull Transformation<Bitmap> transformation) {
        return (GlideOptions) super.transform(transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @SafeVarargs
    @CheckResult
    public final GlideOptions transform(@NonNull Transformation<Bitmap>... transformationArr) {
        return (GlideOptions) super.transform(transformationArr);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public <Y> GlideOptions transform(@NonNull Class<Y> cls, @NonNull Transformation<Y> transformation) {
        return (GlideOptions) super.transform((Class) cls, (Transformation) transformation);
    }
}
