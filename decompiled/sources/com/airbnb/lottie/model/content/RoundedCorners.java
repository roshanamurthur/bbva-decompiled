package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RoundedCornersContent;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class RoundedCorners implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableValue<Float, Float> f26037b;

    public RoundedCorners(String str, AnimatableValue<Float, Float> animatableValue) {
        this.f26036a = str;
        this.f26037b = animatableValue;
    }

    public AnimatableValue<Float, Float> getCornerRadius() {
        return this.f26037b;
    }

    public String getName() {
        return this.f26036a;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new RoundedCornersContent(lottieDrawable, baseLayer, this);
    }
}
