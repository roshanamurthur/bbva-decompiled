package a0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberRowSlots$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,456:1\n51#2:457\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberRowSlots$1$1\n*L\n194#1:457\n*E\n"})
public final class d extends Lambda implements Function2<Density, Constraints, LazyStaggeredGridSlots> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f148p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridCells f149q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f150r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical) {
        super(2);
        this.f148p0 = paddingValues;
        this.f149q0 = staggeredGridCells;
        this.f150r0 = vertical;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
        Density $receiver = density;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        if (Constraints.m4356getMaxHeightimpl(f18296a) == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.".toString());
        }
        PaddingValues paddingValues = this.f148p0;
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(f18296a) - $receiver.mo413roundToPx0680j_4(Dp.m4389constructorimpl(paddingValues.getBottom() + paddingValues.getTop()));
        Arrangement.Vertical vertical = this.f150r0;
        int[] iArrCalculateCrossAxisCellSizes = this.f149q0.calculateCrossAxisCellSizes($receiver, iM4356getMaxHeightimpl, $receiver.mo413roundToPx0680j_4(vertical.getSpacing()));
        int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
        vertical.arrange($receiver, iM4356getMaxHeightimpl, iArrCalculateCrossAxisCellSizes, iArr);
        return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
    }
}
