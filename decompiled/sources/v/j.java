package v;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f93933p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f93934q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ScrollScope f93935r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f93936s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(float f6, Ref.FloatRef floatRef, ScrollScope scrollScope, Function1<? super Float, Unit> function1) {
        super(1);
        this.f93933p0 = f6;
        this.f93934q0 = floatRef;
        this.f93935r0 = scrollScope;
        this.f93936s0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        AnimationScope<Float, AnimationVector1D> animateDecay = animationScope;
        Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
        float fAbs = Math.abs(animateDecay.getValue().floatValue());
        float f6 = this.f93933p0;
        float fAbs2 = Math.abs(f6);
        Function1<Float, Unit> function1 = this.f93936s0;
        ScrollScope scrollScope = this.f93935r0;
        Ref.FloatRef floatRef = this.f93934q0;
        if (fAbs >= fAbs2) {
            float fAccess$coerceToTarget = SnapFlingBehaviorKt.access$coerceToTarget(animateDecay.getValue().floatValue(), f6);
            SnapFlingBehaviorKt.access$animateDecay$consumeDelta(animateDecay, scrollScope, function1, fAccess$coerceToTarget - floatRef.element);
            animateDecay.cancelAnimation();
            floatRef.element = fAccess$coerceToTarget;
        } else {
            SnapFlingBehaviorKt.access$animateDecay$consumeDelta(animateDecay, scrollScope, function1, animateDecay.getValue().floatValue() - floatRef.element);
            floatRef.element = animateDecay.getValue().floatValue();
        }
        return Unit.INSTANCE;
    }
}
