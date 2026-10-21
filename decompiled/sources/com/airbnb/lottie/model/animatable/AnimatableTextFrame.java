package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import x3.a;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableTextFrame extends a<DocumentData, DocumentData> {
    public AnimatableTextFrame(List<Keyframe<DocumentData>> list) {
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
    public TextKeyframeAnimation createAnimation() {
        return new TextKeyframeAnimation(this.f94482a);
    }
}
