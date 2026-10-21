package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class TransformKeyframeAnimation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f25875a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f25876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f25877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f25878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f25879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public BaseKeyframeAnimation<PointF, PointF> f25880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public BaseKeyframeAnimation<?, PointF> f25881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public BaseKeyframeAnimation<ScaleXY, ScaleXY> f25882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public BaseKeyframeAnimation<Float, Float> f25883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public BaseKeyframeAnimation<Integer, Integer> f25884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public FloatKeyframeAnimation f25885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public FloatKeyframeAnimation f25886l;

    @Nullable
    public BaseKeyframeAnimation<?, Float> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public BaseKeyframeAnimation<?, Float> f25887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f25888o;

    public TransformKeyframeAnimation(AnimatableTransform animatableTransform) {
        this.f25880f = animatableTransform.getAnchorPoint() == null ? null : animatableTransform.getAnchorPoint().createAnimation();
        this.f25881g = animatableTransform.getPosition() == null ? null : animatableTransform.getPosition().createAnimation();
        this.f25882h = animatableTransform.getScale() == null ? null : animatableTransform.getScale().createAnimation();
        this.f25883i = animatableTransform.getRotation() == null ? null : animatableTransform.getRotation().createAnimation();
        this.f25885k = animatableTransform.getSkew() == null ? null : animatableTransform.getSkew().createAnimation();
        this.f25888o = animatableTransform.isAutoOrient();
        if (this.f25885k != null) {
            this.f25876b = new Matrix();
            this.f25877c = new Matrix();
            this.f25878d = new Matrix();
            this.f25879e = new float[9];
        } else {
            this.f25876b = null;
            this.f25877c = null;
            this.f25878d = null;
            this.f25879e = null;
        }
        this.f25886l = animatableTransform.getSkewAngle() == null ? null : animatableTransform.getSkewAngle().createAnimation();
        if (animatableTransform.getOpacity() != null) {
            this.f25884j = animatableTransform.getOpacity().createAnimation();
        }
        if (animatableTransform.getStartOpacity() != null) {
            this.m = animatableTransform.getStartOpacity().createAnimation();
        } else {
            this.m = null;
        }
        if (animatableTransform.getEndOpacity() != null) {
            this.f25887n = animatableTransform.getEndOpacity().createAnimation();
        } else {
            this.f25887n = null;
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f25879e[i10] = 0.0f;
        }
    }

    public void addAnimationsToLayer(BaseLayer baseLayer) {
        baseLayer.addAnimation(this.f25884j);
        baseLayer.addAnimation(this.m);
        baseLayer.addAnimation(this.f25887n);
        baseLayer.addAnimation(this.f25880f);
        baseLayer.addAnimation(this.f25881g);
        baseLayer.addAnimation(this.f25882h);
        baseLayer.addAnimation(this.f25883i);
        baseLayer.addAnimation(this.f25885k);
        baseLayer.addAnimation(this.f25886l);
    }

    public void addListener(BaseKeyframeAnimation.AnimationListener animationListener) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f25884j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f25887n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f25880f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.f25881g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation6 = this.f25882h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.f25883i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.addUpdateListener(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.f25885k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.addUpdateListener(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.f25886l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.addUpdateListener(animationListener);
        }
    }

    public <T> boolean applyValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t10 == LottieProperty.TRANSFORM_ANCHOR_POINT) {
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation = this.f25880f;
            if (baseKeyframeAnimation == null) {
                this.f25880f = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t10 == LottieProperty.TRANSFORM_POSITION) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation2 = this.f25881g;
            if (baseKeyframeAnimation2 == null) {
                this.f25881g = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t10 == LottieProperty.TRANSFORM_POSITION_X) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation3 = this.f25881g;
            if (baseKeyframeAnimation3 instanceof SplitDimensionPathKeyframeAnimation) {
                ((SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation3).setXValueCallback(lottieValueCallback);
                return true;
            }
        }
        if (t10 == LottieProperty.TRANSFORM_POSITION_Y) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation4 = this.f25881g;
            if (baseKeyframeAnimation4 instanceof SplitDimensionPathKeyframeAnimation) {
                ((SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation4).setYValueCallback(lottieValueCallback);
                return true;
            }
        }
        if (t10 == LottieProperty.TRANSFORM_SCALE) {
            BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation5 = this.f25882h;
            if (baseKeyframeAnimation5 == null) {
                this.f25882h = new ValueCallbackKeyframeAnimation(lottieValueCallback, new ScaleXY());
                return true;
            }
            baseKeyframeAnimation5.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t10 == LottieProperty.TRANSFORM_ROTATION) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation6 = this.f25883i;
            if (baseKeyframeAnimation6 == null) {
                this.f25883i = new ValueCallbackKeyframeAnimation(lottieValueCallback, Float.valueOf(0.0f));
                return true;
            }
            baseKeyframeAnimation6.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t10 == LottieProperty.TRANSFORM_OPACITY) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation7 = this.f25884j;
            if (baseKeyframeAnimation7 == null) {
                this.f25884j = new ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                return true;
            }
            baseKeyframeAnimation7.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t10 == LottieProperty.TRANSFORM_START_OPACITY) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation8 = this.m;
            if (baseKeyframeAnimation8 == null) {
                this.m = new ValueCallbackKeyframeAnimation(lottieValueCallback, Float.valueOf(100.0f));
                return true;
            }
            baseKeyframeAnimation8.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t10 == LottieProperty.TRANSFORM_END_OPACITY) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation9 = this.f25887n;
            if (baseKeyframeAnimation9 == null) {
                this.f25887n = new ValueCallbackKeyframeAnimation(lottieValueCallback, Float.valueOf(100.0f));
                return true;
            }
            baseKeyframeAnimation9.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t10 == LottieProperty.TRANSFORM_SKEW) {
            if (this.f25885k == null) {
                this.f25885k = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(Float.valueOf(0.0f))));
            }
            this.f25885k.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t10 != LottieProperty.TRANSFORM_SKEW_ANGLE) {
            return false;
        }
        if (this.f25886l == null) {
            this.f25886l = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(Float.valueOf(0.0f))));
        }
        this.f25886l.setValueCallback(lottieValueCallback);
        return true;
    }

    @Nullable
    public BaseKeyframeAnimation<?, Float> getEndOpacity() {
        return this.f25887n;
    }

    public Matrix getMatrix() {
        PointF value;
        ScaleXY value2;
        PointF value3;
        Matrix matrix = this.f25875a;
        matrix.reset();
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f25881g;
        if (baseKeyframeAnimation != null && (value3 = baseKeyframeAnimation.getValue()) != null) {
            float f6 = value3.x;
            if (f6 != 0.0f || value3.y != 0.0f) {
                matrix.preTranslate(f6, value3.y);
            }
        }
        if (!this.f25888o) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.f25883i;
            if (baseKeyframeAnimation2 != null) {
                float fFloatValue = baseKeyframeAnimation2 instanceof ValueCallbackKeyframeAnimation ? baseKeyframeAnimation2.getValue().floatValue() : ((FloatKeyframeAnimation) baseKeyframeAnimation2).getFloatValue();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (baseKeyframeAnimation != null) {
            float progress = baseKeyframeAnimation.getProgress();
            PointF value4 = baseKeyframeAnimation.getValue();
            float f10 = value4.x;
            float f11 = value4.y;
            baseKeyframeAnimation.setProgress(1.0E-4f + progress);
            PointF value5 = baseKeyframeAnimation.getValue();
            baseKeyframeAnimation.setProgress(progress);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(value5.y - f11, value5.x - f10)));
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.f25885k;
        if (floatKeyframeAnimation != null) {
            FloatKeyframeAnimation floatKeyframeAnimation2 = this.f25886l;
            float fCos = floatKeyframeAnimation2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-floatKeyframeAnimation2.getFloatValue()) + 90.0f));
            FloatKeyframeAnimation floatKeyframeAnimation3 = this.f25886l;
            float fSin = floatKeyframeAnimation3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-floatKeyframeAnimation3.getFloatValue()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(floatKeyframeAnimation.getFloatValue()));
            a();
            float[] fArr = this.f25879e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f12 = -fSin;
            fArr[3] = f12;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f25876b;
            matrix2.setValues(fArr);
            a();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f25877c;
            matrix3.setValues(fArr);
            a();
            fArr[0] = fCos;
            fArr[1] = f12;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f25878d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation3 = this.f25882h;
        if (baseKeyframeAnimation3 != null && (value2 = baseKeyframeAnimation3.getValue()) != null && (value2.getScaleX() != 1.0f || value2.getScaleY() != 1.0f)) {
            matrix.preScale(value2.getScaleX(), value2.getScaleY());
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f25880f;
        if (baseKeyframeAnimation4 != null && (value = baseKeyframeAnimation4.getValue()) != null) {
            float f13 = value.x;
            if (f13 != 0.0f || value.y != 0.0f) {
                matrix.preTranslate(-f13, -value.y);
            }
        }
        return matrix;
    }

    public Matrix getMatrixForRepeater(float f6) {
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f25881g;
        PointF value = baseKeyframeAnimation == null ? null : baseKeyframeAnimation.getValue();
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation2 = this.f25882h;
        ScaleXY value2 = baseKeyframeAnimation2 == null ? null : baseKeyframeAnimation2.getValue();
        Matrix matrix = this.f25875a;
        matrix.reset();
        if (value != null) {
            matrix.preTranslate(value.x * f6, value.y * f6);
        }
        if (value2 != null) {
            double d2 = f6;
            matrix.preScale((float) Math.pow(value2.getScaleX(), d2), (float) Math.pow(value2.getScaleY(), d2));
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.f25883i;
        if (baseKeyframeAnimation3 != null) {
            float fFloatValue = baseKeyframeAnimation3.getValue().floatValue();
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f25880f;
            PointF value3 = baseKeyframeAnimation4 != null ? baseKeyframeAnimation4.getValue() : null;
            matrix.preRotate(fFloatValue * f6, value3 == null ? 0.0f : value3.x, value3 != null ? value3.y : 0.0f);
        }
        return matrix;
    }

    @Nullable
    public BaseKeyframeAnimation<?, Integer> getOpacity() {
        return this.f25884j;
    }

    @Nullable
    public BaseKeyframeAnimation<?, Float> getStartOpacity() {
        return this.m;
    }

    public void setProgress(float f6) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f25884j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.setProgress(f6);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.setProgress(f6);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f25887n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.setProgress(f6);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f25880f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.setProgress(f6);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.f25881g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.setProgress(f6);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation6 = this.f25882h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.setProgress(f6);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.f25883i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.setProgress(f6);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.f25885k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.setProgress(f6);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.f25886l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.setProgress(f6);
        }
    }
}
