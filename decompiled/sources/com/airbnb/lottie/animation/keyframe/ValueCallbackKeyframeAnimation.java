package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.Nullable;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class ValueCallbackKeyframeAnimation<K, A> extends BaseKeyframeAnimation<K, A> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A f25889g;

    public ValueCallbackKeyframeAnimation(LottieValueCallback<A> lottieValueCallback) {
        this(lottieValueCallback, null);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final float a() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public A getValue() {
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        A a10 = this.f25889g;
        return lottieValueCallback.getValueInternal(0.0f, 0.0f, a10, a10, getProgress(), getProgress(), getProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void notifyListeners() {
        if (this.valueCallback != null) {
            super.notifyListeners();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void setProgress(float f6) {
        this.progress = f6;
    }

    public ValueCallbackKeyframeAnimation(LottieValueCallback<A> lottieValueCallback, @Nullable A a10) {
        super(Collections.emptyList());
        setValueCallback(lottieValueCallback);
        this.f25889g = a10;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final A getValue(Keyframe<K> keyframe, float f6) {
        return getValue();
    }
}
