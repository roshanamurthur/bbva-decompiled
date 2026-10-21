package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes2.dex */
public class StrokeContent extends BaseStrokeContent {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final BaseLayer f25813q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f25814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f25815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BaseKeyframeAnimation<Integer, Integer> f25816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public ValueCallbackKeyframeAnimation f25817u;

    public StrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeStroke shapeStroke) {
        super(lottieDrawable, baseLayer, shapeStroke.getCapType().toPaintCap(), shapeStroke.getJoinType().toPaintJoin(), shapeStroke.getMiterLimit(), shapeStroke.getOpacity(), shapeStroke.getWidth(), shapeStroke.getLineDashPattern(), shapeStroke.getDashOffset());
        this.f25813q = baseLayer;
        this.f25814r = shapeStroke.getName();
        this.f25815s = shapeStroke.isHidden();
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation = shapeStroke.getColor().createAnimation();
        this.f25816t = baseKeyframeAnimationCreateAnimation;
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t10, lottieValueCallback);
        Integer num = LottieProperty.STROKE_COLOR;
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f25816t;
        if (t10 == num) {
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.COLOR_FILTER) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f25817u;
            BaseLayer baseLayer = this.f25813q;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.removeAnimation(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f25817u = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f25817u = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            baseLayer.addAnimation(baseKeyframeAnimation);
        }
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i10) {
        if (this.f25815s) {
            return;
        }
        LPaint lPaint = this.f25684h;
        lPaint.setColor(((ColorKeyframeAnimation) this.f25816t).getIntValue());
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f25817u;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.getValue());
        }
        super.draw(canvas, matrix, i10);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25814r;
    }
}
