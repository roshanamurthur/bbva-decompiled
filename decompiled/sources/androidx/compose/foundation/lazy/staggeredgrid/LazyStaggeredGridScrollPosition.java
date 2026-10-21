package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.camera.camera2.internal.n1;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u00126\u0010*\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00020%¢\u0006\u0004\b+\u0010,J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0007J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R+\u0010\r\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureResult", "", "updateFromMeasureResult", "", FirebaseAnalytics.Param.INDEX, "scrollOffset", "requestPosition", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "indices", "updateScrollPositionIfTheFirstItemWasMoved", "a", "b", "", "equivalent", "<set-?>", "Landroidx/compose/runtime/MutableState;", "getIndices", "()[I", "setIndices", "([I)V", "c", "getOffsets", "setOffsets", "offsets", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "f", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "initialIndices", "initialOffsets", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "targetIndex", "laneCount", "fillIndices", "<init>", "([I[ILkotlin/jvm/functions/Function2;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,143:1\n81#2:144\n107#2,2:145\n81#2:147\n107#2,2:148\n16594#3,14:150\n1#4:164\n116#5,2:165\n33#5,6:167\n118#5:173\n495#6,4:174\n500#6:183\n129#7,5:178\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n36#1:144\n36#1:145,2\n38#1:147\n38#1:148,2\n57#1:150,14\n61#1:165,2\n61#1:167,6\n61#1:173\n69#1:174,4\n69#1:183\n69#1:178,5\n*E\n"})
public final class LazyStaggeredGridScrollPosition implements SnapshotMutationPolicy<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function2<Integer, Integer, int[]> f5276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState indices;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState offsets;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Object f5280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutNearestRangeState nearestRangeState;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridScrollPosition(@NotNull int[] initialIndices, @NotNull int[] initialOffsets, @NotNull Function2<? super Integer, ? super Integer, int[]> fillIndices) {
        Intrinsics.checkNotNullParameter(initialIndices, "initialIndices");
        Intrinsics.checkNotNullParameter(initialOffsets, "initialOffsets");
        Intrinsics.checkNotNullParameter(fillIndices, "fillIndices");
        this.f5276a = fillIndices;
        this.indices = SnapshotStateKt.mutableStateOf(initialIndices, this);
        this.offsets = SnapshotStateKt.mutableStateOf(initialOffsets, this);
        Integer numMinOrNull = ArraysKt___ArraysKt.minOrNull(initialIndices);
        this.nearestRangeState = new LazyLayoutNearestRangeState(numMinOrNull != null ? numMinOrNull.intValue() : 0, 90, 200);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final int[] getIndices() {
        return (int[]) this.indices.getValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final int[] getOffsets() {
        return (int[]) this.offsets.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.lang.Object] */
    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final /* synthetic */ int[] merge(int[] iArr, int[] iArr2, int[] iArr3) {
        return h0.a(this, iArr, iArr2, iArr3);
    }

    public final void requestPosition(int index, int scrollOffset) {
        int[] iArrInvoke = this.f5276a.invoke(Integer.valueOf(index), Integer.valueOf(getIndices().length));
        int length = iArrInvoke.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = scrollOffset;
        }
        this.indices.setValue(iArrInvoke);
        this.offsets.setValue(iArr);
        this.nearestRangeState.update(index);
        this.f5280e = null;
    }

    public final void updateFromMeasureResult(@NotNull LazyStaggeredGridMeasureResult measureResult) {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        int[] firstVisibleItemIndices = measureResult.getFirstVisibleItemIndices();
        if (firstVisibleItemIndices.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = 0;
        int i11 = firstVisibleItemIndices[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(firstVisibleItemIndices);
        if (lastIndex != 0) {
            int i12 = i11 == -1 ? Integer.MAX_VALUE : i11;
            IntIterator intIteratorG = n1.g(1, lastIndex);
            while (intIteratorG.hasNext()) {
                int i13 = firstVisibleItemIndices[intIteratorG.nextInt()];
                int i14 = i13 == -1 ? Integer.MAX_VALUE : i13;
                if (i12 > i14) {
                    i11 = i13;
                    i12 = i14;
                }
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            i11 = 0;
        }
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = measureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        while (true) {
            if (i10 >= size) {
                lazyStaggeredGridItemInfo = null;
                break;
            }
            lazyStaggeredGridItemInfo = visibleItemsInfo.get(i10);
            if (lazyStaggeredGridItemInfo.getIndex() == i11) {
                break;
            } else {
                i10++;
            }
        }
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2 = lazyStaggeredGridItemInfo;
        this.f5280e = lazyStaggeredGridItemInfo2 != null ? lazyStaggeredGridItemInfo2.getKey() : null;
        this.nearestRangeState.update(i11);
        if (this.f5279d || measureResult.getTotalItemsCount() > 0) {
            this.f5279d = true;
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    int[] firstVisibleItemIndices2 = measureResult.getFirstVisibleItemIndices();
                    int[] firstVisibleItemScrollOffsets = measureResult.getFirstVisibleItemScrollOffsets();
                    this.indices.setValue(firstVisibleItemIndices2);
                    this.offsets.setValue(firstVisibleItemScrollOffsets);
                    Unit unit = Unit.INSTANCE;
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                } catch (Throwable th2) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                }
            } catch (Throwable th3) {
                snapshotCreateNonObservableSnapshot.dispose();
                throw th3;
            }
        }
    }

    @ExperimentalFoundationApi
    @NotNull
    public final int[] updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyLayoutItemProvider itemProvider, @NotNull int[] indices) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(indices, "indices");
        Object obj = this.f5280e;
        Integer orNull = ArraysKt___ArraysKt.getOrNull(indices, 0);
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, obj, orNull != null ? orNull.intValue() : 0);
        if (ArraysKt___ArraysKt.contains(indices, iFindIndexByKey)) {
            return indices;
        }
        this.nearestRangeState.update(iFindIndexByKey);
        int[] iArrInvoke = this.f5276a.invoke(Integer.valueOf(iFindIndexByKey), Integer.valueOf(indices.length));
        this.indices.setValue(iArrInvoke);
        return iArrInvoke;
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(@NotNull int[] a10, @NotNull int[] b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return Arrays.equals(a10, b10);
    }
}
