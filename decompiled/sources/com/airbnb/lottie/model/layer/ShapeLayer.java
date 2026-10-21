package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.parser.DropShadowEffect;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeLayer extends BaseLayer {
    public final ContentGroup D;
    public final CompositionLayer E;

    public ShapeLayer(LottieComposition lottieComposition, LottieDrawable lottieDrawable, CompositionLayer compositionLayer, Layer layer) {
        super(lottieDrawable, layer);
        this.E = compositionLayer;
        ContentGroup contentGroup = new ContentGroup(lottieDrawable, this, new ShapeGroup("__container", layer.f26100a, false), lottieComposition);
        this.D = contentGroup;
        contentGroup.setContents(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void drawLayer(@NonNull Canvas canvas, Matrix matrix, int i10) {
        this.D.draw(canvas, matrix, i10);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    @Nullable
    public BlurEffect getBlurEffect() {
        BlurEffect blurEffect = super.getBlurEffect();
        return blurEffect != null ? blurEffect : this.E.getBlurEffect();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        super.getBounds(rectF, matrix, z10);
        this.D.getBounds(rectF, this.f26085o, z10);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    @Nullable
    public DropShadowEffect getDropShadowEffect() {
        DropShadowEffect dropShadowEffect = super.getDropShadowEffect();
        return dropShadowEffect != null ? dropShadowEffect : this.E.getDropShadowEffect();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void resolveChildKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2) {
        this.D.resolveKeyPath(keyPath, i10, list, keyPath2);
    }
}
