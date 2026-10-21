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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B$\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/ChipBorder;", "", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "borderStroke$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "borderStroke", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/graphics/Color;", "borderColor", "disabledBorderColor", "Landroidx/compose/ui/unit/Dp;", "borderWidth", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class ChipBorder {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9662c;

    public ChipBorder(long j10, long j11, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this.f9660a = j10;
        this.f9661b = j11;
        this.f9662c = f6;
    }

    @Composable
    @NotNull
    public final State<BorderStroke> borderStroke$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1899621712);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899621712, i10, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2045)");
        }
        State<BorderStroke> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m142BorderStrokecXLIe8U(this.f9662c, z10 ? this.f9660a : this.f9661b), composer, 0);
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
        if (other == null || !(other instanceof ChipBorder)) {
            return false;
        }
        ChipBorder chipBorder = (ChipBorder) other;
        return Color.m2509equalsimpl0(this.f9660a, chipBorder.f9660a) && Color.m2509equalsimpl0(this.f9661b, chipBorder.f9661b) && Dp.m4394equalsimpl0(this.f9662c, chipBorder.f9662c);
    }

    public int hashCode() {
        return Dp.m4395hashCodeimpl(this.f9662c) + androidx.collection.j.a(this.f9661b, Color.m2515hashCodeimpl(this.f9660a) * 31, 31);
    }
}
