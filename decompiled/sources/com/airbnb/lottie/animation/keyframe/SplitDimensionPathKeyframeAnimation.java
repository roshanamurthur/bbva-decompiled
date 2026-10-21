package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class SplitDimensionPathKeyframeAnimation extends BaseKeyframeAnimation<PointF, PointF> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PointF f25868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PointF f25869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final BaseKeyframeAnimation<Float, Float> f25870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BaseKeyframeAnimation<Float, Float> f25871j;

    @Nullable
    protected LottieValueCallback<Float> xValueCallback;

    @Nullable
    protected LottieValueCallback<Float> yValueCallback;

    public SplitDimensionPathKeyframeAnimation(BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation, BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2) {
        super(Collections.emptyList());
        this.f25868g = new PointF();
        this.f25869h = new PointF();
        this.f25870i = baseKeyframeAnimation;
        this.f25871j = baseKeyframeAnimation2;
        setProgress(getProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void setProgress(float f6) {
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.f25870i;
        baseKeyframeAnimation.setProgress(f6);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.f25871j;
        baseKeyframeAnimation2.setProgress(f6);
        this.f25868g.set(baseKeyframeAnimation.getValue().floatValue(), baseKeyframeAnimation2.getValue().floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f25825a;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((BaseKeyframeAnimation.AnimationListener) arrayList.get(i10)).onValueChanged();
            i10++;
        }
    }

    public void setXValueCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        LottieValueCallback<Float> lottieValueCallback2 = this.xValueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.xValueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    public void setYValueCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        LottieValueCallback<Float> lottieValueCallback2 = this.yValueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.yValueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue() {
        return getValue((Keyframe<PointF>) null, 0.0f);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final PointF getValue(Keyframe<PointF> keyframe, float f6) {
        Float valueInternal;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation;
        Keyframe<Float> currentKeyframe;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2;
        Keyframe<Float> currentKeyframe2;
        Float valueInternal2 = null;
        if (this.xValueCallback == null || (currentKeyframe2 = (baseKeyframeAnimation2 = this.f25870i).getCurrentKeyframe()) == null) {
            valueInternal = null;
        } else {
            Float f10 = currentKeyframe2.endFrame;
            LottieValueCallback<Float> lottieValueCallback = this.xValueCallback;
            float f11 = currentKeyframe2.startFrame;
            valueInternal = lottieValueCallback.getValueInternal(f11, f10 == null ? f11 : f10.floatValue(), currentKeyframe2.startValue, currentKeyframe2.endValue, baseKeyframeAnimation2.getInterpolatedCurrentKeyframeProgress(), baseKeyframeAnimation2.b(), baseKeyframeAnimation2.getProgress());
        }
        if (this.yValueCallback != null && (currentKeyframe = (baseKeyframeAnimation = this.f25871j).getCurrentKeyframe()) != null) {
            Float f12 = currentKeyframe.endFrame;
            LottieValueCallback<Float> lottieValueCallback2 = this.yValueCallback;
            float f13 = currentKeyframe.startFrame;
            valueInternal2 = lottieValueCallback2.getValueInternal(f13, f12 == null ? f13 : f12.floatValue(), currentKeyframe.startValue, currentKeyframe.endValue, baseKeyframeAnimation.getInterpolatedCurrentKeyframeProgress(), baseKeyframeAnimation.b(), baseKeyframeAnimation.getProgress());
        }
        PointF pointF = this.f25868g;
        PointF pointF2 = this.f25869h;
        if (valueInternal == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(valueInternal.floatValue(), 0.0f);
        }
        if (valueInternal2 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, valueInternal2.floatValue());
        }
        return pointF2;
    }
}
