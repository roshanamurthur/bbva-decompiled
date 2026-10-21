package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes2.dex */
public class LottieInterpolatedIntegerValue extends a<Integer> {
    public LottieInterpolatedIntegerValue(Integer num, Integer num2) {
        super(num, num2);
    }

    @Override // com.airbnb.lottie.value.a
    public final Integer a(Integer num, Integer num2, float f6) {
        return Integer.valueOf(MiscUtils.lerp(num.intValue(), num2.intValue(), f6));
    }

    @Override // com.airbnb.lottie.value.a, com.airbnb.lottie.value.LottieValueCallback
    public /* bridge */ /* synthetic */ Object getValue(LottieFrameInfo lottieFrameInfo) {
        return super.getValue(lottieFrameInfo);
    }

    public LottieInterpolatedIntegerValue(Integer num, Integer num2, Interpolator interpolator) {
        super(num, num2, interpolator);
    }
}
