package h0;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material.RadioButtonColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class j0 implements RadioButtonColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68846c;

    public j0(long j10, long j11, long j12) {
        this.f68844a = j10;
        this.f68845b = j11;
        this.f68846c = j12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Color.m2509equalsimpl0(this.f68844a, j0Var.f68844a) && Color.m2509equalsimpl0(this.f68845b, j0Var.f68845b) && Color.m2509equalsimpl0(this.f68846c, j0Var.f68846c);
    }

    public final int hashCode() {
        return Color.m2515hashCodeimpl(this.f68846c) + androidx.collection.j.a(this.f68845b, Color.m2515hashCodeimpl(this.f68844a) * 31, 31);
    }

    @Override // androidx.compose.material.RadioButtonColors
    @Composable
    @NotNull
    public final State<Color> radioColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        State<Color> stateRememberUpdatedState;
        composer.startReplaceableGroup(1243421834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243421834, i10, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)");
        }
        if (z10) {
            j10 = !z11 ? this.f68845b : this.f68844a;
        } else {
            j10 = this.f68846c;
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceableGroup(-1052799107);
            stateRememberUpdatedState = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1052799002);
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
