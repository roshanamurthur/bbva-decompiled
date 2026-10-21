package com.airbnb.lottie.model.animatable;

import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import x3.a;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableShapeValue extends a<ShapeData, Path> {
    public AnimatableShapeValue(List<Keyframe<ShapeData>> list) {
        super(list);
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

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public ShapeKeyframeAnimation createAnimation() {
        return new ShapeKeyframeAnimation(this.f94482a);
    }
}
