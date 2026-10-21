package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001a\u0010\"\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/EmptyLazyStaggeredGridLayoutInfo;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "a", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "visibleItemsInfo", "Landroidx/compose/ui/unit/IntSize;", "b", "J", "getViewportSize-YbymL2g", "()J", "viewportSize", "Landroidx/compose/foundation/gestures/Orientation;", "c", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "totalItemsCount", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTotalItemsCount", "()I", "viewportStartOffset", "getViewportStartOffset", "viewportEndOffset", "getViewportEndOffset", "beforeContentPadding", "getBeforeContentPadding", "afterContentPadding", "getAfterContentPadding", "mainAxisItemSpacing", "getMainAxisItemSpacing", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class EmptyLazyStaggeredGridLayoutInfo implements LazyStaggeredGridLayoutInfo {

    @NotNull
    public static final EmptyLazyStaggeredGridLayoutInfo INSTANCE = new EmptyLazyStaggeredGridLayoutInfo();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<LazyStaggeredGridItemInfo> visibleItemsInfo = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final long viewportSize = IntSize.INSTANCE.m4554getZeroYbymL2g();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Orientation orientation = Orientation.Vertical;

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return orientation;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    public long getViewportSize() {
        return viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public List<LazyStaggeredGridItemInfo> getVisibleItemsInfo() {
        return visibleItemsInfo;
    }
}
