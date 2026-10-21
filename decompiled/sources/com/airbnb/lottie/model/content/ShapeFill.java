package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.FillContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeFill implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f26042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final AnimatableColorValue f26044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final AnimatableIntegerValue f26045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26046f;

    public ShapeFill(String str, boolean z10, Path.FillType fillType, @Nullable AnimatableColorValue animatableColorValue, @Nullable AnimatableIntegerValue animatableIntegerValue, boolean z11) {
        this.f26043c = str;
        this.f26041a = z10;
        this.f26042b = fillType;
        this.f26044d = animatableColorValue;
        this.f26045e = animatableIntegerValue;
        this.f26046f = z11;
    }

    @Nullable
    public AnimatableColorValue getColor() {
        return this.f26044d;
    }

    public Path.FillType getFillType() {
        return this.f26042b;
    }

    public String getName() {
        return this.f26043c;
    }

    @Nullable
    public AnimatableIntegerValue getOpacity() {
        return this.f26045e;
    }

    public boolean isHidden() {
        return this.f26046f;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new FillContent(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        return a.d(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f26041a, AbstractJsonLexerKt.END_OBJ);
    }
}
