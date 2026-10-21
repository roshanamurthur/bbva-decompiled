package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableTransform implements ModifierContent, ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final AnimatablePathValue f25969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final AnimatableValue<PointF, PointF> f25970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final AnimatableScaleValue f25971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final AnimatableFloatValue f25972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final AnimatableIntegerValue f25973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final AnimatableFloatValue f25974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final AnimatableFloatValue f25975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final AnimatableFloatValue f25976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final AnimatableFloatValue f25977i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25978j;

    public AnimatableTransform() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public TransformKeyframeAnimation createAnimation() {
        return new TransformKeyframeAnimation(this);
    }

    @Nullable
    public AnimatablePathValue getAnchorPoint() {
        return this.f25969a;
    }

    @Nullable
    public AnimatableFloatValue getEndOpacity() {
        return this.f25977i;
    }

    @Nullable
    public AnimatableIntegerValue getOpacity() {
        return this.f25973e;
    }

    @Nullable
    public AnimatableValue<PointF, PointF> getPosition() {
        return this.f25970b;
    }

    @Nullable
    public AnimatableFloatValue getRotation() {
        return this.f25972d;
    }

    @Nullable
    public AnimatableScaleValue getScale() {
        return this.f25971c;
    }

    @Nullable
    public AnimatableFloatValue getSkew() {
        return this.f25974f;
    }

    @Nullable
    public AnimatableFloatValue getSkewAngle() {
        return this.f25975g;
    }

    @Nullable
    public AnimatableFloatValue getStartOpacity() {
        return this.f25976h;
    }

    public boolean isAutoOrient() {
        return this.f25978j;
    }

    public void setAutoOrient(boolean z10) {
        this.f25978j = z10;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return null;
    }

    public AnimatableTransform(@Nullable AnimatablePathValue animatablePathValue, @Nullable AnimatableValue<PointF, PointF> animatableValue, @Nullable AnimatableScaleValue animatableScaleValue, @Nullable AnimatableFloatValue animatableFloatValue, @Nullable AnimatableIntegerValue animatableIntegerValue, @Nullable AnimatableFloatValue animatableFloatValue2, @Nullable AnimatableFloatValue animatableFloatValue3, @Nullable AnimatableFloatValue animatableFloatValue4, @Nullable AnimatableFloatValue animatableFloatValue5) {
        this.f25978j = false;
        this.f25969a = animatablePathValue;
        this.f25970b = animatableValue;
        this.f25971c = animatableScaleValue;
        this.f25972d = animatableFloatValue;
        this.f25973e = animatableIntegerValue;
        this.f25976h = animatableFloatValue2;
        this.f25977i = animatableFloatValue3;
        this.f25974f = animatableFloatValue4;
        this.f25975g = animatableFloatValue5;
    }
}
