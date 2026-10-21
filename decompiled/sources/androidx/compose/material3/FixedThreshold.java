package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J \u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/FixedThreshold;", "Landroidx/compose/material3/ThresholdConfig;", "Landroidx/compose/ui/unit/Density;", "", "fromValue", "toValue", "computeThreshold", "Landroidx/compose/ui/unit/Dp;", TypedValues.CycleType.S_WAVE_OFFSET, "copy-0680j_4", "(F)Landroidx/compose/material3/FixedThreshold;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class FixedThreshold implements ThresholdConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10284a;

    public FixedThreshold(float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this.f10284a = f6;
    }

    /* JADX INFO: renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ FixedThreshold m1118copy0680j_4$default(FixedThreshold fixedThreshold, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = fixedThreshold.f10284a;
        }
        return fixedThreshold.m1119copy0680j_4(f6);
    }

    @Override // androidx.compose.material3.ThresholdConfig
    public float computeThreshold(@NotNull Density density, float f6, float f10) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return (Math.signum(f10 - f6) * density.mo415toPx0680j_4(this.f10284a)) + f6;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-0680j_4, reason: not valid java name */
    public final FixedThreshold m1119copy0680j_4(float offset) {
        return new FixedThreshold(offset, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FixedThreshold) && Dp.m4394equalsimpl0(this.f10284a, ((FixedThreshold) other).f10284a);
    }

    public int hashCode() {
        return Dp.m4395hashCodeimpl(this.f10284a);
    }

    @NotNull
    public String toString() {
        return "FixedThreshold(offset=" + ((Object) Dp.m4400toStringimpl(this.f10284a)) + RootService.CLOSE_BRACKET;
    }
}
