package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PathKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatablePathValue implements AnimatableValue<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Keyframe<PointF>> f25966a;

    public AnimatablePathValue(List<Keyframe<PointF>> list) {
        this.f25966a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        List<Keyframe<PointF>> list = this.f25966a;
        return list.get(0).isStatic() ? new PointKeyframeAnimation(list) : new PathKeyframeAnimation(list);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List<Keyframe<PointF>> getKeyframes() {
        return this.f25966a;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        List<Keyframe<PointF>> list = this.f25966a;
        return list.size() == 1 && list.get(0).isStatic();
    }
}
