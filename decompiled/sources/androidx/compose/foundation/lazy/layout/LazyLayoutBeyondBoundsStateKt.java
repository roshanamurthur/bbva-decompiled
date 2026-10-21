package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyLayoutBeyondBoundsState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"calculateLazyLayoutPinnedIndices", "", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutBeyondBoundsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,62:1\n33#2,6:63\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n*L\n50#1:63,6\n*E\n"})
public final class LazyLayoutBeyondBoundsStateKt {
    @NotNull
    public static final List<Integer> calculateLazyLayoutPinnedIndices(@NotNull LazyLayoutItemProvider lazyLayoutItemProvider, @NotNull LazyLayoutPinnedItemList pinnedItemList, @NotNull LazyLayoutBeyondBoundsInfo beyondBoundsInfo) {
        Intrinsics.checkNotNullParameter(lazyLayoutItemProvider, "<this>");
        Intrinsics.checkNotNullParameter(pinnedItemList, "pinnedItemList");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        if (!beyondBoundsInfo.hasIntervals() && pinnedItemList.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        IntRange intRange = beyondBoundsInfo.hasIntervals() ? new IntRange(beyondBoundsInfo.getStart(), Math.min(beyondBoundsInfo.getEnd(), lazyLayoutItemProvider.getItemCount() - 1)) : IntRange.INSTANCE.getEMPTY();
        int size = pinnedItemList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = pinnedItemList.get(i10);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int first = intRange.getFirst();
            if ((iFindIndexByKey > intRange.getLast() || first > iFindIndexByKey) && iFindIndexByKey >= 0 && iFindIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(Integer.valueOf(iFindIndexByKey));
            }
        }
        int first2 = intRange.getFirst();
        int last = intRange.getLast();
        if (first2 <= last) {
            while (true) {
                arrayList.add(Integer.valueOf(first2));
                if (first2 == last) {
                    break;
                }
                first2++;
            }
        }
        return arrayList;
    }
}
