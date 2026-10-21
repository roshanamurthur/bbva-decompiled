package g1;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Placeable {
    public i(int i10, int i11) {
        m3609setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i10, i11));
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public final void mo3579placeAtf8xVGno(long j10, float f6, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
    }
}
