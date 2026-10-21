package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseStrokeContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, DrawingContent {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LottieDrawable f25681e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f25683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LPaint f25684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FloatKeyframeAnimation f25685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BaseKeyframeAnimation<?, Integer> f25686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f25687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final FloatKeyframeAnimation f25688l;
    protected final BaseLayer layer;

    @Nullable
    public ValueCallbackKeyframeAnimation m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public BaseKeyframeAnimation<Float, Float> f25689n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f25690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final DropShadowKeyframeAnimation f25691p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f25677a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f25678b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f25679c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f25680d = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f25682f = new ArrayList();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f25692a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final TrimPathContent f25693b;

        public a(TrimPathContent trimPathContent) {
            this.f25693b = trimPathContent;
        }
    }

    public BaseStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Paint.Cap cap, Paint.Join join, float f6, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableFloatValue animatableFloatValue2) {
        LPaint lPaint = new LPaint(1);
        this.f25684h = lPaint;
        this.f25690o = 0.0f;
        this.f25681e = lottieDrawable;
        this.layer = baseLayer;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f6);
        this.f25686j = animatableIntegerValue.createAnimation();
        this.f25685i = animatableFloatValue.createAnimation();
        if (animatableFloatValue2 == null) {
            this.f25688l = null;
        } else {
            this.f25688l = animatableFloatValue2.createAnimation();
        }
        this.f25687k = new ArrayList(list.size());
        this.f25683g = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f25687k.add(list.get(i10).createAnimation());
        }
        baseLayer.addAnimation(this.f25686j);
        baseLayer.addAnimation(this.f25685i);
        for (int i11 = 0; i11 < this.f25687k.size(); i11++) {
            baseLayer.addAnimation((BaseKeyframeAnimation) this.f25687k.get(i11));
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.f25688l;
        if (floatKeyframeAnimation != null) {
            baseLayer.addAnimation(floatKeyframeAnimation);
        }
        this.f25686j.addUpdateListener(this);
        this.f25685i.addUpdateListener(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((BaseKeyframeAnimation) this.f25687k.get(i12)).addUpdateListener(this);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.f25688l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.addUpdateListener(this);
        }
        if (baseLayer.getBlurEffect() != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.f25689n = floatKeyframeAnimationCreateAnimation;
            floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.f25689n);
        }
        if (baseLayer.getDropShadowEffect() != null) {
            this.f25691p = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.getDropShadowEffect());
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    @CallSuper
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t10 == LottieProperty.OPACITY) {
            this.f25686j.setValueCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.STROKE_WIDTH) {
            this.f25685i.setValueCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.COLOR_FILTER) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.m;
            if (valueCallbackKeyframeAnimation != null) {
                this.layer.removeAnimation(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.m = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.m = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.layer.addAnimation(this.m);
            return;
        }
        if (t10 == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.f25689n;
            if (baseKeyframeAnimation != null) {
                baseKeyframeAnimation.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f25689n = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            this.layer.addAnimation(this.f25689n);
            return;
        }
        Integer num = LottieProperty.DROP_SHADOW_COLOR;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.f25691p;
        if (t10 == num && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.setColorCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.DROP_SHADOW_OPACITY && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.setOpacityCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.DROP_SHADOW_DIRECTION && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.setDirectionCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.DROP_SHADOW_DISTANCE && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.setDistanceCallback(lottieValueCallback);
        } else {
            if (t10 != LottieProperty.DROP_SHADOW_RADIUS || dropShadowKeyframeAnimation == null) {
                return;
            }
            dropShadowKeyframeAnimation.setRadiusCallback(lottieValueCallback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021d  */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i10) {
        float[] fArr;
        float f6;
        float f10;
        float f11;
        BaseStrokeContent baseStrokeContent = this;
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#draw");
        }
        if (Utils.hasZeroScaleAxis(matrix)) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#draw");
                return;
            }
            return;
        }
        float f12 = 100.0f;
        int intValue = (int) ((((i10 / 255.0f) * ((IntegerKeyframeAnimation) baseStrokeContent.f25686j).getIntValue()) / 100.0f) * 255.0f);
        LPaint lPaint = baseStrokeContent.f25684h;
        boolean z10 = false;
        lPaint.setAlpha(MiscUtils.clamp(intValue, 0, 255));
        lPaint.setStrokeWidth(baseStrokeContent.f25685i.getFloatValue());
        float f13 = 0.0f;
        if (lPaint.getStrokeWidth() <= 0.0f) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#draw");
                return;
            }
            return;
        }
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#applyDashPattern");
        }
        ArrayList arrayList = baseStrokeContent.f25687k;
        float f14 = 1.0f;
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = baseStrokeContent.f25683g;
                if (i11 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((BaseKeyframeAnimation) arrayList.get(i11)).getValue()).floatValue();
                fArr[i11] = fFloatValue;
                if (i11 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i11] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i11] = 0.1f;
                }
                i11++;
            }
            FloatKeyframeAnimation floatKeyframeAnimation = baseStrokeContent.f25688l;
            lPaint.setPathEffect(new DashPathEffect(fArr, floatKeyframeAnimation == null ? 0.0f : floatKeyframeAnimation.getValue().floatValue()));
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#applyDashPattern");
            }
        } else if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#applyDashPattern");
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = baseStrokeContent.m;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = baseStrokeContent.f25689n;
        if (baseKeyframeAnimation != null) {
            float fFloatValue2 = baseKeyframeAnimation.getValue().floatValue();
            if (fFloatValue2 == 0.0f) {
                lPaint.setMaskFilter(null);
            } else if (fFloatValue2 != baseStrokeContent.f25690o) {
                lPaint.setMaskFilter(baseStrokeContent.layer.getBlurMaskFilter(fFloatValue2));
            }
            baseStrokeContent.f25690o = fFloatValue2;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = baseStrokeContent.f25691p;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.applyTo(lPaint, matrix, Utils.mixOpacities(i10, intValue));
        }
        canvas.save();
        canvas.concat(matrix);
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = baseStrokeContent.f25682f;
            if (i12 >= arrayList2.size()) {
                break;
            }
            a aVar = (a) arrayList2.get(i12);
            TrimPathContent trimPathContent = aVar.f25693b;
            Path path = baseStrokeContent.f25678b;
            ArrayList arrayList3 = aVar.f25692a;
            if (trimPathContent != null) {
                if (L.isTraceEnabled()) {
                    L.beginSection("StrokeContent#applyTrimPath");
                }
                TrimPathContent trimPathContent2 = aVar.f25693b;
                if (trimPathContent2 != null) {
                    path.reset();
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        path.addPath(((b) arrayList3.get(size2)).getPath());
                    }
                    float fFloatValue3 = trimPathContent2.getStart().getValue().floatValue() / f12;
                    float fFloatValue4 = trimPathContent2.getEnd().getValue().floatValue() / f12;
                    float fFloatValue5 = trimPathContent2.getOffset().getValue().floatValue() / 360.0f;
                    if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                        PathMeasure pathMeasure = baseStrokeContent.f25677a;
                        pathMeasure.setPath(path, z10);
                        float length = pathMeasure.getLength();
                        while (pathMeasure.nextContour()) {
                            length = pathMeasure.getLength() + length;
                        }
                        float f15 = fFloatValue5 * length;
                        float f16 = (fFloatValue3 * length) + f15;
                        float fMin = Math.min((fFloatValue4 * length) + f15, (f16 + length) - f14);
                        int size3 = arrayList3.size() - 1;
                        float f17 = f13;
                        while (size3 >= 0) {
                            Path path2 = baseStrokeContent.f25679c;
                            path2.set(((b) arrayList3.get(size3)).getPath());
                            pathMeasure.setPath(path2, z10);
                            float length2 = pathMeasure.getLength();
                            if (fMin > length) {
                                float f18 = fMin - length;
                                if (f18 >= f17 + length2 || f17 >= f18) {
                                    f10 = f17 + length2;
                                    if (f10 < f16 && f17 <= fMin) {
                                        if (f10 > fMin || f16 >= f17) {
                                            f11 = 0.0f;
                                            Utils.applyTrimPathIfNeeded(path2, f16 < f17 ? 0.0f : (f16 - f17) / length2, fMin > f10 ? 1.0f : (fMin - f17) / length2, 0.0f);
                                            canvas.drawPath(path2, lPaint);
                                        } else {
                                            canvas.drawPath(path2, lPaint);
                                        }
                                    }
                                } else {
                                    Utils.applyTrimPathIfNeeded(path2, f16 > length ? (f16 - length) / length2 : 0.0f, Math.min(f18 / length2, f14), 0.0f);
                                    canvas.drawPath(path2, lPaint);
                                }
                            } else {
                                f10 = f17 + length2;
                                f11 = f10 < f16 ? 0.0f : 0.0f;
                            }
                            f17 += length2;
                            size3--;
                            baseStrokeContent = this;
                            f13 = f11;
                            z10 = false;
                            f14 = 1.0f;
                        }
                        f6 = f13;
                        if (L.isTraceEnabled()) {
                            L.endSection("StrokeContent#applyTrimPath");
                        }
                    } else {
                        canvas.drawPath(path, lPaint);
                        if (L.isTraceEnabled()) {
                            L.endSection("StrokeContent#applyTrimPath");
                        }
                    }
                } else if (L.isTraceEnabled()) {
                    L.endSection("StrokeContent#applyTrimPath");
                }
                f6 = f13;
            } else {
                f6 = f13;
                if (L.isTraceEnabled()) {
                    L.beginSection("StrokeContent#buildPath");
                }
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((b) arrayList3.get(size4)).getPath());
                }
                if (L.isTraceEnabled()) {
                    L.endSection("StrokeContent#buildPath");
                    L.beginSection("StrokeContent#drawPath");
                }
                canvas.drawPath(path, lPaint);
                if (L.isTraceEnabled()) {
                    L.endSection("StrokeContent#drawPath");
                }
            }
            i12++;
            baseStrokeContent = this;
            f13 = f6;
            f12 = 100.0f;
            z10 = false;
            f14 = 1.0f;
        }
        canvas.restore();
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#getBounds");
        }
        Path path = this.f25678b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f25682f;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            for (int i11 = 0; i11 < aVar.f25692a.size(); i11++) {
                path.addPath(((b) aVar.f25692a.get(i11)).getPath(), matrix);
            }
            i10++;
        }
        RectF rectF2 = this.f25680d;
        path.computeBounds(rectF2, false);
        float floatValue = this.f25685i.getFloatValue() / 2.0f;
        rectF2.set(rectF2.left - floatValue, rectF2.top - floatValue, rectF2.right + floatValue, rectF2.bottom + floatValue);
        rectF.set(rectF2);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#getBounds");
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f25681e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i10, list, keyPath2, this);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        ArrayList arrayList;
        a aVar = null;
        TrimPathContent trimPathContent = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = list.get(size);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent2 = (TrimPathContent) content;
                if (trimPathContent2.f25821d == ShapeTrimPath.Type.INDIVIDUALLY) {
                    trimPathContent = trimPathContent2;
                }
            }
        }
        if (trimPathContent != null) {
            trimPathContent.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f25682f;
            if (size2 < 0) {
                break;
            }
            Content content2 = list2.get(size2);
            if (content2 instanceof TrimPathContent) {
                TrimPathContent trimPathContent3 = (TrimPathContent) content2;
                if (trimPathContent3.f25821d == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(trimPathContent3);
                    trimPathContent3.a(this);
                    aVar = aVar2;
                } else if (!(content2 instanceof b)) {
                    if (aVar == null) {
                        aVar = new a(trimPathContent);
                    }
                    aVar.f25692a.add((b) content2);
                }
            } else if (!(content2 instanceof b)) {
                if (aVar == null) {
                    aVar = new a(trimPathContent);
                }
                aVar.f25692a.add((b) content2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }
}
