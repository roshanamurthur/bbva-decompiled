package h0;

import androidx.compose.material.ButtonColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class e0 implements ButtonColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68728d;

    public e0(long j10, long j11, long j12, long j13) {
        this.f68725a = j10;
        this.f68726b = j11;
        this.f68727c = j12;
        this.f68728d = j13;
    }

    @Override // androidx.compose.material.ButtonColors
    @Composable
    @NotNull
    public final State<Color> backgroundColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-655254499);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-655254499, i10, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:586)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68725a : this.f68727c), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.ButtonColors
    @Composable
    @NotNull
    public final State<Color> contentColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-2133647540);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2133647540, i10, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:591)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68726b : this.f68728d), composer, 0);
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
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Color.m2509equalsimpl0(this.f68725a, e0Var.f68725a) && Color.m2509equalsimpl0(this.f68726b, e0Var.f68726b) && Color.m2509equalsimpl0(this.f68727c, e0Var.f68727c) && Color.m2509equalsimpl0(this.f68728d, e0Var.f68728d);
    }

    public final int hashCode() {
        return Color.m2515hashCodeimpl(this.f68728d) + androidx.collection.j.a(this.f68727c, androidx.collection.j.a(this.f68726b, Color.m2515hashCodeimpl(this.f68725a) * 31, 31), 31);
    }
}
