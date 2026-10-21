package a0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberColumnSlots$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,456:1\n51#2:457\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberColumnSlots$1$1\n*L\n105#1:457\n*E\n"})
public final class c extends Lambda implements Function2<Density, Constraints, LazyStaggeredGridSlots> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f145p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridCells f146q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f147r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.f145p0 = paddingValues;
        this.f146q0 = staggeredGridCells;
        this.f147r0 = horizontal;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
        Density $receiver = density;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        if (Constraints.m4357getMaxWidthimpl(f18296a) == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
        }
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        PaddingValues paddingValues = this.f145p0;
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(f18296a) - $receiver.mo413roundToPx0680j_4(Dp.m4389constructorimpl(PaddingKt.calculateEndPadding(paddingValues, layoutDirection) + PaddingKt.calculateStartPadding(paddingValues, layoutDirection)));
        Arrangement.Horizontal horizontal = this.f147r0;
        int[] iArrCalculateCrossAxisCellSizes = this.f146q0.calculateCrossAxisCellSizes($receiver, iM4357getMaxWidthimpl, $receiver.mo413roundToPx0680j_4(horizontal.getSpacing()));
        int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
        horizontal.arrange($receiver, iM4357getMaxWidthimpl, iArrCalculateCrossAxisCellSizes, layoutDirection, iArr);
        return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
    }
}
