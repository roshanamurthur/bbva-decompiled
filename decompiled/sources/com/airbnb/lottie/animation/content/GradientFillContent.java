package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class GradientFillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f25726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseLayer f25728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LongSparseArray<LinearGradient> f25729d = new LongSparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LongSparseArray<RadialGradient> f25730e = new LongSparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f25731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LPaint f25732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f25733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f25734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GradientType f25735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final BaseKeyframeAnimation<GradientColor, GradientColor> f25736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BaseKeyframeAnimation<Integer, Integer> f25737l;
    public final BaseKeyframeAnimation<PointF, PointF> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final BaseKeyframeAnimation<PointF, PointF> f25738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public ValueCallbackKeyframeAnimation f25739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ValueCallbackKeyframeAnimation f25740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LottieDrawable f25741q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f25742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public BaseKeyframeAnimation<Float, Float> f25743s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f25744t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final DropShadowKeyframeAnimation f25745u;

    public GradientFillContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer, GradientFill gradientFill) {
        Path path = new Path();
        this.f25731f = path;
        this.f25732g = new LPaint(1);
        this.f25733h = new RectF();
        this.f25734i = new ArrayList();
        this.f25744t = 0.0f;
        this.f25728c = baseLayer;
        this.f25726a = gradientFill.getName();
        this.f25727b = gradientFill.isHidden();
        this.f25741q = lottieDrawable;
        this.f25735j = gradientFill.getGradientType();
        path.setFillType(gradientFill.getFillType());
        this.f25742r = (int) (lottieComposition.getDuration() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> baseKeyframeAnimationCreateAnimation = gradientFill.getGradientColor().createAnimation();
        this.f25736k = baseKeyframeAnimationCreateAnimation;
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation2 = gradientFill.getOpacity().createAnimation();
        this.f25737l = baseKeyframeAnimationCreateAnimation2;
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation3 = gradientFill.getStartPoint().createAnimation();
        this.m = baseKeyframeAnimationCreateAnimation3;
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation4 = gradientFill.getEndPoint().createAnimation();
        this.f25738n = baseKeyframeAnimationCreateAnimation4;
        baseKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation4);
        if (baseLayer.getBlurEffect() != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.f25743s = floatKeyframeAnimationCreateAnimation;
            floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.f25743s);
        }
        if (baseLayer.getDropShadowEffect() != null) {
            this.f25745u = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.getDropShadowEffect());
        }
    }

    public final int[] a(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f25740p;
        if (valueCallbackKeyframeAnimation != null) {
            Integer[] numArr = (Integer[]) valueCallbackKeyframeAnimation.getValue();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (t10 == LottieProperty.OPACITY) {
            this.f25737l.setValueCallback(lottieValueCallback);
            return;
        }
        ColorFilter colorFilter = LottieProperty.COLOR_FILTER;
        BaseLayer baseLayer = this.f25728c;
        if (t10 == colorFilter) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f25739o;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.removeAnimation(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f25739o = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f25739o = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            baseLayer.addAnimation(this.f25739o);
            return;
        }
        if (t10 == LottieProperty.GRADIENT_COLOR) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = this.f25740p;
            if (valueCallbackKeyframeAnimation3 != null) {
                baseLayer.removeAnimation(valueCallbackKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.f25740p = null;
                return;
            }
            this.f25729d.clear();
            this.f25730e.clear();
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f25740p = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            baseLayer.addAnimation(this.f25740p);
            return;
        }
        if (t10 == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.f25743s;
            if (baseKeyframeAnimation != null) {
                baseKeyframeAnimation.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f25743s = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.addUpdateListener(this);
            baseLayer.addAnimation(this.f25743s);
            return;
        }
        Integer num = LottieProperty.DROP_SHADOW_COLOR;
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.f25745u;
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

    public final int b() {
        float progress = this.m.getProgress();
        int i10 = this.f25742r;
        int iRound = Math.round(progress * i10);
        int iRound2 = Math.round(this.f25738n.getProgress() * i10);
        int iRound3 = Math.round(this.f25736k.getProgress() * i10);
        int i11 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i11 = i11 * 31 * iRound2;
        }
        return iRound3 != 0 ? i11 * 31 * iRound3 : i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i10) {
        RadialGradient linearGradient;
        if (this.f25727b) {
            return;
        }
        if (L.isTraceEnabled()) {
            L.beginSection("GradientFillContent#draw");
        }
        Path path = this.f25731f;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f25734i;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((b) arrayList.get(i11)).getPath(), matrix);
            i11++;
        }
        path.computeBounds(this.f25733h, false);
        GradientType gradientType = GradientType.LINEAR;
        GradientType gradientType2 = this.f25735j;
        BaseKeyframeAnimation<GradientColor, GradientColor> baseKeyframeAnimation = this.f25736k;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation2 = this.f25738n;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation3 = this.m;
        if (gradientType2 == gradientType) {
            long jB = b();
            LongSparseArray<LinearGradient> longSparseArray = this.f25729d;
            linearGradient = (LinearGradient) longSparseArray.get(jB);
            if (linearGradient == null) {
                PointF value = baseKeyframeAnimation3.getValue();
                PointF value2 = baseKeyframeAnimation2.getValue();
                GradientColor value3 = baseKeyframeAnimation.getValue();
                linearGradient = new LinearGradient(value.x, value.y, value2.x, value2.y, a(value3.getColors()), value3.getPositions(), Shader.TileMode.CLAMP);
                longSparseArray.put(jB, linearGradient);
            }
        } else {
            long jB2 = b();
            LongSparseArray<RadialGradient> longSparseArray2 = this.f25730e;
            linearGradient = longSparseArray2.get(jB2);
            if (linearGradient == null) {
                PointF value4 = baseKeyframeAnimation3.getValue();
                PointF value5 = baseKeyframeAnimation2.getValue();
                GradientColor value6 = baseKeyframeAnimation.getValue();
                int[] iArrA = a(value6.getColors());
                float[] positions = value6.getPositions();
                float f6 = value4.x;
                float f10 = value4.y;
                float fHypot = (float) Math.hypot(value5.x - f6, value5.y - f10);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient = new RadialGradient(f6, f10, fHypot, iArrA, positions, Shader.TileMode.CLAMP);
                longSparseArray2.put(jB2, radialGradient);
                linearGradient = radialGradient;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        LPaint lPaint = this.f25732g;
        lPaint.setShader(linearGradient);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f25739o;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.f25743s;
        if (baseKeyframeAnimation4 != null) {
            float fFloatValue = baseKeyframeAnimation4.getValue().floatValue();
            if (fFloatValue == 0.0f) {
                lPaint.setMaskFilter(null);
            } else if (fFloatValue != this.f25744t) {
                lPaint.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f25744t = fFloatValue;
        }
        int iIntValue = (int) ((((i10 / 255.0f) * this.f25737l.getValue().intValue()) / 100.0f) * 255.0f);
        lPaint.setAlpha(MiscUtils.clamp(iIntValue, 0, 255));
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.f25745u;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.applyTo(lPaint, matrix, Utils.mixOpacities(i10, iIntValue));
        }
        canvas.drawPath(path, lPaint);
        if (L.isTraceEnabled()) {
            L.endSection("GradientFillContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f25731f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f25734i;
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
        return this.f25726a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.f25741q.invalidateSelf();
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
                this.f25734i.add((b) content);
            }
        }
    }
}
