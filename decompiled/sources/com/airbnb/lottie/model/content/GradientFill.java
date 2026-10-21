package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GradientFillContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class GradientFill implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GradientType f25987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f25988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableGradientColorValue f25989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AnimatableIntegerValue f25990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatablePointValue f25991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AnimatablePointValue f25992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25994h;

    public GradientFill(String str, GradientType gradientType, Path.FillType fillType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, boolean z10) {
        this.f25987a = gradientType;
        this.f25988b = fillType;
        this.f25989c = animatableGradientColorValue;
        this.f25990d = animatableIntegerValue;
        this.f25991e = animatablePointValue;
        this.f25992f = animatablePointValue2;
        this.f25993g = str;
        this.f25994h = z10;
    }

    public AnimatablePointValue getEndPoint() {
        return this.f25992f;
    }

    public Path.FillType getFillType() {
        return this.f25988b;
    }

    public AnimatableGradientColorValue getGradientColor() {
        return this.f25989c;
    }

    public GradientType getGradientType() {
        return this.f25987a;
    }

    public String getName() {
        return this.f25993g;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.f25990d;
    }

    public AnimatablePointValue getStartPoint() {
        return this.f25991e;
    }

    public boolean isHidden() {
        return this.f25994h;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new GradientFillContent(lottieDrawable, lottieComposition, baseLayer, this);
    }
}
