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
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001Bt\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\bJ\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/material3/SelectableChipColors;", "", "", "enabled", "selected", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "containerColor", "labelColor$material3_release", "labelColor", "leadingIconContentColor$material3_release", "leadingIconContentColor", "trailingIconContentColor$material3_release", "trailingIconContentColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "<init>", "(JJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SelectableChipColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f11244l;
    public final long m;

    public SelectableChipColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, DefaultConstructorMarker defaultConstructorMarker) {
        this.f11233a = j10;
        this.f11234b = j11;
        this.f11235c = j12;
        this.f11236d = j13;
        this.f11237e = j14;
        this.f11238f = j15;
        this.f11239g = j16;
        this.f11240h = j17;
        this.f11241i = j18;
        this.f11242j = j19;
        this.f11243k = j20;
        this.f11244l = j21;
        this.m = j22;
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-2126903408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126903408, i10, -1, "androidx.compose.material3.SelectableChipColors.containerColor (Chip.kt:1875)");
        }
        if (z10) {
            j10 = !z11 ? this.f11233a : this.f11241i;
        } else {
            j10 = z11 ? this.f11242j : this.f11237e;
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
        if (other == null || !(other instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) other;
        return Color.m2509equalsimpl0(this.f11233a, selectableChipColors.f11233a) && Color.m2509equalsimpl0(this.f11234b, selectableChipColors.f11234b) && Color.m2509equalsimpl0(this.f11235c, selectableChipColors.f11235c) && Color.m2509equalsimpl0(this.f11236d, selectableChipColors.f11236d) && Color.m2509equalsimpl0(this.f11237e, selectableChipColors.f11237e) && Color.m2509equalsimpl0(this.f11238f, selectableChipColors.f11238f) && Color.m2509equalsimpl0(this.f11239g, selectableChipColors.f11239g) && Color.m2509equalsimpl0(this.f11240h, selectableChipColors.f11240h) && Color.m2509equalsimpl0(this.f11241i, selectableChipColors.f11241i) && Color.m2509equalsimpl0(this.f11242j, selectableChipColors.f11242j) && Color.m2509equalsimpl0(this.f11243k, selectableChipColors.f11243k) && Color.m2509equalsimpl0(this.f11244l, selectableChipColors.f11244l) && Color.m2509equalsimpl0(this.m, selectableChipColors.m);
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.m) + androidx.collection.j.a(this.f11244l, androidx.collection.j.a(this.f11243k, androidx.collection.j.a(this.f11242j, androidx.collection.j.a(this.f11241i, androidx.collection.j.a(this.f11240h, androidx.collection.j.a(this.f11239g, androidx.collection.j.a(this.f11238f, androidx.collection.j.a(this.f11237e, androidx.collection.j.a(this.f11236d, androidx.collection.j.a(this.f11235c, androidx.collection.j.a(this.f11234b, Color.m2515hashCodeimpl(this.f11233a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Composable
    @NotNull
    public final State<Color> labelColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-829231549);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-829231549, i10, -1, "androidx.compose.material3.SelectableChipColors.labelColor (Chip.kt:1891)");
        }
        if (z10) {
            j10 = !z11 ? this.f11234b : this.f11243k;
        } else {
            j10 = this.f11238f;
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
    public final State<Color> leadingIconContentColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-1112029563);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112029563, i10, -1, "androidx.compose.material3.SelectableChipColors.leadingIconContentColor (Chip.kt:1907)");
        }
        if (z10) {
            j10 = !z11 ? this.f11235c : this.f11244l;
        } else {
            j10 = this.f11239g;
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
    public final State<Color> trailingIconContentColor$material3_release(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(963620819);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(963620819, i10, -1, "androidx.compose.material3.SelectableChipColors.trailingIconContentColor (Chip.kt:1923)");
        }
        if (z10) {
            j10 = !z11 ? this.f11236d : this.m;
        } else {
            j10 = this.f11240h;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
