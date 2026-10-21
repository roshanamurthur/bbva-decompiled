package l0;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$animateTooltip$2\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,770:1\n939#2:771\n857#2,5:772\n939#2:777\n857#2,5:778\n76#3:783\n76#3:784\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$animateTooltip$2\n*L\n701#1:771\n701#1:772,5\n720#1:777\n720#1:778,5\n701#1:783\n720#1:784\n*E\n"})
public final class r5 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Transition<Boolean> f82849p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(Transition<Boolean> transition) {
        super(3);
        this.f82849p0 = transition;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        int i10;
        Modifier modifier2 = modifier;
        Composer composer2 = composer;
        int iA = ci.a.a(num, modifier2, "$this$composed", composer2, -1498516085);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1498516085, iA, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:699)");
        }
        q5 q5Var = q5.f82826p0;
        composer2.startReplaceableGroup(-1338768149);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
        composer2.startReplaceableGroup(-142660079);
        Transition<Boolean> transition = this.f82849p0;
        boolean zBooleanValue = transition.getCurrentState().booleanValue();
        composer2.startReplaceableGroup(-1553362193);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:717)");
        }
        float f6 = zBooleanValue ? 1.0f : 0.8f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        Float fValueOf = Float.valueOf(f6);
        boolean zBooleanValue2 = transition.getTargetState().booleanValue();
        composer2.startReplaceableGroup(-1553362193);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:717)");
        }
        float f10 = zBooleanValue2 ? 1.0f : 0.8f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(f10), q5Var.invoke(transition.getSegment(), composer2, 0), vectorConverter, "tooltip transition: scaling", composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        p5 p5Var = p5.f82806p0;
        composer2.startReplaceableGroup(-1338768149);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
        composer2.startReplaceableGroup(-142660079);
        boolean zBooleanValue3 = transition.getCurrentState().booleanValue();
        composer2.startReplaceableGroup(2073045083);
        if (ComposerKt.isTraceInProgress()) {
            i10 = 0;
            ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:736)");
        } else {
            i10 = 0;
        }
        float f11 = zBooleanValue3 ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        Float fValueOf2 = Float.valueOf(f11);
        boolean zBooleanValue4 = transition.getTargetState().booleanValue();
        composer2.startReplaceableGroup(2073045083);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2073045083, i10, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:736)");
        }
        float f12 = zBooleanValue4 ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition, fValueOf2, Float.valueOf(f12), p5Var.invoke(transition.getSegment(), composer2, Integer.valueOf(i10)), vectorConverter2, "tooltip transition: alpha", composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        Modifier modifierM2651graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m2651graphicsLayerAp8cVGQ$default(modifier2, ((Number) stateCreateTransitionAnimation.getValue()).floatValue(), ((Number) stateCreateTransitionAnimation.getValue()).floatValue(), ((Number) stateCreateTransitionAnimation2.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierM2651graphicsLayerAp8cVGQ$default;
    }
}
