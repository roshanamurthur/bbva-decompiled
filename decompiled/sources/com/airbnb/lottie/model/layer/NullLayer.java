package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public class NullLayer extends BaseLayer {
    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        super.getBounds(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void drawLayer(Canvas canvas, Matrix matrix, int i10) {
    }
}
