package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyStaggeredGridSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "", "", "itemIndex", "", "isFullSpan", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "a", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "intervals", "<init>", "(Landroidx/compose/foundation/lazy/layout/IntervalList;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyStaggeredGridSpanProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IntervalList<LazyStaggeredGridInterval> intervals;

    public LazyStaggeredGridSpanProvider(@NotNull IntervalList<LazyStaggeredGridInterval> intervals) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        this.intervals = intervals;
    }

    @NotNull
    public final IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }

    public final boolean isFullSpan(int itemIndex) {
        if (itemIndex < 0) {
            return false;
        }
        IntervalList<LazyStaggeredGridInterval> intervalList = this.intervals;
        if (itemIndex >= intervalList.getSize()) {
            return false;
        }
        IntervalList.Interval<LazyStaggeredGridInterval> interval = intervalList.get(itemIndex);
        Function1<Integer, StaggeredGridItemSpan> span = interval.getValue().getSpan();
        return span != null && span.invoke(Integer.valueOf(itemIndex - interval.getStartIndex())) == StaggeredGridItemSpan.INSTANCE.getFullLine();
    }
}
