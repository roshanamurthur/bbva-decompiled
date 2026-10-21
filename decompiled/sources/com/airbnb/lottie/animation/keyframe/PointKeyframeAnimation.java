package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import androidx.datastore.preferences.protobuf.e;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PointKeyframeAnimation extends a<PointF> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PointF f25861g;

    public PointKeyframeAnimation(List<Keyframe<PointF>> list) {
        super(list);
        this.f25861g = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f6) {
        return getValue((Keyframe<PointF>) keyframe, f6);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f6, float f10, float f11) {
        return getValue((Keyframe<PointF>) keyframe, f6, f10, f11);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue(Keyframe<PointF> keyframe, float f6) {
        return getValue(keyframe, f6, f6, f6);
    }

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
    public PointF getValue(Keyframe<PointF> keyframe, float f6, float f10, float f11) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = keyframe.startValue;
        if (pointF3 != null && (pointF = keyframe.endValue) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            LottieValueCallback<A> lottieValueCallback = this.valueCallback;
            if (lottieValueCallback != 0 && (pointF2 = (PointF) lottieValueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), pointF4, pointF5, f6, b(), getProgress())) != null) {
                return pointF2;
            }
            PointF pointF6 = this.f25861g;
            float f12 = pointF4.x;
            float fA = e.a(pointF5.x, f12, f10, f12);
            float f13 = pointF4.y;
            pointF6.set(fA, e.a(pointF5.y, f13, f11, f13));
            return pointF6;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
