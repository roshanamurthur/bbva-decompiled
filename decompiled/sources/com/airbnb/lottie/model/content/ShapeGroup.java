package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeGroup implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ContentModel> f26048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26049c;

    public ShapeGroup(String str, List<ContentModel> list, boolean z10) {
        this.f26047a = str;
        this.f26048b = list;
        this.f26049c = z10;
    }

    public List<ContentModel> getItems() {
        return this.f26048b;
    }

    public String getName() {
        return this.f26047a;
    }

    public boolean isHidden() {
        return this.f26049c;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new ContentGroup(lottieDrawable, baseLayer, this, lottieComposition);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f26047a + "' Shapes: " + Arrays.toString(this.f26048b.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
