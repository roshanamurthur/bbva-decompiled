package v;

import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b<Float, AnimationVector1D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DecayAnimationSpec<Float> f93912a;

    public c(@NotNull DecayAnimationSpec<Float> decayAnimationSpec) {
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        this.f93912a = decayAnimationSpec;
    }

    @Override // v.b
    public final Object a(ScrollScope scrollScope, Float f6, Float f10, Function1 function1, m mVar) {
        Object objAccess$animateDecay = SnapFlingBehaviorKt.access$animateDecay(scrollScope, f6.floatValue(), AnimationStateKt.AnimationState$default(0.0f, f10.floatValue(), 0L, 0L, false, 28, null), this.f93912a, function1, mVar);
        return objAccess$animateDecay == ek.a.getCOROUTINE_SUSPENDED() ? objAccess$animateDecay : (a) objAccess$animateDecay;
    }
}
