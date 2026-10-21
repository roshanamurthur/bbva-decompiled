package l0;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p5 extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final p5 f82806p0 = new p5(3);

    @Override // kotlin.jvm.functions.Function3
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
        Transition.Segment<Boolean> segment2 = segment;
        Composer composer2 = composer;
        int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, -281714272);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-281714272, iD, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:720)");
        }
        TweenSpec tweenSpecTween$default = segment2.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null) : AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return tweenSpecTween$default;
    }
}
