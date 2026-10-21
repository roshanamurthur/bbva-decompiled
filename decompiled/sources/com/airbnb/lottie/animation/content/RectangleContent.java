package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RectangleContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LottieDrawable f25785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BaseKeyframeAnimation<?, PointF> f25786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BaseKeyframeAnimation<?, PointF> f25787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FloatKeyframeAnimation f25788h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25791k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25781a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f25782b = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CompoundTrimPathContent f25789i = new CompoundTrimPathContent();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public BaseKeyframeAnimation<Float, Float> f25790j = null;

    public RectangleContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RectangleShape rectangleShape) {
        this.f25783c = rectangleShape.getName();
        this.f25784d = rectangleShape.isHidden();
        this.f25785e = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation = rectangleShape.getPosition().createAnimation();
        this.f25786f = baseKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation2 = rectangleShape.getSize().createAnimation();
        this.f25787g = baseKeyframeAnimationCreateAnimation2;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = rectangleShape.getCornerRadius().createAnimation();
        this.f25788h = floatKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t10 == LottieProperty.RECTANGLE_SIZE) {
            this.f25787g.setValueCallback(lottieValueCallback);
        } else if (t10 == LottieProperty.POSITION) {
            this.f25786f.setValueCallback(lottieValueCallback);
        } else if (t10 == LottieProperty.CORNER_RADIUS) {
            this.f25788h.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25783c;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public Path getPath() {
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation;
        boolean z10 = this.f25791k;
        Path path = this.f25781a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f25784d) {
            this.f25791k = true;
            return path;
        }
        PointF value = this.f25787g.getValue();
        float f6 = value.x / 2.0f;
        float f10 = value.y / 2.0f;
        FloatKeyframeAnimation floatKeyframeAnimation = this.f25788h;
        float floatValue = floatKeyframeAnimation == null ? 0.0f : floatKeyframeAnimation.getFloatValue();
        if (floatValue == 0.0f && (baseKeyframeAnimation = this.f25790j) != null) {
            floatValue = Math.min(baseKeyframeAnimation.getValue().floatValue(), Math.min(f6, f10));
        }
        float fMin = Math.min(f6, f10);
        if (floatValue > fMin) {
            floatValue = fMin;
        }
        PointF value2 = this.f25786f.getValue();
        path.moveTo(value2.x + f6, (value2.y - f10) + floatValue);
        path.lineTo(value2.x + f6, (value2.y + f10) - floatValue);
        RectF rectF = this.f25782b;
        if (floatValue > 0.0f) {
            float f11 = value2.x + f6;
            float f12 = floatValue * 2.0f;
            float f13 = value2.y + f10;
            rectF.set(f11 - f12, f13 - f12, f11, f13);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((value2.x - f6) + floatValue, value2.y + f10);
        if (floatValue > 0.0f) {
            float f14 = value2.x - f6;
            float f15 = value2.y + f10;
            float f16 = floatValue * 2.0f;
            rectF.set(f14, f15 - f16, f16 + f14, f15);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(value2.x - f6, (value2.y - f10) + floatValue);
        if (floatValue > 0.0f) {
            float f17 = value2.x - f6;
            float f18 = value2.y - f10;
            float f19 = floatValue * 2.0f;
            rectF.set(f17, f18, f17 + f19, f19 + f18);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((value2.x + f6) - floatValue, value2.y - f10);
        if (floatValue > 0.0f) {
            float f20 = value2.x + f6;
            float f21 = floatValue * 2.0f;
            float f22 = value2.y - f10;
            rectF.set(f20 - f21, f22, f20, f21 + f22);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f25789i.apply(path);
        this.f25791k = true;
        return path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f25791k = false;
        this.f25785e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i10, list, keyPath2, this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Content content = list.get(i10);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f25821d == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f25789i.f25694a.add(trimPathContent);
                    trimPathContent.a(this);
                } else if (content instanceof RoundedCornersContent) {
                    this.f25790j = ((RoundedCornersContent) content).getRoundedCorners();
                }
            } else if (content instanceof RoundedCornersContent) {
                this.f25790j = ((RoundedCornersContent) content).getRoundedCorners();
            }
        }
    }
}
