package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\\\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/SliderColors;", "", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "thumbColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "thumbColor", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "trackColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trackColor", "tickColor$material3_release", "tickColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SliderColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11306j;

    public SliderColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, DefaultConstructorMarker defaultConstructorMarker) {
        this.f11297a = j10;
        this.f11298b = j11;
        this.f11299c = j12;
        this.f11300d = j13;
        this.f11301e = j14;
        this.f11302f = j15;
        this.f11303g = j16;
        this.f11304h = j17;
        this.f11305i = j18;
        this.f11306j = j19;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) other;
        return Color.m2509equalsimpl0(this.f11297a, sliderColors.f11297a) && Color.m2509equalsimpl0(this.f11298b, sliderColors.f11298b) && Color.m2509equalsimpl0(this.f11299c, sliderColors.f11299c) && Color.m2509equalsimpl0(this.f11300d, sliderColors.f11300d) && Color.m2509equalsimpl0(this.f11301e, sliderColors.f11301e) && Color.m2509equalsimpl0(this.f11302f, sliderColors.f11302f) && Color.m2509equalsimpl0(this.f11303g, sliderColors.f11303g) && Color.m2509equalsimpl0(this.f11304h, sliderColors.f11304h) && Color.m2509equalsimpl0(this.f11305i, sliderColors.f11305i) && Color.m2509equalsimpl0(this.f11306j, sliderColors.f11306j);
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.f11306j) + androidx.collection.j.a(this.f11305i, androidx.collection.j.a(this.f11304h, androidx.collection.j.a(this.f11303g, androidx.collection.j.a(this.f11302f, androidx.collection.j.a(this.f11301e, androidx.collection.j.a(this.f11300d, androidx.collection.j.a(this.f11299c, androidx.collection.j.a(this.f11298b, Color.m2515hashCodeimpl(this.f11297a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Composable
    @NotNull
    public final State<Color> thumbColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1917959445);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1917959445, i10, -1, "androidx.compose.material3.SliderColors.thumbColor (Slider.kt:1352)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f11297a : this.f11302f), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> tickColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(337026738);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(337026738, i10, -1, "androidx.compose.material3.SliderColors.tickColor (Slider.kt:1368)");
        }
        if (z10) {
            j10 = z11 ? this.f11299c : this.f11301e;
        } else {
            j10 = z11 ? this.f11304h : this.f11306j;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> trackColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(760609284);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(760609284, i10, -1, "androidx.compose.material3.SliderColors.trackColor (Slider.kt:1357)");
        }
        if (z10) {
            j10 = z11 ? this.f11298b : this.f11300d;
        } else {
            j10 = z11 ? this.f11303g : this.f11305i;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
