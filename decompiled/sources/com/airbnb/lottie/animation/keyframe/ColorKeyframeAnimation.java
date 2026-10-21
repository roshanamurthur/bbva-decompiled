package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ColorKeyframeAnimation extends a<Integer> {
    public ColorKeyframeAnimation(List<Keyframe<Integer>> list) {
        super(list);
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
    public int getIntValue(Keyframe<Integer> keyframe, float f6) {
        Float f10;
        Integer num;
        if (keyframe.startValue == null || keyframe.endValue == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        return (lottieValueCallback == 0 || (f10 = keyframe.endFrame) == null || (num = (Integer) lottieValueCallback.getValueInternal(keyframe.startFrame, f10.floatValue(), keyframe.startValue, keyframe.endValue, f6, b(), getProgress())) == null) ? GammaEvaluator.evaluate(MiscUtils.clamp(f6, 0.0f, 1.0f), keyframe.startValue.intValue(), keyframe.endValue.intValue()) : num.intValue();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object getValue(Keyframe keyframe, float f6) {
        return Integer.valueOf(getIntValue(keyframe, f6));
    }

    public int getIntValue() {
        return getIntValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
