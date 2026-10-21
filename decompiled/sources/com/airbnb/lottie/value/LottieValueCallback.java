package com.airbnb.lottie.value;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;

/* JADX INFO: loaded from: classes2.dex */
public class LottieValueCallback<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieFrameInfo<T> f26238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public BaseKeyframeAnimation<?, ?> f26239b;

    @Nullable
    protected T value;

    public LottieValueCallback() {
        this.f26238a = new LottieFrameInfo<>();
        this.value = null;
    }

    @Nullable
    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return this.value;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T getValueInternal(float f6, float f10, T t10, T t11, float f11, float f12, float f13) {
        return getValue(this.f26238a.set(f6, f10, t10, t11, f11, f12, f13));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setAnimation(@Nullable BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.f26239b = baseKeyframeAnimation;
    }

    public final void setValue(@Nullable T t10) {
        this.value = t10;
        BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.f26239b;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.notifyListeners();
        }
    }

    public LottieValueCallback(@Nullable T t10) {
        this.f26238a = new LottieFrameInfo<>();
        this.value = t10;
    }
}
