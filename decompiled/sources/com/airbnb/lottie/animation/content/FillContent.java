package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapeFill;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LPaint f25715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseLayer f25716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f25719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BaseKeyframeAnimation<Integer, Integer> f25720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BaseKeyframeAnimation<Integer, Integer> f25721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ValueCallbackKeyframeAnimation f25722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LottieDrawable f25723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public BaseKeyframeAnimation<Float, Float> f25724k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f25725l;

    @Nullable
    public final DropShadowKeyframeAnimation m;

    public FillContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeFill shapeFill) {
        Path path = new Path();
        this.f25714a = path;
        this.f25715b = new LPaint(1);
        this.f25719f = new ArrayList();
        this.f25716c = baseLayer;
        this.f25717d = shapeFill.getName();
        this.f25718e = shapeFill.isHidden();
        this.f25723j = lottieDrawable;
        if (baseLayer.getBlurEffect() != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.f25724k = floatKeyframeAnimationCreateAnimation;
            floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.f25724k);
        }
        if (baseLayer.getDropShadowEffect() != null) {
            this.m = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.getDropShadowEffect());
        }
        if (shapeFill.getColor() == null || shapeFill.getOpacity() == null) {
            this.f25720g = null;
            this.f25721h = null;
            return;
        }
        path.setFillType(shapeFill.getFillType());
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation = shapeFill.getColor().createAnimation();
        this.f25720g = baseKeyframeAnimationCreateAnimation;
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation2 = shapeFill.getOpacity().createAnimation();
        this.f25721h = baseKeyframeAnimationCreateAnimation2;
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t10 == LottieProperty.COLOR) {
            this.f25720g.setValueCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.OPACITY) {
            this.f25721h.setValueCallback(lottieValueCallback);
            return;
        }
        ColorFilter colorFilter = LottieProperty.COLOR_FILTER;
        BaseLayer baseLayer = this.f25716c;
        if (t10 == colorFilter) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f25722i;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.removeAnimation(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f25722i = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f25722i = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            baseLayer.addAnimation(this.f25722i);
            return;
        }
        if (t10 == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.f25724k;
            if (baseKeyframeAnimation != null) {
                baseKeyframeAnimation.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f25724k = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            baseLayer.addAnimation(this.f25724k);
            return;
        }
        Integer num = LottieProperty.DROP_SHADOW_COLOR;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.m;
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

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i10) {
        if (this.f25718e) {
            return;
        }
        if (L.isTraceEnabled()) {
            L.beginSection("FillContent#draw");
        }
        int intValue = ((ColorKeyframeAnimation) this.f25720g).getIntValue();
        int iIntValue = (int) ((((i10 / 255.0f) * this.f25721h.getValue().intValue()) / 100.0f) * 255.0f);
        LPaint lPaint = this.f25715b;
        int i11 = 0;
        lPaint.setColor((intValue & ViewCompat.MEASURED_SIZE_MASK) | (MiscUtils.clamp(iIntValue, 0, 255) << 24));
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f25722i;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.f25724k;
        if (baseKeyframeAnimation != null) {
            float fFloatValue = baseKeyframeAnimation.getValue().floatValue();
            if (fFloatValue == 0.0f) {
                lPaint.setMaskFilter(null);
            } else if (fFloatValue != this.f25725l) {
                lPaint.setMaskFilter(this.f25716c.getBlurMaskFilter(fFloatValue));
            }
            this.f25725l = fFloatValue;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.m;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.applyTo(lPaint, matrix, Utils.mixOpacities(i10, iIntValue));
        }
        Path path = this.f25714a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f25719f;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((b) arrayList.get(i11)).getPath(), matrix);
            i11++;
        }
        canvas.drawPath(path, lPaint);
        if (L.isTraceEnabled()) {
            L.endSection("FillContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f25714a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f25719f;
            if (i10 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((b) arrayList.get(i10)).getPath(), matrix);
                i10++;
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25717d;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f25723j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i10, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Content content = list2.get(i10);
            if (content instanceof b) {
                this.f25719f.add((b) content);
            }
        }
    }
}
