package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.content.ShapeModifierContent;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeKeyframeAnimation extends BaseKeyframeAnimation<ShapeData, Path> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShapeData f25863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f25864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Path f25865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Path f25866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<ShapeModifierContent> f25867k;

    public ShapeKeyframeAnimation(List<Keyframe<ShapeData>> list) {
        super(list);
        this.f25863g = new ShapeData();
        this.f25864h = new Path();
    }

    public void setShapeModifiers(@Nullable List<ShapeModifierContent> list) {
        this.f25867k = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
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
    public Path getValue(Keyframe<ShapeData> keyframe, float f6) {
        ShapeData shapeData = keyframe.startValue;
        ShapeData shapeData2 = keyframe.endValue;
        ShapeData shapeData3 = shapeData2 == null ? shapeData : shapeData2;
        ShapeData shapeDataModifyShape = this.f25863g;
        shapeDataModifyShape.interpolateBetween(shapeData, shapeData3, f6);
        List<ShapeModifierContent> list = this.f25867k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                shapeDataModifyShape = this.f25867k.get(size).modifyShape(shapeDataModifyShape);
            }
        }
        Path path = this.f25864h;
        MiscUtils.getPathFromData(shapeDataModifyShape, path);
        if (this.valueCallback == null) {
            return path;
        }
        if (this.f25865i == null) {
            this.f25865i = new Path();
            this.f25866j = new Path();
        }
        MiscUtils.getPathFromData(shapeData, this.f25865i);
        if (shapeData2 != null) {
            MiscUtils.getPathFromData(shapeData2, this.f25866j);
        }
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        float f10 = keyframe.startFrame;
        float fFloatValue = keyframe.endFrame.floatValue();
        Path path2 = this.f25865i;
        return (Path) lottieValueCallback.getValueInternal(f10, fFloatValue, path2, shapeData2 == null ? path2 : this.f25866j, f6, b(), getProgress());
    }
}
