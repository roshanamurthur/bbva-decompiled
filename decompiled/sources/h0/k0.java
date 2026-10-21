package h0;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.SelectableChipColors;
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
public final class k0 implements SelectableChipColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f68865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f68866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f68867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f68868i;

    public k0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f68860a = j10;
        this.f68861b = j11;
        this.f68862c = j12;
        this.f68863d = j13;
        this.f68864e = j14;
        this.f68865f = j15;
        this.f68866g = j16;
        this.f68867h = j17;
        this.f68868i = j18;
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @NotNull
    public final State<Color> backgroundColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-403836585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-403836585, i10, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:654)");
        }
        if (z10) {
            j10 = !z11 ? this.f68860a : this.f68866g;
        } else {
            j10 = this.f68863d;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @NotNull
    public final State<Color> contentColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(2025240134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025240134, i10, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:664)");
        }
        if (z10) {
            j10 = !z11 ? this.f68861b : this.f68867h;
        } else {
            j10 = this.f68864e;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
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
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Color.m2509equalsimpl0(this.f68860a, k0Var.f68860a) && Color.m2509equalsimpl0(this.f68861b, k0Var.f68861b) && Color.m2509equalsimpl0(this.f68862c, k0Var.f68862c) && Color.m2509equalsimpl0(this.f68863d, k0Var.f68863d) && Color.m2509equalsimpl0(this.f68864e, k0Var.f68864e) && Color.m2509equalsimpl0(this.f68865f, k0Var.f68865f) && Color.m2509equalsimpl0(this.f68866g, k0Var.f68866g) && Color.m2509equalsimpl0(this.f68867h, k0Var.f68867h) && Color.m2509equalsimpl0(this.f68868i, k0Var.f68868i);
    }

    public final int hashCode() {
        return Color.m2515hashCodeimpl(this.f68868i) + androidx.collection.j.a(this.f68867h, androidx.collection.j.a(this.f68866g, androidx.collection.j.a(this.f68865f, androidx.collection.j.a(this.f68864e, androidx.collection.j.a(this.f68863d, androidx.collection.j.a(this.f68862c, androidx.collection.j.a(this.f68861b, Color.m2515hashCodeimpl(this.f68860a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // androidx.compose.material.SelectableChipColors
    @Composable
    @NotNull
    public final State<Color> leadingIconColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(189838188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(189838188, i10, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:674)");
        }
        if (z10) {
            j10 = !z11 ? this.f68862c : this.f68868i;
        } else {
            j10 = this.f68865f;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
