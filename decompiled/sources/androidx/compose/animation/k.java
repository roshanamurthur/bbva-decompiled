package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, FiniteAnimationSpec<Float>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec<Float> f3235p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        super(3);
        this.f3235p0 = finiteAnimationSpec;
    }

    @Override // kotlin.jvm.functions.Function3
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Object> segment, Composer composer, Integer num) {
        Composer composer2 = composer;
        int iD = androidx.datastore.preferences.protobuf.e.d(num, segment, "$this$animateFloat", composer2, 438406499);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(438406499, iD, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return this.f3235p0;
    }
}
