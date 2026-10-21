package h0;

import androidx.compose.material.SwitchColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class m0 implements SwitchColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f68906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f68907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f68908h;

    public m0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f68901a = j10;
        this.f68902b = j11;
        this.f68903c = j12;
        this.f68904d = j13;
        this.f68905e = j14;
        this.f68906f = j15;
        this.f68907g = j16;
        this.f68908h = j17;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Color.m2509equalsimpl0(this.f68901a, m0Var.f68901a) && Color.m2509equalsimpl0(this.f68902b, m0Var.f68902b) && Color.m2509equalsimpl0(this.f68903c, m0Var.f68903c) && Color.m2509equalsimpl0(this.f68904d, m0Var.f68904d) && Color.m2509equalsimpl0(this.f68905e, m0Var.f68905e) && Color.m2509equalsimpl0(this.f68906f, m0Var.f68906f) && Color.m2509equalsimpl0(this.f68907g, m0Var.f68907g) && Color.m2509equalsimpl0(this.f68908h, m0Var.f68908h);
    }

    public final int hashCode() {
        return Color.m2515hashCodeimpl(this.f68908h) + androidx.collection.j.a(this.f68907g, androidx.collection.j.a(this.f68906f, androidx.collection.j.a(this.f68905e, androidx.collection.j.a(this.f68904d, androidx.collection.j.a(this.f68903c, androidx.collection.j.a(this.f68902b, Color.m2515hashCodeimpl(this.f68901a) * 31, 31), 31), 31), 31), 31), 31);
    }

    @Override // androidx.compose.material.SwitchColors
    @Composable
    @NotNull
    public final State<Color> thumbColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-66424183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-66424183, i10, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:366)");
        }
        if (z10) {
            j10 = z11 ? this.f68901a : this.f68903c;
        } else {
            j10 = z11 ? this.f68905e : this.f68907g;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SwitchColors
    @Composable
    @NotNull
    public final State<Color> trackColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-1176343362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1176343362, i10, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:377)");
        }
        if (z10) {
            j10 = z11 ? this.f68902b : this.f68904d;
        } else {
            j10 = z11 ? this.f68906f : this.f68908h;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
