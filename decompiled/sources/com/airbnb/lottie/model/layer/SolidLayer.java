package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes2.dex */
public class SolidLayer extends BaseLayer {
    public final RectF D;
    public final LPaint E;
    public final float[] F;
    public final Path G;
    public final Layer H;

    @Nullable
    public ValueCallbackKeyframeAnimation I;

    @Nullable
    public ValueCallbackKeyframeAnimation J;

    public SolidLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.D = new RectF();
        LPaint lPaint = new LPaint();
        this.E = lPaint;
        this.F = new float[8];
        this.G = new Path();
        this.H = layer;
        lPaint.setAlpha(0);
        lPaint.setStyle(Paint.Style.FILL);
        lPaint.setColor(layer.f26111l);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t10, lottieValueCallback);
        if (t10 == LottieProperty.COLOR_FILTER) {
            if (lottieValueCallback == null) {
                this.I = null;
                return;
            } else {
                this.I = new ValueCallbackKeyframeAnimation(lottieValueCallback);
                return;
            }
        }
        if (t10 == LottieProperty.COLOR) {
            if (lottieValueCallback != null) {
                this.J = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            } else {
                this.J = null;
                this.E.setColor(this.H.f26111l);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i10) {
        Layer layer = this.H;
        int iAlpha = Color.alpha(layer.f26111l);
        if (iAlpha == 0) {
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.J;
        Integer num = valueCallbackKeyframeAnimation == null ? null : (Integer) valueCallbackKeyframeAnimation.getValue();
        LPaint lPaint = this.E;
        if (num != null) {
            lPaint.setColor(num.intValue());
        } else {
            lPaint.setColor(layer.f26111l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.transform.getOpacity() == null ? 100 : this.transform.getOpacity().getValue().intValue())) / 100.0f) * (i10 / 255.0f) * 255.0f);
        lPaint.setAlpha(iIntValue);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.I;
        if (valueCallbackKeyframeAnimation2 != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation2.getValue());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f6 = layer.f26109j;
            fArr[2] = f6;
            fArr[3] = 0.0f;
            fArr[4] = f6;
            float f10 = layer.f26110k;
            fArr[5] = f10;
            fArr[6] = 0.0f;
            fArr[7] = f10;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, lPaint);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        super.getBounds(rectF, matrix, z10);
        RectF rectF2 = this.D;
        Layer layer = this.H;
        rectF2.set(0.0f, 0.0f, layer.f26109j, layer.f26110k);
        this.f26085o.mapRect(rectF2);
        rectF.set(rectF2);
    }
}
