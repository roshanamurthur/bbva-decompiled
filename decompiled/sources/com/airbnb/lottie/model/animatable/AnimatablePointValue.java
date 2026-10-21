package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import x3.a;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatablePointValue extends a<PointF, PointF> {
    public AnimatablePointValue(List<Keyframe<PointF>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        return new PointKeyframeAnimation(this.f94482a);
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
