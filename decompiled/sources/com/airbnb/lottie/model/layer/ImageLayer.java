package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes2.dex */
public class ImageLayer extends BaseLayer {
    public final LPaint D;
    public final Rect E;
    public final Rect F;

    @Nullable
    public final LottieImageAsset G;

    @Nullable
    public ValueCallbackKeyframeAnimation H;

    @Nullable
    public ValueCallbackKeyframeAnimation I;

    @Nullable
    public final DropShadowKeyframeAnimation J;

    public ImageLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.D = new LPaint(3);
        this.E = new Rect();
        this.F = new Rect();
        this.G = lottieDrawable.getLottieImageAssetForId(layer.getRefId());
        if (getDropShadowEffect() != null) {
            this.J = new DropShadowKeyframeAnimation(this, this, getDropShadowEffect());
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t10, lottieValueCallback);
        if (t10 == LottieProperty.COLOR_FILTER) {
            if (lottieValueCallback == null) {
                this.H = null;
                return;
            } else {
                this.H = new ValueCallbackKeyframeAnimation(lottieValueCallback);
                return;
            }
        }
        if (t10 == LottieProperty.IMAGE) {
            if (lottieValueCallback == null) {
                this.I = null;
            } else {
                this.I = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(@NonNull Canvas canvas, Matrix matrix, int i10) {
        Bitmap bitmapForId;
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.I;
        LottieDrawable lottieDrawable = this.f26086p;
        LottieImageAsset lottieImageAsset = this.G;
        if ((valueCallbackKeyframeAnimation == null || (bitmapForId = (Bitmap) valueCallbackKeyframeAnimation.getValue()) == null) && (bitmapForId = lottieDrawable.getBitmapForId(this.f26087q.getRefId())) == null) {
            bitmapForId = lottieImageAsset != null ? lottieImageAsset.getBitmap() : null;
        }
        if (bitmapForId == null || bitmapForId.isRecycled() || lottieImageAsset == null) {
            return;
        }
        float fDpScale = Utils.dpScale();
        LPaint lPaint = this.D;
        lPaint.setAlpha(i10);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.H;
        if (valueCallbackKeyframeAnimation2 != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation2.getValue());
        }
        canvas.save();
        canvas.concat(matrix);
        int width = bitmapForId.getWidth();
        int height = bitmapForId.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean maintainOriginalImageBounds = lottieDrawable.getMaintainOriginalImageBounds();
        Rect rect2 = this.F;
        if (maintainOriginalImageBounds) {
            rect2.set(0, 0, (int) (lottieImageAsset.getWidth() * fDpScale), (int) (lottieImageAsset.getHeight() * fDpScale));
        } else {
            rect2.set(0, 0, (int) (bitmapForId.getWidth() * fDpScale), (int) (bitmapForId.getHeight() * fDpScale));
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.J;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.applyTo(lPaint, matrix, i10);
        }
        canvas.drawBitmap(bitmapForId, rect, rect2, lPaint);
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        super.getBounds(rectF, matrix, z10);
        LottieImageAsset lottieImageAsset = this.G;
        if (lottieImageAsset != null) {
            float fDpScale = Utils.dpScale();
            rectF.set(0.0f, 0.0f, lottieImageAsset.getWidth() * fDpScale, lottieImageAsset.getHeight() * fDpScale);
            this.f26085o.mapRect(rectF);
        }
    }
}
