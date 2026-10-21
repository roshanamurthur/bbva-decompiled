package y;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import bk.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Lambda implements Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutMeasureScope f94700p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f94701q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f94702r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f94703s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j10, int i10, int i11) {
        super(3);
        this.f94700p0 = lazyLayoutMeasureScope;
        this.f94701q0 = j10;
        this.f94702r0 = i10;
        this.f94703s0 = i11;
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
    @Override // kotlin.jvm.functions.Function3
    public final MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        Function1<? super Placeable.PlacementScope, ? extends Unit> placement = function1;
        Intrinsics.checkNotNullParameter(placement, "placement");
        int i10 = iIntValue + this.f94702r0;
        long j10 = this.f94701q0;
        return this.f94700p0.layout(ConstraintsKt.m4371constrainWidthK40F9xA(j10, i10), ConstraintsKt.m4370constrainHeightK40F9xA(j10, iIntValue2 + this.f94703s0), q.emptyMap(), placement);
    }
}
