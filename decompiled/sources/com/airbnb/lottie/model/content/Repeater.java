package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RepeaterContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class Repeater implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableFloatValue f26032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableFloatValue f26033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AnimatableTransform f26034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26035e;

    public Repeater(String str, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableTransform animatableTransform, boolean z10) {
        this.f26031a = str;
        this.f26032b = animatableFloatValue;
        this.f26033c = animatableFloatValue2;
        this.f26034d = animatableTransform;
        this.f26035e = z10;
    }

    public AnimatableFloatValue getCopies() {
        return this.f26032b;
    }

    public String getName() {
        return this.f26031a;
    }

    public AnimatableFloatValue getOffset() {
        return this.f26033c;
    }

    public AnimatableTransform getTransform() {
        return this.f26034d;
    }

    public boolean isHidden() {
        return this.f26035e;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new RepeaterContent(lottieDrawable, baseLayer, this);
    }
}
