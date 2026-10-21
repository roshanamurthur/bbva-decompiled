package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"findVisibleItem", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "itemIndex", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridMeasureResultKt {

    /* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
    public static final class a extends Lambda implements Function1<LazyStaggeredGridItemInfo, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f5258p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.f5258p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
            LazyStaggeredGridItemInfo it = lazyStaggeredGridItemInfo;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getIndex() - this.f5258p0);
        }
    }

    @Nullable
    public static final LazyStaggeredGridItemInfo findVisibleItem(@NotNull LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i10) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridLayoutInfo, "<this>");
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.first((List) lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        if (i10 > ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.last((List) lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() || index > i10) {
            return null;
        }
        return (LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.getOrNull(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), CollectionsKt__CollectionsKt.binarySearch$default(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, new a(i10), 3, (Object) null));
    }
}
