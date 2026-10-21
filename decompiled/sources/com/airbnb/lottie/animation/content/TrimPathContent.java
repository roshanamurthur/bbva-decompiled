package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TrimPathContent implements Content, BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f25820c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ShapeTrimPath.Type f25821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FloatKeyframeAnimation f25822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FloatKeyframeAnimation f25823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FloatKeyframeAnimation f25824g;

    public TrimPathContent(BaseLayer baseLayer, ShapeTrimPath shapeTrimPath) {
        this.f25818a = shapeTrimPath.getName();
        this.f25819b = shapeTrimPath.isHidden();
        this.f25821d = shapeTrimPath.getType();
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = shapeTrimPath.getStart().createAnimation();
        this.f25822e = floatKeyframeAnimationCreateAnimation;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation2 = shapeTrimPath.getEnd().createAnimation();
        this.f25823f = floatKeyframeAnimationCreateAnimation2;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation3 = shapeTrimPath.getOffset().createAnimation();
        this.f25824g = floatKeyframeAnimationCreateAnimation3;
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation3);
        floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation3.addUpdateListener(this);
    }

    public final void a(BaseKeyframeAnimation.AnimationListener animationListener) {
        this.f25820c.add(animationListener);
    }

    public BaseKeyframeAnimation<?, Float> getEnd() {
        return this.f25823f;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25818a;
    }

    public BaseKeyframeAnimation<?, Float> getOffset() {
        return this.f25824g;
    }

    public BaseKeyframeAnimation<?, Float> getStart() {
        return this.f25822e;
    }

    public boolean isHidden() {
        return this.f25819b;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f25820c;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((BaseKeyframeAnimation.AnimationListener) arrayList.get(i10)).onValueChanged();
            i10++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }
}
