package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
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
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.load.resource.gif.GifOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseRequestOptions<T extends BaseRequestOptions<T>> implements Cloneable {
    public boolean G0;

    @Nullable
    public Drawable I0;
    public int J0;
    public boolean N0;

    @Nullable
    public Resources.Theme O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean T0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f38756p0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public Drawable f38760t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f38761u0;

    @Nullable
    public Drawable v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f38762w0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f38757q0 = 1.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public DiskCacheStrategy f38758r0 = DiskCacheStrategy.AUTOMATIC;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NonNull
    public Priority f38759s0 = Priority.NORMAL;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f38763x0 = true;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f38764y0 = -1;
    public int E0 = -1;

    @NonNull
    public Key F0 = EmptySignature.obtain();
    public boolean H0 = true;

    @NonNull
    public Options K0 = new Options();

    @NonNull
    public CachedHashCodeArrayMap L0 = new CachedHashCodeArrayMap();

    @NonNull
    public Class<?> M0 = Object.class;
    public boolean S0 = true;

    public static boolean a(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    @NonNull
    @CheckResult
    public T apply(@NonNull BaseRequestOptions<?> baseRequestOptions) {
        if (this.P0) {
            return (T) mo4900clone().apply(baseRequestOptions);
        }
        if (a(baseRequestOptions.f38756p0, 2)) {
            this.f38757q0 = baseRequestOptions.f38757q0;
        }
        if (a(baseRequestOptions.f38756p0, 262144)) {
            this.Q0 = baseRequestOptions.Q0;
        }
        if (a(baseRequestOptions.f38756p0, 1048576)) {
            this.T0 = baseRequestOptions.T0;
        }
        if (a(baseRequestOptions.f38756p0, 4)) {
            this.f38758r0 = baseRequestOptions.f38758r0;
        }
        if (a(baseRequestOptions.f38756p0, 8)) {
            this.f38759s0 = baseRequestOptions.f38759s0;
        }
        if (a(baseRequestOptions.f38756p0, 16)) {
            this.f38760t0 = baseRequestOptions.f38760t0;
            this.f38761u0 = 0;
            this.f38756p0 &= -33;
        }
        if (a(baseRequestOptions.f38756p0, 32)) {
            this.f38761u0 = baseRequestOptions.f38761u0;
            this.f38760t0 = null;
            this.f38756p0 &= -17;
        }
        if (a(baseRequestOptions.f38756p0, 64)) {
            this.v0 = baseRequestOptions.v0;
            this.f38762w0 = 0;
            this.f38756p0 &= -129;
        }
        if (a(baseRequestOptions.f38756p0, 128)) {
            this.f38762w0 = baseRequestOptions.f38762w0;
            this.v0 = null;
            this.f38756p0 &= -65;
        }
        if (a(baseRequestOptions.f38756p0, 256)) {
            this.f38763x0 = baseRequestOptions.f38763x0;
        }
        if (a(baseRequestOptions.f38756p0, 512)) {
            this.E0 = baseRequestOptions.E0;
            this.f38764y0 = baseRequestOptions.f38764y0;
        }
        if (a(baseRequestOptions.f38756p0, 1024)) {
            this.F0 = baseRequestOptions.F0;
        }
        if (a(baseRequestOptions.f38756p0, 4096)) {
            this.M0 = baseRequestOptions.M0;
        }
        if (a(baseRequestOptions.f38756p0, 8192)) {
            this.I0 = baseRequestOptions.I0;
            this.J0 = 0;
            this.f38756p0 &= -16385;
        }
        if (a(baseRequestOptions.f38756p0, 16384)) {
            this.J0 = baseRequestOptions.J0;
            this.I0 = null;
            this.f38756p0 &= -8193;
        }
        if (a(baseRequestOptions.f38756p0, 32768)) {
            this.O0 = baseRequestOptions.O0;
        }
        if (a(baseRequestOptions.f38756p0, 65536)) {
            this.H0 = baseRequestOptions.H0;
        }
        if (a(baseRequestOptions.f38756p0, 131072)) {
            this.G0 = baseRequestOptions.G0;
        }
        if (a(baseRequestOptions.f38756p0, 2048)) {
            this.L0.putAll((Map) baseRequestOptions.L0);
            this.S0 = baseRequestOptions.S0;
        }
        if (a(baseRequestOptions.f38756p0, 524288)) {
            this.R0 = baseRequestOptions.R0;
        }
        if (!this.H0) {
            this.L0.clear();
            int i10 = this.f38756p0;
            this.G0 = false;
            this.f38756p0 = i10 & (-133121);
            this.S0 = true;
        }
        this.f38756p0 |= baseRequestOptions.f38756p0;
        this.K0.putAll(baseRequestOptions.K0);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T autoClone() {
        if (this.N0 && !this.P0) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.P0 = true;
        return (T) lock();
    }

    @NonNull
    public final BaseRequestOptions b(@NonNull DownsampleStrategy downsampleStrategy, @NonNull BitmapTransformation bitmapTransformation) {
        if (this.P0) {
            return mo4900clone().b(downsampleStrategy, bitmapTransformation);
        }
        downsample(downsampleStrategy);
        return e(bitmapTransformation, false);
    }

    public final T c(@NonNull Option<?> option) {
        if (this.P0) {
            return (T) mo4900clone().c(option);
        }
        this.K0.remove(option);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T centerCrop() {
        return (T) f(DownsampleStrategy.CENTER_OUTSIDE, new CenterCrop());
    }

    @NonNull
    @CheckResult
    public T centerInside() {
        return (T) d(DownsampleStrategy.CENTER_INSIDE, new CenterInside(), true);
    }

    @NonNull
    @CheckResult
    public T circleCrop() {
        return (T) f(DownsampleStrategy.CENTER_INSIDE, new CircleCrop());
    }

    @NonNull
    public final BaseRequestOptions d(@NonNull DownsampleStrategy downsampleStrategy, @NonNull BitmapTransformation bitmapTransformation, boolean z10) {
        BaseRequestOptions baseRequestOptionsF = z10 ? f(downsampleStrategy, bitmapTransformation) : b(downsampleStrategy, bitmapTransformation);
        baseRequestOptionsF.S0 = true;
        return baseRequestOptionsF;
    }

    @NonNull
    @CheckResult
    public T decode(@NonNull Class<?> cls) {
        if (this.P0) {
            return (T) mo4900clone().decode(cls);
        }
        this.M0 = (Class) Preconditions.checkNotNull(cls);
        this.f38756p0 |= 4096;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T disallowHardwareConfig() {
        return (T) set(Downsampler.ALLOW_HARDWARE_CONFIG, Boolean.FALSE);
    }

    @NonNull
    @CheckResult
    public T diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy) {
        if (this.P0) {
            return (T) mo4900clone().diskCacheStrategy(diskCacheStrategy);
        }
        this.f38758r0 = (DiskCacheStrategy) Preconditions.checkNotNull(diskCacheStrategy);
        this.f38756p0 |= 4;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T dontAnimate() {
        return (T) set(GifOptions.DISABLE_ANIMATION, Boolean.TRUE);
    }

    @NonNull
    @CheckResult
    public T dontTransform() {
        if (this.P0) {
            return (T) mo4900clone().dontTransform();
        }
        this.L0.clear();
        int i10 = this.f38756p0;
        this.G0 = false;
        this.H0 = false;
        this.f38756p0 = (i10 & (-133121)) | 65536;
        this.S0 = true;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T downsample(@NonNull DownsampleStrategy downsampleStrategy) {
        return (T) set(DownsampleStrategy.OPTION, Preconditions.checkNotNull(downsampleStrategy));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final T e(@NonNull Transformation<Bitmap> transformation, boolean z10) {
        if (this.P0) {
            return (T) mo4900clone().e(transformation, z10);
        }
        DrawableTransformation drawableTransformation = new DrawableTransformation(transformation, z10);
        g(Bitmap.class, transformation, z10);
        g(Drawable.class, drawableTransformation, z10);
        g(BitmapDrawable.class, drawableTransformation.asBitmapDrawable(), z10);
        g(GifDrawable.class, new GifDrawableTransformation(transformation), z10);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return (T) set(BitmapEncoder.COMPRESSION_FORMAT, Preconditions.checkNotNull(compressFormat));
    }

    @NonNull
    @CheckResult
    public T encodeQuality(@IntRange(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i10) {
        return (T) set(BitmapEncoder.COMPRESSION_QUALITY, Integer.valueOf(i10));
    }

    public boolean equals(Object obj) {
        if (obj instanceof BaseRequestOptions) {
            return isEquivalentTo((BaseRequestOptions) obj);
        }
        return false;
    }

    @NonNull
    @CheckResult
    public T error(@Nullable Drawable drawable) {
        if (this.P0) {
            return (T) mo4900clone().error(drawable);
        }
        this.f38760t0 = drawable;
        int i10 = this.f38756p0 | 16;
        this.f38761u0 = 0;
        this.f38756p0 = i10 & (-33);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public final BaseRequestOptions f(@NonNull DownsampleStrategy downsampleStrategy, @NonNull BitmapTransformation bitmapTransformation) {
        if (this.P0) {
            return mo4900clone().f(downsampleStrategy, bitmapTransformation);
        }
        downsample(downsampleStrategy);
        return transform(bitmapTransformation);
    }

    @NonNull
    @CheckResult
    public T fallback(@Nullable Drawable drawable) {
        if (this.P0) {
            return (T) mo4900clone().fallback(drawable);
        }
        this.I0 = drawable;
        int i10 = this.f38756p0 | 8192;
        this.J0 = 0;
        this.f38756p0 = i10 & (-16385);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T fitCenter() {
        return (T) d(DownsampleStrategy.FIT_CENTER, new FitCenter(), true);
    }

    @NonNull
    @CheckResult
    public T format(@NonNull DecodeFormat decodeFormat) {
        Preconditions.checkNotNull(decodeFormat);
        return (T) set(Downsampler.DECODE_FORMAT, decodeFormat).set(GifOptions.DECODE_FORMAT, decodeFormat);
    }

    @NonNull
    @CheckResult
    public T frame(@IntRange(from = 0) long j10) {
        return (T) set(VideoDecoder.TARGET_FRAME, Long.valueOf(j10));
    }

    @NonNull
    public final <Y> T g(@NonNull Class<Y> cls, @NonNull Transformation<Y> transformation, boolean z10) {
        if (this.P0) {
            return (T) mo4900clone().g(cls, transformation, z10);
        }
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(transformation);
        this.L0.put(cls, transformation);
        int i10 = this.f38756p0;
        this.H0 = true;
        this.f38756p0 = 67584 | i10;
        this.S0 = false;
        if (z10) {
            this.f38756p0 = i10 | 198656;
            this.G0 = true;
        }
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public final DiskCacheStrategy getDiskCacheStrategy() {
        return this.f38758r0;
    }

    public final int getErrorId() {
        return this.f38761u0;
    }

    @Nullable
    public final Drawable getErrorPlaceholder() {
        return this.f38760t0;
    }

    @Nullable
    public final Drawable getFallbackDrawable() {
        return this.I0;
    }

    public final int getFallbackId() {
        return this.J0;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.R0;
    }

    @NonNull
    public final Options getOptions() {
        return this.K0;
    }

    public final int getOverrideHeight() {
        return this.f38764y0;
    }

    public final int getOverrideWidth() {
        return this.E0;
    }

    @Nullable
    public final Drawable getPlaceholderDrawable() {
        return this.v0;
    }

    public final int getPlaceholderId() {
        return this.f38762w0;
    }

    @NonNull
    public final Priority getPriority() {
        return this.f38759s0;
    }

    @NonNull
    public final Class<?> getResourceClass() {
        return this.M0;
    }

    @NonNull
    public final Key getSignature() {
        return this.F0;
    }

    public final float getSizeMultiplier() {
        return this.f38757q0;
    }

    @Nullable
    public final Resources.Theme getTheme() {
        return this.O0;
    }

    @NonNull
    public final Map<Class<?>, Transformation<?>> getTransformations() {
        return this.L0;
    }

    public final boolean getUseAnimationPool() {
        return this.T0;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.Q0;
    }

    public int hashCode() {
        return Util.hashCode(this.O0, Util.hashCode(this.F0, Util.hashCode(this.M0, Util.hashCode(this.L0, Util.hashCode(this.K0, Util.hashCode(this.f38759s0, Util.hashCode(this.f38758r0, Util.hashCode(this.R0, Util.hashCode(this.Q0, Util.hashCode(this.H0, Util.hashCode(this.G0, Util.hashCode(this.E0, Util.hashCode(this.f38764y0, Util.hashCode(this.f38763x0, Util.hashCode(this.I0, Util.hashCode(this.J0, Util.hashCode(this.v0, Util.hashCode(this.f38762w0, Util.hashCode(this.f38760t0, Util.hashCode(this.f38761u0, Util.hashCode(this.f38757q0)))))))))))))))))))));
    }

    public final boolean isAutoCloneEnabled() {
        return this.P0;
    }

    public final boolean isDiskCacheStrategySet() {
        return a(this.f38756p0, 4);
    }

    public final boolean isEquivalentTo(BaseRequestOptions<?> baseRequestOptions) {
        return Float.compare(baseRequestOptions.f38757q0, this.f38757q0) == 0 && this.f38761u0 == baseRequestOptions.f38761u0 && Util.bothNullOrEqual(this.f38760t0, baseRequestOptions.f38760t0) && this.f38762w0 == baseRequestOptions.f38762w0 && Util.bothNullOrEqual(this.v0, baseRequestOptions.v0) && this.J0 == baseRequestOptions.J0 && Util.bothNullOrEqual(this.I0, baseRequestOptions.I0) && this.f38763x0 == baseRequestOptions.f38763x0 && this.f38764y0 == baseRequestOptions.f38764y0 && this.E0 == baseRequestOptions.E0 && this.G0 == baseRequestOptions.G0 && this.H0 == baseRequestOptions.H0 && this.Q0 == baseRequestOptions.Q0 && this.R0 == baseRequestOptions.R0 && this.f38758r0.equals(baseRequestOptions.f38758r0) && this.f38759s0 == baseRequestOptions.f38759s0 && this.K0.equals(baseRequestOptions.K0) && this.L0.equals(baseRequestOptions.L0) && this.M0.equals(baseRequestOptions.M0) && Util.bothNullOrEqual(this.F0, baseRequestOptions.F0) && Util.bothNullOrEqual(this.O0, baseRequestOptions.O0);
    }

    public final boolean isLocked() {
        return this.N0;
    }

    public final boolean isMemoryCacheable() {
        return this.f38763x0;
    }

    public final boolean isPrioritySet() {
        return a(this.f38756p0, 8);
    }

    public final boolean isSkipMemoryCacheSet() {
        return a(this.f38756p0, 256);
    }

    public final boolean isTransformationAllowed() {
        return this.H0;
    }

    public final boolean isTransformationRequired() {
        return this.G0;
    }

    public final boolean isTransformationSet() {
        return a(this.f38756p0, 2048);
    }

    public final boolean isValidOverride() {
        return Util.isValidDimensions(this.E0, this.f38764y0);
    }

    @NonNull
    public T lock() {
        this.N0 = true;
        return this;
    }

    @NonNull
    @CheckResult
    public T onlyRetrieveFromCache(boolean z10) {
        if (this.P0) {
            return (T) mo4900clone().onlyRetrieveFromCache(z10);
        }
        this.R0 = z10;
        this.f38756p0 |= 524288;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T optionalCenterCrop() {
        return (T) b(DownsampleStrategy.CENTER_OUTSIDE, new CenterCrop());
    }

    @NonNull
    @CheckResult
    public T optionalCenterInside() {
        return (T) d(DownsampleStrategy.CENTER_INSIDE, new CenterInside(), false);
    }

    @NonNull
    @CheckResult
    public T optionalCircleCrop() {
        return (T) b(DownsampleStrategy.CENTER_OUTSIDE, new CircleCrop());
    }

    @NonNull
    @CheckResult
    public T optionalFitCenter() {
        return (T) d(DownsampleStrategy.FIT_CENTER, new FitCenter(), false);
    }

    @NonNull
    @CheckResult
    public T optionalTransform(@NonNull Transformation<Bitmap> transformation) {
        return (T) e(transformation, false);
    }

    @NonNull
    @CheckResult
    public T override(int i10, int i11) {
        if (this.P0) {
            return (T) mo4900clone().override(i10, i11);
        }
        this.E0 = i10;
        this.f38764y0 = i11;
        this.f38756p0 |= 512;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T placeholder(@Nullable Drawable drawable) {
        if (this.P0) {
            return (T) mo4900clone().placeholder(drawable);
        }
        this.v0 = drawable;
        int i10 = this.f38756p0 | 64;
        this.f38762w0 = 0;
        this.f38756p0 = i10 & (-129);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T priority(@NonNull Priority priority) {
        if (this.P0) {
            return (T) mo4900clone().priority(priority);
        }
        this.f38759s0 = (Priority) Preconditions.checkNotNull(priority);
        this.f38756p0 |= 8;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public final T selfOrThrowIfLocked() {
        if (this.N0) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    @NonNull
    @CheckResult
    public <Y> T set(@NonNull Option<Y> option, @NonNull Y y7) {
        if (this.P0) {
            return (T) mo4900clone().set(option, y7);
        }
        Preconditions.checkNotNull(option);
        Preconditions.checkNotNull(y7);
        this.K0.set(option, y7);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T signature(@NonNull Key key) {
        if (this.P0) {
            return (T) mo4900clone().signature(key);
        }
        this.F0 = (Key) Preconditions.checkNotNull(key);
        this.f38756p0 |= 1024;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T sizeMultiplier(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        if (this.P0) {
            return (T) mo4900clone().sizeMultiplier(f6);
        }
        if (f6 < 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f38757q0 = f6;
        this.f38756p0 |= 2;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T skipMemoryCache(boolean z10) {
        if (this.P0) {
            return (T) mo4900clone().skipMemoryCache(true);
        }
        this.f38763x0 = !z10;
        this.f38756p0 |= 256;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T theme(@Nullable Resources.Theme theme) {
        if (this.P0) {
            return (T) mo4900clone().theme(theme);
        }
        this.O0 = theme;
        if (theme != null) {
            this.f38756p0 |= 32768;
            return (T) set(ResourceDrawableDecoder.THEME, theme);
        }
        this.f38756p0 &= -32769;
        return (T) c(ResourceDrawableDecoder.THEME);
    }

    @NonNull
    @CheckResult
    public T timeout(@IntRange(from = 0) int i10) {
        return (T) set(HttpGlideUrlLoader.TIMEOUT, Integer.valueOf(i10));
    }

    @NonNull
    @CheckResult
    public T transform(@NonNull Transformation<Bitmap> transformation) {
        return (T) e(transformation, true);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public T transforms(@NonNull Transformation<Bitmap>... transformationArr) {
        return (T) e(new MultiTransformation(transformationArr), true);
    }

    @NonNull
    @CheckResult
    public T useAnimationPool(boolean z10) {
        if (this.P0) {
            return (T) mo4900clone().useAnimationPool(z10);
        }
        this.T0 = z10;
        this.f38756p0 |= 1048576;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T useUnlimitedSourceGeneratorsPool(boolean z10) {
        if (this.P0) {
            return (T) mo4900clone().useUnlimitedSourceGeneratorsPool(z10);
        }
        this.Q0 = z10;
        this.f38756p0 |= 262144;
        return (T) selfOrThrowIfLocked();
    }

    @Override // 
    @CheckResult
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public T mo4900clone() {
        try {
            T t10 = (T) super.clone();
            Options options = new Options();
            t10.K0 = options;
            options.putAll(this.K0);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            t10.L0 = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll((Map) this.L0);
            t10.N0 = false;
            t10.P0 = false;
            return t10;
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    @NonNull
    @CheckResult
    public <Y> T optionalTransform(@NonNull Class<Y> cls, @NonNull Transformation<Y> transformation) {
        return (T) g(cls, transformation, false);
    }

    @NonNull
    @CheckResult
    public T transform(@NonNull Transformation<Bitmap>... transformationArr) {
        if (transformationArr.length > 1) {
            return (T) e(new MultiTransformation(transformationArr), true);
        }
        return transformationArr.length == 1 ? (T) transform(transformationArr[0]) : (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T override(int i10) {
        return (T) override(i10, i10);
    }

    @NonNull
    @CheckResult
    public <Y> T transform(@NonNull Class<Y> cls, @NonNull Transformation<Y> transformation) {
        return (T) g(cls, transformation, true);
    }

    @NonNull
    @CheckResult
    public T error(@DrawableRes int i10) {
        if (this.P0) {
            return (T) mo4900clone().error(i10);
        }
        this.f38761u0 = i10;
        int i11 = this.f38756p0 | 32;
        this.f38760t0 = null;
        this.f38756p0 = i11 & (-17);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T fallback(@DrawableRes int i10) {
        if (this.P0) {
            return (T) mo4900clone().fallback(i10);
        }
        this.J0 = i10;
        int i11 = this.f38756p0 | 16384;
        this.I0 = null;
        this.f38756p0 = i11 & (-8193);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T placeholder(@DrawableRes int i10) {
        if (this.P0) {
            return (T) mo4900clone().placeholder(i10);
        }
        this.f38762w0 = i10;
        int i11 = this.f38756p0 | 128;
        this.v0 = null;
        this.f38756p0 = i11 & (-65);
        return (T) selfOrThrowIfLocked();
    }
}
