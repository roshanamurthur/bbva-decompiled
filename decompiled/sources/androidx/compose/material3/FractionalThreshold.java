package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.MathHelpersKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/FractionalThreshold;", "Landroidx/compose/material3/ThresholdConfig;", "Landroidx/compose/ui/unit/Density;", "", "fromValue", "toValue", "computeThreshold", "fraction", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "<init>", "(F)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class FractionalThreshold implements ThresholdConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10360a;

    public FractionalThreshold(float f6) {
        this.f10360a = f6;
    }

    public static /* synthetic */ FractionalThreshold copy$default(FractionalThreshold fractionalThreshold, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = fractionalThreshold.f10360a;
        }
        return fractionalThreshold.copy(f6);
    }

    @Override // androidx.compose.material3.ThresholdConfig
    public float computeThreshold(@NotNull Density density, float f6, float f10) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return MathHelpersKt.lerp(f6, f10, this.f10360a);
    }

    @NotNull
    public final FractionalThreshold copy(float fraction) {
        return new FractionalThreshold(fraction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FractionalThreshold) && Float.compare(this.f10360a, ((FractionalThreshold) other).f10360a) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f10360a);
    }

    @NotNull
    public String toString() {
        return androidx.camera.camera2.internal.compat.u.i(new StringBuilder("FractionalThreshold(fraction="), this.f10360a, RootService.CLOSE_BRACKET);
    }
}
