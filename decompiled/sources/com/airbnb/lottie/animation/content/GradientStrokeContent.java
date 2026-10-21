package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes2.dex */
public class GradientStrokeContent extends BaseStrokeContent {

    @Nullable
    public ValueCallbackKeyframeAnimation A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f25746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f25747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LongSparseArray<LinearGradient> f25748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LongSparseArray<RadialGradient> f25749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f25750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final GradientType f25751v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f25752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final BaseKeyframeAnimation<GradientColor, GradientColor> f25753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BaseKeyframeAnimation<PointF, PointF> f25754y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final BaseKeyframeAnimation<PointF, PointF> f25755z;

    public GradientStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, GradientStroke gradientStroke) {
        super(lottieDrawable, baseLayer, gradientStroke.getCapType().toPaintCap(), gradientStroke.getJoinType().toPaintJoin(), gradientStroke.getMiterLimit(), gradientStroke.getOpacity(), gradientStroke.getWidth(), gradientStroke.getLineDashPattern(), gradientStroke.getDashOffset());
        this.f25748s = new LongSparseArray<>();
        this.f25749t = new LongSparseArray<>();
        this.f25750u = new RectF();
        this.f25746q = gradientStroke.getName();
        this.f25751v = gradientStroke.getGradientType();
        this.f25747r = gradientStroke.isHidden();
        this.f25752w = (int) (lottieDrawable.getComposition().getDuration() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> baseKeyframeAnimationCreateAnimation = gradientStroke.getGradientColor().createAnimation();
        this.f25753x = baseKeyframeAnimationCreateAnimation;
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation2 = gradientStroke.getStartPoint().createAnimation();
        this.f25754y = baseKeyframeAnimationCreateAnimation2;
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation3 = gradientStroke.getEndPoint().createAnimation();
        this.f25755z = baseKeyframeAnimationCreateAnimation3;
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
    }

    public final int[] a(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.A;
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
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t10, lottieValueCallback);
        if (t10 == LottieProperty.GRADIENT_COLOR) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.A;
            if (valueCallbackKeyframeAnimation != null) {
                this.layer.removeAnimation(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.A = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.A = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.layer.addAnimation(this.A);
        }
    }

    public final int b() {
        float progress = this.f25754y.getProgress();
        int i10 = this.f25752w;
        int iRound = Math.round(progress * i10);
        int iRound2 = Math.round(this.f25755z.getProgress() * i10);
        int iRound3 = Math.round(this.f25753x.getProgress() * i10);
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
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i10) {
        RadialGradient linearGradient;
        if (this.f25747r) {
            return;
        }
        getBounds(this.f25750u, matrix, false);
        GradientType gradientType = GradientType.LINEAR;
        GradientType gradientType2 = this.f25751v;
        BaseKeyframeAnimation<GradientColor, GradientColor> baseKeyframeAnimation = this.f25753x;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation2 = this.f25755z;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation3 = this.f25754y;
        if (gradientType2 == gradientType) {
            long jB = b();
            LongSparseArray<LinearGradient> longSparseArray = this.f25748s;
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
            LongSparseArray<RadialGradient> longSparseArray2 = this.f25749t;
            linearGradient = longSparseArray2.get(jB2);
            if (linearGradient == null) {
                PointF value4 = baseKeyframeAnimation3.getValue();
                PointF value5 = baseKeyframeAnimation2.getValue();
                GradientColor value6 = baseKeyframeAnimation.getValue();
                int[] iArrA = a(value6.getColors());
                float[] positions = value6.getPositions();
                float f6 = value4.x;
                float f10 = value4.y;
                RadialGradient radialGradient = new RadialGradient(f6, f10, (float) Math.hypot(value5.x - f6, value5.y - f10), iArrA, positions, Shader.TileMode.CLAMP);
                longSparseArray2.put(jB2, radialGradient);
                linearGradient = radialGradient;
            }
        }
        this.f25684h.setShader(linearGradient);
        super.draw(canvas, matrix, i10);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f25746q;
    }
}
