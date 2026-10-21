package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class GradientColorKeyframeAnimation extends a<GradientColor> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GradientColor f25850g;

    public GradientColorKeyframeAnimation(List<Keyframe<GradientColor>> list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            GradientColor gradientColor = list.get(i10).startValue;
            if (gradientColor != null) {
                iMax = Math.max(iMax, gradientColor.getSize());
            }
        }
        this.f25850g = new GradientColor(new float[iMax], new int[iMax]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object getValue(Keyframe keyframe, float f6) {
        GradientColor gradientColor = (GradientColor) keyframe.startValue;
        GradientColor gradientColor2 = (GradientColor) keyframe.endValue;
        GradientColor gradientColor3 = this.f25850g;
        gradientColor3.lerp(gradientColor, gradientColor2, f6);
        return gradientColor3;
    }
}
