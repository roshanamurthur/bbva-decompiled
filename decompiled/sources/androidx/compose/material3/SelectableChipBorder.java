package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/SelectableChipBorder;", "", "", "enabled", "selected", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "borderStroke$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "borderStroke", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/graphics/Color;", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "Landroidx/compose/ui/unit/Dp;", "borderWidth", "selectedBorderWidth", "<init>", "(JJJJFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SelectableChipBorder {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f11232f;

    public SelectableChipBorder(long j10, long j11, long j12, long j13, float f6, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this.f11227a = j10;
        this.f11228b = j11;
        this.f11229c = j12;
        this.f11230d = j13;
        this.f11231e = f6;
        this.f11232f = f10;
    }

    @Composable
    @NotNull
    public final State<BorderStroke> borderStroke$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(670222826);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(670222826, i10, -1, "androidx.compose.material3.SelectableChipBorder.borderStroke (Chip.kt:1993)");
        }
        if (z10) {
            j10 = z11 ? this.f11228b : this.f11227a;
        } else {
            j10 = z11 ? this.f11230d : this.f11229c;
        }
        State<BorderStroke> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m142BorderStrokecXLIe8U(z11 ? this.f11232f : this.f11231e, j10), composer, 0);
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
        if (other == null || !(other instanceof SelectableChipBorder)) {
            return false;
        }
        SelectableChipBorder selectableChipBorder = (SelectableChipBorder) other;
        return Color.m2509equalsimpl0(this.f11227a, selectableChipBorder.f11227a) && Color.m2509equalsimpl0(this.f11228b, selectableChipBorder.f11228b) && Color.m2509equalsimpl0(this.f11229c, selectableChipBorder.f11229c) && Color.m2509equalsimpl0(this.f11230d, selectableChipBorder.f11230d) && Dp.m4394equalsimpl0(this.f11231e, selectableChipBorder.f11231e) && Dp.m4394equalsimpl0(this.f11232f, selectableChipBorder.f11232f);
    }

    public int hashCode() {
        return Dp.m4395hashCodeimpl(this.f11232f) + androidx.camera.camera2.internal.compat.u.a(this.f11231e, androidx.collection.j.a(this.f11230d, androidx.collection.j.a(this.f11229c, androidx.collection.j.a(this.f11228b, Color.m2515hashCodeimpl(this.f11227a) * 31, 31), 31), 31), 31);
    }
}
