package z;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridSlots;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n51#2:558\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n*L\n158#1:558\n*E\n"})
public final class f extends Lambda implements Function2<Density, Constraints, LazyGridSlots> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f94895p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ GridCells f94896q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f94897r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PaddingValues paddingValues, GridCells gridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.f94895p0 = paddingValues;
        this.f94896q0 = gridCells;
        this.f94897r0 = horizontal;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LazyGridSlots invoke(Density density, Constraints constraints) {
        Density $receiver = density;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        if (Constraints.m4357getMaxWidthimpl(f18296a) == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
        }
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        PaddingValues paddingValues = this.f94895p0;
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(f18296a) - $receiver.mo413roundToPx0680j_4(Dp.m4389constructorimpl(PaddingKt.calculateEndPadding(paddingValues, layoutDirection) + PaddingKt.calculateStartPadding(paddingValues, layoutDirection)));
        Arrangement.Horizontal horizontal = this.f94897r0;
        int[] intArray = CollectionsKt___CollectionsKt.toIntArray(this.f94896q0.calculateCrossAxisCellSizes($receiver, iM4357getMaxWidthimpl, $receiver.mo413roundToPx0680j_4(horizontal.getSpacing())));
        int[] iArr = new int[intArray.length];
        horizontal.arrange($receiver, iM4357getMaxWidthimpl, intArray, layoutDirection, iArr);
        return new LazyGridSlots(intArray, iArr);
    }
}
