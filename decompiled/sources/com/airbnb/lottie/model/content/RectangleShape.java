package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RectangleContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class RectangleShape implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableValue<PointF, PointF> f26027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableValue<PointF, PointF> f26028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AnimatableFloatValue f26029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26030e;

    public RectangleShape(String str, AnimatableValue<PointF, PointF> animatableValue, AnimatableValue<PointF, PointF> animatableValue2, AnimatableFloatValue animatableFloatValue, boolean z10) {
        this.f26026a = str;
        this.f26027b = animatableValue;
        this.f26028c = animatableValue2;
        this.f26029d = animatableFloatValue;
        this.f26030e = z10;
    }

    public AnimatableFloatValue getCornerRadius() {
        return this.f26029d;
    }

    public String getName() {
        return this.f26026a;
    }

    public AnimatableValue<PointF, PointF> getPosition() {
        return this.f26027b;
    }

    public AnimatableValue<PointF, PointF> getSize() {
        return this.f26028c;
    }

    public boolean isHidden() {
        return this.f26030e;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new RectangleContent(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.f26027b + ", size=" + this.f26028c + AbstractJsonLexerKt.END_OBJ;
    }
}
