package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0088\u0001\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010!\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\u0019\u0012\u0006\u0010)\u001a\u00020$\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020+0*\u0012\u0006\u00106\u001a\u000201\u0012\u0006\u00109\u001a\u00020$\u0012\u0006\u0010<\u001a\u00020$\u0012\u0006\u0010?\u001a\u00020$\u0012\u0006\u0010B\u001a\u00020$\u0012\u0006\u0010E\u001a\u00020$ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010#\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001a\u0010)\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R#\u00106\u001a\u0002018\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00109\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u0010(R\u001a\u0010<\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b;\u0010(R\u001a\u0010?\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010&\u001a\u0004\b>\u0010(R\u001a\u0010B\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010&\u001a\u0004\bA\u0010(R\u001a\u0010E\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010&\u001a\u0004\bD\u0010(R\u001a\u0010K\u001a\u00020F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020$0L8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010(R\u0014\u0010T\u001a\u00020$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "placeChildren", "", "a", "[I", "getFirstVisibleItemIndices", "()[I", "firstVisibleItemIndices", "b", "getFirstVisibleItemScrollOffsets", "firstVisibleItemScrollOffsets", "", "c", "F", "getConsumedScroll", "()F", "consumedScroll", "d", "Landroidx/compose/ui/layout/MeasureResult;", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "", "e", "Z", "getCanScrollForward", "()Z", "canScrollForward", "f", "getCanScrollBackward", "canScrollBackward", "g", "isVertical", "", "h", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTotalItemsCount", "()I", "totalItemsCount", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "i", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "visibleItemsInfo", "Landroidx/compose/ui/unit/IntSize;", "j", "J", "getViewportSize-YbymL2g", "()J", "viewportSize", "k", "getViewportStartOffset", "viewportStartOffset", "l", "getViewportEndOffset", "viewportEndOffset", "m", "getBeforeContentPadding", "beforeContentPadding", "n", "getAfterContentPadding", "afterContentPadding", "o", "getMainAxisItemSpacing", "mainAxisItemSpacing", "Landroidx/compose/foundation/gestures/Orientation;", "p", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "<init>", "([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final int[] firstVisibleItemIndices;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final int[] firstVisibleItemScrollOffsets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float consumedScroll;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MeasureResult measureResult;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean canScrollForward;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean canScrollBackward;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isVertical;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int totalItemsCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<LazyStaggeredGridItemInfo> visibleItemsInfo;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long viewportSize;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final int viewportStartOffset;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int viewportEndOffset;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int beforeContentPadding;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final int afterContentPadding;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int mainAxisItemSpacing;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Orientation orientation;

    public LazyStaggeredGridMeasureResult() {
        throw null;
    }

    public LazyStaggeredGridMeasureResult(int[] firstVisibleItemIndices, int[] firstVisibleItemScrollOffsets, float f6, MeasureResult measureResult, boolean z10, boolean z11, boolean z12, int i10, List visibleItemsInfo, long j10, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(firstVisibleItemIndices, "firstVisibleItemIndices");
        Intrinsics.checkNotNullParameter(firstVisibleItemScrollOffsets, "firstVisibleItemScrollOffsets");
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(visibleItemsInfo, "visibleItemsInfo");
        this.firstVisibleItemIndices = firstVisibleItemIndices;
        this.firstVisibleItemScrollOffsets = firstVisibleItemScrollOffsets;
        this.consumedScroll = f6;
        this.measureResult = measureResult;
        this.canScrollForward = z10;
        this.canScrollBackward = z11;
        this.isVertical = z12;
        this.totalItemsCount = i10;
        this.visibleItemsInfo = visibleItemsInfo;
        this.viewportSize = j10;
        this.viewportStartOffset = i11;
        this.viewportEndOffset = i12;
        this.beforeContentPadding = i13;
        this.afterContentPadding = i14;
        this.mainAxisItemSpacing = i15;
        this.orientation = z12 ? Orientation.Vertical : Orientation.Horizontal;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @NotNull
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final boolean getCanScrollBackward() {
        return this.canScrollBackward;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @NotNull
    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    @NotNull
    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @NotNull
    public final MeasureResult getMeasureResult() {
        return this.measureResult;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g, reason: from getter */
    public long getViewportSize() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public List<LazyStaggeredGridItemInfo> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }
}
