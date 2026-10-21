package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GradientStrokeContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class GradientStroke implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GradientType f25996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableGradientColorValue f25997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AnimatableIntegerValue f25998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatablePointValue f25999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AnimatablePointValue f26000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnimatableFloatValue f26001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShapeStroke.LineCapType f26002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ShapeStroke.LineJoinType f26003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f26004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<AnimatableFloatValue> f26005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final AnimatableFloatValue f26006l;
    public final boolean m;

    public GradientStroke(String str, GradientType gradientType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f6, List<AnimatableFloatValue> list, @Nullable AnimatableFloatValue animatableFloatValue2, boolean z10) {
        this.f25995a = str;
        this.f25996b = gradientType;
        this.f25997c = animatableGradientColorValue;
        this.f25998d = animatableIntegerValue;
        this.f25999e = animatablePointValue;
        this.f26000f = animatablePointValue2;
        this.f26001g = animatableFloatValue;
        this.f26002h = lineCapType;
        this.f26003i = lineJoinType;
        this.f26004j = f6;
        this.f26005k = list;
        this.f26006l = animatableFloatValue2;
        this.m = z10;
    }

    public ShapeStroke.LineCapType getCapType() {
        return this.f26002h;
    }

    @Nullable
    public AnimatableFloatValue getDashOffset() {
        return this.f26006l;
    }

    public AnimatablePointValue getEndPoint() {
        return this.f26000f;
    }

    public AnimatableGradientColorValue getGradientColor() {
        return this.f25997c;
    }

    public GradientType getGradientType() {
        return this.f25996b;
    }

    public ShapeStroke.LineJoinType getJoinType() {
        return this.f26003i;
    }

    public List<AnimatableFloatValue> getLineDashPattern() {
        return this.f26005k;
    }

    public float getMiterLimit() {
        return this.f26004j;
    }

    public String getName() {
        return this.f25995a;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.f25998d;
    }

    public AnimatablePointValue getStartPoint() {
        return this.f25999e;
    }

    public AnimatableFloatValue getWidth() {
        return this.f26001g;
    }

    public boolean isHidden() {
        return this.m;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new GradientStrokeContent(lottieDrawable, baseLayer, this);
    }
}
