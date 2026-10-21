package h0;

import androidx.compose.material.ChipColors;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterialApi
public final class g0 implements ChipColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f68782f;

    public g0(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f68777a = j10;
        this.f68778b = j11;
        this.f68779c = j12;
        this.f68780d = j13;
        this.f68781e = j14;
        this.f68782f = j15;
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    @NotNull
    public final State<Color> backgroundColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1593588247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1593588247, i10, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:592)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68777a : this.f68780d), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    @NotNull
    public final State<Color> contentColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(483145880);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(483145880, i10, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:597)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68778b : this.f68781e), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Color.m2509equalsimpl0(this.f68777a, g0Var.f68777a) && Color.m2509equalsimpl0(this.f68778b, g0Var.f68778b) && Color.m2509equalsimpl0(this.f68779c, g0Var.f68779c) && Color.m2509equalsimpl0(this.f68780d, g0Var.f68780d) && Color.m2509equalsimpl0(this.f68781e, g0Var.f68781e) && Color.m2509equalsimpl0(this.f68782f, g0Var.f68782f);
    }

    public final int hashCode() {
        return Color.m2515hashCodeimpl(this.f68782f) + androidx.collection.j.a(this.f68781e, androidx.collection.j.a(this.f68780d, androidx.collection.j.a(this.f68779c, androidx.collection.j.a(this.f68778b, Color.m2515hashCodeimpl(this.f68777a) * 31, 31), 31), 31), 31);
    }

    @Override // androidx.compose.material.ChipColors
    @Composable
    @NotNull
    public final State<Color> leadingIconContentColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1955749013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1955749013, i10, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:602)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68779c : this.f68782f), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
