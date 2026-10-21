package com.airbnb.lottie.model.content;

import androidx.activity.a;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ShapeContent;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class ShapePath implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableShapeValue f26052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26053d;

    public ShapePath(String str, int i10, AnimatableShapeValue animatableShapeValue, boolean z10) {
        this.f26050a = str;
        this.f26051b = i10;
        this.f26052c = animatableShapeValue;
        this.f26053d = z10;
    }

    public String getName() {
        return this.f26050a;
    }

    public AnimatableShapeValue getShapePath() {
        return this.f26052c;
    }

    public boolean isHidden() {
        return this.f26053d;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new ShapeContent(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f26050a);
        sb2.append(", index=");
        return a.d(sb2, this.f26051b, AbstractJsonLexerKt.END_OBJ);
    }
}
