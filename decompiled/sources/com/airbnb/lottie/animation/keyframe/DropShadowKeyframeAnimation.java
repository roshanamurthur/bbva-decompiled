package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes2.dex */
public class DropShadowKeyframeAnimation implements BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseLayer f25837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseKeyframeAnimation.AnimationListener f25838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseKeyframeAnimation<Integer, Integer> f25839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FloatKeyframeAnimation f25840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FloatKeyframeAnimation f25841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FloatKeyframeAnimation f25842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FloatKeyframeAnimation f25843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f25844h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f25845i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f25846j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25847k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f25848l = new float[9];

    public class a extends LottieValueCallback<Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LottieValueCallback f25849c;

        public a(LottieValueCallback lottieValueCallback) {
            this.f25849c = lottieValueCallback;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.airbnb.lottie.value.LottieValueCallback
        @Nullable
        public final Float getValue(LottieFrameInfo<Float> lottieFrameInfo) {
            Float f6 = (Float) this.f25849c.getValue(lottieFrameInfo);
            if (f6 == null) {
                return null;
            }
            return Float.valueOf(f6.floatValue() * 2.55f);
        }
    }

    public DropShadowKeyframeAnimation(BaseKeyframeAnimation.AnimationListener animationListener, BaseLayer baseLayer, DropShadowEffect dropShadowEffect) {
        this.f25838b = animationListener;
        this.f25837a = baseLayer;
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation = dropShadowEffect.getColor().createAnimation();
        this.f25839c = baseKeyframeAnimationCreateAnimation;
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = dropShadowEffect.getOpacity().createAnimation();
        this.f25840d = floatKeyframeAnimationCreateAnimation;
        floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation);
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation2 = dropShadowEffect.getDirection().createAnimation();
        this.f25841e = floatKeyframeAnimationCreateAnimation2;
        floatKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation2);
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation3 = dropShadowEffect.getDistance().createAnimation();
        this.f25842f = floatKeyframeAnimationCreateAnimation3;
        floatKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation3);
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation4 = dropShadowEffect.getRadius().createAnimation();
        this.f25843g = floatKeyframeAnimationCreateAnimation4;
        floatKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation4);
    }

    public void applyTo(Paint paint, Matrix matrix, int i10) {
        float floatValue = this.f25841e.getFloatValue() * 0.017453292f;
        float fFloatValue = this.f25842f.getValue().floatValue();
        double d2 = floatValue;
        float fSin = ((float) Math.sin(d2)) * fFloatValue;
        float fCos = ((float) Math.cos(d2 + 3.141592653589793d)) * fFloatValue;
        Matrix matrix2 = this.f25837a.transform.getMatrix();
        float[] fArr = this.f25848l;
        matrix2.getValues(fArr);
        float f6 = fArr[0];
        float f10 = fArr[4];
        matrix.getValues(fArr);
        float f11 = fArr[0] / f6;
        float f12 = fSin * f11;
        float f13 = fCos * (fArr[4] / f10);
        int iIntValue = this.f25839c.getValue().intValue();
        int iArgb = Color.argb(Math.round((this.f25840d.getValue().floatValue() * i10) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        float fMax = Math.max(this.f25843g.getValue().floatValue() * f11 * 0.33f, Float.MIN_VALUE);
        if (this.f25844h == fMax && this.f25845i == f12 && this.f25846j == f13 && this.f25847k == iArgb) {
            return;
        }
        this.f25844h = fMax;
        this.f25845i = f12;
        this.f25846j = f13;
        this.f25847k = iArgb;
        paint.setShadowLayer(fMax, f12, f13, iArgb);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f25838b.onValueChanged();
    }

    public void setColorCallback(@Nullable LottieValueCallback<Integer> lottieValueCallback) {
        this.f25839c.setValueCallback(lottieValueCallback);
    }

    public void setDirectionCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        this.f25841e.setValueCallback(lottieValueCallback);
    }

    public void setDistanceCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        this.f25842f.setValueCallback(lottieValueCallback);
    }

    public void setOpacityCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        FloatKeyframeAnimation floatKeyframeAnimation = this.f25840d;
        if (lottieValueCallback == null) {
            floatKeyframeAnimation.setValueCallback(null);
        } else {
            floatKeyframeAnimation.setValueCallback(new a(lottieValueCallback));
        }
    }

    public void setRadiusCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        this.f25843g.setValueCallback(lottieValueCallback);
    }
}
