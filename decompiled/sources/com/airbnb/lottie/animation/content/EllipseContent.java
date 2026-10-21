package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class EllipseContent implements b, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieDrawable f25708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BaseKeyframeAnimation<?, PointF> f25709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BaseKeyframeAnimation<?, PointF> f25710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CircleShape f25711f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25713h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25706a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CompoundTrimPathContent f25712g = new CompoundTrimPathContent();

    public EllipseContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, CircleShape circleShape) {
        this.f25707b = circleShape.getName();
        this.f25708c = lottieDrawable;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation = circleShape.getSize().createAnimation();
        this.f25709d = baseKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation2 = circleShape.getPosition().createAnimation();
        this.f25710e = baseKeyframeAnimationCreateAnimation2;
        this.f25711f = circleShape;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t10 == LottieProperty.ELLIPSE_SIZE) {
            this.f25709d.setValueCallback(lottieValueCallback);
        } else if (t10 == LottieProperty.POSITION) {
            this.f25710e.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25707b;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public Path getPath() {
        boolean z10 = this.f25713h;
        Path path = this.f25706a;
        if (z10) {
            return path;
        }
        path.reset();
        CircleShape circleShape = this.f25711f;
        if (circleShape.isHidden()) {
            this.f25713h = true;
            return path;
        }
        PointF value = this.f25709d.getValue();
        float f6 = value.x / 2.0f;
        float f10 = value.y / 2.0f;
        float f11 = f6 * 0.55228f;
        float f12 = f10 * 0.55228f;
        path.reset();
        if (circleShape.isReversed()) {
            float f13 = -f10;
            path.moveTo(0.0f, f13);
            float f14 = 0.0f - f11;
            float f15 = -f6;
            float f16 = 0.0f - f12;
            path.cubicTo(f14, f13, f15, f16, f15, 0.0f);
            float f17 = f12 + 0.0f;
            path.cubicTo(f15, f17, f14, f10, 0.0f, f10);
            float f18 = f11 + 0.0f;
            path.cubicTo(f18, f10, f6, f17, f6, 0.0f);
            path.cubicTo(f6, f16, f18, f13, 0.0f, f13);
        } else {
            float f19 = -f10;
            path.moveTo(0.0f, f19);
            float f20 = f11 + 0.0f;
            float f21 = 0.0f - f12;
            path.cubicTo(f20, f19, f6, f21, f6, 0.0f);
            float f22 = f12 + 0.0f;
            path.cubicTo(f6, f22, f20, f10, 0.0f, f10);
            float f23 = 0.0f - f11;
            float f24 = -f6;
            path.cubicTo(f23, f10, f24, f22, f24, 0.0f);
            path.cubicTo(f24, f21, f23, f19, 0.0f, f19);
        }
        PointF value2 = this.f25710e.getValue();
        path.offset(value2.x, value2.y);
        path.close();
        this.f25712g.apply(path);
        this.f25713h = true;
        return path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f25713h = false;
        this.f25708c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i10, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i10, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Content content = list.get(i10);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f25821d == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f25712g.f25694a.add(trimPathContent);
                    trimPathContent.a(this);
                }
            }
        }
    }
}
