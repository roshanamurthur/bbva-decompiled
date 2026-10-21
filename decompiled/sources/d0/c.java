package d0;

import androidx.camera.camera2.internal.l0;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.p0;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CornerSize.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements CornerSize, InspectableValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f68121a;

    public c(float f6) {
        this.f68121a = f6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f68121a, ((c) obj).f68121a) == 0;
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
        return l0.a(new StringBuilder(), this.f68121a, "px");
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f68121a);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* JADX INFO: renamed from: toPx-TmRCtEA */
    public final float mo477toPxTmRCtEA(long j10, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f68121a;
    }

    @NotNull
    public final String toString() {
        return l0.a(new StringBuilder("CornerSize(size = "), this.f68121a, ".px)");
    }
}
