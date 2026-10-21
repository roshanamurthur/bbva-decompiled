package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.e;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PolystarContent implements b, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LottieDrawable f25768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PolystarShape.Type f25769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f25771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FloatKeyframeAnimation f25772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final BaseKeyframeAnimation<?, PointF> f25773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FloatKeyframeAnimation f25774l;

    @Nullable
    public final FloatKeyframeAnimation m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FloatKeyframeAnimation f25775n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final FloatKeyframeAnimation f25776o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FloatKeyframeAnimation f25777p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25779r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25763a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f25764b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PathMeasure f25765c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f25766d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CompoundTrimPathContent f25778q = new CompoundTrimPathContent();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25780a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f25780a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25780a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolystarContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, PolystarShape polystarShape) {
        this.f25768f = lottieDrawable;
        this.f25767e = polystarShape.getName();
        PolystarShape.Type type = polystarShape.getType();
        this.f25769g = type;
        this.f25770h = polystarShape.isHidden();
        this.f25771i = polystarShape.isReversed();
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = polystarShape.getPoints().createAnimation();
        this.f25772j = floatKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation = polystarShape.getPosition().createAnimation();
        this.f25773k = baseKeyframeAnimationCreateAnimation;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation2 = polystarShape.getRotation().createAnimation();
        this.f25774l = floatKeyframeAnimationCreateAnimation2;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation3 = polystarShape.getOuterRadius().createAnimation();
        this.f25775n = floatKeyframeAnimationCreateAnimation3;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation4 = polystarShape.getOuterRoundedness().createAnimation();
        this.f25777p = floatKeyframeAnimationCreateAnimation4;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.m = polystarShape.getInnerRadius().createAnimation();
            this.f25776o = polystarShape.getInnerRoundedness().createAnimation();
        } else {
            this.m = null;
            this.f25776o = null;
        }
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation3);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation4);
        if (type == type2) {
            baseLayer.addAnimation(this.m);
            baseLayer.addAnimation(this.f25776o);
        }
        floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        if (type == type2) {
            this.m.addUpdateListener(this);
            this.f25776o.addUpdateListener(this);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        FloatKeyframeAnimation floatKeyframeAnimation;
        FloatKeyframeAnimation floatKeyframeAnimation2;
        if (t10 == LottieProperty.POLYSTAR_POINTS) {
            this.f25772j.setValueCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.POLYSTAR_ROTATION) {
            this.f25774l.setValueCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.POSITION) {
            this.f25773k.setValueCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.POLYSTAR_INNER_RADIUS && (floatKeyframeAnimation2 = this.m) != null) {
            floatKeyframeAnimation2.setValueCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.POLYSTAR_OUTER_RADIUS) {
            this.f25775n.setValueCallback(lottieValueCallback);
            return;
        }
        if (t10 == LottieProperty.POLYSTAR_INNER_ROUNDEDNESS && (floatKeyframeAnimation = this.f25776o) != null) {
            floatKeyframeAnimation.setValueCallback(lottieValueCallback);
        } else if (t10 == LottieProperty.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.f25777p.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25767e;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public Path getPath() {
        float f6;
        double d2;
        float f10;
        float f11;
        float f12;
        int i10;
        double d3;
        PolystarContent polystarContent;
        float f13;
        PolystarContent polystarContent2 = this;
        boolean z10 = polystarContent2.f25779r;
        Path path = polystarContent2.f25763a;
        if (z10) {
            return path;
        }
        path.reset();
        if (polystarContent2.f25770h) {
            polystarContent2.f25779r = true;
            return path;
        }
        int i11 = a.f25780a[polystarContent2.f25769g.ordinal()];
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = polystarContent2.f25773k;
        FloatKeyframeAnimation floatKeyframeAnimation = polystarContent2.f25775n;
        FloatKeyframeAnimation floatKeyframeAnimation2 = polystarContent2.f25777p;
        FloatKeyframeAnimation floatKeyframeAnimation3 = polystarContent2.f25774l;
        FloatKeyframeAnimation floatKeyframeAnimation4 = polystarContent2.f25772j;
        if (i11 == 1) {
            boolean z11 = false;
            float fFloatValue = floatKeyframeAnimation4.getValue().floatValue();
            double radians = Math.toRadians((floatKeyframeAnimation3 != null ? floatKeyframeAnimation3.getValue().floatValue() : 0.0d) - 90.0d);
            double d7 = fFloatValue;
            float f14 = (float) (6.283185307179586d / d7);
            if (polystarContent2.f25771i) {
                f14 *= -1.0f;
            }
            float f15 = f14;
            float f16 = f15 / 2.0f;
            float f17 = fFloatValue - ((int) fFloatValue);
            if (f17 != 0.0f) {
                radians += (double) ((1.0f - f17) * f16);
            }
            float fFloatValue2 = floatKeyframeAnimation.getValue().floatValue();
            float fFloatValue3 = polystarContent2.m.getValue().floatValue();
            FloatKeyframeAnimation floatKeyframeAnimation5 = polystarContent2.f25776o;
            float fFloatValue4 = floatKeyframeAnimation5 != null ? floatKeyframeAnimation5.getValue().floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = floatKeyframeAnimation2 != null ? floatKeyframeAnimation2.getValue().floatValue() / 100.0f : 0.0f;
            if (f17 != 0.0f) {
                float fA = e.a(fFloatValue2, fFloatValue3, f17, fFloatValue3);
                double d10 = fA;
                float fCos = (float) (Math.cos(radians) * d10);
                float fSin = (float) (d10 * Math.sin(radians));
                path.moveTo(fCos, fSin);
                d2 = radians + ((double) ((f15 * f17) / 2.0f));
                f11 = fCos;
                f12 = fA;
                f10 = fSin;
                f6 = f16;
            } else {
                double d11 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d11);
                float fSin2 = (float) (d11 * Math.sin(radians));
                path.moveTo(fCos2, fSin2);
                f6 = f16;
                d2 = radians + ((double) f6);
                f10 = fSin2;
                f11 = fCos2;
                f12 = 0.0f;
            }
            double dCeil = Math.ceil(d7) * 2.0d;
            double d12 = d2;
            int i12 = 0;
            float f18 = fFloatValue3;
            while (true) {
                double d13 = i12;
                if (d13 >= dCeil) {
                    break;
                }
                float f19 = z11 ? fFloatValue2 : f18;
                float f20 = (f12 == 0.0f || d13 != dCeil - 2.0d) ? f6 : (f15 * f17) / 2.0f;
                double d14 = (f12 == 0.0f || d13 != dCeil - 1.0d) ? f19 : f12;
                float f21 = f12;
                float f22 = f6;
                float fCos3 = (float) (Math.cos(d12) * d14);
                float fSin3 = (float) (d14 * Math.sin(d12));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                } else {
                    float f23 = f10;
                    double dAtan2 = (float) (Math.atan2(f10, f11) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f24 = f11;
                    double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan3);
                    float fSin5 = (float) Math.sin(dAtan3);
                    float f25 = z11 ? fFloatValue4 : fFloatValue5;
                    float f26 = z11 ? fFloatValue5 : fFloatValue4;
                    float f27 = (z11 ? f18 : fFloatValue2) * f25 * 0.47829f;
                    float f28 = fCos4 * f27;
                    float f29 = f27 * fSin4;
                    float f30 = (z11 ? fFloatValue2 : f18) * f26 * 0.47829f;
                    float f31 = fCos5 * f30;
                    float f32 = f30 * fSin5;
                    if (f17 != 0.0f) {
                        if (i12 == 0) {
                            f28 *= f17;
                            f29 *= f17;
                        } else if (d13 == dCeil - 1.0d) {
                            f31 *= f17;
                            f32 *= f17;
                        }
                    }
                    path.cubicTo(f24 - f28, f23 - f29, fCos3 + f31, fSin3 + f32, fCos3, fSin3);
                }
                d12 += (double) f20;
                z11 = !z11;
                i12++;
                f18 = f18;
                f11 = fCos3;
                f10 = fSin3;
                fFloatValue2 = fFloatValue2;
                f15 = f15;
                f6 = f22;
                f12 = f21;
            }
            PointF value = baseKeyframeAnimation.getValue();
            path.offset(value.x, value.y);
            path.close();
        } else if (i11 == 2) {
            int iFloor = (int) Math.floor(floatKeyframeAnimation4.getValue().floatValue());
            double radians2 = Math.toRadians((floatKeyframeAnimation3 != null ? floatKeyframeAnimation3.getValue().floatValue() : 0.0d) - 90.0d);
            double d15 = iFloor;
            float fFloatValue6 = floatKeyframeAnimation2.getValue().floatValue() / 100.0f;
            float fFloatValue7 = floatKeyframeAnimation.getValue().floatValue();
            double d16 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d16);
            float fSin6 = (float) (Math.sin(radians2) * d16);
            path.moveTo(fCos6, fSin6);
            double d17 = (float) (6.283185307179586d / d15);
            double dCeil2 = Math.ceil(d15);
            double d18 = radians2 + d17;
            int i13 = 0;
            while (true) {
                double d19 = i13;
                if (d19 >= dCeil2) {
                    break;
                }
                BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation2 = baseKeyframeAnimation;
                double d20 = d17;
                float fCos7 = (float) (Math.cos(d18) * d16);
                float fSin7 = (float) (Math.sin(d18) * d16);
                if (fFloatValue6 != 0.0f) {
                    d3 = d16;
                    double dAtan4 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan4);
                    float fSin8 = (float) Math.sin(dAtan4);
                    float f33 = fCos6;
                    i10 = i13;
                    double dAtan5 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f34 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f35 = fCos8 * f34;
                    float f36 = fSin8 * f34;
                    float fCos9 = ((float) Math.cos(dAtan5)) * f34;
                    float fSin9 = f34 * ((float) Math.sin(dAtan5));
                    if (d19 == dCeil2 - 1.0d) {
                        polystarContent = this;
                        Path path2 = polystarContent.f25764b;
                        path2.reset();
                        path2.moveTo(f33, fSin6);
                        float f37 = f33 - f35;
                        float f38 = fSin6 - f36;
                        float f39 = fCos7 + fCos9;
                        float f40 = fSin7 + fSin9;
                        path2.cubicTo(f37, f38, f39, f40, fCos7, fSin7);
                        PathMeasure pathMeasure = polystarContent.f25765c;
                        pathMeasure.setPath(path2, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = polystarContent.f25766d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path.cubicTo(f37, f38, f39, f40, fArr[0], fArr[1]);
                    } else {
                        polystarContent = this;
                        path.cubicTo(f33 - f35, fSin6 - f36, fCos7 + fCos9, fSin7 + fSin9, fCos7, fSin7);
                    }
                    f13 = fSin7;
                } else {
                    i10 = i13;
                    d3 = d16;
                    fFloatValue7 = fFloatValue7;
                    polystarContent = polystarContent2;
                    if (d19 == dCeil2 - 1.0d) {
                        f13 = fSin7;
                    } else {
                        f13 = fSin7;
                        path.lineTo(fCos7, f13);
                    }
                    fSin6 = f13;
                    polystarContent2 = polystarContent;
                    i13 = i10 + 1;
                    fCos6 = fCos7;
                    d16 = d3;
                    fFloatValue7 = fFloatValue7;
                    baseKeyframeAnimation = baseKeyframeAnimation2;
                    d17 = d20;
                }
                d18 += d20;
                fSin6 = f13;
                polystarContent2 = polystarContent;
                i13 = i10 + 1;
                fCos6 = fCos7;
                d16 = d3;
                fFloatValue7 = fFloatValue7;
                baseKeyframeAnimation = baseKeyframeAnimation2;
                d17 = d20;
            }
            PointF value2 = baseKeyframeAnimation.getValue();
            path.offset(value2.x, value2.y);
            path.close();
        }
        path.close();
        this.f25778q.apply(path);
        this.f25779r = true;
        return path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f25779r = false;
        this.f25768f.invalidateSelf();
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
                    this.f25778q.f25694a.add(trimPathContent);
                    trimPathContent.a(this);
                }
            }
        }
    }
}
