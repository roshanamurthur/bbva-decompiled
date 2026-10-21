package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002R*\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "getLineConfiguration", "itemIndex", "getLineIndexOfItem", "maxSpan", "spanOf", "value", "i", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSlotsPerLine", "()I", "setSlotsPerLine", "(I)V", "slotsPerLine", "getTotalSize", "totalSize", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "gridContent", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;)V", "a", "b", "LineConfiguration", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
public final class LazyGridSpanLayoutProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyGridIntervalContent f4856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList<a> f4857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList f4862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public List<GridItemSpan> f4863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int slotsPerLine;

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFirstItemIndex", "()I", "firstItemIndex", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "b", "Ljava/util/List;", "getSpans", "()Ljava/util/List;", "spans", "<init>", "(ILjava/util/List;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class LineConfiguration {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int firstItemIndex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<GridItemSpan> spans;

        public LineConfiguration(int i10, @NotNull List<GridItemSpan> spans) {
            Intrinsics.checkNotNullParameter(spans, "spans");
            this.firstItemIndex = i10;
            this.spans = spans;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        @NotNull
        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }
    }

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4868b;

        public a(int i10, int i11) {
            this.f4867a = i10;
            this.f4868b = i11;
        }
    }

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    public static final class b implements LazyGridItemSpanScope {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f4869a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f4870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f4871c;

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public final int getMaxCurrentLineSpan() {
            return f4870b;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public final int getMaxLineSpan() {
            return f4871c;
        }
    }

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    public static final class c extends Lambda implements Function1<a, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f4872p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10) {
            super(1);
            this.f4872p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(a aVar) {
            a it = aVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.f4867a - this.f4872p0);
        }
    }

    public LazyGridSpanLayoutProvider(@NotNull LazyGridIntervalContent gridContent) {
        Intrinsics.checkNotNullParameter(gridContent, "gridContent");
        this.f4856a = gridContent;
        ArrayList<a> arrayList = new ArrayList<>();
        arrayList.add(new a(0, 0));
        this.f4857b = arrayList;
        this.f4861f = -1;
        this.f4862g = new ArrayList();
        this.f4863h = CollectionsKt__CollectionsKt.emptyList();
    }

    public final int a() {
        return ((int) Math.sqrt((((double) getTotalSize()) * 1.0d) / ((double) this.slotsPerLine))) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    @NotNull
    public final LineConfiguration getLineConfiguration(int lineIndex) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        List<GridItemSpan> list;
        if (!this.f4856a.getHasCustomSpans()) {
            int i13 = this.slotsPerLine;
            int i14 = lineIndex * i13;
            int iCoerceAtLeast = kotlin.ranges.c.coerceAtLeast(kotlin.ranges.c.coerceAtMost(i13, getTotalSize() - i14), 0);
            if (iCoerceAtLeast == this.f4863h.size()) {
                list = this.f4863h;
            } else {
                ArrayList arrayList = new ArrayList(iCoerceAtLeast);
                for (int i15 = 0; i15 < iCoerceAtLeast; i15++) {
                    arrayList.add(GridItemSpan.m374boximpl(LazyGridSpanKt.GridItemSpan(1)));
                }
                this.f4863h = arrayList;
                list = arrayList;
            }
            return new LineConfiguration(i14, list);
        }
        int iA = lineIndex / a();
        ArrayList<a> arrayList2 = this.f4857b;
        int iMin = Math.min(iA, arrayList2.size() - 1);
        int iA2 = a() * iMin;
        int iIntValue = arrayList2.get(iMin).f4867a;
        int iSpanOf = arrayList2.get(iMin).f4868b;
        int i16 = this.f4858c;
        ArrayList arrayList3 = this.f4862g;
        if (iA2 <= i16 && i16 <= lineIndex) {
            iIntValue = this.f4859d;
            iSpanOf = this.f4860e;
            iA2 = i16;
        } else if (iMin == this.f4861f && (i10 = lineIndex - iA2) < arrayList3.size()) {
            iIntValue = ((Number) arrayList3.get(i10)).intValue();
            iA2 = lineIndex;
            iSpanOf = 0;
        }
        if (iA2 % a() == 0) {
            int i17 = lineIndex - iA2;
            z10 = 2 <= i17 && i17 < a();
        }
        if (z10) {
            this.f4861f = iMin;
            arrayList3.clear();
        }
        if (iA2 > lineIndex) {
            throw new IllegalStateException("Check failed.".toString());
        }
        while (iA2 < lineIndex && iIntValue < getTotalSize()) {
            if (z10) {
                arrayList3.add(Integer.valueOf(iIntValue));
            }
            int i18 = 0;
            while (i18 < this.slotsPerLine && iIntValue < getTotalSize()) {
                if (iSpanOf == 0) {
                    i12 = iSpanOf;
                    iSpanOf = spanOf(iIntValue, this.slotsPerLine - i18);
                } else {
                    i12 = 0;
                }
                i18 += iSpanOf;
                if (i18 > this.slotsPerLine) {
                    break;
                }
                iIntValue++;
                iSpanOf = i12;
            }
            iA2++;
            if (iA2 % a() == 0 && iIntValue < getTotalSize()) {
                if (arrayList2.size() != iA2 / a()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                arrayList2.add(new a(iIntValue, iSpanOf));
            }
        }
        this.f4858c = lineIndex;
        this.f4859d = iIntValue;
        this.f4860e = iSpanOf;
        ArrayList arrayList4 = new ArrayList();
        int i19 = 0;
        int i20 = iIntValue;
        while (i19 < this.slotsPerLine && i20 < getTotalSize()) {
            if (iSpanOf == 0) {
                int i21 = iSpanOf;
                iSpanOf = spanOf(i20, this.slotsPerLine - i19);
                i11 = i21;
            } else {
                i11 = 0;
            }
            i19 += iSpanOf;
            if (i19 > this.slotsPerLine) {
                break;
            }
            i20++;
            arrayList4.add(GridItemSpan.m374boximpl(LazyGridSpanKt.GridItemSpan(iSpanOf)));
            iSpanOf = i11;
        }
        return new LineConfiguration(iIntValue, arrayList4);
    }

    public final int getLineIndexOfItem(int itemIndex) {
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (itemIndex >= getTotalSize()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.f4856a.getHasCustomSpans()) {
            return itemIndex / this.slotsPerLine;
        }
        ArrayList<a> arrayList = this.f4857b;
        int iBinarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(arrayList, 0, 0, new c(itemIndex), 3, (Object) null);
        if (iBinarySearch$default < 0) {
            iBinarySearch$default = (-iBinarySearch$default) - 2;
        }
        int iA = a() * iBinarySearch$default;
        int i10 = arrayList.get(iBinarySearch$default).f4867a;
        if (i10 > itemIndex) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i11 = 0;
        while (i10 < itemIndex) {
            int i12 = i10 + 1;
            int iSpanOf = spanOf(i10, this.slotsPerLine - i11);
            i11 += iSpanOf;
            int i13 = this.slotsPerLine;
            if (i11 >= i13) {
                if (i11 == i13) {
                    iA++;
                    i11 = 0;
                } else {
                    iA++;
                    i11 = iSpanOf;
                }
            }
            if (iA % a() == 0 && iA / a() >= arrayList.size()) {
                arrayList.add(new a(i12 - (i11 > 0 ? 1 : 0), 0));
            }
            i10 = i12;
        }
        return spanOf(itemIndex, this.slotsPerLine - i11) + i11 > this.slotsPerLine ? iA + 1 : iA;
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int getTotalSize() {
        return this.f4856a.getIntervals().getSize();
    }

    public final void setSlotsPerLine(int i10) {
        if (i10 != this.slotsPerLine) {
            this.slotsPerLine = i10;
            ArrayList<a> arrayList = this.f4857b;
            arrayList.clear();
            arrayList.add(new a(0, 0));
            this.f4858c = 0;
            this.f4859d = 0;
            this.f4860e = 0;
            this.f4861f = -1;
            this.f4862g.clear();
        }
    }

    public final int spanOf(int itemIndex, int maxSpan) {
        b bVar = b.f4869a;
        b.f4870b = maxSpan;
        b.f4871c = this.slotsPerLine;
        IntervalList.Interval<LazyGridInterval> interval = this.f4856a.getIntervals().get(itemIndex);
        return GridItemSpan.m378getCurrentLineSpanimpl(interval.getValue().getSpan().invoke(bVar, Integer.valueOf(itemIndex - interval.getStartIndex())).getF4697a());
    }
}
