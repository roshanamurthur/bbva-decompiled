package h0;

import androidx.compose.material.SliderColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class l0 implements SliderColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f68887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f68888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f68889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f68890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f68891j;

    public l0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f68882a = j10;
        this.f68883b = j11;
        this.f68884c = j12;
        this.f68885d = j13;
        this.f68886e = j14;
        this.f68887f = j15;
        this.f68888g = j16;
        this.f68889h = j17;
        this.f68890i = j18;
        this.f68891j = j19;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Color.m2509equalsimpl0(this.f68882a, l0Var.f68882a) && Color.m2509equalsimpl0(this.f68883b, l0Var.f68883b) && Color.m2509equalsimpl0(this.f68884c, l0Var.f68884c) && Color.m2509equalsimpl0(this.f68885d, l0Var.f68885d) && Color.m2509equalsimpl0(this.f68886e, l0Var.f68886e) && Color.m2509equalsimpl0(this.f68887f, l0Var.f68887f) && Color.m2509equalsimpl0(this.f68888g, l0Var.f68888g) && Color.m2509equalsimpl0(this.f68889h, l0Var.f68889h) && Color.m2509equalsimpl0(this.f68890i, l0Var.f68890i) && Color.m2509equalsimpl0(this.f68891j, l0Var.f68891j);
    }

    public final int hashCode() {
        return Color.m2515hashCodeimpl(this.f68891j) + androidx.collection.j.a(this.f68890i, androidx.collection.j.a(this.f68889h, androidx.collection.j.a(this.f68888g, androidx.collection.j.a(this.f68887f, androidx.collection.j.a(this.f68886e, androidx.collection.j.a(this.f68885d, androidx.collection.j.a(this.f68884c, androidx.collection.j.a(this.f68883b, Color.m2515hashCodeimpl(this.f68882a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // androidx.compose.material.SliderColors
    @Composable
    @NotNull
    public final State<Color> thumbColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1733795637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1733795637, i10, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1086)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68882a : this.f68883b), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    @Composable
    @NotNull
    public final State<Color> tickColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-1491563694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1491563694, i10, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1102)");
        }
        if (z10) {
            j10 = z11 ? this.f68888g : this.f68889h;
        } else {
            j10 = z11 ? this.f68890i : this.f68891j;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    @Composable
    @NotNull
    public final State<Color> trackColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(1575395620);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575395620, i10, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1091)");
        }
        if (z10) {
            j10 = z11 ? this.f68884c : this.f68885d;
        } else {
            j10 = z11 ? this.f68886e : this.f68887f;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
