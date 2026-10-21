package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class Keyframe<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final LottieComposition f26222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26226e;

    @Nullable
    public Float endFrame;

    @Nullable
    public T endValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f26227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26228g;

    @Nullable
    public final Interpolator interpolator;
    public PointF pathCp1;
    public PointF pathCp2;
    public final float startFrame;

    @Nullable
    public final T startValue;

    @Nullable
    public final Interpolator xInterpolator;

    @Nullable
    public final Interpolator yInterpolator;

    public Keyframe(LottieComposition lottieComposition, @Nullable T t10, @Nullable T t11, @Nullable Interpolator interpolator, float f6, @Nullable Float f10) {
        this.f26223b = -3987645.8f;
        this.f26224c = -3987645.8f;
        this.f26225d = 784923401;
        this.f26226e = 784923401;
        this.f26227f = Float.MIN_VALUE;
        this.f26228g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f26222a = lottieComposition;
        this.startValue = t10;
        this.endValue = t11;
        this.interpolator = interpolator;
        this.xInterpolator = null;
        this.yInterpolator = null;
        this.startFrame = f6;
        this.endFrame = f10;
    }

    public boolean containsProgress(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        return f6 >= getStartProgress() && f6 < getEndProgress();
    }

    public Keyframe<T> copyWith(T t10, T t11) {
        return new Keyframe<>(t10, t11);
    }

    public float getEndProgress() {
        LottieComposition lottieComposition = this.f26222a;
        if (lottieComposition == null) {
            return 1.0f;
        }
        if (this.f26228g == Float.MIN_VALUE) {
            if (this.endFrame == null) {
                this.f26228g = 1.0f;
            } else {
                this.f26228g = ((this.endFrame.floatValue() - this.startFrame) / lottieComposition.getDurationFrames()) + getStartProgress();
            }
        }
        return this.f26228g;
    }

    public float getEndValueFloat() {
        if (this.f26224c == -3987645.8f) {
            this.f26224c = ((Float) this.endValue).floatValue();
        }
        return this.f26224c;
    }

    public int getEndValueInt() {
        if (this.f26226e == 784923401) {
            this.f26226e = ((Integer) this.endValue).intValue();
        }
        return this.f26226e;
    }

    public float getStartProgress() {
        LottieComposition lottieComposition = this.f26222a;
        if (lottieComposition == null) {
            return 0.0f;
        }
        if (this.f26227f == Float.MIN_VALUE) {
            this.f26227f = (this.startFrame - lottieComposition.getStartFrame()) / lottieComposition.getDurationFrames();
        }
        return this.f26227f;
    }

    public float getStartValueFloat() {
        if (this.f26223b == -3987645.8f) {
            this.f26223b = ((Float) this.startValue).floatValue();
        }
        return this.f26223b;
    }

    public int getStartValueInt() {
        if (this.f26225d == 784923401) {
            this.f26225d = ((Integer) this.startValue).intValue();
        }
        return this.f26225d;
    }

    public boolean isStatic() {
        return this.interpolator == null && this.xInterpolator == null && this.yInterpolator == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.startValue + ", endValue=" + this.endValue + ", startFrame=" + this.startFrame + ", endFrame=" + this.endFrame + ", interpolator=" + this.interpolator + AbstractJsonLexerKt.END_OBJ;
    }

    public Keyframe(LottieComposition lottieComposition, @Nullable T t10, @Nullable T t11, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f6, @Nullable Float f10) {
        this.f26223b = -3987645.8f;
        this.f26224c = -3987645.8f;
        this.f26225d = 784923401;
        this.f26226e = 784923401;
        this.f26227f = Float.MIN_VALUE;
        this.f26228g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f26222a = lottieComposition;
        this.startValue = t10;
        this.endValue = t11;
        this.interpolator = null;
        this.xInterpolator = interpolator;
        this.yInterpolator = interpolator2;
        this.startFrame = f6;
        this.endFrame = f10;
    }

    public Keyframe(LottieComposition lottieComposition, @Nullable T t10, @Nullable T t11, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f6, @Nullable Float f10) {
        this.f26223b = -3987645.8f;
        this.f26224c = -3987645.8f;
        this.f26225d = 784923401;
        this.f26226e = 784923401;
        this.f26227f = Float.MIN_VALUE;
        this.f26228g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f26222a = lottieComposition;
        this.startValue = t10;
        this.endValue = t11;
        this.interpolator = interpolator;
        this.xInterpolator = interpolator2;
        this.yInterpolator = interpolator3;
        this.startFrame = f6;
        this.endFrame = f10;
    }

    public Keyframe(T t10) {
        this.f26223b = -3987645.8f;
        this.f26224c = -3987645.8f;
        this.f26225d = 784923401;
        this.f26226e = 784923401;
        this.f26227f = Float.MIN_VALUE;
        this.f26228g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f26222a = null;
        this.startValue = t10;
        this.endValue = t10;
        this.interpolator = null;
        this.xInterpolator = null;
        this.yInterpolator = null;
        this.startFrame = Float.MIN_VALUE;
        this.endFrame = Float.valueOf(Float.MAX_VALUE);
    }

    public Keyframe(T t10, T t11) {
        this.f26223b = -3987645.8f;
        this.f26224c = -3987645.8f;
        this.f26225d = 784923401;
        this.f26226e = 784923401;
        this.f26227f = Float.MIN_VALUE;
        this.f26228g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f26222a = null;
        this.startValue = t10;
        this.endValue = t11;
        this.interpolator = null;
        this.xInterpolator = null;
        this.yInterpolator = null;
        this.startFrame = Float.MIN_VALUE;
        this.endFrame = Float.valueOf(Float.MAX_VALUE);
    }
}
