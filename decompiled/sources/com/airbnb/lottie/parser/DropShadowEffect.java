package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;

/* JADX INFO: loaded from: classes2.dex */
public class DropShadowEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatableColorValue f26149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableFloatValue f26150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableFloatValue f26151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AnimatableFloatValue f26152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatableFloatValue f26153e;

    public DropShadowEffect(AnimatableColorValue animatableColorValue, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4) {
        this.f26149a = animatableColorValue;
        this.f26150b = animatableFloatValue;
        this.f26151c = animatableFloatValue2;
        this.f26152d = animatableFloatValue3;
        this.f26153e = animatableFloatValue4;
    }

    public AnimatableColorValue getColor() {
        return this.f26149a;
    }

    public AnimatableFloatValue getDirection() {
        return this.f26151c;
    }

    public AnimatableFloatValue getDistance() {
        return this.f26152d;
    }

    public AnimatableFloatValue getOpacity() {
        return this.f26150b;
    }

    public AnimatableFloatValue getRadius() {
        return this.f26153e;
    }
}
