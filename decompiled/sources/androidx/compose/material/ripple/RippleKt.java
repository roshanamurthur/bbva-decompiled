package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/foundation/Indication;", "rememberRipple-9IZ8Weo", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "rememberRipple", "material-ripple_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,355:1\n50#2:356\n49#2:357\n1097#3,6:358\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n*L\n83#1:356\n83#1:357\n83#1:358,6\n*E\n"})
public final class RippleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Float> f8986a = new TweenSpec<>(15, 0, EasingKt.getLinearEasing(), 2, null);

    public static final AnimationSpec access$incomingStateLayerAnimationSpecFor(Interaction interaction) {
        boolean z10 = interaction instanceof HoverInteraction.Enter;
        TweenSpec<Float> tweenSpec = f8986a;
        if (z10) {
            return tweenSpec;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null);
        }
        return interaction instanceof DragInteraction.Start ? new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null) : tweenSpec;
    }

    public static final AnimationSpec access$outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        boolean z10 = interaction instanceof HoverInteraction.Enter;
        TweenSpec<Float> tweenSpec = f8986a;
        return (z10 || (interaction instanceof FocusInteraction.Focus) || !(interaction instanceof DragInteraction.Start)) ? tweenSpec : new TweenSpec(150, 0, EasingKt.getLinearEasing(), 2, null);
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: rememberRipple-9IZ8Weo, reason: not valid java name */
    public static final Indication m900rememberRipple9IZ8Weo(boolean z10, float f6, long j10, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1635163520);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f6 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            j10 = Color.INSTANCE.m2544getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1635163520, i10, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:76)");
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, (i10 >> 6) & 14);
        Boolean boolValueOf = Boolean.valueOf(z10);
        Dp dpM4387boximpl = Dp.m4387boximpl(f6);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(boolValueOf) | composer.changed(dpM4387boximpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new PlatformRipple(z10, f6, stateRememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        PlatformRipple platformRipple = (PlatformRipple) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return platformRipple;
    }
}
