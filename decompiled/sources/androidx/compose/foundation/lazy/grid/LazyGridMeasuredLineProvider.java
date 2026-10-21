package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.Constraints;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyGridMeasuredLineProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J(\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002J>\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u0002H&ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "", "", "startSlot", "span", "Landroidx/compose/ui/unit/Constraints;", "childConstraints-JhjzzOo$foundation_release", "(II)J", "childConstraints", "itemIndex", "itemConstraints-OenEA2s", "(I)J", "itemConstraints", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "getAndMeasure", FirebaseAnalytics.Param.INDEX, "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", FirebaseAnalytics.Param.ITEMS, "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "mainAxisSpacing", "createLine", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Ljava/util/List;I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "", "isVertical", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "slots", "gridItemsCount", "spaceBetweenLines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "<init>", "(ZLandroidx/compose/foundation/lazy/grid/LazyGridSlots;IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public abstract class LazyGridMeasuredLineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyGridSlots f4844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LazyGridMeasuredItemProvider f4847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final LazyGridSpanLayoutProvider f4848f;

    public LazyGridMeasuredLineProvider(boolean z10, @NotNull LazyGridSlots slots, int i10, int i11, @NotNull LazyGridMeasuredItemProvider measuredItemProvider, @NotNull LazyGridSpanLayoutProvider spanLayoutProvider) {
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        this.f4843a = z10;
        this.f4844b = slots;
        this.f4845c = i10;
        this.f4846d = i11;
        this.f4847e = measuredItemProvider;
        this.f4848f = spanLayoutProvider;
    }

    /* JADX INFO: renamed from: childConstraints-JhjzzOo$foundation_release, reason: not valid java name */
    public final long m392childConstraintsJhjzzOo$foundation_release(int startSlot, int span) {
        int i10;
        LazyGridSlots lazyGridSlots = this.f4844b;
        if (span == 1) {
            i10 = lazyGridSlots.getSizes()[startSlot];
        } else {
            int i11 = (span + startSlot) - 1;
            i10 = (lazyGridSlots.getPositions()[i11] + lazyGridSlots.getSizes()[i11]) - lazyGridSlots.getPositions()[startSlot];
        }
        int iCoerceAtLeast = c.coerceAtLeast(i10, 0);
        return this.f4843a ? Constraints.INSTANCE.m4367fixedWidthOenEA2s(iCoerceAtLeast) : Constraints.INSTANCE.m4366fixedHeightOenEA2s(iCoerceAtLeast);
    }

    @NotNull
    public abstract LazyGridMeasuredLine createLine(int index, @NotNull LazyGridMeasuredItem[] items, @NotNull List<GridItemSpan> spans, int mainAxisSpacing);

    @NotNull
    public final LazyGridMeasuredLine getAndMeasure(int lineIndex) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.f4848f.getLineConfiguration(lineIndex);
        int size = lineConfiguration.getSpans().size();
        int i10 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.f4845c) ? 0 : this.f4846d;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int iM378getCurrentLineSpanimpl = GridItemSpan.m378getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i12).getF4697a());
            LazyGridMeasuredItem lazyGridMeasuredItemM391getAndMeasure3p2s80s = this.f4847e.m391getAndMeasure3p2s80s(lineConfiguration.getFirstItemIndex() + i12, i10, m392childConstraintsJhjzzOo$foundation_release(i11, iM378getCurrentLineSpanimpl));
            i11 += iM378getCurrentLineSpanimpl;
            Unit unit = Unit.INSTANCE;
            lazyGridMeasuredItemArr[i12] = lazyGridMeasuredItemM391getAndMeasure3p2s80s;
        }
        return createLine(lineIndex, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i10);
    }

    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f4847e.getKeyIndexMap();
    }

    /* JADX INFO: renamed from: itemConstraints-OenEA2s, reason: not valid java name */
    public final long m393itemConstraintsOenEA2s(int itemIndex) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.f4848f;
        return m392childConstraintsJhjzzOo$foundation_release(0, lazyGridSpanLayoutProvider.spanOf(itemIndex, lazyGridSpanLayoutProvider.getSlotsPerLine()));
    }
}
