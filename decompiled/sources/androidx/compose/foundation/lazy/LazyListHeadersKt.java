package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyListHeaders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,94:1\n1#2:95\n69#3,6:96\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:96,6\n*E\n"})
public final class LazyListHeadersKt {
    @Nullable
    public static final LazyListMeasuredItem findOrComposeLazyListHeader(@NotNull List<LazyListMeasuredItem> composedVisibleItems, @NotNull LazyListMeasuredItemProvider itemProvider, @NotNull List<Integer> headerIndexes, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(composedVisibleItems, "composedVisibleItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        int index = ((LazyListMeasuredItem) CollectionsKt___CollectionsKt.first((List) composedVisibleItems)).getIndex();
        int size = headerIndexes.size();
        int iIntValue = -1;
        int iIntValue2 = -1;
        int i13 = 0;
        while (i13 < size && headerIndexes.get(i13).intValue() <= index) {
            iIntValue = headerIndexes.get(i13).intValue();
            i13++;
            iIntValue2 = ((i13 < 0 || i13 > CollectionsKt__CollectionsKt.getLastIndex(headerIndexes)) ? -1 : headerIndexes.get(i13)).intValue();
        }
        int size2 = composedVisibleItems.size();
        int offset = Integer.MIN_VALUE;
        int offset2 = Integer.MIN_VALUE;
        int i14 = -1;
        for (int i15 = 0; i15 < size2; i15++) {
            LazyListMeasuredItem lazyListMeasuredItem = composedVisibleItems.get(i15);
            if (lazyListMeasuredItem.getIndex() == iIntValue) {
                offset = lazyListMeasuredItem.getOffset();
                i14 = i15;
            } else if (lazyListMeasuredItem.getIndex() == iIntValue2) {
                offset2 = lazyListMeasuredItem.getOffset();
            }
        }
        if (iIntValue == -1) {
            return null;
        }
        LazyListMeasuredItem andMeasure = itemProvider.getAndMeasure(iIntValue);
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i10, offset) : -i10;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - andMeasure.getSize());
        }
        andMeasure.position(iMax, i11, i12);
        if (i14 != -1) {
            composedVisibleItems.set(i14, andMeasure);
        } else {
            composedVisibleItems.add(0, andMeasure);
        }
        return andMeasure;
    }
}
