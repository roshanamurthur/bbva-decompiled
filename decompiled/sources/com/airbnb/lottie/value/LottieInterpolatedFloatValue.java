package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes2.dex */
public class LottieInterpolatedFloatValue extends a<Float> {
    public LottieInterpolatedFloatValue(Float f6, Float f10) {
        super(f6, f10);
    }

    @Override // com.airbnb.lottie.value.a
    public final Float a(Float f6, Float f10, float f11) {
        return Float.valueOf(MiscUtils.lerp(f6.floatValue(), f10.floatValue(), f11));
    }

    @Override // com.airbnb.lottie.value.a, com.airbnb.lottie.value.LottieValueCallback
    public /* bridge */ /* synthetic */ Object getValue(LottieFrameInfo lottieFrameInfo) {
        return super.getValue(lottieFrameInfo);
    }

    public LottieInterpolatedFloatValue(Float f6, Float f10, Interpolator interpolator) {
        super(f6, f10, interpolator);
    }
}
