package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.SplitDimensionPathKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableSplitDimensionPathValue implements AnimatableValue<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatableFloatValue f25967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableFloatValue f25968b;

    public AnimatableSplitDimensionPathValue(AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2) {
        this.f25967a = animatableFloatValue;
        this.f25968b = animatableFloatValue2;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        return new SplitDimensionPathKeyframeAnimation(this.f25967a.createAnimation(), this.f25968b.createAnimation());
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List<Keyframe<PointF>> getKeyframes() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        return this.f25967a.isStatic() && this.f25968b.isStatic();
    }
}
