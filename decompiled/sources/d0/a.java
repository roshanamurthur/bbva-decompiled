package d0;

import androidx.camera.camera2.internal.l0;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.p0;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CornerSize.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCornerSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerSize.kt\nandroidx/compose/foundation/shape/DpCornerSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class a implements CornerSize, InspectableValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f68119a;

    public a(float f6) {
        this.f68119a = f6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Dp.m4394equalsimpl0(this.f68119a, ((a) obj).f68119a);
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
        return Dp.m4387boximpl(this.f68119a);
    }

    public final int hashCode() {
        return Dp.m4395hashCodeimpl(this.f68119a);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* JADX INFO: renamed from: toPx-TmRCtEA */
    public final float mo477toPxTmRCtEA(long j10, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo415toPx0680j_4(this.f68119a);
    }

    @NotNull
    public final String toString() {
        return l0.a(new StringBuilder("CornerSize(size = "), this.f68119a, ".dp)");
    }
}
