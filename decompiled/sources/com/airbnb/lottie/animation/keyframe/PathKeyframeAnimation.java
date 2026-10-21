package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PathKeyframeAnimation extends a<PointF> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PointF f25856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f25857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f25858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PathMeasure f25859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PathKeyframe f25860k;

    public PathKeyframeAnimation(List<? extends Keyframe<PointF>> list) {
        super(list);
        this.f25856g = new PointF();
        this.f25857h = new float[2];
        this.f25858i = new float[2];
        this.f25859j = new PathMeasure();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f6) {
        return getValue((Keyframe<PointF>) keyframe, f6);
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
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue(Keyframe<PointF> keyframe, float f6) {
        PointF pointF;
        PathKeyframe pathKeyframe = (PathKeyframe) keyframe;
        Path path = pathKeyframe.f25854h;
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback != 0 && keyframe.endFrame != null && (pointF = (PointF) lottieValueCallback.getValueInternal(pathKeyframe.startFrame, pathKeyframe.endFrame.floatValue(), (PointF) pathKeyframe.startValue, (PointF) pathKeyframe.endValue, b(), f6, getProgress())) != null) {
            return pointF;
        }
        if (path == null) {
            return keyframe.startValue;
        }
        PathKeyframe pathKeyframe2 = this.f25860k;
        PathMeasure pathMeasure = this.f25859j;
        if (pathKeyframe2 != pathKeyframe) {
            pathMeasure.setPath(path, false);
            this.f25860k = pathKeyframe;
        }
        float length = pathMeasure.getLength();
        float f10 = f6 * length;
        float[] fArr = this.f25857h;
        float[] fArr2 = this.f25858i;
        pathMeasure.getPosTan(f10, fArr, fArr2);
        PointF pointF2 = this.f25856g;
        pointF2.set(fArr[0], fArr[1]);
        if (f10 < 0.0f) {
            pointF2.offset(fArr2[0] * f10, fArr2[1] * f10);
        } else if (f10 > length) {
            float f11 = f10 - length;
            pointF2.offset(fArr2[0] * f11, fArr2[1] * f11);
        }
        return pointF2;
    }
}
