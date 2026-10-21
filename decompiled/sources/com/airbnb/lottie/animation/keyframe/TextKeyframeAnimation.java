package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TextKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.a<DocumentData> {

    public class a extends LottieValueCallback<DocumentData> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LottieFrameInfo f25872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LottieValueCallback f25873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ DocumentData f25874e;

        public a(LottieFrameInfo lottieFrameInfo, LottieValueCallback lottieValueCallback, DocumentData documentData) {
            this.f25872c = lottieFrameInfo;
            this.f25873d = lottieValueCallback;
            this.f25874e = documentData;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final DocumentData getValue(LottieFrameInfo<DocumentData> lottieFrameInfo) {
            this.f25872c.set(lottieFrameInfo.getStartFrame(), lottieFrameInfo.getEndFrame(), lottieFrameInfo.getStartValue().text, lottieFrameInfo.getEndValue().text, lottieFrameInfo.getLinearKeyframeProgress(), lottieFrameInfo.getInterpolatedKeyframeProgress(), lottieFrameInfo.getOverallProgress());
            String str = (String) this.f25873d.getValue(this.f25872c);
            DocumentData endValue = lottieFrameInfo.getInterpolatedKeyframeProgress() == 1.0f ? lottieFrameInfo.getEndValue() : lottieFrameInfo.getStartValue();
            this.f25874e.set(str, endValue.fontName, endValue.size, endValue.justification, endValue.tracking, endValue.lineHeight, endValue.baselineShift, endValue.color, endValue.strokeColor, endValue.strokeWidth, endValue.strokeOverFill, endValue.boxPosition, endValue.boxSize);
            return this.f25874e;
        }
    }

    public TextKeyframeAnimation(List<Keyframe<DocumentData>> list) {
        super(list);
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
    public final Object getValue(Keyframe keyframe, float f6) {
        T t10;
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback == 0) {
            return (f6 != 1.0f || (t10 = keyframe.endValue) == 0) ? (DocumentData) keyframe.startValue : (DocumentData) t10;
        }
        float f10 = keyframe.startFrame;
        Float f11 = keyframe.endFrame;
        float fFloatValue = f11 == null ? Float.MAX_VALUE : f11.floatValue();
        DocumentData documentData = (DocumentData) keyframe.startValue;
        T t11 = keyframe.endValue;
        return (DocumentData) lottieValueCallback.getValueInternal(f10, fFloatValue, documentData, t11 == 0 ? documentData : (DocumentData) t11, f6, getInterpolatedCurrentKeyframeProgress(), getProgress());
    }

    public void setStringValueCallback(LottieValueCallback<String> lottieValueCallback) {
        super.setValueCallback(new a(new LottieFrameInfo(), lottieValueCallback, new DocumentData()));
    }
}
