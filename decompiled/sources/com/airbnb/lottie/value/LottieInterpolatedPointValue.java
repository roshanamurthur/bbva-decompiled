package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes2.dex */
public class LottieInterpolatedPointValue extends a<PointF> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PointF f26236f;

    public LottieInterpolatedPointValue(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
        this.f26236f = new PointF();
    }

    @Override // com.airbnb.lottie.value.a
    public final PointF a(PointF pointF, PointF pointF2, float f6) {
        PointF pointF3 = pointF;
        PointF pointF4 = pointF2;
        float fLerp = MiscUtils.lerp(pointF3.x, pointF4.x, f6);
        float fLerp2 = MiscUtils.lerp(pointF3.y, pointF4.y, f6);
        PointF pointF5 = this.f26236f;
        pointF5.set(fLerp, fLerp2);
        return pointF5;
    }

    @Override // com.airbnb.lottie.value.a, com.airbnb.lottie.value.LottieValueCallback
    public /* bridge */ /* synthetic */ Object getValue(LottieFrameInfo lottieFrameInfo) {
        return super.getValue(lottieFrameInfo);
    }

    public LottieInterpolatedPointValue(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.f26236f = new PointF();
    }
}
