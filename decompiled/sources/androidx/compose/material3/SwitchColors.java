package androidx.compose.material3;

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

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u008c\u0001\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b$\u0010%J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\bJ\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/material3/SwitchColors;", "", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "thumbColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "thumbColor", "trackColor$material3_release", "trackColor", "borderColor$material3_release", "borderColor", "iconColor$material3_release", "iconColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SwitchColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f11887l;
    public final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f11888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f11889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f11890p;

    public SwitchColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, DefaultConstructorMarker defaultConstructorMarker) {
        this.f11876a = j10;
        this.f11877b = j11;
        this.f11878c = j12;
        this.f11879d = j13;
        this.f11880e = j14;
        this.f11881f = j15;
        this.f11882g = j16;
        this.f11883h = j17;
        this.f11884i = j18;
        this.f11885j = j19;
        this.f11886k = j20;
        this.f11887l = j21;
        this.m = j22;
        this.f11888n = j23;
        this.f11889o = j24;
        this.f11890p = j25;
    }

    @Composable
    @NotNull
    public final State<Color> borderColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(462653665);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(462653665, i10, -1, "androidx.compose.material3.SwitchColors.borderColor (Switch.kt:406)");
        }
        if (z10) {
            j10 = z11 ? this.f11878c : this.f11882g;
        } else {
            j10 = z11 ? this.f11886k : this.f11889o;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) other;
        return Color.m2509equalsimpl0(this.f11876a, switchColors.f11876a) && Color.m2509equalsimpl0(this.f11877b, switchColors.f11877b) && Color.m2509equalsimpl0(this.f11878c, switchColors.f11878c) && Color.m2509equalsimpl0(this.f11879d, switchColors.f11879d) && Color.m2509equalsimpl0(this.f11880e, switchColors.f11880e) && Color.m2509equalsimpl0(this.f11881f, switchColors.f11881f) && Color.m2509equalsimpl0(this.f11882g, switchColors.f11882g) && Color.m2509equalsimpl0(this.f11883h, switchColors.f11883h) && Color.m2509equalsimpl0(this.f11884i, switchColors.f11884i) && Color.m2509equalsimpl0(this.f11885j, switchColors.f11885j) && Color.m2509equalsimpl0(this.f11886k, switchColors.f11886k) && Color.m2509equalsimpl0(this.f11887l, switchColors.f11887l) && Color.m2509equalsimpl0(this.m, switchColors.m) && Color.m2509equalsimpl0(this.f11888n, switchColors.f11888n) && Color.m2509equalsimpl0(this.f11889o, switchColors.f11889o) && Color.m2509equalsimpl0(this.f11890p, switchColors.f11890p);
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.f11890p) + androidx.collection.j.a(this.f11889o, androidx.collection.j.a(this.f11888n, androidx.collection.j.a(this.m, androidx.collection.j.a(this.f11887l, androidx.collection.j.a(this.f11886k, androidx.collection.j.a(this.f11885j, androidx.collection.j.a(this.f11884i, androidx.collection.j.a(this.f11883h, androidx.collection.j.a(this.f11882g, androidx.collection.j.a(this.f11881f, androidx.collection.j.a(this.f11880e, androidx.collection.j.a(this.f11879d, androidx.collection.j.a(this.f11878c, androidx.collection.j.a(this.f11877b, Color.m2515hashCodeimpl(this.f11876a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Composable
    @NotNull
    public final State<Color> iconColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-153383122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-153383122, i10, -1, "androidx.compose.material3.SwitchColors.iconColor (Switch.kt:423)");
        }
        if (z10) {
            j10 = z11 ? this.f11879d : this.f11883h;
        } else {
            j10 = z11 ? this.f11887l : this.f11890p;
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
    public final State<Color> thumbColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-1539933265);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1539933265, i10, -1, "androidx.compose.material3.SwitchColors.thumbColor (Switch.kt:372)");
        }
        if (z10) {
            j10 = z11 ? this.f11876a : this.f11880e;
        } else {
            j10 = z11 ? this.f11884i : this.m;
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
        composer.startReplaceableGroup(961511844);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(961511844, i10, -1, "androidx.compose.material3.SwitchColors.trackColor (Switch.kt:389)");
        }
        if (z10) {
            j10 = z11 ? this.f11877b : this.f11881f;
        } else {
            j10 = z11 ? this.f11885j : this.f11888n;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
