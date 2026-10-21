package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.EllipseContent;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class CircleShape implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableValue<PointF, PointF> f25981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatablePointValue f25982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25984e;

    public CircleShape(String str, AnimatableValue<PointF, PointF> animatableValue, AnimatablePointValue animatablePointValue, boolean z10, boolean z11) {
        this.f25980a = str;
        this.f25981b = animatableValue;
        this.f25982c = animatablePointValue;
        this.f25983d = z10;
        this.f25984e = z11;
    }

    public String getName() {
        return this.f25980a;
    }

    public AnimatableValue<PointF, PointF> getPosition() {
        return this.f25981b;
    }

    public AnimatablePointValue getSize() {
        return this.f25982c;
    }

    public boolean isHidden() {
        return this.f25984e;
    }

    public boolean isReversed() {
        return this.f25983d;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new EllipseContent(lottieDrawable, baseLayer, this);
    }
}
