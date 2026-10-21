package v;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/LowVelocityApproachAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,531:1\n1#2:532\n*E\n"})
public final class d implements b<Float, AnimationVector1D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnimationSpec<Float> f93913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SnapLayoutInfoProvider f93914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Density f93915c;

    public d(@NotNull AnimationSpec<Float> lowVelocityAnimationSpec, @NotNull SnapLayoutInfoProvider layoutInfoProvider, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(lowVelocityAnimationSpec, "lowVelocityAnimationSpec");
        Intrinsics.checkNotNullParameter(layoutInfoProvider, "layoutInfoProvider");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f93913a = lowVelocityAnimationSpec;
        this.f93914b = layoutInfoProvider;
        this.f93915c = density;
    }

    @Override // v.b
    public final Object a(ScrollScope scrollScope, Float f6, Float f10, Function1 function1, m mVar) {
        float fFloatValue = f6.floatValue();
        float fFloatValue2 = f10.floatValue();
        Object objAccess$animateSnap = SnapFlingBehaviorKt.access$animateSnap(scrollScope, Math.signum(fFloatValue2) * (this.f93914b.calculateSnapStepSize(this.f93915c) + Math.abs(fFloatValue)), fFloatValue, AnimationStateKt.AnimationState$default(0.0f, fFloatValue2, 0L, 0L, false, 28, null), this.f93913a, function1, mVar);
        return objAccess$animateSnap == ek.a.getCOROUTINE_SUSPENDED() ? objAccess$animateSnap : (a) objAccess$animateSnap;
    }
}
