package l0;

import androidx.compose.material3.NavigationDrawerItemColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements NavigationDrawerItemColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f82857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f82858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f82859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f82860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f82861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f82862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f82863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f82864h;

    public s1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f82857a = j10;
        this.f82858b = j11;
        this.f82859c = j12;
        this.f82860d = j13;
        this.f82861e = j14;
        this.f82862f = j15;
        this.f82863g = j16;
        this.f82864h = j17;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    @NotNull
    public final State<Color> badgeColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-561675044);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561675044, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:803)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f82863g : this.f82864h), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    @NotNull
    public final State<Color> containerColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-433512770);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-433512770, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:796)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f82861e : this.f82862f), composer, 0);
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
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return Color.m2509equalsimpl0(this.f82857a, s1Var.f82857a) && Color.m2509equalsimpl0(this.f82858b, s1Var.f82858b) && Color.m2509equalsimpl0(this.f82859c, s1Var.f82859c) && Color.m2509equalsimpl0(this.f82860d, s1Var.f82860d) && Color.m2509equalsimpl0(this.f82861e, s1Var.f82861e) && Color.m2509equalsimpl0(this.f82862f, s1Var.f82862f) && Color.m2509equalsimpl0(this.f82863g, s1Var.f82863g) && Color.m2509equalsimpl0(this.f82864h, s1Var.f82864h);
    }

    public final int hashCode() {
        return Color.m2515hashCodeimpl(this.f82864h) + androidx.collection.j.a(this.f82863g, androidx.collection.j.a(this.f82862f, androidx.collection.j.a(this.f82861e, androidx.collection.j.a(this.f82860d, androidx.collection.j.a(this.f82859c, androidx.collection.j.a(this.f82858b, Color.m2515hashCodeimpl(this.f82857a) * 31, 31), 31), 31), 31), 31), 31);
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    @NotNull
    public final State<Color> iconColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1141354218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141354218, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:786)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f82857a : this.f82858b), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    @NotNull
    public final State<Color> textColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1275109558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1275109558, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:791)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f82859c : this.f82860d), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
