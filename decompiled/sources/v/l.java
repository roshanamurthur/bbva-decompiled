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
public final class l extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f93943p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f93944q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ScrollScope f93945r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f93946s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(float f6, Ref.FloatRef floatRef, ScrollScope scrollScope, Function1<? super Float, Unit> function1) {
        super(1);
        this.f93943p0 = f6;
        this.f93944q0 = floatRef;
        this.f93945r0 = scrollScope;
        this.f93946s0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        AnimationScope<Float, AnimationVector1D> animateTo = animationScope;
        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
        float fAccess$coerceToTarget = SnapFlingBehaviorKt.access$coerceToTarget(animateTo.getValue().floatValue(), this.f93943p0);
        Ref.FloatRef floatRef = this.f93944q0;
        float f6 = fAccess$coerceToTarget - floatRef.element;
        float fScrollBy = this.f93945r0.scrollBy(f6);
        this.f93946s0.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f6 - fScrollBy) > 0.5f || fAccess$coerceToTarget != animateTo.getValue().floatValue()) {
            animateTo.cancelAnimation();
        }
        floatRef.element += fScrollBy;
        return Unit.INSTANCE;
    }
}
