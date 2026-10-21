package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "focused", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,855:1\n81#2:856\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n*L\n844#1:856\n*E\n"})
public final class TextFieldDefaultsKt {
    /* JADX INFO: renamed from: access$animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State m874access$animateBorderStrokeAsStateNuRrP5Q(boolean z10, boolean z11, InteractionSource interactionSource, TextFieldColors textFieldColors, float f6, float f10, Composer composer, int i10) {
        State<Dp> stateRememberUpdatedState;
        composer.startReplaceableGroup(1097899920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1097899920, i10, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:835)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        State<Color> stateIndicatorColor = textFieldColors.indicatorColor(z10, z11, interactionSource, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168));
        float f11 = stateCollectIsFocusedAsState.getValue().booleanValue() ? f6 : f10;
        if (z10) {
            composer.startReplaceableGroup(1685712066);
            stateRememberUpdatedState = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(f11, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1685712164);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Dp.m4387boximpl(f10), composer, (i10 >> 15) & 14);
            composer.endReplaceableGroup();
        }
        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new BorderStroke(stateRememberUpdatedState.getValue().m4403unboximpl(), new SolidColor(stateIndicatorColor.getValue().m2518unboximpl(), null), null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState2;
    }
}
