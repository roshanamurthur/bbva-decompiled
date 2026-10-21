package androidx.compose.foundation.lazy.grid;

import androidx.collection.g;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyGridScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureResult", "", "updateFromMeasureResult", "", FirebaseAnalytics.Param.INDEX, "scrollOffset", "requestPosition", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "<set-?>", "a", "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "(I)V", "b", "getScrollOffset", "setScrollOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "e", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n75#2:125\n108#2,2:126\n75#2:128\n108#2,2:129\n1#3:131\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n*L\n35#1:125\n35#1:126,2\n38#1:128\n38#1:129,2\n*E\n"})
public final class LazyGridScrollPosition {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableIntState index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableIntState scrollOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Object f4852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutNearestRangeState nearestRangeState;

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyGridScrollPosition() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public final void a(int i10, int i11) {
        if (i10 < 0.0f) {
            throw new IllegalArgumentException(g.a("Index should be non-negative (", i10, RootService.CLOSE_BRACKET).toString());
        }
        this.index.setIntValue(i10);
        this.nearestRangeState.update(i10);
        this.scrollOffset.setIntValue(i11);
    }

    public final int getIndex() {
        return this.index.getIntValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset.getIntValue();
    }

    public final void requestPosition(int index, int scrollOffset) {
        a(index, scrollOffset);
        this.f4852d = null;
    }

    public final void updateFromMeasureResult(@NotNull LazyGridMeasureResult measureResult) {
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr2;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        LazyGridMeasuredLine firstVisibleLine = measureResult.getFirstVisibleLine();
        this.f4852d = (firstVisibleLine == null || (lazyGridMeasuredItemArr2 = firstVisibleLine.getCom.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS java.lang.String()) == null || (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt___ArraysKt.firstOrNull(lazyGridMeasuredItemArr2)) == null) ? null : lazyGridMeasuredItem2.getKey();
        if (this.f4851c || measureResult.getTotalItemsCount() > 0) {
            this.f4851c = true;
            int firstVisibleLineScrollOffset = measureResult.getFirstVisibleLineScrollOffset();
            if (firstVisibleLineScrollOffset < 0.0f) {
                throw new IllegalStateException(g.a("scrollOffset should be non-negative (", firstVisibleLineScrollOffset, RootService.CLOSE_BRACKET).toString());
            }
            LazyGridMeasuredLine firstVisibleLine2 = measureResult.getFirstVisibleLine();
            a((firstVisibleLine2 == null || (lazyGridMeasuredItemArr = firstVisibleLine2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS java.lang.String()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt___ArraysKt.firstOrNull(lazyGridMeasuredItemArr)) == null) ? 0 : lazyGridMeasuredItem.getIndex(), firstVisibleLineScrollOffset);
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyGridItemProvider itemProvider, int index) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.f4852d, index);
        if (index != iFindIndexByKey) {
            this.index.setIntValue(iFindIndexByKey);
            this.nearestRangeState.update(index);
        }
        return iFindIndexByKey;
    }

    public LazyGridScrollPosition(int i10, int i11) {
        this.index = SnapshotIntStateKt.mutableIntStateOf(i10);
        this.scrollOffset = SnapshotIntStateKt.mutableIntStateOf(i11);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i10, 90, 200);
    }

    public /* synthetic */ LazyGridScrollPosition(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
