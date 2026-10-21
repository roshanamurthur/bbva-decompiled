package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.PolystarContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class PolystarShape implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f26016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableFloatValue f26017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AnimatableValue<PointF, PointF> f26018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatableFloatValue f26019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AnimatableFloatValue f26020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnimatableFloatValue f26021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnimatableFloatValue f26022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AnimatableFloatValue f26023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f26024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f26025k;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i10) {
            this.value = i10;
        }

        public static Type forValue(int i10) {
            for (Type type : values()) {
                if (type.value == i10) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableValue<PointF, PointF> animatableValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5, AnimatableFloatValue animatableFloatValue6, boolean z10, boolean z11) {
        this.f26015a = str;
        this.f26016b = type;
        this.f26017c = animatableFloatValue;
        this.f26018d = animatableValue;
        this.f26019e = animatableFloatValue2;
        this.f26020f = animatableFloatValue3;
        this.f26021g = animatableFloatValue4;
        this.f26022h = animatableFloatValue5;
        this.f26023i = animatableFloatValue6;
        this.f26024j = z10;
        this.f26025k = z11;
    }

    public AnimatableFloatValue getInnerRadius() {
        return this.f26020f;
    }

    public AnimatableFloatValue getInnerRoundedness() {
        return this.f26022h;
    }

    public String getName() {
        return this.f26015a;
    }

    public AnimatableFloatValue getOuterRadius() {
        return this.f26021g;
    }

    public AnimatableFloatValue getOuterRoundedness() {
        return this.f26023i;
    }

    public AnimatableFloatValue getPoints() {
        return this.f26017c;
    }

    public AnimatableValue<PointF, PointF> getPosition() {
        return this.f26018d;
    }

    public AnimatableFloatValue getRotation() {
        return this.f26019e;
    }

    public Type getType() {
        return this.f26016b;
    }

    public boolean isHidden() {
        return this.f26024j;
    }

    public boolean isReversed() {
        return this.f26025k;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new PolystarContent(lottieDrawable, baseLayer, this);
    }
}
