package d0;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.l0;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.p0;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CornerSize.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements CornerSize, InspectableValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f68120a;

    public b(float f6) {
        this.f68120a = f6;
        if (f6 < 0.0f || f6 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Float.compare(this.f68120a, ((b) obj).f68120a) == 0;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final /* synthetic */ Sequence getInspectableElements() {
        return p0.a(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final /* synthetic */ String getNameFallback() {
        return p0.b(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return u.i(new StringBuilder(), this.f68120a, '%');
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f68120a);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* JADX INFO: renamed from: toPx-TmRCtEA */
    public final float mo477toPxTmRCtEA(long j10, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return (this.f68120a / 100.0f) * Size.m2343getMinDimensionimpl(j10);
    }

    @NotNull
    public final String toString() {
        return l0.a(new StringBuilder("CornerSize(size = "), this.f68120a, "%)");
    }
}
