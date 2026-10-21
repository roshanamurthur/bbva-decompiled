package com.airbnb.lottie.value;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes2.dex */
public class LottieRelativePointValueCallback extends LottieValueCallback<PointF> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f26237c;

    public LottieRelativePointValueCallback() {
        this.f26237c = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PointF getOffset(LottieFrameInfo<PointF> lottieFrameInfo) {
        T t10 = this.value;
        if (t10 != 0) {
            return (PointF) t10;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public final PointF getValue(LottieFrameInfo<PointF> lottieFrameInfo) {
        PointF pointF = this.f26237c;
        pointF.set(MiscUtils.lerp(lottieFrameInfo.getStartValue().x, lottieFrameInfo.getEndValue().x, lottieFrameInfo.getInterpolatedKeyframeProgress()), MiscUtils.lerp(lottieFrameInfo.getStartValue().y, lottieFrameInfo.getEndValue().y, lottieFrameInfo.getInterpolatedKeyframeProgress()));
        PointF offset = getOffset(lottieFrameInfo);
        pointF.offset(offset.x, offset.y);
        return pointF;
    }

    public LottieRelativePointValueCallback(@NonNull PointF pointF) {
        super(pointF);
        this.f26237c = new PointF();
    }
}
