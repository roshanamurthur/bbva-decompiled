package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.Arrays;
import java.util.List;
import x3.a;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableGradientColorValue extends a<GradientColor, GradientColor> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatableGradientColorValue(List<Keyframe<GradientColor>> list) {
        super(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            Keyframe<GradientColor> keyframeCopyWith = list.get(i10);
            GradientColor gradientColor = keyframeCopyWith.startValue;
            GradientColor gradientColor2 = keyframeCopyWith.endValue;
            if (gradientColor != null && gradientColor2 != null && gradientColor.getPositions().length != gradientColor2.getPositions().length) {
                float[] positions = gradientColor.getPositions();
                float[] positions2 = gradientColor2.getPositions();
                int length = positions.length + positions2.length;
                float[] fArr = new float[length];
                System.arraycopy(positions, 0, fArr, 0, positions.length);
                System.arraycopy(positions2, 0, fArr, positions.length, positions2.length);
                Arrays.sort(fArr);
                float f6 = Float.NaN;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    float f10 = fArr[i12];
                    if (f10 != f6) {
                        fArr[i11] = f10;
                        i11++;
                        f6 = fArr[i12];
                    }
                }
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, i11);
                keyframeCopyWith = keyframeCopyWith.copyWith(gradientColor.copyWithPositions(fArrCopyOfRange), gradientColor2.copyWithPositions(fArrCopyOfRange));
            }
            list.set(i10, keyframeCopyWith);
        }
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
        return new GradientColorKeyframeAnimation(this.f94482a);
    }

    @Override // x3.a, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ List getKeyframes() {
        return super.getKeyframes();
    }

    @Override // x3.a, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // x3.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
