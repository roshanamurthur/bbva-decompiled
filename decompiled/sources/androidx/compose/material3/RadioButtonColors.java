package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B,\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/RadioButtonColors;", "", "", "enabled", "selected", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "radioColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "radioColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class RadioButtonColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11118d;

    public RadioButtonColors(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this.f11115a = j10;
        this.f11116b = j11;
        this.f11117c = j12;
        this.f11118d = j13;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) other;
        return Color.m2509equalsimpl0(this.f11115a, radioButtonColors.f11115a) && Color.m2509equalsimpl0(this.f11116b, radioButtonColors.f11116b) && Color.m2509equalsimpl0(this.f11117c, radioButtonColors.f11117c) && Color.m2509equalsimpl0(this.f11118d, radioButtonColors.f11118d);
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.f11118d) + androidx.collection.j.a(this.f11117c, androidx.collection.j.a(this.f11116b, Color.m2515hashCodeimpl(this.f11115a) * 31, 31), 31);
    }

    @Composable
    @NotNull
    public final State<Color> radioColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        State<Color> stateRememberUpdatedState;
        composer.startReplaceableGroup(-1840145292);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1840145292, i10, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:182)");
        }
        if (z10 && z11) {
            j10 = this.f11115a;
        } else if (!z10 || z11) {
            j10 = (z10 || !z11) ? this.f11118d : this.f11117c;
        } else {
            j10 = this.f11116b;
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceableGroup(-1943770131);
            stateRememberUpdatedState = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1943770026);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j11), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
