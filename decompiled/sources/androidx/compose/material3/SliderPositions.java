package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R7\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00118F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/SliderPositions;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Lkotlin/ranges/ClosedFloatingPointRange;", "", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getActiveRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "setActiveRange$material3_release", "(Lkotlin/ranges/ClosedFloatingPointRange;)V", "activeRange", "", "b", "getTickFractions", "()[F", "setTickFractions$material3_release", "([F)V", "tickFractions", "initialActiveRange", "initialTickFractions", "<init>", "(Lkotlin/ranges/ClosedFloatingPointRange;[F)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1508:1\n76#2:1509\n102#2,2:1510\n76#2:1512\n102#2,2:1513\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n*L\n1482#1:1509\n1482#1:1510,2\n1490#1:1512\n1490#1:1513,2\n*E\n"})
public final class SliderPositions {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState activeRange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState tickFractions;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderPositions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) other;
        return Intrinsics.areEqual(getActiveRange(), sliderPositions.getActiveRange()) && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions());
    }

    @NotNull
    public final ClosedFloatingPointRange<Float> getActiveRange() {
        return (ClosedFloatingPointRange) this.activeRange.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final float[] getTickFractions() {
        return (float[]) this.tickFractions.getValue();
    }

    public int hashCode() {
        return Arrays.hashCode(getTickFractions()) + (getActiveRange().hashCode() * 31);
    }

    public final void setActiveRange$material3_release(@NotNull ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        Intrinsics.checkNotNullParameter(closedFloatingPointRange, "<set-?>");
        this.activeRange.setValue(closedFloatingPointRange);
    }

    public final void setTickFractions$material3_release(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<set-?>");
        this.tickFractions.setValue(fArr);
    }

    public SliderPositions(@NotNull ClosedFloatingPointRange<Float> initialActiveRange, @NotNull float[] initialTickFractions) {
        Intrinsics.checkNotNullParameter(initialActiveRange, "initialActiveRange");
        Intrinsics.checkNotNullParameter(initialTickFractions, "initialTickFractions");
        this.activeRange = SnapshotStateKt.mutableStateOf$default(initialActiveRange, null, 2, null);
        this.tickFractions = SnapshotStateKt.mutableStateOf$default(initialTickFractions, null, 2, null);
    }

    public /* synthetic */ SliderPositions(ClosedFloatingPointRange closedFloatingPointRange, float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ok.e.rangeTo(0.0f, 1.0f) : closedFloatingPointRange, (i10 & 2) != 0 ? new float[0] : fArr);
    }
}
