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

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BL\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/ChipColors;", "", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "containerColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "containerColor", "labelColor$material3_release", "labelColor", "leadingIconContentColor$material3_release", "leadingIconContentColor", "trailingIconContentColor$material3_release", "trailingIconContentColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class ChipColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9670h;

    public ChipColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this.f9663a = j10;
        this.f9664b = j11;
        this.f9665c = j12;
        this.f9666d = j13;
        this.f9667e = j14;
        this.f9668f = j15;
        this.f9669g = j16;
        this.f9670h = j17;
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-136683658);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-136683658, i10, -1, "androidx.compose.material3.ChipColors.containerColor (Chip.kt:1776)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f9663a : this.f9667e), composer, 0);
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
        if (other == null || !(other instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) other;
        return Color.m2509equalsimpl0(this.f9663a, chipColors.f9663a) && Color.m2509equalsimpl0(this.f9664b, chipColors.f9664b) && Color.m2509equalsimpl0(this.f9665c, chipColors.f9665c) && Color.m2509equalsimpl0(this.f9666d, chipColors.f9666d) && Color.m2509equalsimpl0(this.f9667e, chipColors.f9667e) && Color.m2509equalsimpl0(this.f9668f, chipColors.f9668f) && Color.m2509equalsimpl0(this.f9669g, chipColors.f9669g) && Color.m2509equalsimpl0(this.f9670h, chipColors.f9670h);
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.f9670h) + androidx.collection.j.a(this.f9669g, androidx.collection.j.a(this.f9668f, androidx.collection.j.a(this.f9667e, androidx.collection.j.a(this.f9666d, androidx.collection.j.a(this.f9665c, androidx.collection.j.a(this.f9664b, Color.m2515hashCodeimpl(this.f9663a) * 31, 31), 31), 31), 31), 31), 31);
    }

    @Composable
    @NotNull
    public final State<Color> labelColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(559848681);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(559848681, i10, -1, "androidx.compose.material3.ChipColors.labelColor (Chip.kt:1786)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f9664b : this.f9668f), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> leadingIconContentColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(5136811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5136811, i10, -1, "androidx.compose.material3.ChipColors.leadingIconContentColor (Chip.kt:1796)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f9665c : this.f9669g), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> trailingIconContentColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(96182905);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(96182905, i10, -1, "androidx.compose.material3.ChipColors.trailingIconContentColor (Chip.kt:1808)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f9666d : this.f9670h), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
