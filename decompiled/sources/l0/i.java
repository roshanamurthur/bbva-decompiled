package l0;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.material3.TopAppBarState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f82604p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TopAppBarState f82605q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f82606r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Ref.FloatRef floatRef, TopAppBarState topAppBarState, Ref.FloatRef floatRef2) {
        super(1);
        this.f82604p0 = floatRef;
        this.f82605q0 = topAppBarState;
        this.f82606r0 = floatRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        AnimationScope<Float, AnimationVector1D> animateDecay = animationScope;
        Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
        float fFloatValue = animateDecay.getValue().floatValue();
        Ref.FloatRef floatRef = this.f82604p0;
        float f6 = fFloatValue - floatRef.element;
        TopAppBarState topAppBarState = this.f82605q0;
        float heightOffset = topAppBarState.getHeightOffset();
        topAppBarState.setHeightOffset(heightOffset + f6);
        float fAbs = Math.abs(heightOffset - topAppBarState.getHeightOffset());
        floatRef.element = animateDecay.getValue().floatValue();
        this.f82606r0.element = animateDecay.getVelocity().floatValue();
        if (Math.abs(f6 - fAbs) > 0.5f) {
            animateDecay.cancelAnimation();
        }
        return Unit.INSTANCE;
    }
}
